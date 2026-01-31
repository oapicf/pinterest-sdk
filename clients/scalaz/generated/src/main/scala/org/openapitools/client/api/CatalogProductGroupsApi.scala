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

import org.openapitools.client.api.CatalogsListProductsByFilterRequest
import org.openapitools.client.api.CatalogsProductGroupPinsList200Response
import org.openapitools.client.api.CatalogsProductGroupProductCountsVertical
import org.openapitools.client.api.CatalogsProductGroupsList200Response
import org.openapitools.client.api.CatalogsProductGroupsUpdateRequest
import org.openapitools.client.api.CatalogsVerticalProductGroup
import org.openapitools.client.api.Error
import org.openapitools.client.api.MultipleProductGroupsInner

object CatalogProductGroupsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsProductGroupPinsList(host: String, productGroupId: String, bookmark: String, pageSize: Integer = 25, adAccountId: String, pinMetrics: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String], pinMetricsQuery: QueryParam[Boolean]): Task[CatalogsProductGroupPinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupPinsList200Response] = jsonOf[CatalogsProductGroupPinsList200Response]

    val path = "/catalogs/product_groups/{product_group_id}/products".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsProductGroupPinsList200Response](req)

    } yield resp
  }

  def catalogsProductGroupsCreate(host: String, multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsVerticalProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsVerticalProductGroup] = jsonOf[CatalogsVerticalProductGroup]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(multipleProductGroupsInner)
      resp          <- client.expect[CatalogsVerticalProductGroup](req)

    } yield resp
  }

  def catalogsProductGroupsCreateMany(host: String, multipleProductGroupsInner: List[MultipleProductGroupsInner], adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[List[String]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[String]] = jsonOf[List[String]]

    val path = "/catalogs/product_groups/multiple"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(multipleProductGroupsInner)
      resp          <- client.expect[List[String]](req)

    } yield resp
  }

  def catalogsProductGroupsDelete(host: String, productGroupId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def catalogsProductGroupsDeleteMany(host: String, id: List[Integer] = List.empty[Integer] , adAccountId: String)(implicit idQuery: QueryParam[List[Integer]], adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/catalogs/product_groups/multiple"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("id", Some(idQuery.toParamString(id))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def catalogsProductGroupsGet(host: String, productGroupId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsVerticalProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsVerticalProductGroup] = jsonOf[CatalogsVerticalProductGroup]

    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

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
      resp          <- client.expect[CatalogsVerticalProductGroup](req)

    } yield resp
  }

  def catalogsProductGroupsList(host: String, id: List[Integer] = List.empty[Integer] , feedId: String, catalogId: String, bookmark: String, pageSize: Integer = 25, adAccountId: String)(implicit idQuery: QueryParam[List[Integer]], feedIdQuery: QueryParam[String], catalogIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[CatalogsProductGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupsList200Response] = jsonOf[CatalogsProductGroupsList200Response]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("id", Some(idQuery.toParamString(id))), ("feedId", Some(feed_idQuery.toParamString(feed_id))), ("catalogId", Some(catalog_idQuery.toParamString(catalog_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsProductGroupsList200Response](req)

    } yield resp
  }

  def catalogsProductGroupsProductCountsGet(host: String, productGroupId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsProductGroupProductCountsVertical] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupProductCountsVertical] = jsonOf[CatalogsProductGroupProductCountsVertical]

    val path = "/catalogs/product_groups/{product_group_id}/product_counts".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

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
      resp          <- client.expect[CatalogsProductGroupProductCountsVertical](req)

    } yield resp
  }

  def catalogsProductGroupsUpdate(host: String, productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsVerticalProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsVerticalProductGroup] = jsonOf[CatalogsVerticalProductGroup]

    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsProductGroupsUpdateRequest)
      resp          <- client.expect[CatalogsVerticalProductGroup](req)

    } yield resp
  }

  def productsByProductGroupFilterList(host: String, catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: String, pageSize: Integer = 25, adAccountId: String, pinMetrics: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String], pinMetricsQuery: QueryParam[Boolean]): Task[CatalogsProductGroupPinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupPinsList200Response] = jsonOf[CatalogsProductGroupPinsList200Response]

    val path = "/catalogs/products/get_by_product_group_filters"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsListProductsByFilterRequest)
      resp          <- client.expect[CatalogsProductGroupPinsList200Response](req)

    } yield resp
  }

}

class HttpServiceCatalogProductGroupsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsProductGroupPinsList(productGroupId: String, bookmark: String, pageSize: Integer = 25, adAccountId: String, pinMetrics: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String], pinMetricsQuery: QueryParam[Boolean]): Task[CatalogsProductGroupPinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupPinsList200Response] = jsonOf[CatalogsProductGroupPinsList200Response]

    val path = "/catalogs/product_groups/{product_group_id}/products".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsProductGroupPinsList200Response](req)

    } yield resp
  }

  def catalogsProductGroupsCreate(multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsVerticalProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsVerticalProductGroup] = jsonOf[CatalogsVerticalProductGroup]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(multipleProductGroupsInner)
      resp          <- client.expect[CatalogsVerticalProductGroup](req)

    } yield resp
  }

  def catalogsProductGroupsCreateMany(multipleProductGroupsInner: List[MultipleProductGroupsInner], adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[List[String]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[String]] = jsonOf[List[String]]

    val path = "/catalogs/product_groups/multiple"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(multipleProductGroupsInner)
      resp          <- client.expect[List[String]](req)

    } yield resp
  }

  def catalogsProductGroupsDelete(productGroupId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def catalogsProductGroupsDeleteMany(id: List[Integer] = List.empty[Integer] , adAccountId: String)(implicit idQuery: QueryParam[List[Integer]], adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/catalogs/product_groups/multiple"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("id", Some(idQuery.toParamString(id))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def catalogsProductGroupsGet(productGroupId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsVerticalProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsVerticalProductGroup] = jsonOf[CatalogsVerticalProductGroup]

    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

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
      resp          <- client.expect[CatalogsVerticalProductGroup](req)

    } yield resp
  }

  def catalogsProductGroupsList(id: List[Integer] = List.empty[Integer] , feedId: String, catalogId: String, bookmark: String, pageSize: Integer = 25, adAccountId: String)(implicit idQuery: QueryParam[List[Integer]], feedIdQuery: QueryParam[String], catalogIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[CatalogsProductGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupsList200Response] = jsonOf[CatalogsProductGroupsList200Response]

    val path = "/catalogs/product_groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("id", Some(idQuery.toParamString(id))), ("feedId", Some(feed_idQuery.toParamString(feed_id))), ("catalogId", Some(catalog_idQuery.toParamString(catalog_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsProductGroupsList200Response](req)

    } yield resp
  }

  def catalogsProductGroupsProductCountsGet(productGroupId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsProductGroupProductCountsVertical] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupProductCountsVertical] = jsonOf[CatalogsProductGroupProductCountsVertical]

    val path = "/catalogs/product_groups/{product_group_id}/product_counts".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

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
      resp          <- client.expect[CatalogsProductGroupProductCountsVertical](req)

    } yield resp
  }

  def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsVerticalProductGroup] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsVerticalProductGroup] = jsonOf[CatalogsVerticalProductGroup]

    val path = "/catalogs/product_groups/{product_group_id}".replaceAll("\\{" + "product_group_id" + "\\}",escape(productGroupId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsProductGroupsUpdateRequest)
      resp          <- client.expect[CatalogsVerticalProductGroup](req)

    } yield resp
  }

  def productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: String, pageSize: Integer = 25, adAccountId: String, pinMetrics: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String], pinMetricsQuery: QueryParam[Boolean]): Task[CatalogsProductGroupPinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsProductGroupPinsList200Response] = jsonOf[CatalogsProductGroupPinsList200Response]

    val path = "/catalogs/products/get_by_product_group_filters"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsListProductsByFilterRequest)
      resp          <- client.expect[CatalogsProductGroupPinsList200Response](req)

    } yield resp
  }

}
