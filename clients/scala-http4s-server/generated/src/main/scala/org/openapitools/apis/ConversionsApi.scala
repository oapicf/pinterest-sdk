package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdvertiserDefinedEventsCreate200Response
import org.openapitools.models.AdvertiserDefinedEventsCreateRequest
import org.openapitools.models.AdvertiserDefinedEventsDelete200Response
import org.openapitools.models.AdvertiserDefinedEventsGet200Response
import org.openapitools.models.AdvertiserDefinedEventsUpdate200Response
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

final case class ConversionsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: ConversionsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object advertiserDefinedEvents/create {
    import ConversionsApiDelegate.advertiserDefinedEvents/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events") as auth =>
          delegate.advertiserDefinedEvents/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdvertiserDefinedEventsCreateRequest] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events") as auth =>
          delegate.advertiserDefinedEvents/create.handle_client_credentials(auth, req, req.asJsonDecode[AdvertiserDefinedEventsCreateRequest] , ad_account_id, responses)

    }

    val responses: advertiserDefinedEvents/createResponses[F] = new advertiserDefinedEvents/createResponses[F] {
      def resp200(value: AdvertiserDefinedEventsCreate200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object advertiserDefinedEvents/delete {
    import ConversionsApiDelegate.advertiserDefinedEvents/deleteResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object event_namesQueryParam extends QuerySeqParamDecoderMatcher[String]("event_names")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events" :? event_namesQueryParam(event_names)) as auth =>
        delegate.advertiserDefinedEvents/delete.handle_pinterest_oauth2(auth, req, ad_account_id, event_names, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ DELETE -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events" :? event_namesQueryParam(event_names)) as auth =>
        delegate.advertiserDefinedEvents/delete.handle_client_credentials(auth, req, ad_account_id, event_names, responses)

    }

    val responses: advertiserDefinedEvents/deleteResponses[F] = new advertiserDefinedEvents/deleteResponses[F] {
      def resp200(value: AdvertiserDefinedEventsDelete200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object advertiserDefinedEvents/get {
    import ConversionsApiDelegate.advertiserDefinedEvents/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events") as auth =>
        delegate.advertiserDefinedEvents/get.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events") as auth =>
        delegate.advertiserDefinedEvents/get.handle_client_credentials(auth, req, ad_account_id, responses)

    }

    val responses: advertiserDefinedEvents/getResponses[F] = new advertiserDefinedEvents/getResponses[F] {
      def resp200(value: AdvertiserDefinedEventsGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object advertiserDefinedEvents/update {
    import ConversionsApiDelegate.advertiserDefinedEvents/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events") as auth =>
          delegate.advertiserDefinedEvents/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdvertiserDefinedEventsCreateRequest] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "advertiser_defined_events") as auth =>
          delegate.advertiserDefinedEvents/update.handle_client_credentials(auth, req, req.asJsonDecode[AdvertiserDefinedEventsCreateRequest] , ad_account_id, responses)

    }

    val responses: advertiserDefinedEvents/updateResponses[F] = new advertiserDefinedEvents/updateResponses[F] {
      def resp200(value: AdvertiserDefinedEventsUpdate200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    advertiserDefinedEvents/create.routepinterest_oauth2 <+>
    advertiserDefinedEvents/delete.routepinterest_oauth2 <+>
    advertiserDefinedEvents/get.routepinterest_oauth2 <+>
    advertiserDefinedEvents/update.routepinterest_oauth2
  val routesclient_credentials =
    advertiserDefinedEvents/create.routeclient_credentials <+>
    advertiserDefinedEvents/delete.routeclient_credentials <+>
    advertiserDefinedEvents/get.routeclient_credentials <+>
    advertiserDefinedEvents/update.routeclient_credentials
}

object ConversionsApiDelegate {
  trait advertiserDefinedEvents/createResponses[F[_]] {
    def resp200(value: AdvertiserDefinedEventsCreate200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait advertiserDefinedEvents/deleteResponses[F[_]] {
    def resp200(value: AdvertiserDefinedEventsDelete200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait advertiserDefinedEvents/getResponses[F[_]] {
    def resp200(value: AdvertiserDefinedEventsGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait advertiserDefinedEvents/updateResponses[F[_]] {
    def resp200(value: AdvertiserDefinedEventsUpdate200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ConversionsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait advertiserDefinedEvents/create {
    import ConversionsApiDelegate.advertiserDefinedEvents/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      advertiserDefinedEvents/create: F[AdvertiserDefinedEventsCreateRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: advertiserDefinedEvents/createResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      advertiserDefinedEvents/create: F[AdvertiserDefinedEventsCreateRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: advertiserDefinedEvents/createResponses[F]
    ): F[Response[F]]


  }
  def advertiserDefinedEvents/create: advertiserDefinedEvents/create


  trait advertiserDefinedEvents/delete {
    import ConversionsApiDelegate.advertiserDefinedEvents/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      eventNames: List[String],
      responses: advertiserDefinedEvents/deleteResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      eventNames: List[String],
      responses: advertiserDefinedEvents/deleteResponses[F]
    ): F[Response[F]]

  }
  def advertiserDefinedEvents/delete: advertiserDefinedEvents/delete


  trait advertiserDefinedEvents/get {
    import ConversionsApiDelegate.advertiserDefinedEvents/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: advertiserDefinedEvents/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: advertiserDefinedEvents/getResponses[F]
    ): F[Response[F]]

  }
  def advertiserDefinedEvents/get: advertiserDefinedEvents/get


  trait advertiserDefinedEvents/update {
    import ConversionsApiDelegate.advertiserDefinedEvents/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      advertiserDefinedEvents/update: F[AdvertiserDefinedEventsCreateRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: advertiserDefinedEvents/updateResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      advertiserDefinedEvents/update: F[AdvertiserDefinedEventsCreateRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: advertiserDefinedEvents/updateResponses[F]
    ): F[Response[F]]


  }
  def advertiserDefinedEvents/update: advertiserDefinedEvents/update

}