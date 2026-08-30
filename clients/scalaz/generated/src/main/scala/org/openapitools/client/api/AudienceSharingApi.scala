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

import org.openapitools.client.api.AdAccountToAdAccountSharedAudience
import org.openapitools.client.api.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.client.api.AdAccountToBusinessSharedAudience
import org.openapitools.client.api.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.client.api.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.client.api.AudienceAccountType
import org.openapitools.client.api.BusinessToAdAccountSharedAudience
import org.openapitools.client.api.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.client.api.BusinessToBusinessSharedAudience
import org.openapitools.client.api.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.client.api.Error
import org.openapitools.client.api.Order
import org.openapitools.client.api.SharedAudiencesForBusinessList200Response

object AudienceSharingApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsAudiencesSharedAccountsList(host: String, audienceId: String, accountType: AudienceAccountType, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences/shared/accounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def businessAccountAudiencesSharedAccountsList(host: String, businessId: String, audienceId: String, accountType: AudienceAccountType, bookmark: String, pageSize: Integer = 25)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/businesses/{business_id}/audiences/shared/accounts".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def sharedAudiencesForBusinessList(host: String, businessId: String, order: Order, bookmark: String, pageSize: Integer = 25)(implicit orderQuery: QueryParam[Order], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[SharedAudiencesForBusinessList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SharedAudiencesForBusinessList200Response] = jsonOf[SharedAudiencesForBusinessList200Response]

    val path = "/businesses/{business_id}/audiences".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SharedAudiencesForBusinessList200Response](req)

    } yield resp
  }

  def updateAdAccountToAdAccountSharedAudience(host: String, adAccountId: String, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody): Task[AdAccountToAdAccountSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountToAdAccountSharedAudience] = jsonOf[AdAccountToAdAccountSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[AdAccountToAdAccountSharedAudience](req)

    } yield resp
  }

  def updateAdAccountToBusinessSharedAudience(host: String, adAccountId: String, adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody): Task[AdAccountToBusinessSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountToBusinessSharedAudience] = jsonOf[AdAccountToBusinessSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountToBusinessSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[AdAccountToBusinessSharedAudience](req)

    } yield resp
  }

  def updateBusinessToAdAccountSharedAudience(host: String, businessId: String, businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody): Task[BusinessToAdAccountSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessToAdAccountSharedAudience] = jsonOf[BusinessToAdAccountSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessToAdAccountSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[BusinessToAdAccountSharedAudience](req)

    } yield resp
  }

  def updateBusinessToBusinessSharedAudience(host: String, businessId: String, businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody): Task[BusinessToBusinessSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessToBusinessSharedAudience] = jsonOf[BusinessToBusinessSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessToBusinessSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[BusinessToBusinessSharedAudience](req)

    } yield resp
  }

}

class HttpServiceAudienceSharingApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsAudiencesSharedAccountsList(audienceId: String, accountType: AudienceAccountType, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences/shared/accounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: AudienceAccountType, bookmark: String, pageSize: Integer = 25)(implicit audienceIdQuery: QueryParam[String], accountTypeQuery: QueryParam[AudienceAccountType], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdAccountsAudiencesSharedAccountsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]

    val path = "/businesses/{business_id}/audiences/shared/accounts".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceId", Some(audience_idQuery.toParamString(audience_id))), ("accountType", Some(account_typeQuery.toParamString(account_type))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsAudiencesSharedAccountsList200Response](req)

    } yield resp
  }

  def sharedAudiencesForBusinessList(businessId: String, order: Order, bookmark: String, pageSize: Integer = 25)(implicit orderQuery: QueryParam[Order], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[SharedAudiencesForBusinessList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SharedAudiencesForBusinessList200Response] = jsonOf[SharedAudiencesForBusinessList200Response]

    val path = "/businesses/{business_id}/audiences".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SharedAudiencesForBusinessList200Response](req)

    } yield resp
  }

  def updateAdAccountToAdAccountSharedAudience(adAccountId: String, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody): Task[AdAccountToAdAccountSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountToAdAccountSharedAudience] = jsonOf[AdAccountToAdAccountSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[AdAccountToAdAccountSharedAudience](req)

    } yield resp
  }

  def updateAdAccountToBusinessSharedAudience(adAccountId: String, adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody): Task[AdAccountToBusinessSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountToBusinessSharedAudience] = jsonOf[AdAccountToBusinessSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountToBusinessSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[AdAccountToBusinessSharedAudience](req)

    } yield resp
  }

  def updateBusinessToAdAccountSharedAudience(businessId: String, businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody): Task[BusinessToAdAccountSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessToAdAccountSharedAudience] = jsonOf[BusinessToAdAccountSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessToAdAccountSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[BusinessToAdAccountSharedAudience](req)

    } yield resp
  }

  def updateBusinessToBusinessSharedAudience(businessId: String, businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody): Task[BusinessToBusinessSharedAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessToBusinessSharedAudience] = jsonOf[BusinessToBusinessSharedAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessToBusinessSharedAudienceUpdateWithRequiredBody)
      resp          <- client.expect[BusinessToBusinessSharedAudience](req)

    } yield resp
  }

}
