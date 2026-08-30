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

import org.openapitools.client.api.BrandAccount
import org.openapitools.client.api.BrandAccountCreate
import org.openapitools.client.api.BrandAccountUpdate
import org.openapitools.client.api.BusinessMembershipMember
import org.openapitools.client.api.DeleteBusinessMembership200Response
import org.openapitools.client.api.DeleteBusinessMembershipBody
import org.openapitools.client.api.DeleteBusinessPartners
import org.openapitools.client.api.DeleteBusinessPartnersDelete
import org.openapitools.client.api.Error
import org.openapitools.client.api.GetBusinessEmployers200Response
import org.openapitools.client.api.MemberBusinessRole
import org.openapitools.client.api.PartnerType
import org.openapitools.client.api.SystemUserUpdateWithRequiredBody
import org.openapitools.client.api.UpdateBusinessMembershipsResponse

object BusinessAccessRelationshipsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def brandAccountsCreate(host: String, businessHierarchyId: String, brandAccountCreate: BrandAccountCreate): Task[BrandAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[BrandAccount] = jsonOf[BrandAccount]

    val path = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".replaceAll("\\{" + "business_hierarchy_id" + "\\}",escape(businessHierarchyId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(brandAccountCreate)
      resp          <- client.expect[BrandAccount](req)

    } yield resp
  }

  def brandAccountsUpdate(host: String, brandAccountId: String, businessHierarchyId: String, brandAccountUpdate: BrandAccountUpdate): Task[BrandAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[BrandAccount] = jsonOf[BrandAccount]

    val path = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".replaceAll("\\{" + "brand_account_id" + "\\}",escape(brandAccountId.toString)).replaceAll("\\{" + "business_hierarchy_id" + "\\}",escape(businessHierarchyId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(brandAccountUpdate)
      resp          <- client.expect[BrandAccount](req)

    } yield resp
  }

  def deleteBusinessMembership(host: String, businessId: String, deleteBusinessMembershipBody: DeleteBusinessMembershipBody): Task[DeleteBusinessMembership200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteBusinessMembership200Response] = jsonOf[DeleteBusinessMembership200Response]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteBusinessMembershipBody)
      resp          <- client.expect[DeleteBusinessMembership200Response](req)

    } yield resp
  }

  def deleteBusinessPartners(host: String, businessId: String, deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete): Task[DeleteBusinessPartners] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteBusinessPartners] = jsonOf[DeleteBusinessPartners]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteBusinessPartnersDelete)
      resp          <- client.expect[DeleteBusinessPartners](req)

    } yield resp
  }

  def getBusinessEmployers(host: String, assetsSummary: Boolean = true, bookmark: String, pageSize: Integer = 25)(implicit assetsSummaryQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/employers"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def getBusinessMembers(host: String, businessId: String, fetchSystemUsers: Boolean = false, assetsSummary: Boolean = false, businessRoles: List[MemberBusinessRole] = List.empty[MemberBusinessRole] , memberIds: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit fetchSystemUsersQuery: QueryParam[Boolean], assetsSummaryQuery: QueryParam[Boolean], businessRolesQuery: QueryParam[List[MemberBusinessRole]], memberIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("fetchSystemUsers", Some(fetch_system_usersQuery.toParamString(fetch_system_users))), ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("businessRoles", Some(business_rolesQuery.toParamString(business_roles))), ("memberIds", Some(member_idsQuery.toParamString(member_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def getBusinessPartners(host: String, businessId: String, assetsSummary: Boolean = false, partnerType: PartnerType, partnerIds: String, startIndex: Integer = 0, sortAscending: Boolean, bookmark: String, pageSize: Integer = 25)(implicit assetsSummaryQuery: QueryParam[Boolean], partnerTypeQuery: QueryParam[PartnerType], partnerIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], sortAscendingQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/{business_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("partnerIds", Some(partner_idsQuery.toParamString(partner_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def systemUserUpdate(host: String, businessId: String, systemUserId: String, systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody): Task[Unit] = {
    val path = "/businesses/{business_id}/system_users/{system_user_id}".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "system_user_id" + "\\}",escape(systemUserId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(systemUserUpdateWithRequiredBody)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def updateBusinessMemberships(host: String, businessId: String, businessMembershipMember: List[BusinessMembershipMember]): Task[UpdateBusinessMembershipsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateBusinessMembershipsResponse] = jsonOf[UpdateBusinessMembershipsResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessMembershipMember)
      resp          <- client.expect[UpdateBusinessMembershipsResponse](req)

    } yield resp
  }

}

class HttpServiceBusinessAccessRelationshipsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def brandAccountsCreate(businessHierarchyId: String, brandAccountCreate: BrandAccountCreate): Task[BrandAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[BrandAccount] = jsonOf[BrandAccount]

    val path = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".replaceAll("\\{" + "business_hierarchy_id" + "\\}",escape(businessHierarchyId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(brandAccountCreate)
      resp          <- client.expect[BrandAccount](req)

    } yield resp
  }

  def brandAccountsUpdate(brandAccountId: String, businessHierarchyId: String, brandAccountUpdate: BrandAccountUpdate): Task[BrandAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[BrandAccount] = jsonOf[BrandAccount]

    val path = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".replaceAll("\\{" + "brand_account_id" + "\\}",escape(brandAccountId.toString)).replaceAll("\\{" + "business_hierarchy_id" + "\\}",escape(businessHierarchyId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(brandAccountUpdate)
      resp          <- client.expect[BrandAccount](req)

    } yield resp
  }

  def deleteBusinessMembership(businessId: String, deleteBusinessMembershipBody: DeleteBusinessMembershipBody): Task[DeleteBusinessMembership200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteBusinessMembership200Response] = jsonOf[DeleteBusinessMembership200Response]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteBusinessMembershipBody)
      resp          <- client.expect[DeleteBusinessMembership200Response](req)

    } yield resp
  }

  def deleteBusinessPartners(businessId: String, deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete): Task[DeleteBusinessPartners] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteBusinessPartners] = jsonOf[DeleteBusinessPartners]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteBusinessPartnersDelete)
      resp          <- client.expect[DeleteBusinessPartners](req)

    } yield resp
  }

  def getBusinessEmployers(assetsSummary: Boolean = true, bookmark: String, pageSize: Integer = 25)(implicit assetsSummaryQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/employers"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def getBusinessMembers(businessId: String, fetchSystemUsers: Boolean = false, assetsSummary: Boolean = false, businessRoles: List[MemberBusinessRole] = List.empty[MemberBusinessRole] , memberIds: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit fetchSystemUsersQuery: QueryParam[Boolean], assetsSummaryQuery: QueryParam[Boolean], businessRolesQuery: QueryParam[List[MemberBusinessRole]], memberIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/{business_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("fetchSystemUsers", Some(fetch_system_usersQuery.toParamString(fetch_system_users))), ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("businessRoles", Some(business_rolesQuery.toParamString(business_roles))), ("memberIds", Some(member_idsQuery.toParamString(member_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def getBusinessPartners(businessId: String, assetsSummary: Boolean = false, partnerType: PartnerType, partnerIds: String, startIndex: Integer = 0, sortAscending: Boolean, bookmark: String, pageSize: Integer = 25)(implicit assetsSummaryQuery: QueryParam[Boolean], partnerTypeQuery: QueryParam[PartnerType], partnerIdsQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], sortAscendingQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[GetBusinessEmployers200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]

    val path = "/businesses/{business_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetsSummary", Some(assets_summaryQuery.toParamString(assets_summary))), ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("partnerIds", Some(partner_idsQuery.toParamString(partner_ids))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessEmployers200Response](req)

    } yield resp
  }

  def systemUserUpdate(businessId: String, systemUserId: String, systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody): Task[Unit] = {
    val path = "/businesses/{business_id}/system_users/{system_user_id}".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "system_user_id" + "\\}",escape(systemUserId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(systemUserUpdateWithRequiredBody)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def updateBusinessMemberships(businessId: String, businessMembershipMember: List[BusinessMembershipMember]): Task[UpdateBusinessMembershipsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateBusinessMembershipsResponse] = jsonOf[UpdateBusinessMembershipsResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessMembershipMember)
      resp          <- client.expect[UpdateBusinessMembershipsResponse](req)

    } yield resp
  }

}
