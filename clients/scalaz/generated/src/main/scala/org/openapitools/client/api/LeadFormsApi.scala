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
import org.openapitools.client.api.LeadForm
import org.openapitools.client.api.LeadFormBatchUpdate
import org.openapitools.client.api.LeadFormCreate
import org.openapitools.client.api.LeadFormTest
import org.openapitools.client.api.LeadFormTestCreate
import org.openapitools.client.api.LeadFormsCreate200Response
import org.openapitools.client.api.LeadFormsList200Response
import org.openapitools.client.api.PaginationOrder

object LeadFormsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def leadFormGet(host: String, leadFormId: String, adAccountId: String): Task[LeadForm] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadForm] = jsonOf[LeadForm]

    val path = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}".replaceAll("\\{" + "lead_form_id" + "\\}",escape(leadFormId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[LeadForm](req)

    } yield resp
  }

  def leadFormTestCreate(host: String, adAccountId: String, leadFormId: String, leadFormTestCreate: LeadFormTestCreate): Task[LeadFormTest] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormTest] = jsonOf[LeadFormTest]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormTestCreate)
      resp          <- client.expect[LeadFormTest](req)

    } yield resp
  }

  def leadFormsCreate(host: String, adAccountId: String, leadFormCreate: List[LeadFormCreate]): Task[LeadFormsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsCreate200Response] = jsonOf[LeadFormsCreate200Response]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormCreate)
      resp          <- client.expect[LeadFormsCreate200Response](req)

    } yield resp
  }

  def leadFormsList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[LeadFormsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsList200Response] = jsonOf[LeadFormsList200Response]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[LeadFormsList200Response](req)

    } yield resp
  }

  def leadFormsUpdate(host: String, adAccountId: String, leadFormBatchUpdate: List[LeadFormBatchUpdate]): Task[LeadFormsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsCreate200Response] = jsonOf[LeadFormsCreate200Response]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormBatchUpdate)
      resp          <- client.expect[LeadFormsCreate200Response](req)

    } yield resp
  }

}

class HttpServiceLeadFormsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def leadFormGet(leadFormId: String, adAccountId: String): Task[LeadForm] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadForm] = jsonOf[LeadForm]

    val path = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}".replaceAll("\\{" + "lead_form_id" + "\\}",escape(leadFormId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[LeadForm](req)

    } yield resp
  }

  def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestCreate: LeadFormTestCreate): Task[LeadFormTest] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormTest] = jsonOf[LeadFormTest]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormTestCreate)
      resp          <- client.expect[LeadFormTest](req)

    } yield resp
  }

  def leadFormsCreate(adAccountId: String, leadFormCreate: List[LeadFormCreate]): Task[LeadFormsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsCreate200Response] = jsonOf[LeadFormsCreate200Response]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormCreate)
      resp          <- client.expect[LeadFormsCreate200Response](req)

    } yield resp
  }

  def leadFormsList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[LeadFormsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsList200Response] = jsonOf[LeadFormsList200Response]

    val path = "/ad_accounts/{ad_account_id}/lead_forms".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[LeadFormsList200Response](req)

    } yield resp
  }

  def leadFormsUpdate(adAccountId: String, leadFormBatchUpdate: List[LeadFormBatchUpdate]): Task[LeadFormsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadFormsCreate200Response] = jsonOf[LeadFormsCreate200Response]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadFormBatchUpdate)
      resp          <- client.expect[LeadFormsCreate200Response](req)

    } yield resp
  }

}
