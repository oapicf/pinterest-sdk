package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CatalogsItemsBatch
import org.openapitools.models.CatalogsItemsBatchPostRequest
import org.openapitools.models.CatalogsItemsRequest
import org.openapitools.models.ItemsPost200Response
import org.openapitools.models.PinterestLibError

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.string.MatchesRegex

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class CatalogItemsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: CatalogItemsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object items/post {
    import CatalogItemsApiDelegate.items/postResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "items" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.items/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsItemsRequest] , ad_account_id, responses)

    }

    val responses: items/postResponses[F] = new items/postResponses[F] {
      def resp200(value: ItemsPost200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object itemsBatch/get {
    import CatalogItemsApiDelegate.itemsBatch/getResponses

    object batch_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "items" / "batch" / batch_idVarr(batch_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.itemsBatch/get.handle_pinterest_oauth2(auth, req, batch_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "catalogs" / "items" / "batch" / batch_idVarr(batch_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.itemsBatch/get.handle_client_credentials(auth, req, batch_id, ad_account_id, responses)

    }

    val responses: itemsBatch/getResponses[F] = new itemsBatch/getResponses[F] {
      def resp200(value: CatalogsItemsBatch): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object itemsBatch/post {
    import CatalogItemsApiDelegate.itemsBatch/postResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "items" / "batch" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.itemsBatch/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsItemsBatchPostRequest] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "catalogs" / "items" / "batch" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.itemsBatch/post.handle_client_credentials(auth, req, req.asJsonDecode[CatalogsItemsBatchPostRequest] , ad_account_id, responses)

    }

    val responses: itemsBatch/postResponses[F] = new itemsBatch/postResponses[F] {
      def resp200(value: CatalogsItemsBatch): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    items/post.routepinterest_oauth2 <+>
    itemsBatch/get.routepinterest_oauth2 <+>
    itemsBatch/post.routepinterest_oauth2
  val routesclient_credentials =
    itemsBatch/get.routeclient_credentials <+>
    itemsBatch/post.routeclient_credentials
}

object CatalogItemsApiDelegate {
  trait items/postResponses[F[_]] {
    def resp200(value: ItemsPost200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait itemsBatch/getResponses[F[_]] {
    def resp200(value: CatalogsItemsBatch): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait itemsBatch/postResponses[F[_]] {
    def resp200(value: CatalogsItemsBatch): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CatalogItemsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait items/post {
    import CatalogItemsApiDelegate.items/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      items/post: F[CatalogsItemsRequest],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: items/postResponses[F]
    ): F[Response[F]]


  }
  def items/post: items/post


  trait itemsBatch/get {
    import CatalogItemsApiDelegate.itemsBatch/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      batchId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: itemsBatch/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      batchId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: itemsBatch/getResponses[F]
    ): F[Response[F]]

  }
  def itemsBatch/get: itemsBatch/get


  trait itemsBatch/post {
    import CatalogItemsApiDelegate.itemsBatch/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      itemsBatch/post: F[CatalogsItemsBatchPostRequest],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: itemsBatch/postResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      itemsBatch/post: F[CatalogsItemsBatchPostRequest],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: itemsBatch/postResponses[F]
    ): F[Response[F]]


  }
  def itemsBatch/post: itemsBatch/post

}