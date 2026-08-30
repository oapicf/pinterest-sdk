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

import org.openapitools.client.api.AdPinAnalytics
import org.openapitools.client.api.AdsAnalyticsCampaignTargetingType
import org.openapitools.client.api.BigDecimal
import org.openapitools.client.api.Campaign
import org.openapitools.client.api.CampaignBatchUpdateItem
import org.openapitools.client.api.CampaignBatchWriteResponseModel
import org.openapitools.client.api.CampaignCreateItem
import org.openapitools.client.api.CampaignDeliveryEstimatesCampaign
import org.openapitools.client.api.CampaignDeliveryEstimatesResponse
import org.openapitools.client.api.CampaignsAnalyticsMetrics
import org.openapitools.client.api.CampaignsList200Response
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.EntityStatus
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MetricsResponse
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.ReportingColumnSync
import org.openapitools.client.api.ReportingTimeZone

object CampaignsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adPinsAnalytics(host: String, campaignId: String, pinIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit campaignIdQuery: QueryParam[String], pinIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String]): Task[List[AdPinAnalytics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdPinAnalytics]] = jsonOf[List[AdPinAnalytics]]

    val path = "/ad_accounts/{ad_account_id}/pins/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignId", Some(campaign_idQuery.toParamString(campaign_id))), ("pinIds", Some(pin_idsQuery.toParamString(pin_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdPinAnalytics]](req)

    } yield resp
  }

  def campaignTargetingAnalyticsGet(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsCampaignTargetingType] = List.empty[AdsAnalyticsCampaignTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone)(implicit campaignIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsCampaignTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def campaignsAnalytics(host: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String] = List.empty[String] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, aggregateReportRows: Boolean = false, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], campaignIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], aggregateReportRowsQuery: QueryParam[Boolean], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[CampaignsAnalyticsMetrics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignsAnalyticsMetrics]] = jsonOf[List[CampaignsAnalyticsMetrics]]

    val path = "/ad_accounts/{ad_account_id}/campaigns/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("aggregateReportRows", Some(aggregate_report_rowsQuery.toParamString(aggregate_report_rows))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignsAnalyticsMetrics]](req)

    } yield resp
  }

  def campaignsCreate(host: String, adAccountId: String, campaignCreateItem: List[CampaignCreateItem]): Task[CampaignBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignBatchWriteResponseModel] = jsonOf[CampaignBatchWriteResponseModel]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignCreateItem)
      resp          <- client.expect[CampaignBatchWriteResponseModel](req)

    } yield resp
  }

  def campaignsGet(host: String, campaignId: String, adAccountId: String): Task[Campaign] = {
    implicit val returnTypeDecoder: EntityDecoder[Campaign] = jsonOf[Campaign]

    val path = "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}".replaceAll("\\{" + "campaign_id" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Campaign](req)

    } yield resp
  }

  def campaignsList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, campaignIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"])(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], campaignIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]]): Task[CampaignsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignsList200Response] = jsonOf[CampaignsList200Response]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CampaignsList200Response](req)

    } yield resp
  }

  def campaignsUpdate(host: String, adAccountId: String, campaignBatchUpdateItem: List[CampaignBatchUpdateItem]): Task[CampaignBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignBatchWriteResponseModel] = jsonOf[CampaignBatchWriteResponseModel]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignBatchUpdateItem)
      resp          <- client.expect[CampaignBatchWriteResponseModel](req)

    } yield resp
  }

  def getCampaignDeliveryEstimates(host: String, adAccountId: String, campaignDeliveryEstimatesCampaign: List[CampaignDeliveryEstimatesCampaign]): Task[CampaignDeliveryEstimatesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignDeliveryEstimatesResponse] = jsonOf[CampaignDeliveryEstimatesResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignDeliveryEstimatesCampaign)
      resp          <- client.expect[CampaignDeliveryEstimatesResponse](req)

    } yield resp
  }

}

class HttpServiceCampaignsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adPinsAnalytics(campaignId: String, pinIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit campaignIdQuery: QueryParam[String], pinIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String]): Task[List[AdPinAnalytics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdPinAnalytics]] = jsonOf[List[AdPinAnalytics]]

    val path = "/ad_accounts/{ad_account_id}/pins/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignId", Some(campaign_idQuery.toParamString(campaign_id))), ("pinIds", Some(pin_idsQuery.toParamString(pin_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdPinAnalytics]](req)

    } yield resp
  }

  def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsCampaignTargetingType] = List.empty[AdsAnalyticsCampaignTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone)(implicit campaignIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsCampaignTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def campaignsAnalytics(startDate: LocalDate, endDate: LocalDate, campaignIds: List[String] = List.empty[String] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, aggregateReportRows: Boolean = false, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], campaignIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], aggregateReportRowsQuery: QueryParam[Boolean], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[CampaignsAnalyticsMetrics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignsAnalyticsMetrics]] = jsonOf[List[CampaignsAnalyticsMetrics]]

    val path = "/ad_accounts/{ad_account_id}/campaigns/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("aggregateReportRows", Some(aggregate_report_rowsQuery.toParamString(aggregate_report_rows))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignsAnalyticsMetrics]](req)

    } yield resp
  }

  def campaignsCreate(adAccountId: String, campaignCreateItem: List[CampaignCreateItem]): Task[CampaignBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignBatchWriteResponseModel] = jsonOf[CampaignBatchWriteResponseModel]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignCreateItem)
      resp          <- client.expect[CampaignBatchWriteResponseModel](req)

    } yield resp
  }

  def campaignsGet(campaignId: String, adAccountId: String): Task[Campaign] = {
    implicit val returnTypeDecoder: EntityDecoder[Campaign] = jsonOf[Campaign]

    val path = "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}".replaceAll("\\{" + "campaign_id" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Campaign](req)

    } yield resp
  }

  def campaignsList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, campaignIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"])(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], campaignIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]]): Task[CampaignsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignsList200Response] = jsonOf[CampaignsList200Response]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CampaignsList200Response](req)

    } yield resp
  }

  def campaignsUpdate(adAccountId: String, campaignBatchUpdateItem: List[CampaignBatchUpdateItem]): Task[CampaignBatchWriteResponseModel] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignBatchWriteResponseModel] = jsonOf[CampaignBatchWriteResponseModel]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignBatchUpdateItem)
      resp          <- client.expect[CampaignBatchWriteResponseModel](req)

    } yield resp
  }

  def getCampaignDeliveryEstimates(adAccountId: String, campaignDeliveryEstimatesCampaign: List[CampaignDeliveryEstimatesCampaign]): Task[CampaignDeliveryEstimatesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignDeliveryEstimatesResponse] = jsonOf[CampaignDeliveryEstimatesResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignDeliveryEstimatesCampaign)
      resp          <- client.expect[CampaignDeliveryEstimatesResponse](req)

    } yield resp
  }

}
