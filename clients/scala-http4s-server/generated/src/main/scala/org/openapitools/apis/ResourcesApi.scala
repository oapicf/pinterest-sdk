package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdAccountCountriesGet200Response
import org.openapitools.models.BookClosed
import org.openapitools.models.DeliveryMetricsGet200Response
import org.openapitools.models.PinterestLibError
import org.openapitools.models.PublicTargetingType
import org.openapitools.models.ReportType
import org.openapitools.models.SingleInterestTargetingOption

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

final case class ResourcesApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: ResourcesApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object adAccountCountries/get {
    import ResourcesApiDelegate.adAccountCountries/getResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "resources" / "ad_account_countries") as auth =>
        delegate.adAccountCountries/get.handle_pinterest_oauth2(auth, req, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "resources" / "ad_account_countries") as auth =>
        delegate.adAccountCountries/get.handle_client_credentials(auth, req, responses)

    }

    val responses: adAccountCountries/getResponses[F] = new adAccountCountries/getResponses[F] {
      def resp200(value: AdAccountCountriesGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object deliveryMetrics/get {
    import ResourcesApiDelegate.deliveryMetrics/getResponses

    object report_typeQueryParam extends OptionalQueryParamDecoderMatcher[ReportType]("report_type")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "resources" / "delivery_metrics" :? report_typeQueryParam(report_type)) as auth =>
        delegate.deliveryMetrics/get.handle_pinterest_oauth2(auth, req, report_type, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "resources" / "delivery_metrics" :? report_typeQueryParam(report_type)) as auth =>
        delegate.deliveryMetrics/get.handle_client_credentials(auth, req, report_type, responses)

    }

    val responses: deliveryMetrics/getResponses[F] = new deliveryMetrics/getResponses[F] {
      def resp200(value: DeliveryMetricsGet200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object interestTargetingOptions/get {
    import ResourcesApiDelegate.interestTargetingOptions/getResponses

    object interest_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "resources" / "targeting" / "interests" / interest_idVarr(interest_id)) as auth =>
        delegate.interestTargetingOptions/get.handle_pinterest_oauth2(auth, req, interest_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "resources" / "targeting" / "interests" / interest_idVarr(interest_id)) as auth =>
        delegate.interestTargetingOptions/get.handle_client_credentials(auth, req, interest_id, responses)

    }

    val responses: interestTargetingOptions/getResponses[F] = new interestTargetingOptions/getResponses[F] {
      def resp200(value: SingleInterestTargetingOption): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object leadFormQuestions/get {
    import ResourcesApiDelegate.leadFormQuestions/getResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "resources" / "lead_form_questions") as auth =>
        delegate.leadFormQuestions/get.handle_pinterest_oauth2(auth, req, responses)

    }

    val responses: leadFormQuestions/getResponses[F] = new leadFormQuestions/getResponses[F] {
      def resp200(): F[Response[F]] = Ok()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object metricsReadyState/get {
    import ResourcesApiDelegate.metricsReadyState/getResponses

    object dateQueryParam extends QueryParamDecoderMatcher[Refined[String, MatchesRegex["^\\d{4}-\\d{2}-\\d{2}$"]]]("date")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "resources" / "metrics_ready_state" :? dateQueryParam(date)) as auth =>
        delegate.metricsReadyState/get.handle_pinterest_oauth2(auth, req, date, responses)

    }

    val responses: metricsReadyState/getResponses[F] = new metricsReadyState/getResponses[F] {
      def resp200(value: BookClosed): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object targetingOptions/get {
    import ResourcesApiDelegate.targetingOptions/getResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object client_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("client_id")
    object oauth_signatureQueryParam extends OptionalQueryParamDecoderMatcher[String]("oauth_signature")
    object timestampQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MatchesRegex["\\d+"]]]("timestamp")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "resources" / "targeting" / PublicTargetingTypeVarr(targeting_type) :? ad_account_idQueryParam(ad_account_id) +& client_idQueryParam(client_id) +& oauth_signatureQueryParam(oauth_signature) +& timestampQueryParam(timestamp)) as auth =>
        delegate.targetingOptions/get.handle_pinterest_oauth2(auth, req, targeting_type, ad_account_id, client_id, oauth_signature, timestamp, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "resources" / "targeting" / PublicTargetingTypeVarr(targeting_type) :? ad_account_idQueryParam(ad_account_id) +& client_idQueryParam(client_id) +& oauth_signatureQueryParam(oauth_signature) +& timestampQueryParam(timestamp)) as auth =>
        delegate.targetingOptions/get.handle_client_credentials(auth, req, targeting_type, ad_account_id, client_id, oauth_signature, timestamp, responses)

    }

    val responses: targetingOptions/getResponses[F] = new targetingOptions/getResponses[F] {
      def resp200(value: List[Object]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adAccountCountries/get.routepinterest_oauth2 <+>
    deliveryMetrics/get.routepinterest_oauth2 <+>
    interestTargetingOptions/get.routepinterest_oauth2 <+>
    leadFormQuestions/get.routepinterest_oauth2 <+>
    metricsReadyState/get.routepinterest_oauth2 <+>
    targetingOptions/get.routepinterest_oauth2
  val routesclient_credentials =
    adAccountCountries/get.routeclient_credentials <+>
    deliveryMetrics/get.routeclient_credentials <+>
    interestTargetingOptions/get.routeclient_credentials <+>
    targetingOptions/get.routeclient_credentials
}

object ResourcesApiDelegate {
  trait adAccountCountries/getResponses[F[_]] {
    def resp200(value: AdAccountCountriesGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait deliveryMetrics/getResponses[F[_]] {
    def resp200(value: DeliveryMetricsGet200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait interestTargetingOptions/getResponses[F[_]] {
    def resp200(value: SingleInterestTargetingOption): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait leadFormQuestions/getResponses[F[_]] {
    def resp200(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait metricsReadyState/getResponses[F[_]] {
    def resp200(value: BookClosed): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait targetingOptions/getResponses[F[_]] {
    def resp200(value: List[Object]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait ResourcesApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait adAccountCountries/get {
    import ResourcesApiDelegate.adAccountCountries/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      responses: adAccountCountries/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      responses: adAccountCountries/getResponses[F]
    ): F[Response[F]]

  }
  def adAccountCountries/get: adAccountCountries/get


  trait deliveryMetrics/get {
    import ResourcesApiDelegate.deliveryMetrics/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      reportType: Option[ReportType],
      responses: deliveryMetrics/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      reportType: Option[ReportType],
      responses: deliveryMetrics/getResponses[F]
    ): F[Response[F]]

  }
  def deliveryMetrics/get: deliveryMetrics/get


  trait interestTargetingOptions/get {
    import ResourcesApiDelegate.interestTargetingOptions/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      interestId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: interestTargetingOptions/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      interestId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: interestTargetingOptions/getResponses[F]
    ): F[Response[F]]

  }
  def interestTargetingOptions/get: interestTargetingOptions/get


  trait leadFormQuestions/get {
    import ResourcesApiDelegate.leadFormQuestions/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      responses: leadFormQuestions/getResponses[F]
    ): F[Response[F]]

  }
  def leadFormQuestions/get: leadFormQuestions/get


  trait metricsReadyState/get {
    import ResourcesApiDelegate.metricsReadyState/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      date: Refined[String, MatchesRegex["^\\d{4}-\\d{2}-\\d{2}$"]],
      responses: metricsReadyState/getResponses[F]
    ): F[Response[F]]

  }
  def metricsReadyState/get: metricsReadyState/get


  trait targetingOptions/get {
    import ResourcesApiDelegate.targetingOptions/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      targetingType: PublicTargetingType,
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      clientId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      oauthSignature: Option[String],
      timestamp: Option[Refined[String, MatchesRegex["\\d+"]]],
      responses: targetingOptions/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      targetingType: PublicTargetingType,
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      clientId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      oauthSignature: Option[String],
      timestamp: Option[Refined[String, MatchesRegex["\\d+"]]],
      responses: targetingOptions/getResponses[F]
    ): F[Response[F]]

  }
  def targetingOptions/get: targetingOptions/get

}