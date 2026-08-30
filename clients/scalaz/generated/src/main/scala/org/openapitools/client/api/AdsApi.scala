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

import org.openapitools.client.api.Ad
import org.openapitools.client.api.AdBatchUpdate
import org.openapitools.client.api.AdBatchWriteResponseModel
import org.openapitools.client.api.AdCreate
import org.openapitools.client.api.AdPreviewRequest
import org.openapitools.client.api.AdPreviewURLResponse
import org.openapitools.client.api.AdsAnalytics
import org.openapitools.client.api.AdsAnalyticsAdTargetingType
import org.openapitools.client.api.AdsList200Response
import org.openapitools.client.api.BigDecimal
import org.openapitools.client.api.CampaignAdPreview
import org.openapitools.client.api.CampaignAdPreviewCreate
import org.openapitools.client.api.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.client.api.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.client.api.ConversionAttributionWindowDays
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.ConversionReportTimeType
import org.openapitools.client.api.EntityStatus
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MetricsResponse
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.ReportingColumnSync
import org.openapitools.client.api.ReportingTimeZone

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

  def adTargetingAnalyticsGet(host: String, adAccountId: String, adIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdTargetingType] = List.empty[AdsAnalyticsAdTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: ConversionAttributionWindowDays, engagementWindowDays: ConversionAttributionWindowDays, viewWindowDays: ConversionAttributionWindowDays, conversionReportTime: ConversionReportTimeType, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone, sortColumns: List[String] = List.empty[String] , sortAscending: Boolean)(implicit adIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAdTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[ConversionAttributionWindowDays], engagementWindowDaysQuery: QueryParam[ConversionAttributionWindowDays], viewWindowDaysQuery: QueryParam[ConversionAttributionWindowDays], conversionReportTimeQuery: QueryParam[ConversionReportTimeType], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone], sortColumnsQuery: QueryParam[List[String]], sortAscendingQuery: QueryParam[Boolean]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ads/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))), ("sortColumns", Some(sort_columnsQuery.toParamString(sort_columns))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adsAnalytics(host: String, startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, pinIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, campaignIds: List[String] = List.empty[String] , reportingTimezone: ReportingTimeZone)(implicit pinIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], campaignIdsQuery: QueryParam[List[String]], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[AdsAnalytics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdsAnalytics]] = jsonOf[List[AdsAnalytics]]

    val path = "/ad_accounts/{ad_account_id}/ads/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pinIds", Some(pin_idsQuery.toParamString(pin_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdsAnalytics]](req)

    } yield resp
  }

  def adsCreate(host: String, adAccountId: String, adCreate: List[AdCreate]): Task[AdBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[AdBatchWriteResponseModel] = jsonOf[AdBatchWriteResponseModel]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adCreate)
      resp          <- client.expect[AdBatchWriteResponseModel](req)

    } yield resp
  }

  def adsGet(host: String, adId: String, adAccountId: String): Task[Ad] = {
    implicit val returnTypeDecoder: EntityDecoder[Ad] = jsonOf[Ad]

    val path = "/ad_accounts/{ad_account_id}/ads/{ad_id}".replaceAll("\\{" + "ad_id" + "\\}",escape(adId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Ad](req)

    } yield resp
  }

  def adsList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"])(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], adIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]]): Task[AdsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsList200Response] = jsonOf[AdsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsList200Response](req)

    } yield resp
  }

  def adsUpdate(host: String, adAccountId: String, adBatchUpdate: List[AdBatchUpdate]): Task[AdBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[AdBatchWriteResponseModel] = jsonOf[AdBatchWriteResponseModel]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adBatchUpdate)
      resp          <- client.expect[AdBatchWriteResponseModel](req)

    } yield resp
  }

  def campaignAdPreviewCreate(host: String, adAccountId: String, campaignAdPreviewCreate: List[CampaignAdPreviewCreate]): Task[List[CampaignAdPreviewCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignAdPreviewCreate200ResponseInner]] = jsonOf[List[CampaignAdPreviewCreate200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/campaign_ad_preview".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignAdPreviewCreate)
      resp          <- client.expect[List[CampaignAdPreviewCreate200ResponseInner]](req)

    } yield resp
  }

  def campaignAdPreviewDelete(host: String, adGroupIds: List[String] = List.empty[String] , adAccountId: String)(implicit adGroupIdsQuery: QueryParam[List[String]]): Task[List[CampaignAdPreviewDelete200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignAdPreviewDelete200ResponseInner]] = jsonOf[List[CampaignAdPreviewDelete200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/campaign_ad_preview".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignAdPreviewDelete200ResponseInner]](req)

    } yield resp
  }

  def campaignAdPreviewRead(host: String, adGroupIds: List[String] = List.empty[String] , adAccountId: String)(implicit adGroupIdsQuery: QueryParam[List[String]]): Task[List[CampaignAdPreview]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignAdPreview]] = jsonOf[List[CampaignAdPreview]]

    val path = "/ad_accounts/{ad_account_id}/campaign_ad_preview".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignAdPreview]](req)

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

  def adTargetingAnalyticsGet(adAccountId: String, adIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdTargetingType] = List.empty[AdsAnalyticsAdTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: ConversionAttributionWindowDays, engagementWindowDays: ConversionAttributionWindowDays, viewWindowDays: ConversionAttributionWindowDays, conversionReportTime: ConversionReportTimeType, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone, sortColumns: List[String] = List.empty[String] , sortAscending: Boolean)(implicit adIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAdTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[ConversionAttributionWindowDays], engagementWindowDaysQuery: QueryParam[ConversionAttributionWindowDays], viewWindowDaysQuery: QueryParam[ConversionAttributionWindowDays], conversionReportTimeQuery: QueryParam[ConversionReportTimeType], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone], sortColumnsQuery: QueryParam[List[String]], sortAscendingQuery: QueryParam[Boolean]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ads/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))), ("sortColumns", Some(sort_columnsQuery.toParamString(sort_columns))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adsAnalytics(startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, pinIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, campaignIds: List[String] = List.empty[String] , reportingTimezone: ReportingTimeZone)(implicit pinIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], campaignIdsQuery: QueryParam[List[String]], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[AdsAnalytics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdsAnalytics]] = jsonOf[List[AdsAnalytics]]

    val path = "/ad_accounts/{ad_account_id}/ads/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pinIds", Some(pin_idsQuery.toParamString(pin_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdsAnalytics]](req)

    } yield resp
  }

  def adsCreate(adAccountId: String, adCreate: List[AdCreate]): Task[AdBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[AdBatchWriteResponseModel] = jsonOf[AdBatchWriteResponseModel]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adCreate)
      resp          <- client.expect[AdBatchWriteResponseModel](req)

    } yield resp
  }

  def adsGet(adId: String, adAccountId: String): Task[Ad] = {
    implicit val returnTypeDecoder: EntityDecoder[Ad] = jsonOf[Ad]

    val path = "/ad_accounts/{ad_account_id}/ads/{ad_id}".replaceAll("\\{" + "ad_id" + "\\}",escape(adId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Ad](req)

    } yield resp
  }

  def adsList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"])(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], adIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]]): Task[AdsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsList200Response] = jsonOf[AdsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsList200Response](req)

    } yield resp
  }

  def adsUpdate(adAccountId: String, adBatchUpdate: List[AdBatchUpdate]): Task[AdBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[AdBatchWriteResponseModel] = jsonOf[AdBatchWriteResponseModel]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adBatchUpdate)
      resp          <- client.expect[AdBatchWriteResponseModel](req)

    } yield resp
  }

  def campaignAdPreviewCreate(adAccountId: String, campaignAdPreviewCreate: List[CampaignAdPreviewCreate]): Task[List[CampaignAdPreviewCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignAdPreviewCreate200ResponseInner]] = jsonOf[List[CampaignAdPreviewCreate200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/campaign_ad_preview".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignAdPreviewCreate)
      resp          <- client.expect[List[CampaignAdPreviewCreate200ResponseInner]](req)

    } yield resp
  }

  def campaignAdPreviewDelete(adGroupIds: List[String] = List.empty[String] , adAccountId: String)(implicit adGroupIdsQuery: QueryParam[List[String]]): Task[List[CampaignAdPreviewDelete200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignAdPreviewDelete200ResponseInner]] = jsonOf[List[CampaignAdPreviewDelete200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/campaign_ad_preview".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignAdPreviewDelete200ResponseInner]](req)

    } yield resp
  }

  def campaignAdPreviewRead(adGroupIds: List[String] = List.empty[String] , adAccountId: String)(implicit adGroupIdsQuery: QueryParam[List[String]]): Task[List[CampaignAdPreview]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignAdPreview]] = jsonOf[List[CampaignAdPreview]]

    val path = "/ad_accounts/{ad_account_id}/campaign_ad_preview".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignAdPreview]](req)

    } yield resp
  }

}
