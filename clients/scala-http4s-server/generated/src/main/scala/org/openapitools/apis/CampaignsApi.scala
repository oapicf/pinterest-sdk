package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdPinAnalytics
import org.openapitools.models.AdsAnalyticsCampaignTargetingType
import org.openapitools.models.Campaign
import org.openapitools.models.CampaignBatchUpdateItem
import org.openapitools.models.CampaignBatchWriteResponseModel
import org.openapitools.models.CampaignCreateItem
import org.openapitools.models.CampaignDeliveryEstimatesCampaign
import org.openapitools.models.CampaignDeliveryEstimatesResponse
import org.openapitools.models.CampaignsAnalyticsMetrics
import org.openapitools.models.CampaignsList200Response
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.EntityStatus
import org.openapitools.models.Granularity
import java.time.LocalDate
import org.openapitools.models.MetricsResponse
import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder
import org.openapitools.models.ReportingColumnSync
import org.openapitools.models.ReportingTimeZone

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

final case class CampaignsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: CampaignsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object adPins/analytics {
    import CampaignsApiDelegate.adPins/analyticsResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object campaign_idQueryParam extends QueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_id")
    object pin_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("pin_ids")
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "pins" / "analytics" :? campaign_idQueryParam(campaign_id) +& pin_idsQueryParam(pin_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time)) as auth =>
        delegate.adPins/analytics.handle_pinterest_oauth2(auth, req, ad_account_id, campaign_id, pin_ids, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "pins" / "analytics" :? campaign_idQueryParam(campaign_id) +& pin_idsQueryParam(pin_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time)) as auth =>
        delegate.adPins/analytics.handle_client_credentials(auth, req, ad_account_id, campaign_id, pin_ids, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, responses)

    }

    val responses: adPins/analyticsResponses[F] = new adPins/analyticsResponses[F] {
      def resp200(value: List[AdPinAnalytics]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaignTargetingAnalytics/get {
    import CampaignsApiDelegate.campaignTargetingAnalytics/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object campaign_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_ids")
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object targeting_typesQueryParam extends QuerySeqParamDecoderMatcher[AdsAnalyticsCampaignTargetingType]("targeting_types")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object attribution_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[ConversionReportAttributionType]("attribution_types")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns" / "targeting_analytics" :? campaign_idsQueryParam(campaign_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.campaignTargetingAnalytics/get.handle_pinterest_oauth2(auth, req, ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns" / "targeting_analytics" :? campaign_idsQueryParam(campaign_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.campaignTargetingAnalytics/get.handle_client_credentials(auth, req, ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, responses)

    }

    val responses: campaignTargetingAnalytics/getResponses[F] = new campaignTargetingAnalytics/getResponses[F] {
      def resp200(value: MetricsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaigns/analytics {
    import CampaignsApiDelegate.campaigns/analyticsResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object campaign_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_ids")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object aggregate_report_rowsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("aggregate_report_rows")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns" / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& campaign_idsQueryParam(campaign_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& aggregate_report_rowsQueryParam(aggregate_report_rows) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.campaigns/analytics.handle_pinterest_oauth2(auth, req, ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns" / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& campaign_idsQueryParam(campaign_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& aggregate_report_rowsQueryParam(aggregate_report_rows) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.campaigns/analytics.handle_client_credentials(auth, req, ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, responses)

    }

    val responses: campaigns/analyticsResponses[F] = new campaigns/analyticsResponses[F] {
      def resp200(value: List[CampaignsAnalyticsMetrics]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaigns/create {
    import CampaignsApiDelegate.campaigns/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns") as auth =>
          delegate.campaigns/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[CampaignCreateItem]] , ad_account_id, responses)

    }

    val responses: campaigns/createResponses[F] = new campaigns/createResponses[F] {
      def resp200(value: CampaignBatchWriteResponseModel): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaigns/get {
    import CampaignsApiDelegate.campaigns/getResponses

    object campaign_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / campaign_idVarr(campaign_id) / "campaigns" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.campaigns/get.handle_pinterest_oauth2(auth, req, campaign_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / campaign_idVarr(campaign_id) / "campaigns" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.campaigns/get.handle_client_credentials(auth, req, campaign_id, ad_account_id, responses)

    }

    val responses: campaigns/getResponses[F] = new campaigns/getResponses[F] {
      def resp200(value: Campaign): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaigns/list {
    import CampaignsApiDelegate.campaigns/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object campaign_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_ids")
    object entity_statusesQueryParam extends OptionalQuerySeqParamDecoderMatcher[EntityStatus]("entity_statuses")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& campaign_idsQueryParam(campaign_ids) +& entity_statusesQueryParam(entity_statuses)) as auth =>
        delegate.campaigns/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, campaign_ids, entity_statuses, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& campaign_idsQueryParam(campaign_ids) +& entity_statusesQueryParam(entity_statuses)) as auth =>
        delegate.campaigns/list.handle_client_credentials(auth, req, ad_account_id, bookmark, page_size, order, campaign_ids, entity_statuses, responses)

    }

    val responses: campaigns/listResponses[F] = new campaigns/listResponses[F] {
      def resp200(value: CampaignsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaigns/update {
    import CampaignsApiDelegate.campaigns/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns") as auth =>
          delegate.campaigns/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[CampaignBatchUpdateItem]] , ad_account_id, responses)

    }

    val responses: campaigns/updateResponses[F] = new campaigns/updateResponses[F] {
      def resp200(value: CampaignBatchWriteResponseModel): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object getCampaignDeliveryEstimates {
    import CampaignsApiDelegate.getCampaignDeliveryEstimatesResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaigns" / "delivery_estimates") as auth =>
          delegate.getCampaignDeliveryEstimates.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[CampaignDeliveryEstimatesCampaign]] , ad_account_id, responses)

    }

    val responses: getCampaignDeliveryEstimatesResponses[F] = new getCampaignDeliveryEstimatesResponses[F] {
      def resp200(value: CampaignDeliveryEstimatesResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp503(value: PinterestLibError): F[Response[F]] = ServiceUnavailable(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adPins/analytics.routepinterest_oauth2 <+>
    campaignTargetingAnalytics/get.routepinterest_oauth2 <+>
    campaigns/analytics.routepinterest_oauth2 <+>
    campaigns/create.routepinterest_oauth2 <+>
    campaigns/get.routepinterest_oauth2 <+>
    campaigns/list.routepinterest_oauth2 <+>
    campaigns/update.routepinterest_oauth2 <+>
    getCampaignDeliveryEstimates.routepinterest_oauth2
  val routesclient_credentials =
    adPins/analytics.routeclient_credentials <+>
    campaignTargetingAnalytics/get.routeclient_credentials <+>
    campaigns/analytics.routeclient_credentials <+>
    campaigns/get.routeclient_credentials <+>
    campaigns/list.routeclient_credentials
}

object CampaignsApiDelegate {
  trait adPins/analyticsResponses[F[_]] {
    def resp200(value: List[AdPinAnalytics]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaignTargetingAnalytics/getResponses[F[_]] {
    def resp200(value: MetricsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaigns/analyticsResponses[F[_]] {
    def resp200(value: List[CampaignsAnalyticsMetrics]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaigns/createResponses[F[_]] {
    def resp200(value: CampaignBatchWriteResponseModel): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaigns/getResponses[F[_]] {
    def resp200(value: Campaign): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaigns/listResponses[F[_]] {
    def resp200(value: CampaignsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaigns/updateResponses[F[_]] {
    def resp200(value: CampaignBatchWriteResponseModel): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait getCampaignDeliveryEstimatesResponses[F[_]] {
    def resp200(value: CampaignDeliveryEstimatesResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp503(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CampaignsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait adPins/analytics {
    import CampaignsApiDelegate.adPins/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      campaignId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      pinIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      responses: adPins/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      campaignId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      pinIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      responses: adPins/analyticsResponses[F]
    ): F[Response[F]]

  }
  def adPins/analytics: adPins/analytics


  trait campaignTargetingAnalytics/get {
    import CampaignsApiDelegate.campaignTargetingAnalytics/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      campaignIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsCampaignTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      responses: campaignTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      campaignIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsCampaignTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      responses: campaignTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

  }
  def campaignTargetingAnalytics/get: campaignTargetingAnalytics/get


  trait campaigns/analytics {
    import CampaignsApiDelegate.campaigns/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      campaignIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      aggregateReportRows: Option[Boolean],
      reportingTimezone: Option[ReportingTimeZone],
      responses: campaigns/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      campaignIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      aggregateReportRows: Option[Boolean],
      reportingTimezone: Option[ReportingTimeZone],
      responses: campaigns/analyticsResponses[F]
    ): F[Response[F]]

  }
  def campaigns/analytics: campaigns/analytics


  trait campaigns/create {
    import CampaignsApiDelegate.campaigns/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      campaigns/create: F[List[CampaignCreateItem]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: campaigns/createResponses[F]
    ): F[Response[F]]


  }
  def campaigns/create: campaigns/create


  trait campaigns/get {
    import CampaignsApiDelegate.campaigns/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      campaignId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: campaigns/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      campaignId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: campaigns/getResponses[F]
    ): F[Response[F]]

  }
  def campaigns/get: campaigns/get


  trait campaigns/list {
    import CampaignsApiDelegate.campaigns/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      entityStatuses: Option[List[EntityStatus]],
      responses: campaigns/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      entityStatuses: Option[List[EntityStatus]],
      responses: campaigns/listResponses[F]
    ): F[Response[F]]

  }
  def campaigns/list: campaigns/list


  trait campaigns/update {
    import CampaignsApiDelegate.campaigns/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      campaigns/update: F[List[CampaignBatchUpdateItem]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: campaigns/updateResponses[F]
    ): F[Response[F]]


  }
  def campaigns/update: campaigns/update


  trait getCampaignDeliveryEstimates {
    import CampaignsApiDelegate.getCampaignDeliveryEstimatesResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      getCampaignDeliveryEstimates: F[List[CampaignDeliveryEstimatesCampaign]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: getCampaignDeliveryEstimatesResponses[F]
    ): F[Response[F]]


  }
  def getCampaignDeliveryEstimates: getCampaignDeliveryEstimates

}