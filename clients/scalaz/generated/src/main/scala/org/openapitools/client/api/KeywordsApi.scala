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

import org.openapitools.client.api.Error
import org.openapitools.client.api.KeywordUpdateBody
import org.openapitools.client.api.KeywordsGet200Response
import org.openapitools.client.api.KeywordsMetricsArrayResponse
import org.openapitools.client.api.KeywordsRequest
import org.openapitools.client.api.KeywordsResponse
import org.openapitools.client.api.MatchType
import org.openapitools.client.api.TrendType
import org.openapitools.client.api.TrendingKeywordsResponse
import org.openapitools.client.api.TrendsSupportedRegion

object KeywordsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def countryKeywordsMetricsGet(host: String, adAccountId: String, countryCode: String, keywords: List[String] = List.empty[String] )(implicit countryCodeQuery: QueryParam[String], keywordsQuery: QueryParam[List[String]]): Task[KeywordsMetricsArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsMetricsArrayResponse] = jsonOf[KeywordsMetricsArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/keywords/metrics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("countryCode", Some(country_codeQuery.toParamString(country_code))), ("keywords", Some(keywordsQuery.toParamString(keywords))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[KeywordsMetricsArrayResponse](req)

    } yield resp
  }

  def keywordsCreate(host: String, adAccountId: String, keywordsRequest: KeywordsRequest): Task[KeywordsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsResponse] = jsonOf[KeywordsResponse]

    val path = "/ad_accounts/{ad_account_id}/keywords".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(keywordsRequest)
      resp          <- client.expect[KeywordsResponse](req)

    } yield resp
  }

  def keywordsGet(host: String, adAccountId: String, campaignId: String, adGroupId: String, matchTypes: List[MatchType] = List.empty[MatchType] , pageSize: Integer = 25, bookmark: String)(implicit campaignIdQuery: QueryParam[String], adGroupIdQuery: QueryParam[String], matchTypesQuery: QueryParam[List[MatchType]], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[KeywordsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsGet200Response] = jsonOf[KeywordsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/keywords".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignId", Some(campaign_idQuery.toParamString(campaign_id))), ("adGroupId", Some(ad_group_idQuery.toParamString(ad_group_id))), ("matchTypes", Some(match_typesQuery.toParamString(match_types))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[KeywordsGet200Response](req)

    } yield resp
  }

  def keywordsUpdate(host: String, adAccountId: String, keywordUpdateBody: KeywordUpdateBody): Task[KeywordsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsResponse] = jsonOf[KeywordsResponse]

    val path = "/ad_accounts/{ad_account_id}/keywords".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(keywordUpdateBody)
      resp          <- client.expect[KeywordsResponse](req)

    } yield resp
  }

  def trendingKeywordsList(host: String, region: TrendsSupportedRegion, trendType: TrendType, interests: List[String] = List.empty[String] , genders: List[String] = List.empty[String] , ages: List[String] = List.empty[String] , normalizeAgainstGroup: Boolean = false, limit: Integer = 50)(implicit interestsQuery: QueryParam[List[String]], gendersQuery: QueryParam[List[String]], agesQuery: QueryParam[List[String]], normalizeAgainstGroupQuery: QueryParam[Boolean], limitQuery: QueryParam[Integer]): Task[TrendingKeywordsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TrendingKeywordsResponse] = jsonOf[TrendingKeywordsResponse]

    val path = "/trends/keywords/{region}/top/{trend_type}".replaceAll("\\{" + "region" + "\\}",escape(region.toString)).replaceAll("\\{" + "trend_type" + "\\}",escape(trendType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("interests", Some(interestsQuery.toParamString(interests))), ("genders", Some(gendersQuery.toParamString(genders))), ("ages", Some(agesQuery.toParamString(ages))), ("normalizeAgainstGroup", Some(normalize_against_groupQuery.toParamString(normalize_against_group))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TrendingKeywordsResponse](req)

    } yield resp
  }

}

class HttpServiceKeywordsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def countryKeywordsMetricsGet(adAccountId: String, countryCode: String, keywords: List[String] = List.empty[String] )(implicit countryCodeQuery: QueryParam[String], keywordsQuery: QueryParam[List[String]]): Task[KeywordsMetricsArrayResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsMetricsArrayResponse] = jsonOf[KeywordsMetricsArrayResponse]

    val path = "/ad_accounts/{ad_account_id}/keywords/metrics".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("countryCode", Some(country_codeQuery.toParamString(country_code))), ("keywords", Some(keywordsQuery.toParamString(keywords))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[KeywordsMetricsArrayResponse](req)

    } yield resp
  }

  def keywordsCreate(adAccountId: String, keywordsRequest: KeywordsRequest): Task[KeywordsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsResponse] = jsonOf[KeywordsResponse]

    val path = "/ad_accounts/{ad_account_id}/keywords".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(keywordsRequest)
      resp          <- client.expect[KeywordsResponse](req)

    } yield resp
  }

  def keywordsGet(adAccountId: String, campaignId: String, adGroupId: String, matchTypes: List[MatchType] = List.empty[MatchType] , pageSize: Integer = 25, bookmark: String)(implicit campaignIdQuery: QueryParam[String], adGroupIdQuery: QueryParam[String], matchTypesQuery: QueryParam[List[MatchType]], pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[KeywordsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsGet200Response] = jsonOf[KeywordsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/keywords".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("campaignId", Some(campaign_idQuery.toParamString(campaign_id))), ("adGroupId", Some(ad_group_idQuery.toParamString(ad_group_id))), ("matchTypes", Some(match_typesQuery.toParamString(match_types))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[KeywordsGet200Response](req)

    } yield resp
  }

  def keywordsUpdate(adAccountId: String, keywordUpdateBody: KeywordUpdateBody): Task[KeywordsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[KeywordsResponse] = jsonOf[KeywordsResponse]

    val path = "/ad_accounts/{ad_account_id}/keywords".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(keywordUpdateBody)
      resp          <- client.expect[KeywordsResponse](req)

    } yield resp
  }

  def trendingKeywordsList(region: TrendsSupportedRegion, trendType: TrendType, interests: List[String] = List.empty[String] , genders: List[String] = List.empty[String] , ages: List[String] = List.empty[String] , normalizeAgainstGroup: Boolean = false, limit: Integer = 50)(implicit interestsQuery: QueryParam[List[String]], gendersQuery: QueryParam[List[String]], agesQuery: QueryParam[List[String]], normalizeAgainstGroupQuery: QueryParam[Boolean], limitQuery: QueryParam[Integer]): Task[TrendingKeywordsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TrendingKeywordsResponse] = jsonOf[TrendingKeywordsResponse]

    val path = "/trends/keywords/{region}/top/{trend_type}".replaceAll("\\{" + "region" + "\\}",escape(region.toString)).replaceAll("\\{" + "trend_type" + "\\}",escape(trendType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("interests", Some(interestsQuery.toParamString(interests))), ("genders", Some(gendersQuery.toParamString(genders))), ("ages", Some(agesQuery.toParamString(ages))), ("normalizeAgainstGroup", Some(normalize_against_groupQuery.toParamString(normalize_against_group))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TrendingKeywordsResponse](req)

    } yield resp
  }

}
