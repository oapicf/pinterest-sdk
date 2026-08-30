package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Ad
import org.openapitools.models.AdBatchUpdate
import org.openapitools.models.AdBatchWriteResponseModel
import org.openapitools.models.AdCreate
import org.openapitools.models.AdPreviewRequest
import org.openapitools.models.AdPreviewURLResponse
import org.openapitools.models.AdsAnalytics
import org.openapitools.models.AdsAnalyticsAdTargetingType
import org.openapitools.models.AdsList200Response
import org.openapitools.models.CampaignAdPreview
import org.openapitools.models.CampaignAdPreviewCreate
import org.openapitools.models.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.models.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.models.ConversionAttributionWindowDays
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.ConversionReportTimeType
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

final case class AdsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: AdsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object adPreviews/create {
    import AdsApiDelegate.adPreviews/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_previews") as auth =>
          delegate.adPreviews/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdPreviewRequest] , ad_account_id, responses)

    }

    val responses: adPreviews/createResponses[F] = new adPreviews/createResponses[F] {
      def resp200(value: AdPreviewURLResponse): F[Response[F]] = Ok(value)
      def resp201(value: AdPreviewURLResponse): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adTargetingAnalytics/get {
    import AdsApiDelegate.adTargetingAnalytics/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ad_ids")
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object targeting_typesQueryParam extends QuerySeqParamDecoderMatcher[AdsAnalyticsAdTargetingType]("targeting_types")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[ConversionAttributionWindowDays]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[ConversionAttributionWindowDays]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[ConversionAttributionWindowDays]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[ConversionReportTimeType]("conversion_report_time")
    object attribution_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[ConversionReportAttributionType]("attribution_types")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")
    object sort_columnsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("sort_columns")
    object sort_ascendingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("sort_ascending")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads" / "targeting_analytics" :? ad_idsQueryParam(ad_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone) +& sort_columnsQueryParam(sort_columns) +& sort_ascendingQueryParam(sort_ascending)) as auth =>
        delegate.adTargetingAnalytics/get.handle_pinterest_oauth2(auth, req, ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads" / "targeting_analytics" :? ad_idsQueryParam(ad_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone) +& sort_columnsQueryParam(sort_columns) +& sort_ascendingQueryParam(sort_ascending)) as auth =>
        delegate.adTargetingAnalytics/get.handle_client_credentials(auth, req, ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, responses)

    }

    val responses: adTargetingAnalytics/getResponses[F] = new adTargetingAnalytics/getResponses[F] {
      def resp200(value: MetricsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ads/analytics {
    import AdsApiDelegate.ads/analyticsResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object pin_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("pin_ids")
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object ad_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ad_ids")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object campaign_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_ids")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads" / "analytics" :? pin_idsQueryParam(pin_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& ad_idsQueryParam(ad_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& campaign_idsQueryParam(campaign_ids) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.ads/analytics.handle_pinterest_oauth2(auth, req, ad_account_id, pin_ids, start_date, end_date, ad_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, campaign_ids, reporting_timezone, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads" / "analytics" :? pin_idsQueryParam(pin_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& ad_idsQueryParam(ad_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& campaign_idsQueryParam(campaign_ids) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.ads/analytics.handle_client_credentials(auth, req, ad_account_id, pin_ids, start_date, end_date, ad_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, campaign_ids, reporting_timezone, responses)

    }

    val responses: ads/analyticsResponses[F] = new ads/analyticsResponses[F] {
      def resp200(value: List[AdsAnalytics]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ads/create {
    import AdsApiDelegate.ads/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads") as auth =>
          delegate.ads/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[AdCreate]] , ad_account_id, responses)

    }

    val responses: ads/createResponses[F] = new ads/createResponses[F] {
      def resp200(value: AdBatchWriteResponseModel): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ads/get {
    import AdsApiDelegate.ads/getResponses

    object ad_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_idVarr(ad_id) / "ads" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.ads/get.handle_pinterest_oauth2(auth, req, ad_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_idVarr(ad_id) / "ads" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.ads/get.handle_client_credentials(auth, req, ad_id, ad_account_id, responses)

    }

    val responses: ads/getResponses[F] = new ads/getResponses[F] {
      def resp200(value: Ad): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ads/list {
    import AdsApiDelegate.ads/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object campaign_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_ids")
    object ad_group_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ad_group_ids")
    object ad_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ad_ids")
    object entity_statusesQueryParam extends OptionalQuerySeqParamDecoderMatcher[EntityStatus]("entity_statuses")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& campaign_idsQueryParam(campaign_ids) +& ad_group_idsQueryParam(ad_group_ids) +& ad_idsQueryParam(ad_ids) +& entity_statusesQueryParam(entity_statuses)) as auth =>
        delegate.ads/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, ad_ids, entity_statuses, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& campaign_idsQueryParam(campaign_ids) +& ad_group_idsQueryParam(ad_group_ids) +& ad_idsQueryParam(ad_ids) +& entity_statusesQueryParam(entity_statuses)) as auth =>
        delegate.ads/list.handle_client_credentials(auth, req, ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, ad_ids, entity_statuses, responses)

    }

    val responses: ads/listResponses[F] = new ads/listResponses[F] {
      def resp200(value: AdsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object ads/update {
    import AdsApiDelegate.ads/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ads") as auth =>
          delegate.ads/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[AdBatchUpdate]] , ad_account_id, responses)

    }

    val responses: ads/updateResponses[F] = new ads/updateResponses[F] {
      def resp200(value: AdBatchWriteResponseModel): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaignAdPreview/create {
    import AdsApiDelegate.campaignAdPreview/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaign_ad_preview") as auth =>
          delegate.campaignAdPreview/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[CampaignAdPreviewCreate]] , ad_account_id, responses)

    }

    val responses: campaignAdPreview/createResponses[F] = new campaignAdPreview/createResponses[F] {
      def resp200(value: List[CampaignAdPreviewCreate200ResponseInner]): F[Response[F]] = Ok(value)
      def resp201(value: List[CampaignAdPreview]): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaignAdPreview/delete {
    import AdsApiDelegate.campaignAdPreview/deleteResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_group_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_group_ids")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaign_ad_preview" :? ad_group_idsQueryParam(ad_group_ids)) as auth =>
        delegate.campaignAdPreview/delete.handle_pinterest_oauth2(auth, req, ad_account_id, ad_group_ids, responses)

    }

    val responses: campaignAdPreview/deleteResponses[F] = new campaignAdPreview/deleteResponses[F] {
      def resp200(value: List[CampaignAdPreviewDelete200ResponseInner]): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object campaignAdPreview/read {
    import AdsApiDelegate.campaignAdPreview/readResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_group_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_group_ids")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "campaign_ad_preview" :? ad_group_idsQueryParam(ad_group_ids)) as auth =>
        delegate.campaignAdPreview/read.handle_pinterest_oauth2(auth, req, ad_account_id, ad_group_ids, responses)

    }

    val responses: campaignAdPreview/readResponses[F] = new campaignAdPreview/readResponses[F] {
      def resp200(value: List[CampaignAdPreview]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adPreviews/create.routepinterest_oauth2 <+>
    adTargetingAnalytics/get.routepinterest_oauth2 <+>
    ads/analytics.routepinterest_oauth2 <+>
    ads/create.routepinterest_oauth2 <+>
    ads/get.routepinterest_oauth2 <+>
    ads/list.routepinterest_oauth2 <+>
    ads/update.routepinterest_oauth2 <+>
    campaignAdPreview/create.routepinterest_oauth2 <+>
    campaignAdPreview/delete.routepinterest_oauth2 <+>
    campaignAdPreview/read.routepinterest_oauth2
  val routesclient_credentials =
    adTargetingAnalytics/get.routeclient_credentials <+>
    ads/analytics.routeclient_credentials <+>
    ads/get.routeclient_credentials <+>
    ads/list.routeclient_credentials
}

object AdsApiDelegate {
  trait adPreviews/createResponses[F[_]] {
    def resp200(value: AdPreviewURLResponse): F[Response[F]]
    def resp201(value: AdPreviewURLResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adTargetingAnalytics/getResponses[F[_]] {
    def resp200(value: MetricsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ads/analyticsResponses[F[_]] {
    def resp200(value: List[AdsAnalytics]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ads/createResponses[F[_]] {
    def resp200(value: AdBatchWriteResponseModel): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ads/getResponses[F[_]] {
    def resp200(value: Ad): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ads/listResponses[F[_]] {
    def resp200(value: AdsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait ads/updateResponses[F[_]] {
    def resp200(value: AdBatchWriteResponseModel): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaignAdPreview/createResponses[F[_]] {
    def resp200(value: List[CampaignAdPreviewCreate200ResponseInner]): F[Response[F]]
    def resp201(value: List[CampaignAdPreview]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaignAdPreview/deleteResponses[F[_]] {
    def resp200(value: List[CampaignAdPreviewDelete200ResponseInner]): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait campaignAdPreview/readResponses[F[_]] {
    def resp200(value: List[CampaignAdPreview]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait AdsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait adPreviews/create {
    import AdsApiDelegate.adPreviews/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adPreviews/create: F[AdPreviewRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adPreviews/createResponses[F]
    ): F[Response[F]]


  }
  def adPreviews/create: adPreviews/create


  trait adTargetingAnalytics/get {
    import AdsApiDelegate.adTargetingAnalytics/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsAdTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[ConversionAttributionWindowDays],
      engagementWindowDays: Option[ConversionAttributionWindowDays],
      viewWindowDays: Option[ConversionAttributionWindowDays],
      conversionReportTime: Option[ConversionReportTimeType],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      sortColumns: Option[List[String]],
      sortAscending: Option[Boolean],
      responses: adTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsAdTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[ConversionAttributionWindowDays],
      engagementWindowDays: Option[ConversionAttributionWindowDays],
      viewWindowDays: Option[ConversionAttributionWindowDays],
      conversionReportTime: Option[ConversionReportTimeType],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      sortColumns: Option[List[String]],
      sortAscending: Option[Boolean],
      responses: adTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

  }
  def adTargetingAnalytics/get: adTargetingAnalytics/get


  trait ads/analytics {
    import AdsApiDelegate.ads/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      pinIds: Option[List[String]],
      startDate: LocalDate,
      endDate: LocalDate,
      adIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      reportingTimezone: Option[ReportingTimeZone],
      responses: ads/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      pinIds: Option[List[String]],
      startDate: LocalDate,
      endDate: LocalDate,
      adIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      reportingTimezone: Option[ReportingTimeZone],
      responses: ads/analyticsResponses[F]
    ): F[Response[F]]

  }
  def ads/analytics: ads/analytics


  trait ads/create {
    import AdsApiDelegate.ads/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      ads/create: F[List[AdCreate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ads/createResponses[F]
    ): F[Response[F]]


  }
  def ads/create: ads/create


  trait ads/get {
    import AdsApiDelegate.ads/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ads/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ads/getResponses[F]
    ): F[Response[F]]

  }
  def ads/get: ads/get


  trait ads/list {
    import AdsApiDelegate.ads/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      adGroupIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      adIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      entityStatuses: Option[List[EntityStatus]],
      responses: ads/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      adGroupIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      adIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      entityStatuses: Option[List[EntityStatus]],
      responses: ads/listResponses[F]
    ): F[Response[F]]

  }
  def ads/list: ads/list


  trait ads/update {
    import AdsApiDelegate.ads/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      ads/update: F[List[AdBatchUpdate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: ads/updateResponses[F]
    ): F[Response[F]]


  }
  def ads/update: ads/update


  trait campaignAdPreview/create {
    import AdsApiDelegate.campaignAdPreview/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      campaignAdPreview/create: F[List[CampaignAdPreviewCreate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: campaignAdPreview/createResponses[F]
    ): F[Response[F]]


  }
  def campaignAdPreview/create: campaignAdPreview/create


  trait campaignAdPreview/delete {
    import AdsApiDelegate.campaignAdPreview/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: campaignAdPreview/deleteResponses[F]
    ): F[Response[F]]

  }
  def campaignAdPreview/delete: campaignAdPreview/delete


  trait campaignAdPreview/read {
    import AdsApiDelegate.campaignAdPreview/readResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: campaignAdPreview/readResponses[F]
    ): F[Response[F]]

  }
  def campaignAdPreview/read: campaignAdPreview/read

}