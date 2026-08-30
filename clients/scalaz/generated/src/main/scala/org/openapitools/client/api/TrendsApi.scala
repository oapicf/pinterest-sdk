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

import org.openapitools.client.api.AgeTrendsBucket
import org.openapitools.client.api.Error
import org.openapitools.client.api.FeaturedTrend
import org.openapitools.client.api.GenderBucket
import org.openapitools.client.api.InterestsEnum
import org.openapitools.client.api.ProductCategoriesEngagementType
import org.openapitools.client.api.ProductCategoryDetailLookbackWindow
import org.openapitools.client.api.ProductCategoryDetails
import org.openapitools.client.api.ProductCategoryEnum
import org.openapitools.client.api.ProductCategoryRegion
import org.openapitools.client.api.TrendingProductCategory
import org.openapitools.client.api.TrendsEditorial
import org.openapitools.client.api.VerticalProductCategory

object TrendsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def trendsEditorialArticlesList(host: String, region: ProductCategoryRegion)(implicit regionQuery: QueryParam[ProductCategoryRegion]): Task[List[TrendsEditorial]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[TrendsEditorial]] = jsonOf[List[TrendsEditorial]]

    val path = "/trends/editorial_articles"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("region", Some(regionQuery.toParamString(region))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[TrendsEditorial]](req)

    } yield resp
  }

  def trendsFeaturedTopicsList(host: String, region: ProductCategoryRegion, interest: InterestsEnum)(implicit interestQuery: QueryParam[InterestsEnum], regionQuery: QueryParam[ProductCategoryRegion]): Task[List[FeaturedTrend]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[FeaturedTrend]] = jsonOf[List[FeaturedTrend]]

    val path = "/trends/topics/featured"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("interest", Some(interestQuery.toParamString(interest))), ("region", Some(regionQuery.toParamString(region))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[FeaturedTrend]](req)

    } yield resp
  }

  def trendsProductCategoriesDetailsList(host: String, productCategories: List[ProductCategoryEnum] = List.empty[ProductCategoryEnum] , region: ProductCategoryRegion, lookbackWindow: ProductCategoryDetailLookbackWindow, engagementType: ProductCategoriesEngagementType)(implicit productCategoriesQuery: QueryParam[List[ProductCategoryEnum]], regionQuery: QueryParam[ProductCategoryRegion], lookbackWindowQuery: QueryParam[ProductCategoryDetailLookbackWindow], engagementTypeQuery: QueryParam[ProductCategoriesEngagementType]): Task[List[ProductCategoryDetails]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[ProductCategoryDetails]] = jsonOf[List[ProductCategoryDetails]]

    val path = "/trends/product_categories/details"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("productCategories", Some(product_categoriesQuery.toParamString(product_categories))), ("region", Some(regionQuery.toParamString(region))), ("lookbackWindow", Some(lookback_windowQuery.toParamString(lookback_window))), ("engagementType", Some(engagement_typeQuery.toParamString(engagement_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[ProductCategoryDetails]](req)

    } yield resp
  }

  def trendsProductCategoriesTrendingList(host: String, region: ProductCategoryRegion, verticals: List[VerticalProductCategory] = List.empty[VerticalProductCategory] , ages: List[AgeTrendsBucket] = List.empty[AgeTrendsBucket] , genders: List[GenderBucket] = List.empty[GenderBucket] , engagementType: ProductCategoriesEngagementType)(implicit regionQuery: QueryParam[ProductCategoryRegion], verticalsQuery: QueryParam[List[VerticalProductCategory]], agesQuery: QueryParam[List[AgeTrendsBucket]], gendersQuery: QueryParam[List[GenderBucket]], engagementTypeQuery: QueryParam[ProductCategoriesEngagementType]): Task[List[TrendingProductCategory]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[TrendingProductCategory]] = jsonOf[List[TrendingProductCategory]]

    val path = "/trends/product_categories/trending"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("region", Some(regionQuery.toParamString(region))), ("verticals", Some(verticalsQuery.toParamString(verticals))), ("ages", Some(agesQuery.toParamString(ages))), ("genders", Some(gendersQuery.toParamString(genders))), ("engagementType", Some(engagement_typeQuery.toParamString(engagement_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[TrendingProductCategory]](req)

    } yield resp
  }

}

class HttpServiceTrendsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def trendsEditorialArticlesList(region: ProductCategoryRegion)(implicit regionQuery: QueryParam[ProductCategoryRegion]): Task[List[TrendsEditorial]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[TrendsEditorial]] = jsonOf[List[TrendsEditorial]]

    val path = "/trends/editorial_articles"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("region", Some(regionQuery.toParamString(region))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[TrendsEditorial]](req)

    } yield resp
  }

  def trendsFeaturedTopicsList(region: ProductCategoryRegion, interest: InterestsEnum)(implicit interestQuery: QueryParam[InterestsEnum], regionQuery: QueryParam[ProductCategoryRegion]): Task[List[FeaturedTrend]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[FeaturedTrend]] = jsonOf[List[FeaturedTrend]]

    val path = "/trends/topics/featured"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("interest", Some(interestQuery.toParamString(interest))), ("region", Some(regionQuery.toParamString(region))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[FeaturedTrend]](req)

    } yield resp
  }

  def trendsProductCategoriesDetailsList(productCategories: List[ProductCategoryEnum] = List.empty[ProductCategoryEnum] , region: ProductCategoryRegion, lookbackWindow: ProductCategoryDetailLookbackWindow, engagementType: ProductCategoriesEngagementType)(implicit productCategoriesQuery: QueryParam[List[ProductCategoryEnum]], regionQuery: QueryParam[ProductCategoryRegion], lookbackWindowQuery: QueryParam[ProductCategoryDetailLookbackWindow], engagementTypeQuery: QueryParam[ProductCategoriesEngagementType]): Task[List[ProductCategoryDetails]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[ProductCategoryDetails]] = jsonOf[List[ProductCategoryDetails]]

    val path = "/trends/product_categories/details"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("productCategories", Some(product_categoriesQuery.toParamString(product_categories))), ("region", Some(regionQuery.toParamString(region))), ("lookbackWindow", Some(lookback_windowQuery.toParamString(lookback_window))), ("engagementType", Some(engagement_typeQuery.toParamString(engagement_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[ProductCategoryDetails]](req)

    } yield resp
  }

  def trendsProductCategoriesTrendingList(region: ProductCategoryRegion, verticals: List[VerticalProductCategory] = List.empty[VerticalProductCategory] , ages: List[AgeTrendsBucket] = List.empty[AgeTrendsBucket] , genders: List[GenderBucket] = List.empty[GenderBucket] , engagementType: ProductCategoriesEngagementType)(implicit regionQuery: QueryParam[ProductCategoryRegion], verticalsQuery: QueryParam[List[VerticalProductCategory]], agesQuery: QueryParam[List[AgeTrendsBucket]], gendersQuery: QueryParam[List[GenderBucket]], engagementTypeQuery: QueryParam[ProductCategoriesEngagementType]): Task[List[TrendingProductCategory]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[TrendingProductCategory]] = jsonOf[List[TrendingProductCategory]]

    val path = "/trends/product_categories/trending"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("region", Some(regionQuery.toParamString(region))), ("verticals", Some(verticalsQuery.toParamString(verticals))), ("ages", Some(agesQuery.toParamString(ages))), ("genders", Some(gendersQuery.toParamString(genders))), ("engagementType", Some(engagement_typeQuery.toParamString(engagement_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[TrendingProductCategory]](req)

    } yield resp
  }

}
