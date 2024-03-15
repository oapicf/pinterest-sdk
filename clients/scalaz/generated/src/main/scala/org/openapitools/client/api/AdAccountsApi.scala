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
import org.openapitools.client.api.AdAccountAnalyticsResponseInner
import org.openapitools.client.api.AdAccountCreateRequest
import org.openapitools.client.api.AdAccountsList200Response
import org.openapitools.client.api.AdsAnalyticsCreateAsyncRequest
import org.openapitools.client.api.AdsAnalyticsCreateAsyncResponse
import org.openapitools.client.api.AdsAnalyticsGetAsyncResponse
import org.openapitools.client.api.AdsAnalyticsTargetingType
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.CreateMMMReportRequest
import org.openapitools.client.api.CreateMMMReportResponse
import org.openapitools.client.api.Error
import org.openapitools.client.api.GetMMMReportResponse
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MetricsResponse
import org.openapitools.client.api.TemplatesList200Response

object AdAccountsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[AdAccountAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdAccountAnalyticsResponseInner]] = jsonOf[List[AdAccountAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdAccountAnalyticsResponseInner]](req)

    } yield resp
  }

  def adAccountTargetingAnalyticsGet(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType] = List.empty[AdsAnalyticsTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adAccountsCreate(host: String, adAccountCreateRequest: AdAccountCreateRequest): Task[AdAccount] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountCreateRequest)
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

  def adAccountsList(host: String, bookmark: String, pageSize: Integer = 25, includeSharedAccounts: Boolean = true)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], includeSharedAccountsQuery: QueryParam[Boolean]): Task[AdAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsList200Response] = jsonOf[AdAccountsList200Response]

    val path = "/ad_accounts"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("includeSharedAccounts", Some(include_shared_accountsQuery.toParamString(include_shared_accounts))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsList200Response](req)

    } yield resp
  }

  def analyticsCreateMmmReport(host: String, adAccountId: String, createMMMReportRequest: CreateMMMReportRequest): Task[CreateMMMReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateMMMReportResponse] = jsonOf[CreateMMMReportResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createMMMReportRequest)
      resp          <- client.expect[CreateMMMReportResponse](req)

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

  def analyticsCreateTemplateReport(host: String, adAccountId: String, templateId: String, startDate: LocalDate, endDate: LocalDate, granularity: Granularity)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], granularityQuery: QueryParam[Granularity]): Task[AdsAnalyticsCreateAsyncResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsAnalyticsCreateAsyncResponse] = jsonOf[AdsAnalyticsCreateAsyncResponse]

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
      resp          <- client.expect[AdsAnalyticsCreateAsyncResponse](req)

    } yield resp
  }

  def analyticsGetMmmReport(host: String, adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[GetMMMReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetMMMReportResponse] = jsonOf[GetMMMReportResponse]

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
      resp          <- client.expect[GetMMMReportResponse](req)

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

  def templatesList(host: String, adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[TemplatesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[TemplatesList200Response] = jsonOf[TemplatesList200Response]

    val path = "/ad_accounts/{ad_account_id}/templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

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

  def adAccountAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[AdAccountAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdAccountAnalyticsResponseInner]] = jsonOf[List[AdAccountAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdAccountAnalyticsResponseInner]](req)

    } yield resp
  }

  def adAccountTargetingAnalyticsGet(adAccountId: String, startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType] = List.empty[AdsAnalyticsTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adAccountsCreate(adAccountCreateRequest: AdAccountCreateRequest): Task[AdAccount] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountCreateRequest)
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

  def adAccountsList(bookmark: String, pageSize: Integer = 25, includeSharedAccounts: Boolean = true)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], includeSharedAccountsQuery: QueryParam[Boolean]): Task[AdAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsList200Response] = jsonOf[AdAccountsList200Response]

    val path = "/ad_accounts"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("includeSharedAccounts", Some(include_shared_accountsQuery.toParamString(include_shared_accounts))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsList200Response](req)

    } yield resp
  }

  def analyticsCreateMmmReport(adAccountId: String, createMMMReportRequest: CreateMMMReportRequest): Task[CreateMMMReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateMMMReportResponse] = jsonOf[CreateMMMReportResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createMMMReportRequest)
      resp          <- client.expect[CreateMMMReportResponse](req)

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

  def analyticsCreateTemplateReport(adAccountId: String, templateId: String, startDate: LocalDate, endDate: LocalDate, granularity: Granularity)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], granularityQuery: QueryParam[Granularity]): Task[AdsAnalyticsCreateAsyncResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsAnalyticsCreateAsyncResponse] = jsonOf[AdsAnalyticsCreateAsyncResponse]

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
      resp          <- client.expect[AdsAnalyticsCreateAsyncResponse](req)

    } yield resp
  }

  def analyticsGetMmmReport(adAccountId: String, token: String)(implicit tokenQuery: QueryParam[String]): Task[GetMMMReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetMMMReportResponse] = jsonOf[GetMMMReportResponse]

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
      resp          <- client.expect[GetMMMReportResponse](req)

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

  def templatesList(adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[TemplatesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[TemplatesList200Response] = jsonOf[TemplatesList200Response]

    val path = "/ad_accounts/{ad_account_id}/templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TemplatesList200Response](req)

    } yield resp
  }

}
