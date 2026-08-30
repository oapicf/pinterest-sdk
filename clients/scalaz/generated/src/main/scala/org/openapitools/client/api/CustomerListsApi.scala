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
import org.openapitools.client.api.CustomerListCreate
import org.openapitools.client.api.CustomerListUpdateWithRequiredBody
import org.openapitools.client.api.CustomerListsList200Response
import org.openapitools.client.api.Error
import org.openapitools.client.api.PaginationOrder

object CustomerListsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def customerListsCreate(host: String, adAccountId: String, customerListCreate: CustomerListCreate): Task[CustomerList] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListCreate)
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

  def customerListsList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, excludeNca: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], excludeNcaQuery: QueryParam[Boolean]): Task[CustomerListsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListsList200Response] = jsonOf[CustomerListsList200Response]

    val path = "/ad_accounts/{ad_account_id}/customer_lists".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("excludeNca", Some(exclude_ncaQuery.toParamString(exclude_nca))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CustomerListsList200Response](req)

    } yield resp
  }

  def customerListsUpdate(host: String, adAccountId: String, customerListId: String, customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody): Task[CustomerList] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListUpdateWithRequiredBody)
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

}

class HttpServiceCustomerListsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def customerListsCreate(adAccountId: String, customerListCreate: CustomerListCreate): Task[CustomerList] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListCreate)
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

  def customerListsList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, excludeNca: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], excludeNcaQuery: QueryParam[Boolean]): Task[CustomerListsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CustomerListsList200Response] = jsonOf[CustomerListsList200Response]

    val path = "/ad_accounts/{ad_account_id}/customer_lists".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("excludeNca", Some(exclude_ncaQuery.toParamString(exclude_nca))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CustomerListsList200Response](req)

    } yield resp
  }

  def customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody): Task[CustomerList] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(customerListUpdateWithRequiredBody)
      resp          <- client.expect[CustomerList](req)

    } yield resp
  }

}
