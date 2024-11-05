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
import org.openapitools.client.api.LeadFormArrayResponse
import org.openapitools.client.api.LeadFormCreateRequest
import org.openapitools.client.api.LeadFormResponse
import org.openapitools.client.api.LeadFormTestRequest
import org.openapitools.client.api.LeadFormTestResponse
import org.openapitools.client.api.LeadFormUpdateRequest
import org.openapitools.client.api.LeadFormsList200Response

object LeadFormsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def leadFormGet(host: String, adAccountId: String, leadFormId: String): Task[LeadFormResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormResponse] = jsonOf[LeadFormResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "lead_form_id" + "\\}",escape(leadFormId.toString))

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
      resp          <- client.expect[LeadFormResponse](req)

    } yield resp
  }

  def leadFormTestCreate(host: String, adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest): Task[LeadFormTestResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormTestResponse] = jsonOf[LeadFormTestResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "lead_form_id" + "\\}",escape(leadFormId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormTestRequest)
      resp          <- client.expect[LeadFormTestResponse](req)

    } yield resp
  }

  def leadFormsCreate(host: String, adAccountId: String, leadFormCreateRequest: List[LeadFormCreateRequest]): Task[LeadFormArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormArrayResponse] = jsonOf[LeadFormArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormCreateRequest)
      resp          <- client.expect[LeadFormArrayResponse](req)

    } yield resp
  }

  def leadFormsList(host: String, adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[LeadFormsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsList200Response] = jsonOf[LeadFormsList200Response]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[LeadFormsList200Response](req)

    } yield resp
  }

  def leadFormsUpdate(host: String, adAccountId: String, leadFormUpdateRequest: List[LeadFormUpdateRequest]): Task[LeadFormArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormArrayResponse] = jsonOf[LeadFormArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormUpdateRequest)
      resp          <- client.expect[LeadFormArrayResponse](req)

    } yield resp
  }

}

class HttpServiceLeadFormsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def leadFormGet(adAccountId: String, leadFormId: String): Task[LeadFormResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormResponse] = jsonOf[LeadFormResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "lead_form_id" + "\\}",escape(leadFormId.toString))

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
      resp          <- client.expect[LeadFormResponse](req)

    } yield resp
  }

  def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest): Task[LeadFormTestResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormTestResponse] = jsonOf[LeadFormTestResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "lead_form_id" + "\\}",escape(leadFormId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormTestRequest)
      resp          <- client.expect[LeadFormTestResponse](req)

    } yield resp
  }

  def leadFormsCreate(adAccountId: String, leadFormCreateRequest: List[LeadFormCreateRequest]): Task[LeadFormArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormArrayResponse] = jsonOf[LeadFormArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormCreateRequest)
      resp          <- client.expect[LeadFormArrayResponse](req)

    } yield resp
  }

  def leadFormsList(adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[LeadFormsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsList200Response] = jsonOf[LeadFormsList200Response]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[LeadFormsList200Response](req)

    } yield resp
  }

  def leadFormsUpdate(adAccountId: String, leadFormUpdateRequest: List[LeadFormUpdateRequest]): Task[LeadFormArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormArrayResponse] = jsonOf[LeadFormArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormUpdateRequest)
      resp          <- client.expect[LeadFormArrayResponse](req)

    } yield resp
  }

}
