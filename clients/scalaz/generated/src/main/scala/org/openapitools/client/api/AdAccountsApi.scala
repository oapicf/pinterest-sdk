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

import org.openapitools.client.api.AdsAnalyticsCreateAsyncRequest
import org.openapitools.client.api.AdsAnalyticsCreateAsyncResponse
import org.openapitools.client.api.AdsAnalyticsGetAsyncResponse
import org.openapitools.client.api.AnyType
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.Paginated

object AdAccountsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

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
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def adAccountsList(host: String, bookmark: String, pageSize: Integer = 25, includeSharedAccounts: Boolean = true)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], includeSharedAccountsQuery: QueryParam[Boolean]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def adGroupsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

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
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def adGroupsList(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , entityStatuses: List[String] = List.empty[String] , pageSize: Integer = 25, order: String, bookmark: String, translateInterestsToNames: Boolean = false)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String], translateInterestsToNamesQuery: QueryParam[Boolean]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def adsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, adIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

    val path = "/ad_accounts/{ad_account_id}/ads/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def adsList(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , entityStatuses: List[String] = List.empty[String] , pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], adIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

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

  def campaignsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], campaignIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

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
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def campaignsList(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , entityStatuses: List[String] = List.empty[String] , pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def productGroupsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], productGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

    val path = "/ad_accounts/{ad_account_id}/product_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("productGroupIds", Some(product_group_idsQuery.toParamString(product_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

}

class HttpServiceAdAccountsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

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
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def adAccountsList(bookmark: String, pageSize: Integer = 25, includeSharedAccounts: Boolean = true)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], includeSharedAccountsQuery: QueryParam[Boolean]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def adGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

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
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def adGroupsList(adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , entityStatuses: List[String] = List.empty[String] , pageSize: Integer = 25, order: String, bookmark: String, translateInterestsToNames: Boolean = false)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String], translateInterestsToNamesQuery: QueryParam[Boolean]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def adsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, adIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], adIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

    val path = "/ad_accounts/{ad_account_id}/ads/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("adIds", Some(ad_idsQuery.toParamString(ad_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def adsList(adAccountId: String, campaignIds: List[String] = List.empty[String] , adGroupIds: List[String] = List.empty[String] , adIds: List[String] = List.empty[String] , entityStatuses: List[String] = List.empty[String] , pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], adGroupIdsQuery: QueryParam[List[String]], adIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

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

  def campaignsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], campaignIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

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
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

  def campaignsList(adAccountId: String, campaignIds: List[String] = List.empty[String] , entityStatuses: List[String] = List.empty[String] , pageSize: Integer = 25, order: String, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

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
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def productGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], productGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[Map[String, Any]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Map[String, Any]]] = jsonOf[List[Map[String, Any]]]

    val path = "/ad_accounts/{ad_account_id}/product_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("productGroupIds", Some(product_group_idsQuery.toParamString(product_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Map[String, Any]]](req)

    } yield resp
  }

}
