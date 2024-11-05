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

import org.openapitools.client.api.AdArrayResponse
import org.openapitools.client.api.AdCreateRequest
import org.openapitools.client.api.AdPreviewRequest
import org.openapitools.client.api.AdPreviewURLResponse
import org.openapitools.client.api.AdResponse
import org.openapitools.client.api.AdUpdateRequest
import org.openapitools.client.api.AdsAnalyticsAdTargetingType
import org.openapitools.client.api.AdsAnalyticsResponseInner
import org.openapitools.client.api.AdsList200Response
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MetricsResponse

object AdsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adPreviewsCreate(host: String, adAccountId: String, adPreviewRequest: AdPreviewRequest): Task[AdPreviewURLResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdPreviewURLResponse] = jsonOf[AdPreviewURLResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_previews".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adPreviewRequest)
      resp          <- client.expect[AdPreviewURLResponse](req)

    } yield resp
  }

  def adTargetingAnalyticsGet(host: String, adAccountId: String, adIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdTargetingType] = List.empty[AdsAnalyticsAdTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit adIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAdTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ads/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String] = List.empty[String] , granularity: Granularity, adIds: List[String] = List.empty[String] , clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, pinIds: List[String] = List.empty[String] , campaignIds: List[String] = List.empty[String] )(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], pinIdsQuery: QueryParam[List[String]], campaignIdsQuery: QueryParam[List[String]]): Task[List[AdsAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdsAnalyticsResponseInner]] = jsonOf[List[AdsAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/ads/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("pinIds", Some(pin_idsQuery.toParamString(pin_ids))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdsAnalyticsResponseInner]](req)

    } yield resp
  }

  def adsCreate(host: String, adAccountId: String, adCreateRequest: List[AdCreateRequest]): Task[AdArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdArrayResponse] = jsonOf[AdArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adCreateRequest)
      resp          <- client.expect[AdArrayResponse](req)

    } yield resp
  }

  def adsGet(host: String, adAccountId: String, adId: String): Task[AdResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdResponse] = jsonOf[AdResponse]

    val path = "/ad_accounts/{ad_account_id}/ads/{ad_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_id" + "\\}",escape(adId.toString))

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
      resp          <- client.expect[AdResponse](req)

    } yield resp
  }

  def adsList(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], adIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[AdsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsList200Response] = jsonOf[AdsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsList200Response](req)

    } yield resp
  }

  def adsUpdate(host: String, adAccountId: String, adUpdateRequest: List[AdUpdateRequest]): Task[AdArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdArrayResponse] = jsonOf[AdArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adUpdateRequest)
      resp          <- client.expect[AdArrayResponse](req)

    } yield resp
  }

}

class HttpServiceAdsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adPreviewsCreate(adAccountId: String, adPreviewRequest: AdPreviewRequest): Task[AdPreviewURLResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdPreviewURLResponse] = jsonOf[AdPreviewURLResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_previews".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adPreviewRequest)
      resp          <- client.expect[AdPreviewURLResponse](req)

    } yield resp
  }

  def adTargetingAnalyticsGet(adAccountId: String, adIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdTargetingType] = List.empty[AdsAnalyticsAdTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit adIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAdTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ads/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String] = List.empty[String] , granularity: Granularity, adIds: List[String] = List.empty[String] , clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, pinIds: List[String] = List.empty[String] , campaignIds: List[String] = List.empty[String] )(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], pinIdsQuery: QueryParam[List[String]], campaignIdsQuery: QueryParam[List[String]]): Task[List[AdsAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdsAnalyticsResponseInner]] = jsonOf[List[AdsAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/ads/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("pinIds", Some(pin_idsQuery.toParamString(pin_ids))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdsAnalyticsResponseInner]](req)

    } yield resp
  }

  def adsCreate(adAccountId: String, adCreateRequest: List[AdCreateRequest]): Task[AdArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdArrayResponse] = jsonOf[AdArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adCreateRequest)
      resp          <- client.expect[AdArrayResponse](req)

    } yield resp
  }

  def adsGet(adAccountId: String, adId: String): Task[AdResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdResponse] = jsonOf[AdResponse]

    val path = "/ad_accounts/{ad_account_id}/ads/{ad_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_id" + "\\}",escape(adId.toString))

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
      resp          <- client.expect[AdResponse](req)

    } yield resp
  }

  def adsList(adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], adIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[AdsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsList200Response] = jsonOf[AdsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsList200Response](req)

    } yield resp
  }

  def adsUpdate(adAccountId: String, adUpdateRequest: List[AdUpdateRequest]): Task[AdArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdArrayResponse] = jsonOf[AdArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adUpdateRequest)
      resp          <- client.expect[AdArrayResponse](req)

    } yield resp
  }

}
