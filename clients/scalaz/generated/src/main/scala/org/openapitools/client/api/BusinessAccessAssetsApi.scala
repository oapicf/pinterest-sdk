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

import org.openapitools.client.api.BusinessAssetMembersGet200Response
import org.openapitools.client.api.BusinessAssetPartnersGet200Response
import org.openapitools.client.api.BusinessAssetsGet200Response
import org.openapitools.client.api.BusinessMemberAssetsGet200Response
import org.openapitools.client.api.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.client.api.BusinessPartnerAssetAccessGet200Response
import org.openapitools.client.api.CreateAssetGroupBody
import org.openapitools.client.api.CreateAssetGroupResponse
import org.openapitools.client.api.DeleteAssetGroupBody
import org.openapitools.client.api.DeleteAssetGroupResponse
import org.openapitools.client.api.DeleteMemberAccessResultsResponseArray
import org.openapitools.client.api.DeletePartnerAssetAccessBody
import org.openapitools.client.api.DeletePartnerAssetsResultsResponseArray
import org.openapitools.client.api.Error
import org.openapitools.client.api.PartnerType
import org.openapitools.client.api.PermissionsWithOwner
import org.openapitools.client.api.UpdateAssetGroupBody
import org.openapitools.client.api.UpdateAssetGroupResponse
import org.openapitools.client.api.UpdateMemberAssetAccessBody
import org.openapitools.client.api.UpdateMemberAssetsResultsResponseArray
import org.openapitools.client.api.UpdatePartnerAssetAccessBody
import org.openapitools.client.api.UpdatePartnerAssetsResultsResponseArray

object BusinessAccessAssetsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def assetGroupCreate(host: String, businessId: String, createAssetGroupBody: CreateAssetGroupBody): Task[CreateAssetGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateAssetGroupResponse] = jsonOf[CreateAssetGroupResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssetGroupBody)
      resp          <- client.expect[CreateAssetGroupResponse](req)

    } yield resp
  }

  def assetGroupDelete(host: String, businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody): Task[DeleteAssetGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteAssetGroupResponse] = jsonOf[DeleteAssetGroupResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteAssetGroupBody)
      resp          <- client.expect[DeleteAssetGroupResponse](req)

    } yield resp
  }

  def assetGroupUpdate(host: String, businessId: String, updateAssetGroupBody: UpdateAssetGroupBody): Task[UpdateAssetGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateAssetGroupResponse] = jsonOf[UpdateAssetGroupResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateAssetGroupBody)
      resp          <- client.expect[UpdateAssetGroupResponse](req)

    } yield resp
  }

  def businessAssetMembersGet(host: String, businessId: String, assetId: String, bookmark: String, pageSize: Integer = 25, startIndex: Integer = 0)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], startIndexQuery: QueryParam[Integer]): Task[BusinessAssetMembersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetMembersGet200Response] = jsonOf[BusinessAssetMembersGet200Response]

    val path = "/businesses/{business_id}/assets/{asset_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("startIndex", Some(start_indexQuery.toParamString(start_index))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetMembersGet200Response](req)

    } yield resp
  }

  def businessAssetPartnersGet(host: String, businessId: String, assetId: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetPartnersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetPartnersGet200Response] = jsonOf[BusinessAssetPartnersGet200Response]

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
      resp          <- client.expect[BusinessAssetPartnersGet200Response](req)

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

  def businessMemberAssetsGet(host: String, businessId: String, memberId: String, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessMemberAssetsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessMemberAssetsGet200Response] = jsonOf[BusinessMemberAssetsGet200Response]

    val path = "/businesses/{business_id}/members/{member_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "member_id" + "\\}",escape(memberId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessMemberAssetsGet200Response](req)

    } yield resp
  }

  def businessMembersAssetAccessDelete(host: String, businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest): Task[DeleteMemberAccessResultsResponseArray] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessMembersAssetAccessDeleteRequest)
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

  def businessPartnerAssetAccessGet(host: String, businessId: String, partnerId: String, partnerType: PartnerType, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, pageSize: Integer = 25, bookmark: String)(implicit partnerTypeQuery: QueryParam[PartnerType], assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[BusinessPartnerAssetAccessGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessPartnerAssetAccessGet200Response] = jsonOf[BusinessPartnerAssetAccessGet200Response]

    val path = "/businesses/{business_id}/partners/{partner_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "partner_id" + "\\}",escape(partnerId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessPartnerAssetAccessGet200Response](req)

    } yield resp
  }

  def deletePartnerAssetAccessHandlerImpl(host: String, businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): Task[DeletePartnerAssetsResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePartnerAssetsResultsResponseArray] = jsonOf[DeletePartnerAssetsResultsResponseArray]

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
      resp          <- client.expect[DeletePartnerAssetsResultsResponseArray](req)

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

  def assetGroupCreate(businessId: String, createAssetGroupBody: CreateAssetGroupBody): Task[CreateAssetGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateAssetGroupResponse] = jsonOf[CreateAssetGroupResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssetGroupBody)
      resp          <- client.expect[CreateAssetGroupResponse](req)

    } yield resp
  }

  def assetGroupDelete(businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody): Task[DeleteAssetGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteAssetGroupResponse] = jsonOf[DeleteAssetGroupResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteAssetGroupBody)
      resp          <- client.expect[DeleteAssetGroupResponse](req)

    } yield resp
  }

  def assetGroupUpdate(businessId: String, updateAssetGroupBody: UpdateAssetGroupBody): Task[UpdateAssetGroupResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateAssetGroupResponse] = jsonOf[UpdateAssetGroupResponse]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateAssetGroupBody)
      resp          <- client.expect[UpdateAssetGroupResponse](req)

    } yield resp
  }

  def businessAssetMembersGet(businessId: String, assetId: String, bookmark: String, pageSize: Integer = 25, startIndex: Integer = 0)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], startIndexQuery: QueryParam[Integer]): Task[BusinessAssetMembersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetMembersGet200Response] = jsonOf[BusinessAssetMembersGet200Response]

    val path = "/businesses/{business_id}/assets/{asset_id}/members".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("startIndex", Some(start_indexQuery.toParamString(start_index))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessAssetMembersGet200Response](req)

    } yield resp
  }

  def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessAssetPartnersGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessAssetPartnersGet200Response] = jsonOf[BusinessAssetPartnersGet200Response]

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
      resp          <- client.expect[BusinessAssetPartnersGet200Response](req)

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

  def businessMemberAssetsGet(businessId: String, memberId: String, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, bookmark: String, pageSize: Integer = 25)(implicit assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BusinessMemberAssetsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessMemberAssetsGet200Response] = jsonOf[BusinessMemberAssetsGet200Response]

    val path = "/businesses/{business_id}/members/{member_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "member_id" + "\\}",escape(memberId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessMemberAssetsGet200Response](req)

    } yield resp
  }

  def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest): Task[DeleteMemberAccessResultsResponseArray] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(businessMembersAssetAccessDeleteRequest)
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

  def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: PartnerType, assetType: String = AD_ACCOUNT, startIndex: Integer = 0, pageSize: Integer = 25, bookmark: String)(implicit partnerTypeQuery: QueryParam[PartnerType], assetTypeQuery: QueryParam[String], startIndexQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[BusinessPartnerAssetAccessGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BusinessPartnerAssetAccessGet200Response] = jsonOf[BusinessPartnerAssetAccessGet200Response]

    val path = "/businesses/{business_id}/partners/{partner_id}/assets".replaceAll("\\{" + "business_id" + "\\}",escape(businessId.toString)).replaceAll("\\{" + "partner_id" + "\\}",escape(partnerId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("partnerType", Some(partner_typeQuery.toParamString(partner_type))), ("assetType", Some(asset_typeQuery.toParamString(asset_type))), ("startIndex", Some(start_indexQuery.toParamString(start_index))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BusinessPartnerAssetAccessGet200Response](req)

    } yield resp
  }

  def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): Task[DeletePartnerAssetsResultsResponseArray] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePartnerAssetsResultsResponseArray] = jsonOf[DeletePartnerAssetsResultsResponseArray]

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
      resp          <- client.expect[DeletePartnerAssetsResultsResponseArray](req)

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
