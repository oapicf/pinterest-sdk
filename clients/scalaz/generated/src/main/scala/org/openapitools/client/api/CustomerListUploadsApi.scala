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

import org.openapitools.client.api.CustomerListUploadCreateRequest
import org.openapitools.client.api.CustomerListUploadCreateResponse
import org.openapitools.client.api.CustomerListUploadResponse
import org.openapitools.client.api.Error

object CustomerListUploadsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def customerListUploadsCreate(host: String, adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest): Task[CustomerListUploadCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListUploadCreateResponse] = jsonOf[CustomerListUploadCreateResponse]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListUploadCreateRequest)
      resp          <- client.expect[CustomerListUploadCreateResponse](req)

    } yield resp
  }

  def customerListUploadsGet(host: String, adAccountId: String, customerListId: String, customerListUploadId: String): Task[CustomerListUploadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListUploadResponse] = jsonOf[CustomerListUploadResponse]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString)).replaceAll("\\{" + "customer_list_upload_id" + "\\}",escape(customerListUploadId.toString))

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
      resp          <- client.expect[CustomerListUploadResponse](req)

    } yield resp
  }

  def customerListUploadsRun(host: String, adAccountId: String, customerListId: String, customerListUploadId: String): Task[CustomerListUploadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListUploadResponse] = jsonOf[CustomerListUploadResponse]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString)).replaceAll("\\{" + "customer_list_upload_id" + "\\}",escape(customerListUploadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CustomerListUploadResponse](req)

    } yield resp
  }

}

class HttpServiceCustomerListUploadsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest): Task[CustomerListUploadCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListUploadCreateResponse] = jsonOf[CustomerListUploadCreateResponse]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListUploadCreateRequest)
      resp          <- client.expect[CustomerListUploadCreateResponse](req)

    } yield resp
  }

  def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String): Task[CustomerListUploadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListUploadResponse] = jsonOf[CustomerListUploadResponse]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString)).replaceAll("\\{" + "customer_list_upload_id" + "\\}",escape(customerListUploadId.toString))

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
      resp          <- client.expect[CustomerListUploadResponse](req)

    } yield resp
  }

  def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String): Task[CustomerListUploadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListUploadResponse] = jsonOf[CustomerListUploadResponse]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString)).replaceAll("\\{" + "customer_list_upload_id" + "\\}",escape(customerListUploadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CustomerListUploadResponse](req)

    } yield resp
  }

}
