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

import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.ProductGroupAnalyticsResponseInner
import org.openapitools.client.api.ProductGroupPromotionCreateRequest
import org.openapitools.client.api.ProductGroupPromotionResponse
import org.openapitools.client.api.ProductGroupPromotionUpdateRequest
import org.openapitools.client.api.ProductGroupPromotionsList200Response

object ProductGroupPromotionsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def productGroupPromotionsCreate(host: String, adAccountId: String, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest): Task[ProductGroupPromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionResponse] = jsonOf[ProductGroupPromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionCreateRequest)
      resp          <- client.expect[ProductGroupPromotionResponse](req)

    } yield resp
  }

  def productGroupPromotionsGet(host: String, adAccountId: String, productGroupPromotionId: String): Task[ProductGroupPromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionResponse] = jsonOf[ProductGroupPromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "product_group_promotion_id" + "\\}",escape(productGroupPromotionId.toString))

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
      resp          <- client.expect[ProductGroupPromotionResponse](req)

    } yield resp
  }

  def productGroupPromotionsList(host: String, adAccountId: String, productGroupPromotionIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], adGroupId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit productGroupPromotionIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], adGroupIdQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[ProductGroupPromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionsList200Response] = jsonOf[ProductGroupPromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("productGroupPromotionIds", Some(product_group_promotion_idsQuery.toParamString(product_group_promotion_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("adGroupId", Some(ad_group_idQuery.toParamString(ad_group_id))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProductGroupPromotionsList200Response](req)

    } yield resp
  }

  def productGroupPromotionsUpdate(host: String, adAccountId: String, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest): Task[ProductGroupPromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionResponse] = jsonOf[ProductGroupPromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionUpdateRequest)
      resp          <- client.expect[ProductGroupPromotionResponse](req)

    } yield resp
  }

  def productGroupsAnalytics(host: String, adAccountId: String, startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], productGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[ProductGroupAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[ProductGroupAnalyticsResponseInner]] = jsonOf[List[ProductGroupAnalyticsResponseInner]]

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
      resp          <- client.expect[List[ProductGroupAnalyticsResponseInner]](req)

    } yield resp
  }

}

class HttpServiceProductGroupPromotionsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def productGroupPromotionsCreate(adAccountId: String, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest): Task[ProductGroupPromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionResponse] = jsonOf[ProductGroupPromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionCreateRequest)
      resp          <- client.expect[ProductGroupPromotionResponse](req)

    } yield resp
  }

  def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String): Task[ProductGroupPromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionResponse] = jsonOf[ProductGroupPromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "product_group_promotion_id" + "\\}",escape(productGroupPromotionId.toString))

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
      resp          <- client.expect[ProductGroupPromotionResponse](req)

    } yield resp
  }

  def productGroupPromotionsList(adAccountId: String, productGroupPromotionIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE","PAUSED"], adGroupId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit productGroupPromotionIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], adGroupIdQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[ProductGroupPromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionsList200Response] = jsonOf[ProductGroupPromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("productGroupPromotionIds", Some(product_group_promotion_idsQuery.toParamString(product_group_promotion_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("adGroupId", Some(ad_group_idQuery.toParamString(ad_group_id))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProductGroupPromotionsList200Response](req)

    } yield resp
  }

  def productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest): Task[ProductGroupPromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionResponse] = jsonOf[ProductGroupPromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionUpdateRequest)
      resp          <- client.expect[ProductGroupPromotionResponse](req)

    } yield resp
  }

  def productGroupsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String] = List.empty[String] , columns: List[String] = List.empty[String] , granularity: Granularity, clickWindowDays: Integer = 30, engagementWindowDays: Integer = 30, viewWindowDays: Integer = 1, conversionReportTime: String = TIME_OF_AD_ACTION)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], productGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[String]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[Integer], engagementWindowDaysQuery: QueryParam[Integer], viewWindowDaysQuery: QueryParam[Integer], conversionReportTimeQuery: QueryParam[String]): Task[List[ProductGroupAnalyticsResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[ProductGroupAnalyticsResponseInner]] = jsonOf[List[ProductGroupAnalyticsResponseInner]]

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
      resp          <- client.expect[List[ProductGroupAnalyticsResponseInner]](req)

    } yield resp
  }

}
