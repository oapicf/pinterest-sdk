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

import org.openapitools.client.api.BigDecimal
import org.openapitools.client.api.EntityStatus
import org.openapitools.client.api.Error
import org.openapitools.client.api.Granularity
import java.time.LocalDate
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.ProductGroupAnalyticsItems
import org.openapitools.client.api.ProductGroupPromotion
import org.openapitools.client.api.ProductGroupPromotions
import org.openapitools.client.api.ProductGroupPromotionsCreate
import org.openapitools.client.api.ProductGroupPromotionsList200Response
import org.openapitools.client.api.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.client.api.ReportingColumnSync
import org.openapitools.client.api.ReportingTimeZone

object ProductGroupPromotionsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def productGroupPromotionsCreate(host: String, adAccountId: String, productGroupPromotionsCreate: ProductGroupPromotionsCreate): Task[ProductGroupPromotions] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotions] = jsonOf[ProductGroupPromotions]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionsCreate)
      resp          <- client.expect[ProductGroupPromotions](req)

    } yield resp
  }

  def productGroupPromotionsGet(host: String, adAccountId: String, productGroupPromotionId: String): Task[ProductGroupPromotion] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotion] = jsonOf[ProductGroupPromotion]

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
      resp          <- client.expect[ProductGroupPromotion](req)

    } yield resp
  }

  def productGroupPromotionsList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, productGroupPromotionIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"], adGroupId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], productGroupPromotionIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]], adGroupIdQuery: QueryParam[String]): Task[ProductGroupPromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionsList200Response] = jsonOf[ProductGroupPromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("productGroupPromotionIds", Some(product_group_promotion_idsQuery.toParamString(product_group_promotion_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("adGroupId", Some(ad_group_idQuery.toParamString(ad_group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProductGroupPromotionsList200Response](req)

    } yield resp
  }

  def productGroupPromotionsUpdate(host: String, adAccountId: String, productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody): Task[ProductGroupPromotions] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotions] = jsonOf[ProductGroupPromotions]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionsUpdateWithRequiredBody)
      resp          <- client.expect[ProductGroupPromotions](req)

    } yield resp
  }

  def productGroupsAnalytics(host: String, startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String] = List.empty[String] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], productGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[ProductGroupAnalyticsItems]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[ProductGroupAnalyticsItems]] = jsonOf[List[ProductGroupAnalyticsItems]]

    val path = "/ad_accounts/{ad_account_id}/product_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("productGroupIds", Some(product_group_idsQuery.toParamString(product_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[ProductGroupAnalyticsItems]](req)

    } yield resp
  }

}

class HttpServiceProductGroupPromotionsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def productGroupPromotionsCreate(adAccountId: String, productGroupPromotionsCreate: ProductGroupPromotionsCreate): Task[ProductGroupPromotions] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotions] = jsonOf[ProductGroupPromotions]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionsCreate)
      resp          <- client.expect[ProductGroupPromotions](req)

    } yield resp
  }

  def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String): Task[ProductGroupPromotion] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotion] = jsonOf[ProductGroupPromotion]

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
      resp          <- client.expect[ProductGroupPromotion](req)

    } yield resp
  }

  def productGroupPromotionsList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, productGroupPromotionIds: List[String] = List.empty[String] , entityStatuses: List[EntityStatus] = ["ACTIVE","PAUSED"], adGroupId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], productGroupPromotionIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[EntityStatus]], adGroupIdQuery: QueryParam[String]): Task[ProductGroupPromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotionsList200Response] = jsonOf[ProductGroupPromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/product_group_promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("productGroupPromotionIds", Some(product_group_promotion_idsQuery.toParamString(product_group_promotion_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("adGroupId", Some(ad_group_idQuery.toParamString(ad_group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProductGroupPromotionsList200Response](req)

    } yield resp
  }

  def productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody): Task[ProductGroupPromotions] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductGroupPromotions] = jsonOf[ProductGroupPromotions]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productGroupPromotionsUpdateWithRequiredBody)
      resp          <- client.expect[ProductGroupPromotions](req)

    } yield resp
  }

  def productGroupsAnalytics(startDate: LocalDate, endDate: LocalDate, productGroupIds: List[String] = List.empty[String] , columns: List[ReportingColumnSync] = List.empty[ReportingColumnSync] , granularity: Granularity, adAccountId: String, clickWindowDays: BigDecimal = 30, engagementWindowDays: BigDecimal = 30, viewWindowDays: BigDecimal = 1, conversionReportTime: String = TIME_OF_AD_ACTION, reportingTimezone: ReportingTimeZone)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], productGroupIdsQuery: QueryParam[List[String]], columnsQuery: QueryParam[List[ReportingColumnSync]], granularityQuery: QueryParam[Granularity], clickWindowDaysQuery: QueryParam[BigDecimal], engagementWindowDaysQuery: QueryParam[BigDecimal], viewWindowDaysQuery: QueryParam[BigDecimal], conversionReportTimeQuery: QueryParam[String], reportingTimezoneQuery: QueryParam[ReportingTimeZone]): Task[List[ProductGroupAnalyticsItems]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[ProductGroupAnalyticsItems]] = jsonOf[List[ProductGroupAnalyticsItems]]

    val path = "/ad_accounts/{ad_account_id}/product_groups/analytics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("productGroupIds", Some(product_group_idsQuery.toParamString(product_group_ids))), ("columns", Some(columnsQuery.toParamString(columns))), ("granularity", Some(granularityQuery.toParamString(granularity))), ("clickWindowDays", Some(click_window_daysQuery.toParamString(click_window_days))), ("engagementWindowDays", Some(engagement_window_daysQuery.toParamString(engagement_window_days))), ("viewWindowDays", Some(view_window_daysQuery.toParamString(view_window_days))), ("conversionReportTime", Some(conversion_report_timeQuery.toParamString(conversion_report_time))), ("reportingTimezone", Some(reporting_timezoneQuery.toParamString(reporting_timezone))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[ProductGroupAnalyticsItems]](req)

    } yield resp
  }

}
