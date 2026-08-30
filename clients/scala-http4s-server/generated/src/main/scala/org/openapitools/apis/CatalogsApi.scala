package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Catalog
import org.openapitools.models.CatalogCreate
import org.openapitools.models.CatalogsAvailableFilterValues
import org.openapitools.models.CatalogsList200Response
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.Country
import org.openapitools.models.PinterestLibError

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.numeric.GreaterEqual
import eu.timepit.refined.numeric.LessEqual
import eu.timepit.refined.string.MatchesRegex

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class CatalogsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: CatalogsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object catalogs/availableFilterValues {
    import CatalogsApiDelegate.catalogs/availableFilterValuesResponses

    object catalog_idQueryParam extends QueryParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("catalog_id")
    object feed_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("feed_id")
    object countryQueryParam extends OptionalQueryParamDecoderMatcher[Country]("country")
    object languageQueryParam extends OptionalQueryParamDecoderMatcher[CatalogsLocale]("language")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "available_filter_values" :? catalog_idQueryParam(catalog_id) +& feed_idQueryParam(feed_id) +& countryQueryParam(country) +& languageQueryParam(language) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.catalogs/availableFilterValues.handle_pinterest_oauth2(auth, req, catalog_id, feed_id, country, language, ad_account_id, responses)

    }

    val responses: catalogs/availableFilterValuesResponses[F] = new catalogs/availableFilterValuesResponses[F] {
      def resp200(value: CatalogsAvailableFilterValues): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogs/create {
    import CatalogsApiDelegate.catalogs/createResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogs/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogCreate] , ad_account_id, responses)

    }

    val responses: catalogs/createResponses[F] = new catalogs/createResponses[F] {
      def resp200(value: Catalog): F[Response[F]] = Ok(value)
      def resp201(value: Catalog): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogs/list {
    import CatalogsApiDelegate.catalogs/listResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" :? ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.catalogs/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, responses)

    }

    val responses: catalogs/listResponses[F] = new catalogs/listResponses[F] {
      def resp200(value: CatalogsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    catalogs/availableFilterValues.routepinterest_oauth2 <+>
    catalogs/create.routepinterest_oauth2 <+>
    catalogs/list.routepinterest_oauth2
}

object CatalogsApiDelegate {
  trait catalogs/availableFilterValuesResponses[F[_]] {
    def resp200(value: CatalogsAvailableFilterValues): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogs/createResponses[F[_]] {
    def resp200(value: Catalog): F[Response[F]]
    def resp201(value: Catalog): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogs/listResponses[F[_]] {
    def resp200(value: CatalogsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CatalogsApiDelegate[F[_], pinterest_oauth2] {

  trait catalogs/availableFilterValues {
    import CatalogsApiDelegate.catalogs/availableFilterValuesResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogId: Refined[String, MatchesRegex["^\\d+$"]],
      feedId: Option[Refined[String, MatchesRegex["^\\d+$"]]],
      country: Option[Country],
      language: Option[CatalogsLocale],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogs/availableFilterValuesResponses[F]
    ): F[Response[F]]

  }
  def catalogs/availableFilterValues: catalogs/availableFilterValues


  trait catalogs/create {
    import CatalogsApiDelegate.catalogs/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogs/create: F[CatalogCreate],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogs/createResponses[F]
    ): F[Response[F]]


  }
  def catalogs/create: catalogs/create


  trait catalogs/list {
    import CatalogsApiDelegate.catalogs/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: catalogs/listResponses[F]
    ): F[Response[F]]

  }
  def catalogs/list: catalogs/list

}