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
import org.openapitools.client.api.LabelCreateRequest
import org.openapitools.client.api.LabelUpdateRequest
import org.openapitools.client.api.LabelsList200Response
import org.openapitools.client.api.LabelsResponse

object LabelsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def labelsCreate(host: String, adAccountId: String, labelCreateRequest: LabelCreateRequest): Task[LabelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LabelsResponse] = jsonOf[LabelsResponse]

    val path = "/ad_accounts/{ad_account_id}/labels".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(labelCreateRequest)
      resp          <- client.expect[LabelsResponse](req)

    } yield resp
  }

  def labelsList(host: String, adAccountId: String, campaignIds: List[String] = List.empty[String] , labelIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE"], labelTypes: List[String] = ["BRAND","CUSTOM"], pageSize: Integer = 25, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], labelIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], labelTypesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[LabelsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LabelsList200Response] = jsonOf[LabelsList200Response]

    val path = "/ad_accounts/{ad_account_id}/labels".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("labelIds", Some(label_idsQuery.toParamString(label_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("labelTypes", Some(label_typesQuery.toParamString(label_types))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[LabelsList200Response](req)

    } yield resp
  }

  def labelsUpdate(host: String, adAccountId: String, labelUpdateRequest: LabelUpdateRequest): Task[LabelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LabelsResponse] = jsonOf[LabelsResponse]

    val path = "/ad_accounts/{ad_account_id}/labels".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(labelUpdateRequest)
      resp          <- client.expect[LabelsResponse](req)

    } yield resp
  }

}

class HttpServiceLabelsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest): Task[LabelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LabelsResponse] = jsonOf[LabelsResponse]

    val path = "/ad_accounts/{ad_account_id}/labels".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(labelCreateRequest)
      resp          <- client.expect[LabelsResponse](req)

    } yield resp
  }

  def labelsList(adAccountId: String, campaignIds: List[String] = List.empty[String] , labelIds: List[String] = List.empty[String] , entityStatuses: List[String] = ["ACTIVE"], labelTypes: List[String] = ["BRAND","CUSTOM"], pageSize: Integer = 25, bookmark: String)(implicit campaignIdsQuery: QueryParam[List[String]], labelIdsQuery: QueryParam[List[String]], entityStatusesQuery: QueryParam[List[String]], labelTypesQuery: QueryParam[List[String]], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[LabelsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LabelsList200Response] = jsonOf[LabelsList200Response]

    val path = "/ad_accounts/{ad_account_id}/labels".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignIds", Some(campaign_idsQuery.toParamString(campaign_ids))), ("labelIds", Some(label_idsQuery.toParamString(label_ids))), ("entityStatuses", Some(entity_statusesQuery.toParamString(entity_statuses))), ("labelTypes", Some(label_typesQuery.toParamString(label_types))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[LabelsList200Response](req)

    } yield resp
  }

  def labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest): Task[LabelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LabelsResponse] = jsonOf[LabelsResponse]

    val path = "/ad_accounts/{ad_account_id}/labels".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(labelUpdateRequest)
      resp          <- client.expect[LabelsResponse](req)

    } yield resp
  }

}
