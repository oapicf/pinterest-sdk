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
import org.openapitools.client.api.CatalogsFeedIngestion
import org.openapitools.client.api.CatalogsItemValidationIssue
import org.openapitools.client.api.Error
import org.openapitools.client.api.FeedProcessingResultsList200Response
import org.openapitools.client.api.FeedsCreateRequest
import org.openapitools.client.api.FeedsList200Response
import org.openapitools.client.api.FeedsUpdateRequest
import org.openapitools.client.api.ItemsIssuesList200Response

object CatalogFeedsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def feedProcessingResultsList(host: String, feedId: String, bookmark: String, pageSize: Integer = 25, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[FeedProcessingResultsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[FeedProcessingResultsList200Response] = jsonOf[FeedProcessingResultsList200Response]

    val path = "/catalogs/feeds/{feed_id}/processing_results".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FeedProcessingResultsList200Response](req)

    } yield resp
  }

  def feedsCreate(host: String, feedsCreateRequest: FeedsCreateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(feedsCreateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsDelete(host: String, feedId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

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

  def feedsGet(host: String, feedId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

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
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsIngest(host: String, feedId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeedIngestion] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeedIngestion] = jsonOf[CatalogsFeedIngestion]

    val path = "/catalogs/feeds/{feed_id}/ingest".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsFeedIngestion](req)

    } yield resp
  }

  def feedsList(host: String, bookmark: String, pageSize: Integer = 25, catalogId: String, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], catalogIdQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[FeedsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[FeedsList200Response] = jsonOf[FeedsList200Response]

    val path = "/catalogs/feeds"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("catalogId", Some(catalog_idQuery.toParamString(catalog_id))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FeedsList200Response](req)

    } yield resp
  }

  def feedsUpdate(host: String, feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(feedsUpdateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def itemsIssuesList(host: String, processingResultId: String, bookmark: String, pageSize: Integer = 25, itemNumbers: List[Integer] = List.empty[Integer] , itemValidationIssue: CatalogsItemValidationIssue, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], itemNumbersQuery: QueryParam[List[Integer]], itemValidationIssueQuery: QueryParam[CatalogsItemValidationIssue], adAccountIdQuery: QueryParam[String]): Task[ItemsIssuesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemsIssuesList200Response] = jsonOf[ItemsIssuesList200Response]

    val path = "/catalogs/processing_results/{processing_result_id}/item_issues".replaceAll("\\{" + "processing_result_id" + "\\}",escape(processingResultId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("itemNumbers", Some(item_numbersQuery.toParamString(item_numbers))), ("itemValidationIssue", Some(item_validation_issueQuery.toParamString(item_validation_issue))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ItemsIssuesList200Response](req)

    } yield resp
  }

}

class HttpServiceCatalogFeedsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def feedProcessingResultsList(feedId: String, bookmark: String, pageSize: Integer = 25, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[FeedProcessingResultsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[FeedProcessingResultsList200Response] = jsonOf[FeedProcessingResultsList200Response]

    val path = "/catalogs/feeds/{feed_id}/processing_results".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FeedProcessingResultsList200Response](req)

    } yield resp
  }

  def feedsCreate(feedsCreateRequest: FeedsCreateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(feedsCreateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsDelete(feedId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

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

  def feedsGet(feedId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

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
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def feedsIngest(feedId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeedIngestion] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeedIngestion] = jsonOf[CatalogsFeedIngestion]

    val path = "/catalogs/feeds/{feed_id}/ingest".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsFeedIngestion](req)

    } yield resp
  }

  def feedsList(bookmark: String, pageSize: Integer = 25, catalogId: String, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], catalogIdQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[FeedsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[FeedsList200Response] = jsonOf[FeedsList200Response]

    val path = "/catalogs/feeds"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("catalogId", Some(catalog_idQuery.toParamString(catalog_id))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FeedsList200Response](req)

    } yield resp
  }

  def feedsUpdate(feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsFeed] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsFeed] = jsonOf[CatalogsFeed]

    val path = "/catalogs/feeds/{feed_id}".replaceAll("\\{" + "feed_id" + "\\}",escape(feedId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(feedsUpdateRequest)
      resp          <- client.expect[CatalogsFeed](req)

    } yield resp
  }

  def itemsIssuesList(processingResultId: String, bookmark: String, pageSize: Integer = 25, itemNumbers: List[Integer] = List.empty[Integer] , itemValidationIssue: CatalogsItemValidationIssue, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], itemNumbersQuery: QueryParam[List[Integer]], itemValidationIssueQuery: QueryParam[CatalogsItemValidationIssue], adAccountIdQuery: QueryParam[String]): Task[ItemsIssuesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ItemsIssuesList200Response] = jsonOf[ItemsIssuesList200Response]

    val path = "/catalogs/processing_results/{processing_result_id}/item_issues".replaceAll("\\{" + "processing_result_id" + "\\}",escape(processingResultId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("itemNumbers", Some(item_numbersQuery.toParamString(item_numbers))), ("itemValidationIssue", Some(item_validation_issueQuery.toParamString(item_validation_issue))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ItemsIssuesList200Response](req)

    } yield resp
  }

}
