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

import org.openapitools.client.api.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.client.api.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.client.api.CatalogsLocalStoresList200Response
import org.openapitools.client.api.Error
import org.openapitools.client.api.LocalInventoryItemsBatch
import org.openapitools.client.api.LocalInventoryItemsBatchCreate
import org.openapitools.client.api.LocalInventoryItemsGet
import org.openapitools.client.api.LocalInventoryItemsGetCreate
import org.openapitools.client.api.LocalStore
import org.openapitools.client.api.LocalStoreBatchUpdate
import org.openapitools.client.api.LocalStoreCreate
import org.openapitools.client.api.SupplementalItemsBatchResponse

object CatalogSupplementalApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsLocalInventoryItemsBatchOperate(host: String, catalogId: String, localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[SupplementalItemsBatchResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SupplementalItemsBatchResponse] = jsonOf[SupplementalItemsBatchResponse]

    val path = "/catalogs/{catalog_id}/local_inventory_items/batch".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localInventoryItemsBatchCreate)
      resp          <- client.expect[SupplementalItemsBatchResponse](req)

    } yield resp
  }

  def catalogsLocalInventoryItemsPost(host: String, catalogId: String, localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[LocalInventoryItemsGet] = {
    implicit val returnTypeDecoder: EntityDecoder[LocalInventoryItemsGet] = jsonOf[LocalInventoryItemsGet]

    val path = "/catalogs/{catalog_id}/local_inventory_items/query".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localInventoryItemsGetCreate)
      resp          <- client.expect[LocalInventoryItemsGet](req)

    } yield resp
  }

  def catalogsLocalStoresCreate(host: String, catalogId: String, localStoreCreate: List[LocalStoreCreate], adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[List[CatalogsLocalStoresCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CatalogsLocalStoresCreate200ResponseInner]] = jsonOf[List[CatalogsLocalStoresCreate200ResponseInner]]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localStoreCreate)
      resp          <- client.expect[List[CatalogsLocalStoresCreate200ResponseInner]](req)

    } yield resp
  }

  def catalogsLocalStoresDelete(host: String, catalogId: String, ids: List[String] = List.empty[String] , adAccountId: String)(implicit idsQuery: QueryParam[List[String]], adAccountIdQuery: QueryParam[String]): Task[List[CatalogsLocalStoresDelete200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CatalogsLocalStoresDelete200ResponseInner]] = jsonOf[List[CatalogsLocalStoresDelete200ResponseInner]]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ids", Some(idsQuery.toParamString(ids))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CatalogsLocalStoresDelete200ResponseInner]](req)

    } yield resp
  }

  def catalogsLocalStoresList(host: String, catalogId: String, ids: List[String] = List.empty[String] , adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit idsQuery: QueryParam[List[String]], adAccountIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[CatalogsLocalStoresList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsLocalStoresList200Response] = jsonOf[CatalogsLocalStoresList200Response]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ids", Some(idsQuery.toParamString(ids))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsLocalStoresList200Response](req)

    } yield resp
  }

  def catalogsLocalStoresUpdate(host: String, catalogId: String, localStoreBatchUpdate: List[LocalStoreBatchUpdate], adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[List[CatalogsLocalStoresCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CatalogsLocalStoresCreate200ResponseInner]] = jsonOf[List[CatalogsLocalStoresCreate200ResponseInner]]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localStoreBatchUpdate)
      resp          <- client.expect[List[CatalogsLocalStoresCreate200ResponseInner]](req)

    } yield resp
  }

  def catalogsSupplementalItemsBatchGet(host: String, catalogId: String, batchId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[SupplementalItemsBatchResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SupplementalItemsBatchResponse] = jsonOf[SupplementalItemsBatchResponse]

    val path = "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SupplementalItemsBatchResponse](req)

    } yield resp
  }

}

class HttpServiceCatalogSupplementalApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsLocalInventoryItemsBatchOperate(catalogId: String, localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[SupplementalItemsBatchResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SupplementalItemsBatchResponse] = jsonOf[SupplementalItemsBatchResponse]

    val path = "/catalogs/{catalog_id}/local_inventory_items/batch".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localInventoryItemsBatchCreate)
      resp          <- client.expect[SupplementalItemsBatchResponse](req)

    } yield resp
  }

  def catalogsLocalInventoryItemsPost(catalogId: String, localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[LocalInventoryItemsGet] = {
    implicit val returnTypeDecoder: EntityDecoder[LocalInventoryItemsGet] = jsonOf[LocalInventoryItemsGet]

    val path = "/catalogs/{catalog_id}/local_inventory_items/query".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localInventoryItemsGetCreate)
      resp          <- client.expect[LocalInventoryItemsGet](req)

    } yield resp
  }

  def catalogsLocalStoresCreate(catalogId: String, localStoreCreate: List[LocalStoreCreate], adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[List[CatalogsLocalStoresCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CatalogsLocalStoresCreate200ResponseInner]] = jsonOf[List[CatalogsLocalStoresCreate200ResponseInner]]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localStoreCreate)
      resp          <- client.expect[List[CatalogsLocalStoresCreate200ResponseInner]](req)

    } yield resp
  }

  def catalogsLocalStoresDelete(catalogId: String, ids: List[String] = List.empty[String] , adAccountId: String)(implicit idsQuery: QueryParam[List[String]], adAccountIdQuery: QueryParam[String]): Task[List[CatalogsLocalStoresDelete200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CatalogsLocalStoresDelete200ResponseInner]] = jsonOf[List[CatalogsLocalStoresDelete200ResponseInner]]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ids", Some(idsQuery.toParamString(ids))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[CatalogsLocalStoresDelete200ResponseInner]](req)

    } yield resp
  }

  def catalogsLocalStoresList(catalogId: String, ids: List[String] = List.empty[String] , adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit idsQuery: QueryParam[List[String]], adAccountIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[CatalogsLocalStoresList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsLocalStoresList200Response] = jsonOf[CatalogsLocalStoresList200Response]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ids", Some(idsQuery.toParamString(ids))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsLocalStoresList200Response](req)

    } yield resp
  }

  def catalogsLocalStoresUpdate(catalogId: String, localStoreBatchUpdate: List[LocalStoreBatchUpdate], adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[List[CatalogsLocalStoresCreate200ResponseInner]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CatalogsLocalStoresCreate200ResponseInner]] = jsonOf[List[CatalogsLocalStoresCreate200ResponseInner]]

    val path = "/catalogs/{catalog_id}/local_stores".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(localStoreBatchUpdate)
      resp          <- client.expect[List[CatalogsLocalStoresCreate200ResponseInner]](req)

    } yield resp
  }

  def catalogsSupplementalItemsBatchGet(catalogId: String, batchId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[SupplementalItemsBatchResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SupplementalItemsBatchResponse] = jsonOf[SupplementalItemsBatchResponse]

    val path = "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".replaceAll("\\{" + "catalog_id" + "\\}",escape(catalogId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SupplementalItemsBatchResponse](req)

    } yield resp
  }

}
