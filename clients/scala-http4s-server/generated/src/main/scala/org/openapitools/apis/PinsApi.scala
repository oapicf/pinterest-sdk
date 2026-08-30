package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreativeType
import java.time.LocalDate
import org.openapitools.models.MultiPinsAnalyticsMetricTypesItem
import org.openapitools.models.Pin
import org.openapitools.models.PinAnalyticsMetricsResponse
import org.openapitools.models.PinCreate
import org.openapitools.models.PinFilter
import org.openapitools.models.PinType
import org.openapitools.models.PinUpdate
import org.openapitools.models.PinsList200Response
import org.openapitools.models.PinsSaveRequestCreate
import org.openapitools.models.PinterestLibError
import org.openapitools.models.QuerypinanalyticsmetrictypesItems

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.collection.MinSize
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

final case class PinsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: PinsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object multiPins/analytics {
    import PinsApiDelegate.multiPins/analyticsResponses

    object pin_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("pin_ids")
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object app_typesQueryParam extends OptionalQueryParamDecoderMatcher[String]("app_types")
    object metric_typesQueryParam extends QuerySeqParamDecoderMatcher[MultiPinsAnalyticsMetricTypesItem]("metric_types")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "pins" / "analytics" :? pin_idsQueryParam(pin_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& app_typesQueryParam(app_types) +& metric_typesQueryParam(metric_types) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.multiPins/analytics.handle_pinterest_oauth2(auth, req, pin_ids, start_date, end_date, app_types, metric_types, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "pins" / "analytics" :? pin_idsQueryParam(pin_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& app_typesQueryParam(app_types) +& metric_typesQueryParam(metric_types) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.multiPins/analytics.handle_client_credentials(auth, req, pin_ids, start_date, end_date, app_types, metric_types, ad_account_id, responses)

    }

    val responses: multiPins/analyticsResponses[F] = new multiPins/analyticsResponses[F] {
      def resp200(value: Map[String, Map]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pins/analytics {
    import PinsApiDelegate.pins/analyticsResponses

    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object app_typesQueryParam extends OptionalQueryParamDecoderMatcher[String]("app_types")
    object metric_typesQueryParam extends QuerySeqParamDecoderMatcher[QuerypinanalyticsmetrictypesItems]("metric_types")
    object split_fieldQueryParam extends OptionalQueryParamDecoderMatcher[String]("split_field")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "pins" / pin_id / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& app_typesQueryParam(app_types) +& metric_typesQueryParam(metric_types) +& split_fieldQueryParam(split_field) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.pins/analytics.handle_pinterest_oauth2(auth, req, pin_id, start_date, end_date, app_types, metric_types, split_field, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "pins" / pin_id / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& app_typesQueryParam(app_types) +& metric_typesQueryParam(metric_types) +& split_fieldQueryParam(split_field) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.pins/analytics.handle_client_credentials(auth, req, pin_id, start_date, end_date, app_types, metric_types, split_field, ad_account_id, responses)

    }

    val responses: pins/analyticsResponses[F] = new pins/analyticsResponses[F] {
      def resp200(value: Map[String, PinAnalyticsMetricsResponse]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pins/create {
    import PinsApiDelegate.pins/createResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "pins" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.pins/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[PinCreate] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "pins" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.pins/create.handle_client_credentials(auth, req, req.asJsonDecode[PinCreate] , ad_account_id, responses)

    }

    val responses: pins/createResponses[F] = new pins/createResponses[F] {
      def resp200(value: Pin): F[Response[F]] = Ok(value)
      def resp201(value: Pin): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pins/delete {
    import PinsApiDelegate.pins/deleteResponses

    object pin_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "pins" / pin_idVarr(pin_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.pins/delete.handle_pinterest_oauth2(auth, req, pin_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ DELETE -> Root / "pins" / pin_idVarr(pin_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.pins/delete.handle_client_credentials(auth, req, pin_id, ad_account_id, responses)

    }

    val responses: pins/deleteResponses[F] = new pins/deleteResponses[F] {
      def resp200(value: Pin): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pins/get {
    import PinsApiDelegate.pins/getResponses

    object pin_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object pin_metricsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("pin_metrics")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "pins" / pin_idVarr(pin_id) :? ad_account_idQueryParam(ad_account_id) +& pin_metricsQueryParam(pin_metrics)) as auth =>
        delegate.pins/get.handle_pinterest_oauth2(auth, req, pin_id, ad_account_id, pin_metrics, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "pins" / pin_idVarr(pin_id) :? ad_account_idQueryParam(ad_account_id) +& pin_metricsQueryParam(pin_metrics)) as auth =>
        delegate.pins/get.handle_client_credentials(auth, req, pin_id, ad_account_id, pin_metrics, responses)

    }

    val responses: pins/getResponses[F] = new pins/getResponses[F] {
      def resp200(value: Pin): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pins/list {
    import PinsApiDelegate.pins/listResponses

    object pin_filterQueryParam extends OptionalQueryParamDecoderMatcher[PinFilter]("pin_filter")
    object pin_metricsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("pin_metrics")
    object include_protected_pinsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_protected_pins")
    object pin_typeQueryParam extends OptionalQueryParamDecoderMatcher[PinType]("pin_type")
    object creative_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[CreativeType]("creative_types")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object domainQueryParam extends OptionalQueryParamDecoderMatcher[String]("domain")
    object domainsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("domains")
    object include_product_tag_objQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_product_tag_obj")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "pins" :? pin_filterQueryParam(pin_filter) +& pin_metricsQueryParam(pin_metrics) +& include_protected_pinsQueryParam(include_protected_pins) +& pin_typeQueryParam(pin_type) +& creative_typesQueryParam(creative_types) +& ad_account_idQueryParam(ad_account_id) +& domainQueryParam(domain) +& domainsQueryParam(domains) +& include_product_tag_objQueryParam(include_product_tag_obj) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.pins/list.handle_pinterest_oauth2(auth, req, pin_filter, pin_metrics, include_protected_pins, pin_type, creative_types, ad_account_id, domain, domains, include_product_tag_obj, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "pins" :? pin_filterQueryParam(pin_filter) +& pin_metricsQueryParam(pin_metrics) +& include_protected_pinsQueryParam(include_protected_pins) +& pin_typeQueryParam(pin_type) +& creative_typesQueryParam(creative_types) +& ad_account_idQueryParam(ad_account_id) +& domainQueryParam(domain) +& domainsQueryParam(domains) +& include_product_tag_objQueryParam(include_product_tag_obj) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.pins/list.handle_client_credentials(auth, req, pin_filter, pin_metrics, include_protected_pins, pin_type, creative_types, ad_account_id, domain, domains, include_product_tag_obj, bookmark, page_size, responses)

    }

    val responses: pins/listResponses[F] = new pins/listResponses[F] {
      def resp200(value: PinsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pins/save {
    import PinsApiDelegate.pins/saveResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "pins" / pin_id / "save" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.pins/save.handle_pinterest_oauth2(auth, req, req.asJsonDecode[PinsSaveRequestCreate] , pin_id, ad_account_id, responses)

    }

    val responses: pins/saveResponses[F] = new pins/saveResponses[F] {
      def resp201(value: Pin): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object pins/update {
    import PinsApiDelegate.pins/updateResponses

    object pin_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "pins" / pin_idVarr(pin_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.pins/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[PinUpdate] , pin_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ PATCH -> Root / "pins" / pin_idVarr(pin_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.pins/update.handle_client_credentials(auth, req, req.asJsonDecode[PinUpdate] , pin_id, ad_account_id, responses)

    }

    val responses: pins/updateResponses[F] = new pins/updateResponses[F] {
      def resp200(value: Pin): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    multiPins/analytics.routepinterest_oauth2 <+>
    pins/analytics.routepinterest_oauth2 <+>
    pins/create.routepinterest_oauth2 <+>
    pins/delete.routepinterest_oauth2 <+>
    pins/get.routepinterest_oauth2 <+>
    pins/list.routepinterest_oauth2 <+>
    pins/save.routepinterest_oauth2 <+>
    pins/update.routepinterest_oauth2
  val routesclient_credentials =
    multiPins/analytics.routeclient_credentials <+>
    pins/analytics.routeclient_credentials <+>
    pins/create.routeclient_credentials <+>
    pins/delete.routeclient_credentials <+>
    pins/get.routeclient_credentials <+>
    pins/list.routeclient_credentials <+>
    pins/update.routeclient_credentials
}

object PinsApiDelegate {
  trait multiPins/analyticsResponses[F[_]] {
    def resp200(value: Map[String, Map]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pins/analyticsResponses[F[_]] {
    def resp200(value: Map[String, PinAnalyticsMetricsResponse]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pins/createResponses[F[_]] {
    def resp200(value: Pin): F[Response[F]]
    def resp201(value: Pin): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pins/deleteResponses[F[_]] {
    def resp200(value: Pin): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pins/getResponses[F[_]] {
    def resp200(value: Pin): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pins/listResponses[F[_]] {
    def resp200(value: PinsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pins/saveResponses[F[_]] {
    def resp201(value: Pin): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait pins/updateResponses[F[_]] {
    def resp200(value: Pin): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait PinsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait multiPins/analytics {
    import PinsApiDelegate.multiPins/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pinIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      appTypes: Option[String],
      metricTypes: List[MultiPinsAnalyticsMetricTypesItem],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: multiPins/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      pinIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      appTypes: Option[String],
      metricTypes: List[MultiPinsAnalyticsMetricTypesItem],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: multiPins/analyticsResponses[F]
    ): F[Response[F]]

  }
  def multiPins/analytics: multiPins/analytics


  trait pins/analytics {
    import PinsApiDelegate.pins/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pinId: String,
      startDate: LocalDate,
      endDate: LocalDate,
      appTypes: Option[String],
      metricTypes: List[QuerypinanalyticsmetrictypesItems],
      splitField: Option[String],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      pinId: String,
      startDate: LocalDate,
      endDate: LocalDate,
      appTypes: Option[String],
      metricTypes: List[QuerypinanalyticsmetrictypesItems],
      splitField: Option[String],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/analyticsResponses[F]
    ): F[Response[F]]

  }
  def pins/analytics: pins/analytics


  trait pins/create {
    import PinsApiDelegate.pins/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pins/create: F[PinCreate],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/createResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      pins/create: F[PinCreate],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/createResponses[F]
    ): F[Response[F]]


  }
  def pins/create: pins/create


  trait pins/delete {
    import PinsApiDelegate.pins/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/deleteResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/deleteResponses[F]
    ): F[Response[F]]

  }
  def pins/delete: pins/delete


  trait pins/get {
    import PinsApiDelegate.pins/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      pinMetrics: Option[Boolean],
      responses: pins/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      pinMetrics: Option[Boolean],
      responses: pins/getResponses[F]
    ): F[Response[F]]

  }
  def pins/get: pins/get


  trait pins/list {
    import PinsApiDelegate.pins/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pinFilter: Option[PinFilter],
      pinMetrics: Option[Boolean],
      includeProtectedPins: Option[Boolean],
      pinType: Option[PinType],
      creativeTypes: Option[List[CreativeType]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      domain: Option[String],
      domains: Option[List[String]],
      includeProductTagObj: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: pins/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      pinFilter: Option[PinFilter],
      pinMetrics: Option[Boolean],
      includeProtectedPins: Option[Boolean],
      pinType: Option[PinType],
      creativeTypes: Option[List[CreativeType]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      domain: Option[String],
      domains: Option[List[String]],
      includeProductTagObj: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: pins/listResponses[F]
    ): F[Response[F]]

  }
  def pins/list: pins/list


  trait pins/save {
    import PinsApiDelegate.pins/saveResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pins/save: F[PinsSaveRequestCreate],
      pinId: String,
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/saveResponses[F]
    ): F[Response[F]]


  }
  def pins/save: pins/save


  trait pins/update {
    import PinsApiDelegate.pins/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      pins/update: F[PinUpdate],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/updateResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      pins/update: F[PinUpdate],
      pinId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: pins/updateResponses[F]
    ): F[Response[F]]


  }
  def pins/update: pins/update

}