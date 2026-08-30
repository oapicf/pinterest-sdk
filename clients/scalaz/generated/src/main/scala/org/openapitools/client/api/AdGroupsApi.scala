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

import org.openapitools.client.api.AdGroup
import org.openapitools.client.api.AdGroupAudienceSizing
import org.openapitools.client.api.AdGroupAudienceSizingCreate
import org.openapitools.client.api.AdGroupCreateCreate
import org.openapitools.client.api.AdGroupUpdateBatchUpdate
import org.openapitools.client.api.AdGroupsAnalyticsMetrics
import org.openapitools.client.api.AdGroupsCreate200Response
import org.openapitools.client.api.AdGroupsList200Response
import org.openapitools.client.api.AdsAnalyticsAdGroupTargetingType
import org.openapitools.client.api.BidFloor
import org.openapitools.client.api.BidFloorCreate
import org.openapitools.client.api.BigDecimal
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.DynamicTitlesDownloadCSV
import org.openapitools.client.api.DynamicTitlesGetStatus
import org.openapitools.client.api.DynamicTitlesProcessCSV
import org.openapitools.client.api.DynamicTitlesProcessCSVCreate
import org.openapitools.client.api.DynamicTitlesUploadURL
import org.openapitools.client.api.EntityStatus
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MetricsResponse
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.ReportingColumnSync
import org.openapitools.client.api.ReportingTimeZone

object AdGroupsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adGroupsAnalytics(host: String, startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String] = List.empty[String] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, aggregateReportRows: Boolean = false, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], aggregateReportRowsQuery: QueryParam[Boolean], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[AdGroupsAnalyticsMetrics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdGroupsAnalyticsMetrics]] = jsonOf[List[AdGroupsAnalyticsMetrics]]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("aggregateReportRows", Some(aggregate_report_rowsQuery.toParamString(aggregate_report_rows))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdGroupsAnalyticsMetrics]](req)

    } yield resp
  }

  def adGroupsAudienceSizing(host: String, adAccountId: String, adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate): Task[AdGroupAudienceSizing] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupAudienceSizing] = jsonOf[AdGroupAudienceSizing]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupAudienceSizingCreate)
      resp          <- client.expect[AdGroupAudienceSizing](req)

    } yield resp
  }

  def adGroupsBidFloorGet(host: String, adAccountId: String, bidFloorCreate: BidFloorCreate): Task[BidFloor] = {
    implicit val returnTypeDecoder: EntityDecoder[BidFloor] = jsonOf[BidFloor]

    val path = "/ad_accounts/{ad_account_id}/bid_floor".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bidFloorCreate)
      resp          <- client.expect[BidFloor](req)

    } yield resp
  }

  def adGroupsCreate(host: String, adAccountId: String, adGroupCreateCreate: List[AdGroupCreateCreate]): Task[AdGroupsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsCreate200Response] = jsonOf[AdGroupsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupCreateCreate)
      resp          <- client.expect[AdGroupsCreate200Response](req)

    } yield resp
  }

  def adGroupsDynamicTitlesDownloadCsv(host: String, adAccountId: String, adGroupId: String): Task[DynamicTitlesDownloadCSV] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesDownloadCSV] = jsonOf[DynamicTitlesDownloadCSV]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[DynamicTitlesDownloadCSV](req)

    } yield resp
  }

  def adGroupsDynamicTitlesGetStatus(host: String, adAccountId: String, adGroupId: String): Task[DynamicTitlesGetStatus] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesGetStatus] = jsonOf[DynamicTitlesGetStatus]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[DynamicTitlesGetStatus](req)

    } yield resp
  }

  def adGroupsDynamicTitlesGetUploadUrl(host: String, adAccountId: String, adGroupId: String): Task[DynamicTitlesUploadURL] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesUploadURL] = jsonOf[DynamicTitlesUploadURL]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[DynamicTitlesUploadURL](req)

    } yield resp
  }

  def adGroupsDynamicTitlesProcessCsv(host: String, adAccountId: String, adGroupId: String, dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate): Task[DynamicTitlesProcessCSV] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesProcessCSV] = jsonOf[DynamicTitlesProcessCSV]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(dynamicTitlesProcessCSVCreate)
      resp          <- client.expect[DynamicTitlesProcessCSV](req)

    } yield resp
  }

  def adGroupsGet(host: String, adGroupId: String, adAccountId: String): Task[AdGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroup] = jsonOf[AdGroup]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AdGroup](req)

    } yield resp
  }

  def adGroupsList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"], translateInterestsToNames: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]], translateInterestsToNamesQuery: QueryParam[Boolean]): Task[AdGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsList200Response] = jsonOf[AdGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("translateInterestsToNames", Some(translate_interests_to_namesQuery.toParamString(translate_interests_to_names))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdGroupsList200Response](req)

    } yield resp
  }

  def adGroupsTargetingAnalyticsGet(host: String, adAccountId: String, adGroupIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdGroupTargetingType] = List.empty[AdsAnalyticsAdGroupTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone, sortColumns: List[String] = List.empty[String] , sortAscending: Boolean)(implicit adGroupIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAdGroupTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone], sortColumnsQuery: QueryParam[List[String]], sortAscendingQuery: QueryParam[Boolean]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))), ("sortColumns", Some(sort_columnsQuery.toParamString(sort_columns))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adGroupsUpdate(host: String, adAccountId: String, adGroupUpdateBatchUpdate: List[AdGroupUpdateBatchUpdate]): Task[AdGroupsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsCreate200Response] = jsonOf[AdGroupsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupUpdateBatchUpdate)
      resp          <- client.expect[AdGroupsCreate200Response](req)

    } yield resp
  }

  def getAdGroupsByPromotionIdsList(host: String, adAccountId: String, promotionIds: List[String] = List.empty[String] , bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], promotionIdsQuery: QueryParam[List[String]]): Task[AdGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsList200Response] = jsonOf[AdGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/promotion_applied_entities".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("promotionIds", Some(promotion_idsQuery.toParamString(promotion_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdGroupsList200Response](req)

    } yield resp
  }

}

class HttpServiceAdGroupsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adGroupsAnalytics(startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String] = List.empty[String] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, aggregateReportRows: Boolean = false, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], aggregateReportRowsQuery: QueryParam[Boolean], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[AdGroupsAnalyticsMetrics]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdGroupsAnalyticsMetrics]] = jsonOf[List[AdGroupsAnalyticsMetrics]]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("aggregateReportRows", Some(aggregate_report_rowsQuery.toParamString(aggregate_report_rows))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdGroupsAnalyticsMetrics]](req)

    } yield resp
  }

  def adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate): Task[AdGroupAudienceSizing] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupAudienceSizing] = jsonOf[AdGroupAudienceSizing]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupAudienceSizingCreate)
      resp          <- client.expect[AdGroupAudienceSizing](req)

    } yield resp
  }

  def adGroupsBidFloorGet(adAccountId: String, bidFloorCreate: BidFloorCreate): Task[BidFloor] = {
    implicit val returnTypeDecoder: EntityDecoder[BidFloor] = jsonOf[BidFloor]

    val path = "/ad_accounts/{ad_account_id}/bid_floor".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bidFloorCreate)
      resp          <- client.expect[BidFloor](req)

    } yield resp
  }

  def adGroupsCreate(adAccountId: String, adGroupCreateCreate: List[AdGroupCreateCreate]): Task[AdGroupsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsCreate200Response] = jsonOf[AdGroupsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupCreateCreate)
      resp          <- client.expect[AdGroupsCreate200Response](req)

    } yield resp
  }

  def adGroupsDynamicTitlesDownloadCsv(adAccountId: String, adGroupId: String): Task[DynamicTitlesDownloadCSV] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesDownloadCSV] = jsonOf[DynamicTitlesDownloadCSV]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[DynamicTitlesDownloadCSV](req)

    } yield resp
  }

  def adGroupsDynamicTitlesGetStatus(adAccountId: String, adGroupId: String): Task[DynamicTitlesGetStatus] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesGetStatus] = jsonOf[DynamicTitlesGetStatus]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[DynamicTitlesGetStatus](req)

    } yield resp
  }

  def adGroupsDynamicTitlesGetUploadUrl(adAccountId: String, adGroupId: String): Task[DynamicTitlesUploadURL] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesUploadURL] = jsonOf[DynamicTitlesUploadURL]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[DynamicTitlesUploadURL](req)

    } yield resp
  }

  def adGroupsDynamicTitlesProcessCsv(adAccountId: String, adGroupId: String, dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate): Task[DynamicTitlesProcessCSV] = {
    implicit val returnTypeDecoder: EntityDecoder[DynamicTitlesProcessCSV] = jsonOf[DynamicTitlesProcessCSV]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(dynamicTitlesProcessCSVCreate)
      resp          <- client.expect[DynamicTitlesProcessCSV](req)

    } yield resp
  }

  def adGroupsGet(adGroupId: String, adAccountId: String): Task[AdGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroup] = jsonOf[AdGroup]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AdGroup](req)

    } yield resp
  }

  def adGroupsList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"], translateInterestsToNames: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]], translateInterestsToNamesQuery: QueryParam[Boolean]): Task[AdGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsList200Response] = jsonOf[AdGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("translateInterestsToNames", Some(translate_interests_to_namesQuery.toParamString(translate_interests_to_names))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdGroupsList200Response](req)

    } yield resp
  }

  def adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdGroupTargetingType] = List.empty[AdsAnalyticsAdGroupTargetingType] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: List[ConversionReportAttributionType] = List.empty[ConversionReportAttributionType] , reportingTimezone: ReportingTimeZone, sortColumns: List[String] = List.empty[String] , sortAscending: Boolean)(implicit adGroupIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsAdGroupTargetingType]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[List[ConversionReportAttributionType]], reportingTimezoneQuery: QueryParam[ReportingTimeZone], sortColumnsQuery: QueryParam[List[String]], sortAscendingQuery: QueryParam[Boolean]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))), ("sortColumns", Some(sort_columnsQuery.toParamString(sort_columns))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adGroupsUpdate(adAccountId: String, adGroupUpdateBatchUpdate: List[AdGroupUpdateBatchUpdate]): Task[AdGroupsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsCreate200Response] = jsonOf[AdGroupsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupUpdateBatchUpdate)
      resp          <- client.expect[AdGroupsCreate200Response](req)

    } yield resp
  }

  def getAdGroupsByPromotionIdsList(adAccountId: String, promotionIds: List[String] = List.empty[String] , bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], promotionIdsQuery: QueryParam[List[String]]): Task[AdGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsList200Response] = jsonOf[AdGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/promotion_applied_entities".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("promotionIds", Some(promotion_idsQuery.toParamString(promotion_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdGroupsList200Response](req)

    } yield resp
  }

}
