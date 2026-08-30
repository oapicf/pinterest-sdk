package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.ConversionDeletionRequest
import org.openapitools.models.ConversionDeletionRequestCreate
import org.openapitools.models.ConversionDeletionRequestList200Response
import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder

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

final case class ConversionDeletionRequestsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: ConversionDeletionRequestsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object conversionDeletionRequest/create {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_deletion_requests") as auth =>
          delegate.conversionDeletionRequest/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ConversionDeletionRequestCreate] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_deletion_requests") as auth =>
          delegate.conversionDeletionRequest/create.handle_client_credentials(auth, req, req.asJsonDecode[ConversionDeletionRequestCreate] , ad_account_id, responses)

    }

    val responses: conversionDeletionRequest/createResponses[F] = new conversionDeletionRequest/createResponses[F] {
      def resp200(value: ConversionDeletionRequest): F[Response[F]] = Ok(value)
      def resp201(value: ConversionDeletionRequest): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object conversionDeletionRequest/delete {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/deleteResponses

    object request_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "ad_accounts" / request_idVarr(request_id) / "conversion_deletion_requests" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.conversionDeletionRequest/delete.handle_pinterest_oauth2(auth, req, request_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ DELETE -> Root / "ad_accounts" / request_idVarr(request_id) / "conversion_deletion_requests" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.conversionDeletionRequest/delete.handle_client_credentials(auth, req, request_id, ad_account_id, responses)

    }

    val responses: conversionDeletionRequest/deleteResponses[F] = new conversionDeletionRequest/deleteResponses[F] {
      def resp200(value: ConversionDeletionRequest): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object conversionDeletionRequest/get {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/getResponses

    object request_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / request_idVarr(request_id) / "conversion_deletion_requests" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.conversionDeletionRequest/get.handle_pinterest_oauth2(auth, req, request_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / request_idVarr(request_id) / "conversion_deletion_requests" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.conversionDeletionRequest/get.handle_client_credentials(auth, req, request_id, ad_account_id, responses)

    }

    val responses: conversionDeletionRequest/getResponses[F] = new conversionDeletionRequest/getResponses[F] {
      def resp200(value: ConversionDeletionRequest): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object conversionDeletionRequest/list {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_deletion_requests" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order)) as auth =>
        delegate.conversionDeletionRequest/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "conversion_deletion_requests" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order)) as auth =>
        delegate.conversionDeletionRequest/list.handle_client_credentials(auth, req, ad_account_id, bookmark, page_size, order, responses)

    }

    val responses: conversionDeletionRequest/listResponses[F] = new conversionDeletionRequest/listResponses[F] {
      def resp200(value: ConversionDeletionRequestList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    conversionDeletionRequest/create.routepinterest_oauth2 <+>
    conversionDeletionRequest/delete.routepinterest_oauth2 <+>
    conversionDeletionRequest/get.routepinterest_oauth2 <+>
    conversionDeletionRequest/list.routepinterest_oauth2
  val routesclient_credentials =
    conversionDeletionRequest/create.routeclient_credentials <+>
    conversionDeletionRequest/delete.routeclient_credentials <+>
    conversionDeletionRequest/get.routeclient_credentials <+>
    conversionDeletionRequest/list.routeclient_credentials
}

object ConversionDeletionRequestsApiDelegate {
  trait conversionDeletionRequest/createResponses[F[_]] {
    def resp200(value: ConversionDeletionRequest): F[Response[F]]
    def resp201(value: ConversionDeletionRequest): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait conversionDeletionRequest/deleteResponses[F[_]] {
    def resp200(value: ConversionDeletionRequest): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait conversionDeletionRequest/getResponses[F[_]] {
    def resp200(value: ConversionDeletionRequest): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait conversionDeletionRequest/listResponses[F[_]] {
    def resp200(value: ConversionDeletionRequestList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ConversionDeletionRequestsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait conversionDeletionRequest/create {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      conversionDeletionRequest/create: F[ConversionDeletionRequestCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionDeletionRequest/createResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      conversionDeletionRequest/create: F[ConversionDeletionRequestCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionDeletionRequest/createResponses[F]
    ): F[Response[F]]


  }
  def conversionDeletionRequest/create: conversionDeletionRequest/create


  trait conversionDeletionRequest/delete {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      requestId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionDeletionRequest/deleteResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      requestId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionDeletionRequest/deleteResponses[F]
    ): F[Response[F]]

  }
  def conversionDeletionRequest/delete: conversionDeletionRequest/delete


  trait conversionDeletionRequest/get {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      requestId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionDeletionRequest/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      requestId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: conversionDeletionRequest/getResponses[F]
    ): F[Response[F]]

  }
  def conversionDeletionRequest/get: conversionDeletionRequest/get


  trait conversionDeletionRequest/list {
    import ConversionDeletionRequestsApiDelegate.conversionDeletionRequest/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      responses: conversionDeletionRequest/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      responses: conversionDeletionRequest/listResponses[F]
    ): F[Response[F]]

  }
  def conversionDeletionRequest/list: conversionDeletionRequest/list

}