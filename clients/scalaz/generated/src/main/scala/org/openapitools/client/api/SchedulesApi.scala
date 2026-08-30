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
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.Schedule
import org.openapitools.client.api.ScheduleBatchUpdate
import org.openapitools.client.api.ScheduleCreate
import org.openapitools.client.api.ScheduleStatus
import org.openapitools.client.api.ScheduleType
import org.openapitools.client.api.SchedulesCreate200ResponseInner
import org.openapitools.client.api.SchedulesList200Response

object SchedulesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def schedulesCreate(host: String, adAccountId: String, scheduleCreate: List[ScheduleCreate]): Task[List[SchedulesCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[SchedulesCreate200ResponseInner]] = jsonOf[List[SchedulesCreate200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/schedules".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(scheduleCreate)
      resp          <- client.expect[List[SchedulesCreate200ResponseInner]](req)

    } yield resp
  }

  def schedulesList(host: String, adAccountId: String, entityIds: List[String] = List.empty[String] , bookmark: String, pageSize: Integer = 25, order: PaginationOrder, scheduleStatuses: List[ScheduleStatus] = List.empty[ScheduleStatus] , scheduleType: ScheduleType)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], scheduleStatusesQuery: QueryParam[List[ScheduleStatus]], scheduleTypeQuery: QueryParam[ScheduleType], entityIdsQuery: QueryParam[List[String]]): Task[SchedulesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SchedulesList200Response] = jsonOf[SchedulesList200Response]

    val path = "/ad_accounts/{ad_account_id}/schedules".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("scheduleStatuses", Some(schedule_statusesQuery.toParamString(schedule_statuses))), ("scheduleType", Some(schedule_typeQuery.toParamString(schedule_type))), ("entityIds", Some(entity_idsQuery.toParamString(entity_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SchedulesList200Response](req)

    } yield resp
  }

  def schedulesUpdate(host: String, adAccountId: String, scheduleBatchUpdate: List[ScheduleBatchUpdate]): Task[List[SchedulesCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[SchedulesCreate200ResponseInner]] = jsonOf[List[SchedulesCreate200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/schedules".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(scheduleBatchUpdate)
      resp          <- client.expect[List[SchedulesCreate200ResponseInner]](req)

    } yield resp
  }

}

class HttpServiceSchedulesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def schedulesCreate(adAccountId: String, scheduleCreate: List[ScheduleCreate]): Task[List[SchedulesCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[SchedulesCreate200ResponseInner]] = jsonOf[List[SchedulesCreate200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/schedules".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(scheduleCreate)
      resp          <- client.expect[List[SchedulesCreate200ResponseInner]](req)

    } yield resp
  }

  def schedulesList(adAccountId: String, entityIds: List[String] = List.empty[String] , bookmark: String, pageSize: Integer = 25, order: PaginationOrder, scheduleStatuses: List[ScheduleStatus] = List.empty[ScheduleStatus] , scheduleType: ScheduleType)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], scheduleStatusesQuery: QueryParam[List[ScheduleStatus]], scheduleTypeQuery: QueryParam[ScheduleType], entityIdsQuery: QueryParam[List[String]]): Task[SchedulesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SchedulesList200Response] = jsonOf[SchedulesList200Response]

    val path = "/ad_accounts/{ad_account_id}/schedules".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("scheduleStatuses", Some(schedule_statusesQuery.toParamString(schedule_statuses))), ("scheduleType", Some(schedule_typeQuery.toParamString(schedule_type))), ("entityIds", Some(entity_idsQuery.toParamString(entity_ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SchedulesList200Response](req)

    } yield resp
  }

  def schedulesUpdate(adAccountId: String, scheduleBatchUpdate: List[ScheduleBatchUpdate]): Task[List[SchedulesCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[SchedulesCreate200ResponseInner]] = jsonOf[List[SchedulesCreate200ResponseInner]]

    val path = "/ad_accounts/{ad_account_id}/schedules".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(scheduleBatchUpdate)
      resp          <- client.expect[List[SchedulesCreate200ResponseInner]](req)

    } yield resp
  }

}
