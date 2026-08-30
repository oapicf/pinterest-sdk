package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CatalogsCreateReportResponse
import org.openapitools.models.CatalogsReport
import org.openapitools.models.CatalogsReportParameters
import org.openapitools.models.CatalogsReportStatsParameters
import org.openapitools.models.PinterestLibError
import org.openapitools.models.ReportsStats200Response

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

final case class CatalogReportsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: CatalogReportsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object reports/create {
    import CatalogReportsApiDelegate.reports/createResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "reports" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.reports/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsReportParameters] , ad_account_id, responses)

    }

    val responses: reports/createResponses[F] = new reports/createResponses[F] {
      def resp200(value: CatalogsCreateReportResponse): F[Response[F]] = Ok(value)
      def resp201(value: CatalogsCreateReportResponse): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object reports/get {
    import CatalogReportsApiDelegate.reports/getResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object tokenQueryParam extends QueryParamDecoderMatcher[String]("token")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "reports" :? ad_account_idQueryParam(ad_account_id) +& tokenQueryParam(token)) as auth =>
        delegate.reports/get.handle_pinterest_oauth2(auth, req, ad_account_id, token, responses)

    }

    val responses: reports/getResponses[F] = new reports/getResponses[F] {
      def resp200(value: CatalogsReport): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object reports/stats {
    import CatalogReportsApiDelegate.reports/statsResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object parametersQueryParam extends QueryParamDecoderMatcher[CatalogsReportStatsParameters]("parameters")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "reports" / "stats" :? ad_account_idQueryParam(ad_account_id) +& parametersQueryParam(parameters) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.reports/stats.handle_pinterest_oauth2(auth, req, ad_account_id, parameters, bookmark, page_size, responses)

    }

    val responses: reports/statsResponses[F] = new reports/statsResponses[F] {
      def resp200(value: ReportsStats200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    reports/create.routepinterest_oauth2 <+>
    reports/get.routepinterest_oauth2 <+>
    reports/stats.routepinterest_oauth2
}

object CatalogReportsApiDelegate {
  trait reports/createResponses[F[_]] {
    def resp200(value: CatalogsCreateReportResponse): F[Response[F]]
    def resp201(value: CatalogsCreateReportResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait reports/getResponses[F[_]] {
    def resp200(value: CatalogsReport): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait reports/statsResponses[F[_]] {
    def resp200(value: ReportsStats200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CatalogReportsApiDelegate[F[_], pinterest_oauth2] {

  trait reports/create {
    import CatalogReportsApiDelegate.reports/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      reports/create: F[CatalogsReportParameters],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: reports/createResponses[F]
    ): F[Response[F]]


  }
  def reports/create: reports/create


  trait reports/get {
    import CatalogReportsApiDelegate.reports/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      token: String,
      responses: reports/getResponses[F]
    ): F[Response[F]]

  }
  def reports/get: reports/get


  trait reports/stats {
    import CatalogReportsApiDelegate.reports/statsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      parameters: CatalogsReportStatsParameters,
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: reports/statsResponses[F]
    ): F[Response[F]]

  }
  def reports/stats: reports/stats

}