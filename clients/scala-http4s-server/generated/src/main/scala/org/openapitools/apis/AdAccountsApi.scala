package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdAccount
import org.openapitools.models.AdAccountAnalyticsItems
import org.openapitools.models.AdAccountCreate
import org.openapitools.models.AdAccountsList200Response
import org.openapitools.models.AdsAnalyticsAccountTargetingType
import org.openapitools.models.AdsAnalyticsCreateAsyncRequest
import org.openapitools.models.AdsAnalyticsCreateAsyncResponse
import org.openapitools.models.AdsAnalyticsGetAsyncResponse
import org.openapitools.models.ConversionProductReport
import org.openapitools.models.ConversionProductReportCreate
import org.openapitools.models.ConversionReportAttributionType
import org.openapitools.models.Granularity
import java.time.LocalDate
import org.openapitools.models.MMMReport
import org.openapitools.models.MMMReportCreate
import org.openapitools.models.MetricsResponse
import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder
import org.openapitools.models.ReportingColumnSync
import org.openapitools.models.ReportingTimeZone
import org.openapitools.models.TemplateBasedReport
import org.openapitools.models.TemplatesList200Response

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

final case class AdAccountsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: AdAccountsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object adAccount/analytics {
    import AdAccountsApiDelegate.adAccount/analyticsResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.adAccount/analytics.handle_pinterest_oauth2(auth, req, ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.adAccount/analytics.handle_client_credentials(auth, req, ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, responses)

    }

    val responses: adAccount/analyticsResponses[F] = new adAccount/analyticsResponses[F] {
      def resp200(value: List[AdAccountAnalyticsItems]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adAccountTargetingAnalytics/get {
    import AdAccountsApiDelegate.adAccountTargetingAnalytics/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object start_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends QueryParamDecoderMatcher[LocalDate]("end_date")
    object targeting_typesQueryParam extends QuerySeqParamDecoderMatcher[AdsAnalyticsAccountTargetingType]("targeting_types")
    object columnsQueryParam extends QuerySeqParamDecoderMatcher[ReportingColumnSync]("columns")
    object granularityQueryParam extends QueryParamDecoderMatcher[Granularity]("granularity")
    object click_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("click_window_days")
    object engagement_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("engagement_window_days")
    object view_window_daysQueryParam extends OptionalQueryParamDecoderMatcher[BigDecimal]("view_window_days")
    object conversion_report_timeQueryParam extends OptionalQueryParamDecoderMatcher[String]("conversion_report_time")
    object attribution_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[ConversionReportAttributionType]("attribution_types")
    object reporting_timezoneQueryParam extends OptionalQueryParamDecoderMatcher[ReportingTimeZone]("reporting_timezone")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "targeting_analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.adAccountTargetingAnalytics/get.handle_pinterest_oauth2(auth, req, ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "targeting_analytics" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& targeting_typesQueryParam(targeting_types) +& columnsQueryParam(columns) +& granularityQueryParam(granularity) +& click_window_daysQueryParam(click_window_days) +& engagement_window_daysQueryParam(engagement_window_days) +& view_window_daysQueryParam(view_window_days) +& conversion_report_timeQueryParam(conversion_report_time) +& attribution_typesQueryParam(attribution_types) +& reporting_timezoneQueryParam(reporting_timezone)) as auth =>
        delegate.adAccountTargetingAnalytics/get.handle_client_credentials(auth, req, ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, responses)

    }

    val responses: adAccountTargetingAnalytics/getResponses[F] = new adAccountTargetingAnalytics/getResponses[F] {
      def resp200(value: MetricsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adAccounts/create {
    import AdAccountsApiDelegate.adAccounts/createResponses


    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts") as auth =>
          delegate.adAccounts/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdAccountCreate] , responses)

    }

    val responses: adAccounts/createResponses[F] = new adAccounts/createResponses[F] {
      def resp200(value: AdAccount): F[Response[F]] = Ok(value)
      def resp201(value: AdAccount): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adAccounts/get {
    import AdAccountsApiDelegate.adAccounts/getResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.adAccounts/get.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id)) as auth =>
        delegate.adAccounts/get.handle_client_credentials(auth, req, ad_account_id, responses)

    }

    val responses: adAccounts/getResponses[F] = new adAccounts/getResponses[F] {
      def resp200(value: AdAccount): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object adAccounts/list {
    import AdAccountsApiDelegate.adAccounts/listResponses

    object include_shared_accountsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_shared_accounts")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" :? include_shared_accountsQueryParam(include_shared_accounts) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.adAccounts/list.handle_pinterest_oauth2(auth, req, include_shared_accounts, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" :? include_shared_accountsQueryParam(include_shared_accounts) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.adAccounts/list.handle_client_credentials(auth, req, include_shared_accounts, bookmark, page_size, responses)

    }

    val responses: adAccounts/listResponses[F] = new adAccounts/listResponses[F] {
      def resp200(value: AdAccountsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object analytics/createConversionProductReport {
    import AdAccountsApiDelegate.analytics/createConversionProductReportResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "reports" / "brand_category_sku") as auth =>
          delegate.analytics/createConversionProductReport.handle_pinterest_oauth2(auth, req, req.asJsonDecode[ConversionProductReportCreate] , ad_account_id, responses)

    }

    val responses: analytics/createConversionProductReportResponses[F] = new analytics/createConversionProductReportResponses[F] {
      def resp200(value: ConversionProductReport): F[Response[F]] = Ok(value)
      def resp201(value: ConversionProductReport): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object analytics/createMmmReport {
    import AdAccountsApiDelegate.analytics/createMmmReportResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "mmm_reports") as auth =>
          delegate.analytics/createMmmReport.handle_pinterest_oauth2(auth, req, req.asJsonDecode[MMMReportCreate] , ad_account_id, responses)

    }

    val responses: analytics/createMmmReportResponses[F] = new analytics/createMmmReportResponses[F] {
      def resp200(value: MMMReport): F[Response[F]] = Ok(value)
      def resp201(value: MMMReport): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object analytics/createReport {
    import AdAccountsApiDelegate.analytics/createReportResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "reports") as auth =>
          delegate.analytics/createReport.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdsAnalyticsCreateAsyncRequest] , ad_account_id, responses)

    }

    val responses: analytics/createReportResponses[F] = new analytics/createReportResponses[F] {
      def resp200(value: AdsAnalyticsCreateAsyncResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object analytics/createTemplateReport {
    import AdAccountsApiDelegate.analytics/createTemplateReportResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object template_idVarr extends RefinedVarr[String, MaxSize[18]]
    object start_dateQueryParam extends OptionalQueryParamDecoderMatcher[LocalDate]("start_date")
    object end_dateQueryParam extends OptionalQueryParamDecoderMatcher[LocalDate]("end_date")
    object granularityQueryParam extends OptionalQueryParamDecoderMatcher[Granularity]("granularity")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "templates" / template_idVarr(template_id) / "reports" :? start_dateQueryParam(start_date) +& end_dateQueryParam(end_date) +& granularityQueryParam(granularity)) as auth =>
        delegate.analytics/createTemplateReport.handle_pinterest_oauth2(auth, req, ad_account_id, template_id, start_date, end_date, granularity, responses)

    }

    val responses: analytics/createTemplateReportResponses[F] = new analytics/createTemplateReportResponses[F] {
      def resp200(value: TemplateBasedReport): F[Response[F]] = Ok(value)
      def resp201(value: TemplateBasedReport): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object analytics/getConversionProductReport {
    import AdAccountsApiDelegate.analytics/getConversionProductReportResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object tokenQueryParam extends QueryParamDecoderMatcher[String]("token")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "reports" / "brand_category_sku" :? tokenQueryParam(token)) as auth =>
        delegate.analytics/getConversionProductReport.handle_pinterest_oauth2(auth, req, ad_account_id, token, responses)

    }

    val responses: analytics/getConversionProductReportResponses[F] = new analytics/getConversionProductReportResponses[F] {
      def resp200(value: ConversionProductReport): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object analytics/getMmmReport {
    import AdAccountsApiDelegate.analytics/getMmmReportResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object tokenQueryParam extends QueryParamDecoderMatcher[String]("token")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "mmm_reports" :? tokenQueryParam(token)) as auth =>
        delegate.analytics/getMmmReport.handle_pinterest_oauth2(auth, req, ad_account_id, token, responses)

    }

    val responses: analytics/getMmmReportResponses[F] = new analytics/getMmmReportResponses[F] {
      def resp200(value: MMMReport): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object analytics/getReport {
    import AdAccountsApiDelegate.analytics/getReportResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object tokenQueryParam extends QueryParamDecoderMatcher[String]("token")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "reports" :? tokenQueryParam(token)) as auth =>
        delegate.analytics/getReport.handle_pinterest_oauth2(auth, req, ad_account_id, token, responses)

    }

    val responses: analytics/getReportResponses[F] = new analytics/getReportResponses[F] {
      def resp200(value: AdsAnalyticsGetAsyncResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object sandbox/delete {
    import AdAccountsApiDelegate.sandbox/deleteResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "sandbox") as auth =>
        delegate.sandbox/delete.handle_pinterest_oauth2(auth, req, ad_account_id, responses)

    }

    val responses: sandbox/deleteResponses[F] = new sandbox/deleteResponses[F] {
      def resp200(value: String): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object templates/list {
    import AdAccountsApiDelegate.templates/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "templates" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order)) as auth =>
        delegate.templates/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, responses)

    }

    val responses: templates/listResponses[F] = new templates/listResponses[F] {
      def resp200(value: TemplatesList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adAccount/analytics.routepinterest_oauth2 <+>
    adAccountTargetingAnalytics/get.routepinterest_oauth2 <+>
    adAccounts/create.routepinterest_oauth2 <+>
    adAccounts/get.routepinterest_oauth2 <+>
    adAccounts/list.routepinterest_oauth2 <+>
    analytics/createConversionProductReport.routepinterest_oauth2 <+>
    analytics/createMmmReport.routepinterest_oauth2 <+>
    analytics/createReport.routepinterest_oauth2 <+>
    analytics/createTemplateReport.routepinterest_oauth2 <+>
    analytics/getConversionProductReport.routepinterest_oauth2 <+>
    analytics/getMmmReport.routepinterest_oauth2 <+>
    analytics/getReport.routepinterest_oauth2 <+>
    sandbox/delete.routepinterest_oauth2 <+>
    templates/list.routepinterest_oauth2
  val routesclient_credentials =
    adAccount/analytics.routeclient_credentials <+>
    adAccountTargetingAnalytics/get.routeclient_credentials <+>
    adAccounts/get.routeclient_credentials <+>
    adAccounts/list.routeclient_credentials
}

object AdAccountsApiDelegate {
  trait adAccount/analyticsResponses[F[_]] {
    def resp200(value: List[AdAccountAnalyticsItems]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adAccountTargetingAnalytics/getResponses[F[_]] {
    def resp200(value: MetricsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adAccounts/createResponses[F[_]] {
    def resp200(value: AdAccount): F[Response[F]]
    def resp201(value: AdAccount): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adAccounts/getResponses[F[_]] {
    def resp200(value: AdAccount): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait adAccounts/listResponses[F[_]] {
    def resp200(value: AdAccountsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait analytics/createConversionProductReportResponses[F[_]] {
    def resp200(value: ConversionProductReport): F[Response[F]]
    def resp201(value: ConversionProductReport): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait analytics/createMmmReportResponses[F[_]] {
    def resp200(value: MMMReport): F[Response[F]]
    def resp201(value: MMMReport): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait analytics/createReportResponses[F[_]] {
    def resp200(value: AdsAnalyticsCreateAsyncResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait analytics/createTemplateReportResponses[F[_]] {
    def resp200(value: TemplateBasedReport): F[Response[F]]
    def resp201(value: TemplateBasedReport): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait analytics/getConversionProductReportResponses[F[_]] {
    def resp200(value: ConversionProductReport): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait analytics/getMmmReportResponses[F[_]] {
    def resp200(value: MMMReport): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait analytics/getReportResponses[F[_]] {
    def resp200(value: AdsAnalyticsGetAsyncResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait sandbox/deleteResponses[F[_]] {
    def resp200(value: String): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait templates/listResponses[F[_]] {
    def resp200(value: TemplatesList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait AdAccountsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait adAccount/analytics {
    import AdAccountsApiDelegate.adAccount/analyticsResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      reportingTimezone: Option[ReportingTimeZone],
      responses: adAccount/analyticsResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      reportingTimezone: Option[ReportingTimeZone],
      responses: adAccount/analyticsResponses[F]
    ): F[Response[F]]

  }
  def adAccount/analytics: adAccount/analytics


  trait adAccountTargetingAnalytics/get {
    import AdAccountsApiDelegate.adAccountTargetingAnalytics/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsAccountTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      responses: adAccountTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      startDate: LocalDate,
      endDate: LocalDate,
      targetingTypes: List[AdsAnalyticsAccountTargetingType],
      columns: List[ReportingColumnSync],
      granularity: Granularity,
      clickWindowDays: Option[BigDecimal],
      engagementWindowDays: Option[BigDecimal],
      viewWindowDays: Option[BigDecimal],
      conversionReportTime: Option[String],
      attributionTypes: Option[List[ConversionReportAttributionType]],
      reportingTimezone: Option[ReportingTimeZone],
      responses: adAccountTargetingAnalytics/getResponses[F]
    ): F[Response[F]]

  }
  def adAccountTargetingAnalytics/get: adAccountTargetingAnalytics/get


  trait adAccounts/create {
    import AdAccountsApiDelegate.adAccounts/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccounts/create: F[AdAccountCreate],
      responses: adAccounts/createResponses[F]
    ): F[Response[F]]


  }
  def adAccounts/create: adAccounts/create


  trait adAccounts/get {
    import AdAccountsApiDelegate.adAccounts/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adAccounts/getResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: adAccounts/getResponses[F]
    ): F[Response[F]]

  }
  def adAccounts/get: adAccounts/get


  trait adAccounts/list {
    import AdAccountsApiDelegate.adAccounts/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      includeSharedAccounts: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: adAccounts/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      includeSharedAccounts: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: adAccounts/listResponses[F]
    ): F[Response[F]]

  }
  def adAccounts/list: adAccounts/list


  trait analytics/createConversionProductReport {
    import AdAccountsApiDelegate.analytics/createConversionProductReportResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      analytics/createConversionProductReport: F[ConversionProductReportCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: analytics/createConversionProductReportResponses[F]
    ): F[Response[F]]


  }
  def analytics/createConversionProductReport: analytics/createConversionProductReport


  trait analytics/createMmmReport {
    import AdAccountsApiDelegate.analytics/createMmmReportResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      analytics/createMmmReport: F[MMMReportCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: analytics/createMmmReportResponses[F]
    ): F[Response[F]]


  }
  def analytics/createMmmReport: analytics/createMmmReport


  trait analytics/createReport {
    import AdAccountsApiDelegate.analytics/createReportResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      analytics/createReport: F[AdsAnalyticsCreateAsyncRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: analytics/createReportResponses[F]
    ): F[Response[F]]


  }
  def analytics/createReport: analytics/createReport


  trait analytics/createTemplateReport {
    import AdAccountsApiDelegate.analytics/createTemplateReportResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      templateId: Refined[String, MaxSize[18]],
      startDate: Option[LocalDate],
      endDate: Option[LocalDate],
      granularity: Option[Granularity],
      responses: analytics/createTemplateReportResponses[F]
    ): F[Response[F]]

  }
  def analytics/createTemplateReport: analytics/createTemplateReport


  trait analytics/getConversionProductReport {
    import AdAccountsApiDelegate.analytics/getConversionProductReportResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      token: String,
      responses: analytics/getConversionProductReportResponses[F]
    ): F[Response[F]]

  }
  def analytics/getConversionProductReport: analytics/getConversionProductReport


  trait analytics/getMmmReport {
    import AdAccountsApiDelegate.analytics/getMmmReportResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      token: String,
      responses: analytics/getMmmReportResponses[F]
    ): F[Response[F]]

  }
  def analytics/getMmmReport: analytics/getMmmReport


  trait analytics/getReport {
    import AdAccountsApiDelegate.analytics/getReportResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      token: String,
      responses: analytics/getReportResponses[F]
    ): F[Response[F]]

  }
  def analytics/getReport: analytics/getReport


  trait sandbox/delete {
    import AdAccountsApiDelegate.sandbox/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: sandbox/deleteResponses[F]
    ): F[Response[F]]

  }
  def sandbox/delete: sandbox/delete


  trait templates/list {
    import AdAccountsApiDelegate.templates/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      responses: templates/listResponses[F]
    ): F[Response[F]]

  }
  def templates/list: templates/list

}