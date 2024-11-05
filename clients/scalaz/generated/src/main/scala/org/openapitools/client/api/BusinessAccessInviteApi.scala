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

import org.openapitools.client.api.AuthRespondInvitesBody
import org.openapitools.client.api.CancelInvitesBody
import org.openapitools.client.api.CreateAssetAccessRequestBody
import org.openapitools.client.api.CreateAssetAccessRequestResponse
import org.openapitools.client.api.CreateAssetInvitesRequest
import org.openapitools.client.api.CreateInvitesResultsResponseArray
import org.openapitools.client.api.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.client.api.DeleteInvitesResultsResponseArray
import org.openapitools.client.api.Error
import org.openapitools.client.api.GetInvites200Response
import org.openapitools.client.api.InviteType
import org.openapitools.client.api.RespondToInvitesResponseArray
import org.openapitools.client.api.UpdateInvitesResultsResponseArray

object BusinessAccessInviteApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def assetAccessRequestsCreate(host: String, businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody): Task[CreateAssetAccessRequestResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateAssetAccessRequestResponse] = jsonOf[CreateAssetAccessRequestResponse]

    val path = "/businesses/{business_id}/requests/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssetAccessRequestBody)
      resp          <- client.expect[CreateAssetAccessRequestResponse](req)

    } yield resp
  }

  def cancelInvitesOrRequests(host: String, businessId: String, cancelInvitesBody: CancelInvitesBody): Task[DeleteInvitesResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteInvitesResultsResponseArray] = jsonOf[DeleteInvitesResultsResponseArray]

    val path = "/businesses/{business_id}/invites".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(cancelInvitesBody)
      resp          <- client.expect[DeleteInvitesResultsResponseArray](req)

    } yield resp
  }

  def createAssetInvites(host: String, businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest): Task[UpdateInvitesResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateInvitesResultsResponseArray] = jsonOf[UpdateInvitesResultsResponseArray]

    val path = "/businesses/{business_id}/invites/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssetInvitesRequest)
      resp          <- client.expect[UpdateInvitesResultsResponseArray](req)

    } yield resp
  }

  def createMembershipOrPartnershipInvites(host: String, businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody): Task[CreateInvitesResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateInvitesResultsResponseArray] = jsonOf[CreateInvitesResultsResponseArray]

    val path = "/businesses/{business_id}/invites".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createMembershipOrPartnershipInvitesBody)
      resp          <- client.expect[CreateInvitesResultsResponseArray](req)

    } yield resp
  }

  def getInvites(host: String, businessId: String, isMember: Boolean = true, inviteStatus: List[String] = List.empty[String] , inviteType: InviteType, bookmark: String, pageSize: Integer = 25)(implicit isMemberQuery: QueryParam[Boolean], inviteStatusQuery: QueryParam[List[String]], inviteTypeQuery: QueryParam[InviteType], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetInvites200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetInvites200Response] = jsonOf[GetInvites200Response]

    val path = "/businesses/{business_id}/invites".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("isMember", Some(is_memberQuery.toParamString(is_member))), ("inviteStatus", Some(invite_statusQuery.toParamString(invite_status))), ("inviteType", Some(invite_typeQuery.toParamString(invite_type))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetInvites200Response](req)

    } yield resp
  }

  def respondBusinessAccessInvites(host: String, authRespondInvitesBody: AuthRespondInvitesBody): Task[RespondToInvitesResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[RespondToInvitesResponseArray] = jsonOf[RespondToInvitesResponseArray]

    val path = "/businesses/invites"

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(authRespondInvitesBody)
      resp          <- client.expect[RespondToInvitesResponseArray](req)

    } yield resp
  }

}

class HttpServiceBusinessAccessInviteApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def assetAccessRequestsCreate(businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody): Task[CreateAssetAccessRequestResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateAssetAccessRequestResponse] = jsonOf[CreateAssetAccessRequestResponse]

    val path = "/businesses/{business_id}/requests/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssetAccessRequestBody)
      resp          <- client.expect[CreateAssetAccessRequestResponse](req)

    } yield resp
  }

  def cancelInvitesOrRequests(businessId: String, cancelInvitesBody: CancelInvitesBody): Task[DeleteInvitesResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteInvitesResultsResponseArray] = jsonOf[DeleteInvitesResultsResponseArray]

    val path = "/businesses/{business_id}/invites".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(cancelInvitesBody)
      resp          <- client.expect[DeleteInvitesResultsResponseArray](req)

    } yield resp
  }

  def createAssetInvites(businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest): Task[UpdateInvitesResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateInvitesResultsResponseArray] = jsonOf[UpdateInvitesResultsResponseArray]

    val path = "/businesses/{business_id}/invites/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssetInvitesRequest)
      resp          <- client.expect[UpdateInvitesResultsResponseArray](req)

    } yield resp
  }

  def createMembershipOrPartnershipInvites(businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody): Task[CreateInvitesResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateInvitesResultsResponseArray] = jsonOf[CreateInvitesResultsResponseArray]

    val path = "/businesses/{business_id}/invites".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createMembershipOrPartnershipInvitesBody)
      resp          <- client.expect[CreateInvitesResultsResponseArray](req)

    } yield resp
  }

  def getInvites(businessId: String, isMember: Boolean = true, inviteStatus: List[String] = List.empty[String] , inviteType: InviteType, bookmark: String, pageSize: Integer = 25)(implicit isMemberQuery: QueryParam[Boolean], inviteStatusQuery: QueryParam[List[String]], inviteTypeQuery: QueryParam[InviteType], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetInvites200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetInvites200Response] = jsonOf[GetInvites200Response]

    val path = "/businesses/{business_id}/invites".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("isMember", Some(is_memberQuery.toParamString(is_member))), ("inviteStatus", Some(invite_statusQuery.toParamString(invite_status))), ("inviteType", Some(invite_typeQuery.toParamString(invite_type))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetInvites200Response](req)

    } yield resp
  }

  def respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody): Task[RespondToInvitesResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[RespondToInvitesResponseArray] = jsonOf[RespondToInvitesResponseArray]

    val path = "/businesses/invites"

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(authRespondInvitesBody)
      resp          <- client.expect[RespondToInvitesResponseArray](req)

    } yield resp
  }

}
