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

import org.openapitools.client.api.CatalogsFeed
import org.openapitools.client.api.CatalogsFeedsCreateRequest
import org.openapitools.client.api.CatalogsFeedsUpdateRequest
import org.openapitools.client.api.CatalogsItems
import org.openapitools.client.api.CatalogsItemsBatch
import org.openapitools.client.api.CatalogsItemsBatchRequest
import org.openapitools.client.api.CatalogsProductGroup
import org.openapitools.client.api.CatalogsProductGroupCreateRequest
import org.openapitools.client.api.CatalogsProductGroupUpdateRequest
import org.openapitools.client.api.Error
import org.openapitools.client.api.Paginated

object CatalogsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsProductGroupsCreate(host: String, catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest): Task[Any] = {
    implicit val returnTypeDecoder: EntityDecoder[Any] = jsonOf[Any]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsProductGroupCreateRequest)
      resp          <- client.expect[Any](req)

    } yield resp
  }

  def catalogsProductGroupsDelete(host: String, productGroupId: String): Task[Unit] = {
    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def catalogsProductGroupsList(host: String, feedId: String, bookmark: String, pageSize: Integer = 25)(implicit feedIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedId", Some(feed_idQuery.toParamString(feed_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def catalogsProductGroupsUpdate(host: String, productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest): Task[CatalogsProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroup] = jsonOf[CatalogsProductGroup]

    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsProductGroupUpdateRequest)
      resp          <- client.expect[CatalogsProductGroup](req)

    } yield resp
  }

  def feedProcessingResultsList(host: String, feedId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/catalogs/feeds/{feed_id}/processing_results".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def feedsCreate(host: String, catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsFeedsCreateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsDelete(host: String, feedId: String): Task[Unit] = {
    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def feedsGet(host: String, feedId: String): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

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
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsList(host: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/catalogs/feeds"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def feedsUpdate(host: String, feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsFeedsUpdateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def itemsBatchGet(host: String, batchId: String): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch/{batch_id}".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsBatchPost(host: String, catalogsItemsBatchRequest: CatalogsItemsBatchRequest): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsItemsBatchRequest)
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsGet(host: String, country: String, itemIds: List[String] = List.empty[String] , language: String)(implicit countryQuery: QueryParam[String], itemIdsQuery: QueryParam[List[String]], languageQuery: QueryParam[String]): Task[CatalogsItems] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItems] = jsonOf[CatalogsItems]

    val path = "/catalogs/items"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("country", Some(countryQuery.toParamString(country))), ("itemIds", Some(item_idsQuery.toParamString(item_ids))), ("language", Some(languageQuery.toParamString(language))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsItems](req)

    } yield resp
  }

}

class HttpServiceCatalogsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest): Task[Any] = {
    implicit val returnTypeDecoder: EntityDecoder[Any] = jsonOf[Any]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsProductGroupCreateRequest)
      resp          <- client.expect[Any](req)

    } yield resp
  }

  def catalogsProductGroupsDelete(productGroupId: String): Task[Unit] = {
    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def catalogsProductGroupsList(feedId: String, bookmark: String, pageSize: Integer = 25)(implicit feedIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedId", Some(feed_idQuery.toParamString(feed_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest): Task[CatalogsProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroup] = jsonOf[CatalogsProductGroup]

    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsProductGroupUpdateRequest)
      resp          <- client.expect[CatalogsProductGroup](req)

    } yield resp
  }

  def feedProcessingResultsList(feedId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/catalogs/feeds/{feed_id}/processing_results".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def feedsCreate(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsFeedsCreateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsDelete(feedId: String): Task[Unit] = {
    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def feedsGet(feedId: String): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

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
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsList(bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[Paginated] = {
    implicit val returnTypeDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]

    val path = "/catalogs/feeds"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Paginated](req)

    } yield resp
  }

  def feedsUpdate(feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsFeedsUpdateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def itemsBatchGet(batchId: String): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch/{batch_id}".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsBatchPost(catalogsItemsBatchRequest: CatalogsItemsBatchRequest): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsItemsBatchRequest)
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsGet(country: String, itemIds: List[String] = List.empty[String] , language: String)(implicit countryQuery: QueryParam[String], itemIdsQuery: QueryParam[List[String]], languageQuery: QueryParam[String]): Task[CatalogsItems] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItems] = jsonOf[CatalogsItems]

    val path = "/catalogs/items"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("country", Some(countryQuery.toParamString(country))), ("itemIds", Some(item_idsQuery.toParamString(item_ids))), ("language", Some(languageQuery.toParamString(language))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsItems](req)

    } yield resp
  }

}
