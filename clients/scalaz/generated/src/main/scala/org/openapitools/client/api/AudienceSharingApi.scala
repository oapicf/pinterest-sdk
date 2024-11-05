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

import org.openapitools.client.api.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.client.api.AudienceAccountType
import org.openapitools.client.api.AudiencesList200Response
import org.openapitools.client.api.BusinessSharedAudience
import org.openapitools.client.api.BusinessSharedAudienceResponse
import org.openapitools.client.api.Error
import org.openapitools.client.api.SharedAudience
import org.openapitools.client.api.SharedAudienceResponse

object AudienceSharingApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsAudiencesSharedAccountsList(host: String, adAccountId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Integer = 25, bookmark: String)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences/shared/accounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def businessAccountAudiencesSharedAccountsList(host: String, businessId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Integer = 25, bookmark: String)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/businesses/{business_id}/audiences/shared/accounts".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def sharedAudiencesForBusinessList(host: String, businessId: String, bookmark: String, order: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], orderQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AudiencesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AudiencesList200Response] = jsonOf[AudiencesList200Response]

    val path = "/businesses/{business_id}/audiences".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("order", Some(orderQuery.toParamString(order))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudiencesList200Response](req)

    } yield resp
  }

  def updateAdAccountToAdAccountSharedAudience(host: String, adAccountId: String, sharedAudience: SharedAudience): Task[SharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SharedAudienceResponse] = jsonOf[SharedAudienceResponse]

    val path = "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sharedAudience)
      resp          <- client.expect[SharedAudienceResponse](req)

    } yield resp
  }

  def updateAdAccountToBusinessSharedAudience(host: String, adAccountId: String, businessSharedAudience: BusinessSharedAudience): Task[BusinessSharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessSharedAudienceResponse] = jsonOf[BusinessSharedAudienceResponse]

    val path = "/ad_accounts/{ad_account_id}/audiences/businesses/shared".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessSharedAudience)
      resp          <- client.expect[BusinessSharedAudienceResponse](req)

    } yield resp
  }

  def updateBusinessToAdAccountSharedAudience(host: String, businessId: String, sharedAudience: SharedAudience): Task[SharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SharedAudienceResponse] = jsonOf[SharedAudienceResponse]

    val path = "/businesses/{business_id}/audiences/ad_accounts/shared".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sharedAudience)
      resp          <- client.expect[SharedAudienceResponse](req)

    } yield resp
  }

  def updateBusinessToBusinessSharedAudience(host: String, businessId: String, businessSharedAudience: BusinessSharedAudience): Task[BusinessSharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessSharedAudienceResponse] = jsonOf[BusinessSharedAudienceResponse]

    val path = "/businesses/{business_id}/audiences/businesses/shared".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessSharedAudience)
      resp          <- client.expect[BusinessSharedAudienceResponse](req)

    } yield resp
  }

}

class HttpServiceAudienceSharingApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsAudiencesSharedAccountsList(adAccountId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Integer = 25, bookmark: String)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences/shared/accounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Integer = 25, bookmark: String)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/businesses/{business_id}/audiences/shared/accounts".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def sharedAudiencesForBusinessList(businessId: String, bookmark: String, order: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], orderQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AudiencesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AudiencesList200Response] = jsonOf[AudiencesList200Response]

    val path = "/businesses/{business_id}/audiences".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("order", Some(orderQuery.toParamString(order))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudiencesList200Response](req)

    } yield resp
  }

  def updateAdAccountToAdAccountSharedAudience(adAccountId: String, sharedAudience: SharedAudience): Task[SharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SharedAudienceResponse] = jsonOf[SharedAudienceResponse]

    val path = "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sharedAudience)
      resp          <- client.expect[SharedAudienceResponse](req)

    } yield resp
  }

  def updateAdAccountToBusinessSharedAudience(adAccountId: String, businessSharedAudience: BusinessSharedAudience): Task[BusinessSharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessSharedAudienceResponse] = jsonOf[BusinessSharedAudienceResponse]

    val path = "/ad_accounts/{ad_account_id}/audiences/businesses/shared".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessSharedAudience)
      resp          <- client.expect[BusinessSharedAudienceResponse](req)

    } yield resp
  }

  def updateBusinessToAdAccountSharedAudience(businessId: String, sharedAudience: SharedAudience): Task[SharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SharedAudienceResponse] = jsonOf[SharedAudienceResponse]

    val path = "/businesses/{business_id}/audiences/ad_accounts/shared".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sharedAudience)
      resp          <- client.expect[SharedAudienceResponse](req)

    } yield resp
  }

  def updateBusinessToBusinessSharedAudience(businessId: String, businessSharedAudience: BusinessSharedAudience): Task[BusinessSharedAudienceResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessSharedAudienceResponse] = jsonOf[BusinessSharedAudienceResponse]

    val path = "/businesses/{business_id}/audiences/businesses/shared".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessSharedAudience)
      resp          <- client.expect[BusinessSharedAudienceResponse](req)

    } yield resp
  }

}
