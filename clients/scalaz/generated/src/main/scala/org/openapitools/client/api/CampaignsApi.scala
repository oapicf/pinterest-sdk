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

import org.openapitools.client.api.AdsAnalyticsTargetingType
import org.openapitools.client.api.CampaignCreateRequest
import org.openapitools.client.api.CampaignCreateResponse
import org.openapitools.client.api.CampaignResponse
import org.openapitools.client.api.CampaignUpdateRequest
import org.openapitools.client.api.CampaignUpdateResponse
import org.openapitools.client.api.CampaignsAnalyticsResponseInner
import org.openapitools.client.api.CampaignsList200Response
import org.openapitools.client.api.ConversionReportAttributionType
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.MetricsResponse

object CampaignsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def campaignTargetingAnalyticsGet(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType] = List.empty[AdsAnalyticsTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit campaignIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def campaignsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], campaignIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[CampaignsAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignsAnalyticsResponseInner]] = jsonOf[List[CampaignsAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/campaigns/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignsAnalyticsResponseInner]](req)

    } yield resp
  }

  def campaignsCreate(host: String, adAccountId: String, campaignCreateRequest: List[CampaignCreateRequest]): Task[CampaignCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignCreateResponse] = jsonOf[CampaignCreateResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignCreateRequest)
      resp          <- client.expect[CampaignCreateResponse](req)

    } yield resp
  }

  def campaignsGet(host: String, adAccountId: String, campaignId: String): Task[CampaignResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignResponse] = jsonOf[CampaignResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "campaign_id" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[CampaignResponse](req)

    } yield resp
  }

  def campaignsList(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[CampaignsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignsList200Response] = jsonOf[CampaignsList200Response]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CampaignsList200Response](req)

    } yield resp
  }

  def campaignsUpdate(host: String, adAccountId: String, campaignUpdateRequest: List[CampaignUpdateRequest]): Task[CampaignUpdateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignUpdateResponse] = jsonOf[CampaignUpdateResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignUpdateRequest)
      resp          <- client.expect[CampaignUpdateResponse](req)

    } yield resp
  }

}

class HttpServiceCampaignsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: List[String] = List.empty[String] , startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsTargetingType] = List.empty[AdsAnalyticsTargetingType] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION, attributionTypes: ConversionReportAttributionType)(implicit campaignIdsQuery: QueryParam[List[String]], startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], targetingTypesQuery: QueryParam[List[AdsAnalyticsTargetingType]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String], attributionTypesQuery: QueryParam[ConversionReportAttributionType]): Task[MetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MetricsResponse] = jsonOf[MetricsResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("targetingTypes", Some(targeting_typesQuery.toParamString(targeting_types))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("attributionTypes", Some(attribution_typesQuery.toParamString(attribution_types))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MetricsResponse](req)

    } yield resp
  }

  def campaignsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], campaignIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[CampaignsAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CampaignsAnalyticsResponseInner]] = jsonOf[List[CampaignsAnalyticsResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/campaigns/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CampaignsAnalyticsResponseInner]](req)

    } yield resp
  }

  def campaignsCreate(adAccountId: String, campaignCreateRequest: List[CampaignCreateRequest]): Task[CampaignCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignCreateResponse] = jsonOf[CampaignCreateResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignCreateRequest)
      resp          <- client.expect[CampaignCreateResponse](req)

    } yield resp
  }

  def campaignsGet(adAccountId: String, campaignId: String): Task[CampaignResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignResponse] = jsonOf[CampaignResponse]

    val path = "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "campaign_id" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[CampaignResponse](req)

    } yield resp
  }

  def campaignsList(adAccountId: String, campaignIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[CampaignsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignsList200Response] = jsonOf[CampaignsList200Response]

    val path = "/ad_accounts/{ad_account_id}/campaigns".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CampaignsList200Response](req)

    } yield resp
  }

  def campaignsUpdate(adAccountId: String, campaignUpdateRequest: List[CampaignUpdateRequest]): Task[CampaignUpdateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CampaignUpdateResponse] = jsonOf[CampaignUpdateResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(campaignUpdateRequest)
      resp          <- client.expect[CampaignUpdateResponse](req)

    } yield resp
  }

}
