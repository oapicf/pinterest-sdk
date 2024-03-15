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

import org.openapitools.client.api.CustomerList
import org.openapitools.client.api.CustomerListRequest
import org.openapitools.client.api.CustomerListUpdateRequest
import org.openapitools.client.api.CustomerListsList200Response
import org.openapitools.client.api.Error

object CustomerListsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def customerListsCreate(host: String, adAccountId: String, customerListRequest: CustomerListRequest): Task[CustomerList] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]

    val path = "/ad_accounts/{ad_account_id}/customer_lists".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListRequest)
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

  def customerListsGet(host: String, adAccountId: String, customerListId: String): Task[CustomerList] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString))

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
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

  def customerListsList(host: String, adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[CustomerListsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListsList200Response] = jsonOf[CustomerListsList200Response]

    val path = "/ad_accounts/{ad_account_id}/customer_lists".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[CustomerListsList200Response](req)

    } yield resp
  }

  def customerListsUpdate(host: String, adAccountId: String, customerListId: String, customerListUpdateRequest: CustomerListUpdateRequest): Task[CustomerList] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListUpdateRequest)
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

}

class HttpServiceCustomerListsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def customerListsCreate(adAccountId: String, customerListRequest: CustomerListRequest): Task[CustomerList] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]

    val path = "/ad_accounts/{ad_account_id}/customer_lists".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListRequest)
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

  def customerListsGet(adAccountId: String, customerListId: String): Task[CustomerList] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString))

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
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

  def customerListsList(adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[CustomerListsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListsList200Response] = jsonOf[CustomerListsList200Response]

    val path = "/ad_accounts/{ad_account_id}/customer_lists".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[CustomerListsList200Response](req)

    } yield resp
  }

  def customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateRequest: CustomerListUpdateRequest): Task[CustomerList] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]

    val path = "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "customer_list_id" + "\\}",escape(customerListId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListUpdateRequest)
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

}
