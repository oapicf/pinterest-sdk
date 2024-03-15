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

import org.openapitools.client.api.AdGroupArrayResponse
import org.openapitools.client.api.AdGroupAudienceSizingRequest
import org.openapitools.client.api.AdGroupAudienceSizingResponse
import org.openapitools.client.api.AdGroupCreateRequest
import org.openapitools.client.api.AdGroupResponse
import org.openapitools.client.api.AdGroupUpdateRequest
import org.openapitools.client.api.AdGroupsAnalyticsResponseInner
import org.openapitools.client.api.AdGroupsList200Response
import org.openapitools.client.api.AdsAnalyticsTargetingType
import org.openapitools.client.api.BidFloor
import org.openapitools.client.api.BidFloorRequest
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MetricsResponse

object AdGroupsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adGroupsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[AdGroupsAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdGroupsAnalyticsResponseInner]] = jsonOf[List[AdGroupsAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdGroupsAnalyticsResponseInner]](req)

    } yield resp
  }

  def adGroupsAudienceSizing(host: String, adAccountId: String, adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest): Task[AdGroupAudienceSizingResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupAudienceSizingResponse] = jsonOf[AdGroupAudienceSizingResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupAudienceSizingRequest)
      resp          <- client.expect[AdGroupAudienceSizingResponse](req)

    } yield resp
  }

  def adGroupsBidFloorGet(host: String, adAccountId: String, bidFloorRequest: BidFloorRequest): Task[BidFloor] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bidFloorRequest)
      resp          <- client.expect[BidFloor](req)

    } yield resp
  }

  def adGroupsCreate(host: String, adAccountId: String, adGroupCreateRequest: List[AdGroupCreateRequest]): Task[AdGroupArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupArrayResponse] = jsonOf[AdGroupArrayResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupCreateRequest)
      resp          <- client.expect[AdGroupArrayResponse](req)

    } yield resp
  }

  def adGroupsGet(host: String, adAccountId: String, adGroupId: String): Task[AdGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupResponse] = jsonOf[AdGroupResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[AdGroupResponse](req)

    } yield resp
  }

  def adGroupsList(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], pageSize: Integer = 25, order: String, bookmark: String, translateInterestsToNames: Boolean = false)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String], translateInterestsToNamesQuery: QueryParam[Boolean]): Task[AdGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsList200Response] = jsonOf[AdGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("translateInterestsToNames", Some(translate_interests_to_namesQuery.toParamString(translate_interests_to_names))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdGroupsList200Response](req)

    } yield resp
  }

  def adGroupsTargetingAnalyticsGet(host: String, adAccountId: String, adGroupIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType] = List.empty[AdsAnalyticsTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit adGroupIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adGroupsUpdate(host: String, adAccountId: String, adGroupUpdateRequest: List[AdGroupUpdateRequest]): Task[AdGroupArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupArrayResponse] = jsonOf[AdGroupArrayResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupUpdateRequest)
      resp          <- client.expect[AdGroupArrayResponse](req)

    } yield resp
  }

}

class HttpServiceAdGroupsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[AdGroupsAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[AdGroupsAnalyticsResponseInner]] = jsonOf[List[AdGroupsAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[AdGroupsAnalyticsResponseInner]](req)

    } yield resp
  }

  def adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest): Task[AdGroupAudienceSizingResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupAudienceSizingResponse] = jsonOf[AdGroupAudienceSizingResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupAudienceSizingRequest)
      resp          <- client.expect[AdGroupAudienceSizingResponse](req)

    } yield resp
  }

  def adGroupsBidFloorGet(adAccountId: String, bidFloorRequest: BidFloorRequest): Task[BidFloor] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bidFloorRequest)
      resp          <- client.expect[BidFloor](req)

    } yield resp
  }

  def adGroupsCreate(adAccountId: String, adGroupCreateRequest: List[AdGroupCreateRequest]): Task[AdGroupArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupArrayResponse] = jsonOf[AdGroupArrayResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupCreateRequest)
      resp          <- client.expect[AdGroupArrayResponse](req)

    } yield resp
  }

  def adGroupsGet(adAccountId: String, adGroupId: String): Task[AdGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupResponse] = jsonOf[AdGroupResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "ad_group_id" + "\\}",escape(adGroupId.toString))

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
      resp          <- client.expect[AdGroupResponse](req)

    } yield resp
  }

  def adGroupsList(adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], pageSize: Integer = 25, order: String, bookmark: String, translateInterestsToNames: Boolean = false)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String], translateInterestsToNamesQuery: QueryParam[Boolean]): Task[AdGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupsList200Response] = jsonOf[AdGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/ad_groups".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("translateInterestsToNames", Some(translate_interests_to_namesQuery.toParamString(translate_interests_to_names))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdGroupsList200Response](req)

    } yield resp
  }

  def adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType] = List.empty[AdsAnalyticsTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit adGroupIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adGroupIds", Some(ad_group_idsQuery.toParamString(ad_group_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def adGroupsUpdate(adAccountId: String, adGroupUpdateRequest: List[AdGroupUpdateRequest]): Task[AdGroupArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdGroupArrayResponse] = jsonOf[AdGroupArrayResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adGroupUpdateRequest)
      resp          <- client.expect[AdGroupArrayResponse](req)

    } yield resp
  }

}
