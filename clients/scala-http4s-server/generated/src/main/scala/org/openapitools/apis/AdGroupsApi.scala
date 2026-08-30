package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdGroup
import org.openapitools.models.AdGroupAudienceSizing
import org.openapitools.models.AdGroupAudienceSizingCreate
import org.openapitools.models.AdGroupCreateCreate
import org.openapitools.models.AdGroupUpdateBatchUpdate
import org.openapitools.models.AdGroupsAnalyticsMetrics
import org.openapitools.models.AdGroupsCreate200Response
import org.openapitools.models.AdGroupsList200Response
import org.openapitools.models.AdGroupsUpdate200Response
import org.openapitools.models.AdsAnalyticsAdGroupTargetingType
import org.openapitools.models.BidFloor
import org.openapitools.models.BidFloorCreate
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.DynamicTitlesDownloadCSV
import org.openapitools.models.DynamicTitlesGetStatus
import org.openapitools.models.DynamicTitlesProcessCSV
import org.openapitools.models.DynamicTitlesProcessCSVCreate
import org.openapitools.models.DynamicTitlesUploadURL
import org.openapitools.models.EntityStatus
import org.openapitools.models.GetAdGroupsByPromotionIdsList200Response
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

final case class AdGroupsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: AdGroupsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object adGroups/analytics {
    import AdGroupsApiDelegate.adGroups/analyticsResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object ad_group_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_group_ids")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object aggregate_report_rowsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("aggregate_report_rows")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& ad_group_idsQueryParam(ad_group_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& aggregate_report_rowsQueryParam(aggregate_report_rows) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.adGroups/analytics.handle_pinterest_oauth2(auth, req, ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& ad_group_idsQueryParam(ad_group_ids) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& aggregate_report_rowsQueryParam(aggregate_report_rows) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.adGroups/analytics.handle_client_credentials(auth, req, ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, responses)

    }

    val responses: adGroups/analyticsResponses[F] = new adGroups/analyticsResponses[F] {
      def resp200(value: List[AdGroupsAnalyticsMetrics]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroups/audienceSizing {
    import AdGroupsApiDelegate.adGroups/audienceSizingResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / "audience_sizing") as auth =>
          delegate.adGroups/audienceSizing.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdGroupAudienceSizingCreate] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / "audience_sizing") as auth =>
          delegate.adGroups/audienceSizing.handle_client_credentials(auth, req, req.asJsonDecode[AdGroupAudienceSizingCreate] , ad_account_id, responses)

    }

    val responses: adGroups/audienceSizingResponses[F] = new adGroups/audienceSizingResponses[F] {
      def resp200(value: AdGroupAudienceSizing): F[Response[F]] = Ok(value)
      def resp201(value: AdGroupAudienceSizing): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroups/create {
    import AdGroupsApiDelegate.adGroups/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups") as auth =>
          delegate.adGroups/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[AdGroupCreateCreate]] , ad_account_id, responses)

    }

    val responses: adGroups/createResponses[F] = new adGroups/createResponses[F] {
      def resp200(value: AdGroupsCreate200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroups/get {
    import AdGroupsApiDelegate.adGroups/getResponses

    object ad_group_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_group_idVarr(ad_group_id) / "ad_groups" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.adGroups/get.handle_pinterest_oauth2(auth, req, ad_group_id, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_group_idVarr(ad_group_id) / "ad_groups" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.adGroups/get.handle_client_credentials(auth, req, ad_group_id, ad_account_id, responses)

    }

    val responses: adGroups/getResponses[F] = new adGroups/getResponses[F] {
      def resp200(value: AdGroup): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroups/list {
    import AdGroupsApiDelegate.adGroups/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object campaign_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_ids")
    object ad_group_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ad_group_ids")
    object entity_statusesQueryParam extends OptionalQuerySeqParamDecoderMatcher[EntityStatus]("entity_statuses")
    object translate_interests_to_namesQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("translate_interests_to_names")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& campaign_idsQueryParam(campaign_ids) +& ad_group_idsQueryParam(ad_group_ids) +& entity_statusesQueryParam(entity_statuses) +& translate_interests_to_namesQueryParam(translate_interests_to_names)) as auth =>
        delegate.adGroups/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, entity_statuses, translate_interests_to_names, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& campaign_idsQueryParam(campaign_ids) +& ad_group_idsQueryParam(ad_group_ids) +& entity_statusesQueryParam(entity_statuses) +& translate_interests_to_namesQueryParam(translate_interests_to_names)) as auth =>
        delegate.adGroups/list.handle_client_credentials(auth, req, ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, entity_statuses, translate_interests_to_names, responses)

    }

    val responses: adGroups/listResponses[F] = new adGroups/listResponses[F] {
      def resp200(value: AdGroupsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroups/update {
    import AdGroupsApiDelegate.adGroups/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups") as auth =>
          delegate.adGroups/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[AdGroupUpdateBatchUpdate]] , ad_account_id, responses)

    }

    val responses: adGroups/updateResponses[F] = new adGroups/updateResponses[F] {
      def resp200(value: AdGroupsUpdate200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroupsBidFloor/get {
    import AdGroupsApiDelegate.adGroupsBidFloor/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "bid_floor") as auth =>
          delegate.adGroupsBidFloor/get.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BidFloorCreate] , ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "bid_floor") as auth =>
          delegate.adGroupsBidFloor/get.handle_client_credentials(auth, req, req.asJsonDecode[BidFloorCreate] , ad_account_id, responses)

    }

    val responses: adGroupsBidFloor/getResponses[F] = new adGroupsBidFloor/getResponses[F] {
      def resp200(value: BidFloor): F[Response[F]] = Ok(value)
      def resp201(value: BidFloor): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroupsDynamicTitles/downloadCsv {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/downloadCsvResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_group_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / ad_group_idVarr(ad_group_id) / "dynamic_titles" / "csv") as auth =>
        delegate.adGroupsDynamicTitles/downloadCsv.handle_pinterest_oauth2(auth, req, ad_account_id, ad_group_id, responses)

    }

    val responses: adGroupsDynamicTitles/downloadCsvResponses[F] = new adGroupsDynamicTitles/downloadCsvResponses[F] {
      def resp200(value: DynamicTitlesDownloadCSV): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroupsDynamicTitles/getStatus {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/getStatusResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_group_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / ad_group_idVarr(ad_group_id) / "dynamic_titles" / "status") as auth =>
        delegate.adGroupsDynamicTitles/getStatus.handle_pinterest_oauth2(auth, req, ad_account_id, ad_group_id, responses)

    }

    val responses: adGroupsDynamicTitles/getStatusResponses[F] = new adGroupsDynamicTitles/getStatusResponses[F] {
      def resp200(value: DynamicTitlesGetStatus): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroupsDynamicTitles/getUploadUrl {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/getUploadUrlResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_group_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / ad_group_idVarr(ad_group_id) / "dynamic_titles" / "uploads") as auth =>
        delegate.adGroupsDynamicTitles/getUploadUrl.handle_pinterest_oauth2(auth, req, ad_account_id, ad_group_id, responses)

    }

    val responses: adGroupsDynamicTitles/getUploadUrlResponses[F] = new adGroupsDynamicTitles/getUploadUrlResponses[F] {
      def resp200(value: DynamicTitlesUploadURL): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroupsDynamicTitles/processCsv {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/processCsvResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_group_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / ad_group_idVarr(ad_group_id) / "dynamic_titles") as auth =>
          delegate.adGroupsDynamicTitles/processCsv.handle_pinterest_oauth2(auth, req, req.asJsonDecode[DynamicTitlesProcessCSVCreate] , ad_account_id, ad_group_id, responses)

    }

    val responses: adGroupsDynamicTitles/processCsvResponses[F] = new adGroupsDynamicTitles/processCsvResponses[F] {
      def resp200(value: DynamicTitlesProcessCSV): F[Response[F]] = Ok(value)
      def resp201(value: DynamicTitlesProcessCSV): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adGroupsTargetingAnalytics/get {
    import AdGroupsApiDelegate.adGroupsTargetingAnalytics/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object ad_group_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_group_ids")
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object targeting_typesQueryParam extends QuerySeqParamDecoderMatcher[AdsAnalyticsAdGroupTargetingType]("targeting_types")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object attribution_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[ConversionReportAttributionType]("attribution_types")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")
    object sort_columnsQueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("sort_columns")
    object sort_ascendingQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("sort_ascending")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / "targeting_analytics" :? ad_group_idsQueryParam(ad_group_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone) +& sort_columnsQueryParam(sort_columns) +& sort_ascendingQueryParam(sort_ascending)) as auth =>
        delegate.adGroupsTargetingAnalytics/get.handle_pinterest_oauth2(auth, req, ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "ad_groups" / "targeting_analytics" :? ad_group_idsQueryParam(ad_group_ids) +& start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone) +& sort_columnsQueryParam(sort_columns) +& sort_ascendingQueryParam(sort_ascending)) as auth =>
        delegate.adGroupsTargetingAnalytics/get.handle_client_credentials(auth, req, ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, responses)

    }

    val responses: adGroupsTargetingAnalytics/getResponses[F] = new adGroupsTargetingAnalytics/getResponses[F] {
      def resp200(value: MetricsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object getAdGroupsByPromotionIds/list {
    import AdGroupsApiDelegate.getAdGroupsByPromotionIds/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object promotion_idsQueryParam extends QuerySeqParamDecoderMatcher[String]("promotion_ids")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "promotion_applied_entities" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& promotion_idsQueryParam(promotion_ids)) as auth =>
        delegate.getAdGroupsByPromotionIds/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, promotion_ids, responses)

    }

    val responses: getAdGroupsByPromotionIds/listResponses[F] = new getAdGroupsByPromotionIds/listResponses[F] {
      def resp200(value: GetAdGroupsByPromotionIdsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adGroups/analytics.routepinterest_oauth2 <+>
    adGroups/audienceSizing.routepinterest_oauth2 <+>
    adGroups/create.routepinterest_oauth2 <+>
    adGroups/get.routepinterest_oauth2 <+>
    adGroups/list.routepinterest_oauth2 <+>
    adGroups/update.routepinterest_oauth2 <+>
    adGroupsBidFloor/get.routepinterest_oauth2 <+>
    adGroupsDynamicTitles/downloadCsv.routepinterest_oauth2 <+>
    adGroupsDynamicTitles/getStatus.routepinterest_oauth2 <+>
    adGroupsDynamicTitles/getUploadUrl.routepinterest_oauth2 <+>
    adGroupsDynamicTitles/processCsv.routepinterest_oauth2 <+>
    adGroupsTargetingAnalytics/get.routepinterest_oauth2 <+>
    getAdGroupsByPromotionIds/list.routepinterest_oauth2
  val routesclient_credentials =
    adGroups/analytics.routeclient_credentials <+>
    adGroups/audienceSizing.routeclient_credentials <+>
    adGroups/get.routeclient_credentials <+>
    adGroups/list.routeclient_credentials <+>
    adGroupsBidFloor/get.routeclient_credentials <+>
    adGroupsTargetingAnalytics/get.routeclient_credentials
}

object AdGroupsApiDelegate {
  trait adGroups/analyticsResponses[F[_]] {
    def resp200(value: List[AdGroupsAnalyticsMetrics]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroups/audienceSizingResponses[F[_]] {
    def resp200(value: AdGroupAudienceSizing): F[Response[F]]
    def resp201(value: AdGroupAudienceSizing): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroups/createResponses[F[_]] {
    def resp200(value: AdGroupsCreate200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroups/getResponses[F[_]] {
    def resp200(value: AdGroup): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroups/listResponses[F[_]] {
    def resp200(value: AdGroupsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroups/updateResponses[F[_]] {
    def resp200(value: AdGroupsUpdate200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroupsBidFloor/getResponses[F[_]] {
    def resp200(value: BidFloor): F[Response[F]]
    def resp201(value: BidFloor): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroupsDynamicTitles/downloadCsvResponses[F[_]] {
    def resp200(value: DynamicTitlesDownloadCSV): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroupsDynamicTitles/getStatusResponses[F[_]] {
    def resp200(value: DynamicTitlesGetStatus): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroupsDynamicTitles/getUploadUrlResponses[F[_]] {
    def resp200(value: DynamicTitlesUploadURL): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroupsDynamicTitles/processCsvResponses[F[_]] {
    def resp200(value: DynamicTitlesProcessCSV): F[Response[F]]
    def resp201(value: DynamicTitlesProcessCSV): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adGroupsTargetingAnalytics/getResponses[F[_]] {
    def resp200(value: MetricsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait getAdGroupsByPromotionIds/listResponses[F[_]] {
    def resp200(value: GetAdGroupsByPromotionIdsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait AdGroupsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait adGroups/analytics {
    import AdGroupsApiDelegate.adGroups/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      adGroupIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      aggregateReportRows: Option[Boolean],
      reportingTimezone: Option[ReportingTimeZone],
      responses: adGroups/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      adGroupIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      aggregateReportRows: Option[Boolean],
      reportingTimezone: Option[ReportingTimeZone],
      responses: adGroups/analyticsResponses[F]
    ): F[Response[F]]

  }
  def adGroups/analytics: adGroups/analytics


  trait adGroups/audienceSizing {
    import AdGroupsApiDelegate.adGroups/audienceSizingResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adGroups/audienceSizing: F[AdGroupAudienceSizingCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroups/audienceSizingResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adGroups/audienceSizing: F[AdGroupAudienceSizingCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroups/audienceSizingResponses[F]
    ): F[Response[F]]


  }
  def adGroups/audienceSizing: adGroups/audienceSizing


  trait adGroups/create {
    import AdGroupsApiDelegate.adGroups/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adGroups/create: F[List[AdGroupCreateCreate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroups/createResponses[F]
    ): F[Response[F]]


  }
  def adGroups/create: adGroups/create


  trait adGroups/get {
    import AdGroupsApiDelegate.adGroups/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adGroupId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroups/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adGroupId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroups/getResponses[F]
    ): F[Response[F]]

  }
  def adGroups/get: adGroups/get


  trait adGroups/list {
    import AdGroupsApiDelegate.adGroups/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      adGroupIds: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      entityStatuses: Option[List[EntityStatus]],
      translateInterestsToNames: Option[Boolean],
      responses: adGroups/listResponses[F]
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
      entityStatuses: Option[List[EntityStatus]],
      translateInterestsToNames: Option[Boolean],
      responses: adGroups/listResponses[F]
    ): F[Response[F]]

  }
  def adGroups/list: adGroups/list


  trait adGroups/update {
    import AdGroupsApiDelegate.adGroups/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adGroups/update: F[List[AdGroupUpdateBatchUpdate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroups/updateResponses[F]
    ): F[Response[F]]


  }
  def adGroups/update: adGroups/update


  trait adGroupsBidFloor/get {
    import AdGroupsApiDelegate.adGroupsBidFloor/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adGroupsBidFloor/get: F[BidFloorCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroupsBidFloor/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adGroupsBidFloor/get: F[BidFloorCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroupsBidFloor/getResponses[F]
    ): F[Response[F]]


  }
  def adGroupsBidFloor/get: adGroupsBidFloor/get


  trait adGroupsDynamicTitles/downloadCsv {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/downloadCsvResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroupsDynamicTitles/downloadCsvResponses[F]
    ): F[Response[F]]

  }
  def adGroupsDynamicTitles/downloadCsv: adGroupsDynamicTitles/downloadCsv


  trait adGroupsDynamicTitles/getStatus {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/getStatusResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroupsDynamicTitles/getStatusResponses[F]
    ): F[Response[F]]

  }
  def adGroupsDynamicTitles/getStatus: adGroupsDynamicTitles/getStatus


  trait adGroupsDynamicTitles/getUploadUrl {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/getUploadUrlResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroupsDynamicTitles/getUploadUrlResponses[F]
    ): F[Response[F]]

  }
  def adGroupsDynamicTitles/getUploadUrl: adGroupsDynamicTitles/getUploadUrl


  trait adGroupsDynamicTitles/processCsv {
    import AdGroupsApiDelegate.adGroupsDynamicTitles/processCsvResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adGroupsDynamicTitles/processCsv: F[DynamicTitlesProcessCSVCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adGroupsDynamicTitles/processCsvResponses[F]
    ): F[Response[F]]


  }
  def adGroupsDynamicTitles/processCsv: adGroupsDynamicTitles/processCsv


  trait adGroupsTargetingAnalytics/get {
    import AdGroupsApiDelegate.adGroupsTargetingAnalytics/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsAdGroupTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      sortColumns: Option[List[String]],
      sortAscending: Option[Boolean],
      responses: adGroupsTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      adGroupIds: List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsAdGroupTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      sortColumns: Option[List[String]],
      sortAscending: Option[Boolean],
      responses: adGroupsTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

  }
  def adGroupsTargetingAnalytics/get: adGroupsTargetingAnalytics/get


  trait getAdGroupsByPromotionIds/list {
    import AdGroupsApiDelegate.getAdGroupsByPromotionIds/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      promotionIds: List[String],
      responses: getAdGroupsByPromotionIds/listResponses[F]
    ): F[Response[F]]

  }
  def getAdGroupsByPromotionIds/list: getAdGroupsByPromotionIds/list

}