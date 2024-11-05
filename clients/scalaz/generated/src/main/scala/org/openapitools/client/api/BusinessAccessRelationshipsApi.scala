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

import org.openapitools.client.api.DeletePartnersRequest
import org.openapitools.client.api.DeletePartnersResponse
import org.openapitools.client.api.DeletedMembersResponse
import org.openapitools.client.api.Error
import org.openapitools.client.api.GetBusinessEmployers200Response
import org.openapitools.client.api.GetBusinessMembers200Response
import org.openapitools.client.api.GetBusinessPartners200Response
import org.openapitools.client.api.MemberBusinessRole
import org.openapitools.client.api.MembersToDeleteBody
import org.openapitools.client.api.PartnerType
import org.openapitools.client.api.UpdateMemberBusinessRoleBody
import org.openapitools.client.api.UpdateMemberResultsResponseArray

object BusinessAccessRelationshipsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteBusinessMembership(host: String, businessId: String, membersToDeleteBody: MembersToDeleteBody): Task[DeletedMembersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletedMembersResponse] = jsonOf[DeletedMembersResponse]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(membersToDeleteBody)
      resp          <- client.expect[DeletedMembersResponse](req)

    } yield resp
  }

  def deleteBusinessPartners(host: String, businessId: String, deletePartnersRequest: DeletePartnersRequest): Task[DeletePartnersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePartnersResponse] = jsonOf[DeletePartnersResponse]

    val path = "/businesses/{business_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePartnersRequest)
      resp          <- client.expect[DeletePartnersResponse](req)

    } yield resp
  }

  def getBusinessEmployers(host: String, pageSize: Integer = 25, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/employers"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def getBusinessMembers(host: String, businessId: String, assetsSummary: Boolean = false, businessRoles: List[MemberBusinessRole] = List.empty[MemberBusinessRole] , memberIds: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit assetsSummaryQuery: QueryParam[Boolean], businessRolesQuery: QueryParam[List[MemberBusinessRole]], memberIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessMembers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessMembers200Response] = jsonOf[GetBusinessMembers200Response]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("businessRoles", Some(business_rolesQuery.toParamString(business_roles))), ("memberIds", Some(member_idsQuery.toParamString(member_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessMembers200Response](req)

    } yield resp
  }

  def getBusinessPartners(host: String, businessId: String, assetsSummary: Boolean = false, partnerType: PartnerType, partnerIds: String, startIndex: Integer = 0, pageSize: Integer = 25, bookmark: String)(implicit assetsSummaryQuery: QueryParam[Boolean], partnerTypeQuery: QueryParam[PartnerType], partnerIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[GetBusinessPartners200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessPartners200Response] = jsonOf[GetBusinessPartners200Response]

    val path = "/businesses/{business_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("partnerIds", Some(partner_idsQuery.toParamString(partner_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessPartners200Response](req)

    } yield resp
  }

  def updateBusinessMemberships(host: String, businessId: String, updateMemberBusinessRoleBody: List[UpdateMemberBusinessRoleBody]): Task[UpdateMemberResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateMemberResultsResponseArray] = jsonOf[UpdateMemberResultsResponseArray]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateMemberBusinessRoleBody)
      resp          <- client.expect[UpdateMemberResultsResponseArray](req)

    } yield resp
  }

}

class HttpServiceBusinessAccessRelationshipsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteBusinessMembership(businessId: String, membersToDeleteBody: MembersToDeleteBody): Task[DeletedMembersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletedMembersResponse] = jsonOf[DeletedMembersResponse]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(membersToDeleteBody)
      resp          <- client.expect[DeletedMembersResponse](req)

    } yield resp
  }

  def deleteBusinessPartners(businessId: String, deletePartnersRequest: DeletePartnersRequest): Task[DeletePartnersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePartnersResponse] = jsonOf[DeletePartnersResponse]

    val path = "/businesses/{business_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePartnersRequest)
      resp          <- client.expect[DeletePartnersResponse](req)

    } yield resp
  }

  def getBusinessEmployers(pageSize: Integer = 25, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/employers"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def getBusinessMembers(businessId: String, assetsSummary: Boolean = false, businessRoles: List[MemberBusinessRole] = List.empty[MemberBusinessRole] , memberIds: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit assetsSummaryQuery: QueryParam[Boolean], businessRolesQuery: QueryParam[List[MemberBusinessRole]], memberIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessMembers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessMembers200Response] = jsonOf[GetBusinessMembers200Response]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("businessRoles", Some(business_rolesQuery.toParamString(business_roles))), ("memberIds", Some(member_idsQuery.toParamString(member_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessMembers200Response](req)

    } yield resp
  }

  def getBusinessPartners(businessId: String, assetsSummary: Boolean = false, partnerType: PartnerType, partnerIds: String, startIndex: Integer = 0, pageSize: Integer = 25, bookmark: String)(implicit assetsSummaryQuery: QueryParam[Boolean], partnerTypeQuery: QueryParam[PartnerType], partnerIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[GetBusinessPartners200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessPartners200Response] = jsonOf[GetBusinessPartners200Response]

    val path = "/businesses/{business_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("partnerIds", Some(partner_idsQuery.toParamString(partner_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessPartners200Response](req)

    } yield resp
  }

  def updateBusinessMemberships(businessId: String, updateMemberBusinessRoleBody: List[UpdateMemberBusinessRoleBody]): Task[UpdateMemberResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateMemberResultsResponseArray] = jsonOf[UpdateMemberResultsResponseArray]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateMemberBusinessRoleBody)
      resp          <- client.expect[UpdateMemberResultsResponseArray](req)

    } yield resp
  }

}
