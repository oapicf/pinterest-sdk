package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.AdAccount
import org.openapitools.client.api.AdAccountAnalyticsItems
import org.openapitools.client.api.AdAccountCreate
import org.openapitools.client.api.AdAccountsList200Response
import org.openapitools.client.api.AdsAnalyticsAccountTargetingType
import org.openapitools.client.api.AdsAnalyticsCreateAsyncRequest
import org.openapitools.client.api.AdsAnalyticsCreateAsyncResponse
import org.openapitools.client.api.AdsAnalyticsGetAsyncResponse
import org.openapitools.client.api.BigDecimal
import org.openapitools.client.api.ConversionProductReport
import org.openapitools.client.api.ConversionProductReportCreate
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MMMReport
import org.openapitools.client.api.MMMReportCreate
import org.openapitools.client.api.MetricsResponse
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.ReportingColumnSync
import org.openapitools.client.api.ReportingTimeZone
import org.openapitools.client.api.TemplateBasedReport
import org.openapitools.client.api.TemplatesList200Response

object AdAccountsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountAnalytics(host: String, startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[AdAccountAnalyticsItems]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdAccountAnalyticsItems]] = jsonOf[List[AdAccountAnalyticsItems]]

    val path = "/ad_accounts/{ad_account_id}/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdAccountAnalyticsItems]](req)

    } yield resp
  }

  def adAccountTargetingAnalyticsGet(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAccountTargetingType] = List.empty[AdsAnalyticsAccountTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAccountTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adAccountsCreate(host: String, adAccountCreate: AdAccountCreate): Task[AdAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccount] = jsonOf[AdAccount]

    val path = "/ad_accounts"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountCreate)
      resp          <- client.expect[AdAccount](req)

    } yield resp
  }

  def adAccountsGet(host: String, adAccountId: String): Task[AdAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccount] = jsonOf[AdAccount]

    val path = "/ad_accounts/{ad_account_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccount](req)

    } yield resp
  }

  def adAccountsList(host: String, includeSharedAccounts: Boolean = true, bookmark: String, pageSize: Integer = 25)(implicit includeSharedAccountsQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsList200Response] = jsonOf[AdAccountsList200Response]

    val path = "/ad_accounts"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeSharedAccounts", Some(include_shared_accountsQuery.toParamString(include_shared_accounts))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsList200Response](req)

    } yield resp
  }

  def analyticsCreateConversionProductReport(host: String, adAccountId: String, conversionProductReportCreate: ConversionProductReportCreate): Task[ConversionProductReport] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionProductReport] = jsonOf[ConversionProductReport]

    val path = "/ad_accounts/{ad_account_id}/reports/brand_category_sku".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionProductReportCreate)
      resp          <- client.expect[ConversionProductReport](req)

    } yield resp
  }

  def analyticsCreateMmmReport(host: String, adAccountId: String, mMMReportCreate: MMMReportCreate): Task[MMMReport] = {
    implicit val returnTypeDecoder: EntityDecoder[MMMReport] = jsonOf[MMMReport]

    val path = "/ad_accounts/{ad_account_id}/mmm_reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(mMMReportCreate)
      resp          <- client.expect[MMMReport](req)

    } yield resp
  }

  def analyticsCreateReport(host: String, adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): Task[AdsAnalyticsCreateAsyncResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsAnalyticsCreateAsyncResponse] = jsonOf[AdsAnalyticsCreateAsyncResponse]

    val path = "/ad_accounts/{ad_account_id}/reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adsAnalyticsCreateAsyncRequest)
      resp          <- client.expect[AdsAnalyticsCreateAsyncResponse](req)

    } yield resp
  }

  def analyticsCreateTemplateReport(host: String, adAccountId: String, templateId: String, startDate: LocalDate, endDate: LocalDate, granularity: Granularity)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], granularityQuery: QueryParam[Granularity]): Task[TemplateBasedReport] = {
    implicit val returnTypeDecoder: EntityDecoder[TemplateBasedReport] = jsonOf[TemplateBasedReport]

    val path = "/ad_accounts/{ad_account_id}/templates/{template_id}/reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "template_id" + "\\}",escape(templateId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("granularity", Some(granularityQuery.toParamString(granularity))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TemplateBasedReport](req)

    } yield resp
  }

  def analyticsGetConversionProductReport(host: String, adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[ConversionProductReport] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionProductReport] = jsonOf[ConversionProductReport]

    val path = "/ad_accounts/{ad_account_id}/reports/brand_category_sku".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ConversionProductReport](req)

    } yield resp
  }

  def analyticsGetMmmReport(host: String, adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[MMMReport] = {
    implicit val returnTypeDecoder: EntityDecoder[MMMReport] = jsonOf[MMMReport]

    val path = "/ad_accounts/{ad_account_id}/mmm_reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MMMReport](req)

    } yield resp
  }

  def analyticsGetReport(host: String, adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[AdsAnalyticsGetAsyncResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsAnalyticsGetAsyncResponse] = jsonOf[AdsAnalyticsGetAsyncResponse]

    val path = "/ad_accounts/{ad_account_id}/reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsAnalyticsGetAsyncResponse](req)

    } yield resp
  }

  def sandboxDelete(host: String, adAccountId: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/ad_accounts/{ad_account_id}/sandbox".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def templatesList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[TemplatesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[TemplatesList200Response] = jsonOf[TemplatesList200Response]

    val path = "/ad_accounts/{ad_account_id}/templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TemplatesList200Response](req)

    } yield resp
  }

}

class HttpServiceAdAccountsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountAnalytics(startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[AdAccountAnalyticsItems]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdAccountAnalyticsItems]] = jsonOf[List[AdAccountAnalyticsItems]]

    val path = "/ad_accounts/{ad_account_id}/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdAccountAnalyticsItems]](req)

    } yield resp
  }

  def adAccountTargetingAnalyticsGet(adAccountId: String, startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAccountTargetingType] = List.empty[AdsAnalyticsAccountTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAccountTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adAccountsCreate(adAccountCreate: AdAccountCreate): Task[AdAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccount] = jsonOf[AdAccount]

    val path = "/ad_accounts"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountCreate)
      resp          <- client.expect[AdAccount](req)

    } yield resp
  }

  def adAccountsGet(adAccountId: String): Task[AdAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccount] = jsonOf[AdAccount]

    val path = "/ad_accounts/{ad_account_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccount](req)

    } yield resp
  }

  def adAccountsList(includeSharedAccounts: Boolean = true, bookmark: String, pageSize: Integer = 25)(implicit includeSharedAccountsQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsList200Response] = jsonOf[AdAccountsList200Response]

    val path = "/ad_accounts"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeSharedAccounts", Some(include_shared_accountsQuery.toParamString(include_shared_accounts))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsList200Response](req)

    } yield resp
  }

  def analyticsCreateConversionProductReport(adAccountId: String, conversionProductReportCreate: ConversionProductReportCreate): Task[ConversionProductReport] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionProductReport] = jsonOf[ConversionProductReport]

    val path = "/ad_accounts/{ad_account_id}/reports/brand_category_sku".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionProductReportCreate)
      resp          <- client.expect[ConversionProductReport](req)

    } yield resp
  }

  def analyticsCreateMmmReport(adAccountId: String, mMMReportCreate: MMMReportCreate): Task[MMMReport] = {
    implicit val returnTypeDecoder: EntityDecoder[MMMReport] = jsonOf[MMMReport]

    val path = "/ad_accounts/{ad_account_id}/mmm_reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(mMMReportCreate)
      resp          <- client.expect[MMMReport](req)

    } yield resp
  }

  def analyticsCreateReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): Task[AdsAnalyticsCreateAsyncResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsAnalyticsCreateAsyncResponse] = jsonOf[AdsAnalyticsCreateAsyncResponse]

    val path = "/ad_accounts/{ad_account_id}/reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adsAnalyticsCreateAsyncRequest)
      resp          <- client.expect[AdsAnalyticsCreateAsyncResponse](req)

    } yield resp
  }

  def analyticsCreateTemplateReport(adAccountId: String, templateId: String, startDate: LocalDate, endDate: LocalDate, granularity: Granularity)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], granularityQuery: QueryParam[Granularity]): Task[TemplateBasedReport] = {
    implicit val returnTypeDecoder: EntityDecoder[TemplateBasedReport] = jsonOf[TemplateBasedReport]

    val path = "/ad_accounts/{ad_account_id}/templates/{template_id}/reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "template_id" + "\\}",escape(templateId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("granularity", Some(granularityQuery.toParamString(granularity))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TemplateBasedReport](req)

    } yield resp
  }

  def analyticsGetConversionProductReport(adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[ConversionProductReport] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionProductReport] = jsonOf[ConversionProductReport]

    val path = "/ad_accounts/{ad_account_id}/reports/brand_category_sku".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ConversionProductReport](req)

    } yield resp
  }

  def analyticsGetMmmReport(adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[MMMReport] = {
    implicit val returnTypeDecoder: EntityDecoder[MMMReport] = jsonOf[MMMReport]

    val path = "/ad_accounts/{ad_account_id}/mmm_reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MMMReport](req)

    } yield resp
  }

  def analyticsGetReport(adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[AdsAnalyticsGetAsyncResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsAnalyticsGetAsyncResponse] = jsonOf[AdsAnalyticsGetAsyncResponse]

    val path = "/ad_accounts/{ad_account_id}/reports".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsAnalyticsGetAsyncResponse](req)

    } yield resp
  }

  def sandboxDelete(adAccountId: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/ad_accounts/{ad_account_id}/sandbox".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def templatesList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[TemplatesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[TemplatesList200Response] = jsonOf[TemplatesList200Response]

    val path = "/ad_accounts/{ad_account_id}/templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TemplatesList200Response](req)

    } yield resp
  }

}
