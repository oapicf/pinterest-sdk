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

import org.openapitools.client.api.AssetGroupDeletion
import org.openapitools.client.api.AssetGroupDeletionDelete
import org.openapitools.client.api.AssetGroupInput
import org.openapitools.client.api.AssetGroupInputCreate
import org.openapitools.client.api.AssetGroupModification
import org.openapitools.client.api.AssetGroupModificationReadOrUpdate
import org.openapitools.client.api.AssetPermissionType
import org.openapitools.client.api.AssetSearchBy
import org.openapitools.client.api.AssetSortBy
import org.openapitools.client.api.BusinessAssetMembersGet200Response
import org.openapitools.client.api.BusinessAssetsGet200Response
import org.openapitools.client.api.BusinessMemberAssetsGetResponse
import org.openapitools.client.api.BusinessMembersAssetAccessDeleteBody
import org.openapitools.client.api.BusinessPartnerAssetAccessGet200Response
import org.openapitools.client.api.DeleteMemberAccessResultsResponseArray
import org.openapitools.client.api.DeletePartnerAssetAccessBody
import org.openapitools.client.api.DeletePartnerAssetAccessResultsResponseArray
import org.openapitools.client.api.Error
import org.openapitools.client.api.NonDraftEntityStatus
import org.openapitools.client.api.PermissionsWithOwner
import org.openapitools.client.api.UpdateMemberAssetAccessBody
import org.openapitools.client.api.UpdateMemberAssetsResultsResponseArray
import org.openapitools.client.api.UpdatePartnerAssetAccessBody
import org.openapitools.client.api.UpdatePartnerAssetsResultsResponseArray

object BusinessAccessAssetsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def assetGroupCreate(host: String, businessId: String, assetGroupInputCreate: AssetGroupInputCreate): Task[AssetGroupInput] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetGroupInput] = jsonOf[AssetGroupInput]

    val path = "/businesses/{business_id}/asset_groups".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(assetGroupInputCreate)
      resp          <- client.expect[AssetGroupInput](req)

    } yield resp
  }

  def assetGroupDelete(host: String, businessId: String, assetGroupDeletionDelete: AssetGroupDeletionDelete): Task[AssetGroupDeletion] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetGroupDeletion] = jsonOf[AssetGroupDeletion]

    val path = "/businesses/{business_id}/asset_groups".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(assetGroupDeletionDelete)
      resp          <- client.expect[AssetGroupDeletion](req)

    } yield resp
  }

  def assetGroupUpdate(host: String, businessId: String, assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate): Task[AssetGroupModification] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetGroupModification] = jsonOf[AssetGroupModification]

    val path = "/businesses/{business_id}/asset_groups".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(assetGroupModificationReadOrUpdate)
      resp          <- client.expect[AssetGroupModification](req)

    } yield resp
  }

  def businessAssetMembersGet(host: String, businessId: String, assetId: String, startIndex: Integer = 0, fetchSystemUsers: Boolean = false, bookmark: String, pageSize: Integer = 25)(implicit startIndexQuery: QueryParam[Integer], fetchSystemUsersQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetMembersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetMembersGet200Response] = jsonOf[BusinessAssetMembersGet200Response]

    val path = "/businesses/{business_id}/assets/{asset_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("fetchSystemUsers", Some(fetch_system_usersQuery.toParamString(fetch_system_users))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetMembersGet200Response](req)

    } yield resp
  }

  def businessAssetPartnersGet(host: String, businessId: String, assetId: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetMembersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetMembersGet200Response] = jsonOf[BusinessAssetMembersGet200Response]

    val path = "/businesses/{business_id}/assets/{asset_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetMembersGet200Response](req)

    } yield resp
  }

  def businessAssetsGet(host: String, businessId: String, permissions: List[PermissionsWithOwner] = List.empty[PermissionsWithOwner] , childAssetId: String, assetGroupId: String, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit permissionsQuery: QueryParam[List[PermissionsWithOwner]], childAssetIdQuery: QueryParam[String], assetGroupIdQuery: QueryParam[String], assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetsGet200Response] = jsonOf[BusinessAssetsGet200Response]

    val path = "/businesses/{business_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("permissions", Some(permissionsQuery.toParamString(permissions))), ("childAssetId", Some(child_asset_idQuery.toParamString(child_asset_id))), ("assetGroupId", Some(asset_group_idQuery.toParamString(asset_group_id))), ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetsGet200Response](req)

    } yield resp
  }

  def businessMemberAssetsGet(host: String, businessId: String, memberId: String, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, sortBy: AssetSortBy, sortAscending: Boolean = true, searchBy: AssetSearchBy, searchValue: String, assetPermissionType: AssetPermissionType, adAccountStatuses: List[NonDraftEntityStatus] = List.empty[NonDraftEntityStatus] , bookmark: String, pageSize: Integer = 25)(implicit assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], sortByQuery: QueryParam[AssetSortBy], sortAscendingQuery: QueryParam[Boolean], searchByQuery: QueryParam[AssetSearchBy], searchValueQuery: QueryParam[String], assetPermissionTypeQuery: QueryParam[AssetPermissionType], adAccountStatusesQuery: QueryParam[List[NonDraftEntityStatus]], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessMemberAssetsGetResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessMemberAssetsGetResponse] = jsonOf[BusinessMemberAssetsGetResponse]

    val path = "/businesses/{business_id}/members/{member_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "member_id" + "\\}",escape(memberId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))), ("searchBy", Some(search_byQuery.toParamString(search_by))), ("searchValue", Some(search_valueQuery.toParamString(search_value))), ("assetPermissionType", Some(asset_permission_typeQuery.toParamString(asset_permission_type))), ("adAccountStatuses", Some(ad_account_statusesQuery.toParamString(ad_account_statuses))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessMemberAssetsGetResponse](req)

    } yield resp
  }

  def businessMembersAssetAccessDelete(host: String, businessId: String, businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody): Task[DeleteMemberAccessResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteMemberAccessResultsResponseArray] = jsonOf[DeleteMemberAccessResultsResponseArray]

    val path = "/businesses/{business_id}/members/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessMembersAssetAccessDeleteBody)
      resp          <- client.expect[DeleteMemberAccessResultsResponseArray](req)

    } yield resp
  }

  def businessMembersAssetAccessUpdate(host: String, businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): Task[UpdateMemberAssetsResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateMemberAssetsResultsResponseArray] = jsonOf[UpdateMemberAssetsResultsResponseArray]

    val path = "/businesses/{business_id}/members/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateMemberAssetAccessBody)
      resp          <- client.expect[UpdateMemberAssetsResultsResponseArray](req)

    } yield resp
  }

  def businessPartnerAssetAccessGet(host: String, businessId: String, partnerId: String, partnerType: String = INTERNAL, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, sortBy: AssetSortBy, sortAscending: Boolean = true, searchBy: AssetSearchBy, searchValue: String, bookmark: String, pageSize: Integer = 25)(implicit partnerTypeQuery: QueryParam[String], assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], sortByQuery: QueryParam[AssetSortBy], sortAscendingQuery: QueryParam[Boolean], searchByQuery: QueryParam[AssetSearchBy], searchValueQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessPartnerAssetAccessGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessPartnerAssetAccessGet200Response] = jsonOf[BusinessPartnerAssetAccessGet200Response]

    val path = "/businesses/{business_id}/partners/{partner_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "partner_id" + "\\}",escape(partnerId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))), ("searchBy", Some(search_byQuery.toParamString(search_by))), ("searchValue", Some(search_valueQuery.toParamString(search_value))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessPartnerAssetAccessGet200Response](req)

    } yield resp
  }

  def deletePartnerAssetAccessHandlerImpl(host: String, businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): Task[DeletePartnerAssetAccessResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePartnerAssetAccessResultsResponseArray] = jsonOf[DeletePartnerAssetAccessResultsResponseArray]

    val path = "/businesses/{business_id}/partners/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePartnerAssetAccessBody)
      resp          <- client.expect[DeletePartnerAssetAccessResultsResponseArray](req)

    } yield resp
  }

  def updatePartnerAssetAccessHandlerImpl(host: String, businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): Task[UpdatePartnerAssetsResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdatePartnerAssetsResultsResponseArray] = jsonOf[UpdatePartnerAssetsResultsResponseArray]

    val path = "/businesses/{business_id}/partners/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePartnerAssetAccessBody)
      resp          <- client.expect[UpdatePartnerAssetsResultsResponseArray](req)

    } yield resp
  }

}

class HttpServiceBusinessAccessAssetsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def assetGroupCreate(businessId: String, assetGroupInputCreate: AssetGroupInputCreate): Task[AssetGroupInput] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetGroupInput] = jsonOf[AssetGroupInput]

    val path = "/businesses/{business_id}/asset_groups".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(assetGroupInputCreate)
      resp          <- client.expect[AssetGroupInput](req)

    } yield resp
  }

  def assetGroupDelete(businessId: String, assetGroupDeletionDelete: AssetGroupDeletionDelete): Task[AssetGroupDeletion] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetGroupDeletion] = jsonOf[AssetGroupDeletion]

    val path = "/businesses/{business_id}/asset_groups".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(assetGroupDeletionDelete)
      resp          <- client.expect[AssetGroupDeletion](req)

    } yield resp
  }

  def assetGroupUpdate(businessId: String, assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate): Task[AssetGroupModification] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetGroupModification] = jsonOf[AssetGroupModification]

    val path = "/businesses/{business_id}/asset_groups".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(assetGroupModificationReadOrUpdate)
      resp          <- client.expect[AssetGroupModification](req)

    } yield resp
  }

  def businessAssetMembersGet(businessId: String, assetId: String, startIndex: Integer = 0, fetchSystemUsers: Boolean = false, bookmark: String, pageSize: Integer = 25)(implicit startIndexQuery: QueryParam[Integer], fetchSystemUsersQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetMembersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetMembersGet200Response] = jsonOf[BusinessAssetMembersGet200Response]

    val path = "/businesses/{business_id}/assets/{asset_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("fetchSystemUsers", Some(fetch_system_usersQuery.toParamString(fetch_system_users))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetMembersGet200Response](req)

    } yield resp
  }

  def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetMembersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetMembersGet200Response] = jsonOf[BusinessAssetMembersGet200Response]

    val path = "/businesses/{business_id}/assets/{asset_id}/partners".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetMembersGet200Response](req)

    } yield resp
  }

  def businessAssetsGet(businessId: String, permissions: List[PermissionsWithOwner] = List.empty[PermissionsWithOwner] , childAssetId: String, assetGroupId: String, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit permissionsQuery: QueryParam[List[PermissionsWithOwner]], childAssetIdQuery: QueryParam[String], assetGroupIdQuery: QueryParam[String], assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetsGet200Response] = jsonOf[BusinessAssetsGet200Response]

    val path = "/businesses/{business_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("permissions", Some(permissionsQuery.toParamString(permissions))), ("childAssetId", Some(child_asset_idQuery.toParamString(child_asset_id))), ("assetGroupId", Some(asset_group_idQuery.toParamString(asset_group_id))), ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetsGet200Response](req)

    } yield resp
  }

  def businessMemberAssetsGet(businessId: String, memberId: String, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, sortBy: AssetSortBy, sortAscending: Boolean = true, searchBy: AssetSearchBy, searchValue: String, assetPermissionType: AssetPermissionType, adAccountStatuses: List[NonDraftEntityStatus] = List.empty[NonDraftEntityStatus] , bookmark: String, pageSize: Integer = 25)(implicit assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], sortByQuery: QueryParam[AssetSortBy], sortAscendingQuery: QueryParam[Boolean], searchByQuery: QueryParam[AssetSearchBy], searchValueQuery: QueryParam[String], assetPermissionTypeQuery: QueryParam[AssetPermissionType], adAccountStatusesQuery: QueryParam[List[NonDraftEntityStatus]], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessMemberAssetsGetResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessMemberAssetsGetResponse] = jsonOf[BusinessMemberAssetsGetResponse]

    val path = "/businesses/{business_id}/members/{member_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "member_id" + "\\}",escape(memberId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))), ("searchBy", Some(search_byQuery.toParamString(search_by))), ("searchValue", Some(search_valueQuery.toParamString(search_value))), ("assetPermissionType", Some(asset_permission_typeQuery.toParamString(asset_permission_type))), ("adAccountStatuses", Some(ad_account_statusesQuery.toParamString(ad_account_statuses))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessMemberAssetsGetResponse](req)

    } yield resp
  }

  def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody): Task[DeleteMemberAccessResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteMemberAccessResultsResponseArray] = jsonOf[DeleteMemberAccessResultsResponseArray]

    val path = "/businesses/{business_id}/members/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessMembersAssetAccessDeleteBody)
      resp          <- client.expect[DeleteMemberAccessResultsResponseArray](req)

    } yield resp
  }

  def businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): Task[UpdateMemberAssetsResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateMemberAssetsResultsResponseArray] = jsonOf[UpdateMemberAssetsResultsResponseArray]

    val path = "/businesses/{business_id}/members/assets/access".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateMemberAssetAccessBody)
      resp          <- client.expect[UpdateMemberAssetsResultsResponseArray](req)

    } yield resp
  }

  def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: String = INTERNAL, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, sortBy: AssetSortBy, sortAscending: Boolean = true, searchBy: AssetSearchBy, searchValue: String, bookmark: String, pageSize: Integer = 25)(implicit partnerTypeQuery: QueryParam[String], assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], sortByQuery: QueryParam[AssetSortBy], sortAscendingQuery: QueryParam[Boolean], searchByQuery: QueryParam[AssetSearchBy], searchValueQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessPartnerAssetAccessGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessPartnerAssetAccessGet200Response] = jsonOf[BusinessPartnerAssetAccessGet200Response]

    val path = "/businesses/{business_id}/partners/{partner_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "partner_id" + "\\}",escape(partnerId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("sortAscending", Some(sort_ascendingQuery.toParamString(sort_ascending))), ("searchBy", Some(search_byQuery.toParamString(search_by))), ("searchValue", Some(search_valueQuery.toParamString(search_value))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessPartnerAssetAccessGet200Response](req)

    } yield resp
  }

  def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): Task[DeletePartnerAssetAccessResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePartnerAssetAccessResultsResponseArray] = jsonOf[DeletePartnerAssetAccessResultsResponseArray]

    val path = "/businesses/{business_id}/partners/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePartnerAssetAccessBody)
      resp          <- client.expect[DeletePartnerAssetAccessResultsResponseArray](req)

    } yield resp
  }

  def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): Task[UpdatePartnerAssetsResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdatePartnerAssetsResultsResponseArray] = jsonOf[UpdatePartnerAssetsResultsResponseArray]

    val path = "/businesses/{business_id}/partners/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePartnerAssetAccessBody)
      resp          <- client.expect[UpdatePartnerAssetsResultsResponseArray](req)

    } yield resp
  }

}
