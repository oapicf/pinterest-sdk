package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.KeywordUpdateBody
import org.openapitools.server.model.KeywordsGet200Response
import org.openapitools.server.model.KeywordsMetricsArrayResponse
import org.openapitools.server.model.KeywordsRequest
import org.openapitools.server.model.KeywordsResponse
import org.openapitools.server.model.MatchType
import org.openapitools.server.model.TrendType
import org.openapitools.server.model.TrendingKeywordsResponse
import org.openapitools.server.model.TrendsSupportedRegion


class KeywordsApi(
    keywordsService: KeywordsApiService,
    keywordsMarshaller: KeywordsApiMarshaller
) {

  import KeywordsApiPatterns.adAccountIdPattern

  import keywordsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "keywords" / "metrics") { (adAccountId) => 
      get { 
        parameters("country_code".as[String], "keywords".as[String]) { (countryCode, keywords) => 
            keywordsService.countryKeywordsMetricsGet(adAccountId = adAccountId, countryCode = countryCode, keywords = keywords)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "keywords") { (adAccountId) => 
      post {  
            entity(as[KeywordsRequest]){ keywordsRequest =>
              keywordsService.keywordsCreate(adAccountId = adAccountId, keywordsRequest = keywordsRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "keywords") { (adAccountId) => 
      get { 
        parameters("campaign_id".as[String].?, "ad_group_id".as[String].?, "match_types".as[String].?, "page_size".as[Int].?(25), "bookmark".as[String].?) { (campaignId, adGroupId, matchTypes, pageSize, bookmark) => 
            keywordsService.keywordsGet(adAccountId = adAccountId, campaignId = campaignId, adGroupId = adGroupId, matchTypes = matchTypes, pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "keywords") { (adAccountId) => 
      patch {  
            entity(as[KeywordUpdateBody]){ keywordUpdateBody =>
              keywordsService.keywordsUpdate(adAccountId = adAccountId, keywordUpdateBody = keywordUpdateBody)
            }
      }
    } ~
    path("trends" / "keywords" / Segment / "top" / Segment) { (region, trendType) => 
      get { 
        parameters("interests".as[String].?, "genders".as[String].?, "ages".as[String].?, "normalize_against_group".as[Boolean].?(false), "limit".as[Int].?(50)) { (interests, genders, ages, normalizeAgainstGroup, limit) => 
            keywordsService.trendingKeywordsList(region = region, trendType = trendType, interests = interests, genders = genders, ages = ages, normalizeAgainstGroup = normalizeAgainstGroup, limit = limit)
        }
      }
    }
}

object KeywordsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait KeywordsApiService {

  def countryKeywordsMetricsGet200(responseKeywordsMetricsArrayResponse: KeywordsMetricsArrayResponse)(implicit toEntityMarshallerKeywordsMetricsArrayResponse: ToEntityMarshaller[KeywordsMetricsArrayResponse]): Route =
    complete((200, responseKeywordsMetricsArrayResponse))
  def countryKeywordsMetricsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: KeywordsMetricsArrayResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def countryKeywordsMetricsGet(adAccountId: String, countryCode: String, keywords: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerKeywordsMetricsArrayResponse: ToEntityMarshaller[KeywordsMetricsArrayResponse]): Route

  def keywordsCreate200(responseKeywordsResponse: KeywordsResponse)(implicit toEntityMarshallerKeywordsResponse: ToEntityMarshaller[KeywordsResponse]): Route =
    complete((200, responseKeywordsResponse))
  def keywordsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: KeywordsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def keywordsCreate(adAccountId: String, keywordsRequest: KeywordsRequest)
      (implicit toEntityMarshallerKeywordsResponse: ToEntityMarshaller[KeywordsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def keywordsGet200(responseKeywordsGet200Response: KeywordsGet200Response)(implicit toEntityMarshallerKeywordsGet200Response: ToEntityMarshaller[KeywordsGet200Response]): Route =
    complete((200, responseKeywordsGet200Response))
  def keywordsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: KeywordsGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def keywordsGet(adAccountId: String, campaignId: Option[String], adGroupId: Option[String], matchTypes: Option[String], pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerKeywordsGet200Response: ToEntityMarshaller[KeywordsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def keywordsUpdate200(responseKeywordsResponse: KeywordsResponse)(implicit toEntityMarshallerKeywordsResponse: ToEntityMarshaller[KeywordsResponse]): Route =
    complete((200, responseKeywordsResponse))
  def keywordsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: KeywordsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def keywordsUpdate(adAccountId: String, keywordUpdateBody: KeywordUpdateBody)
      (implicit toEntityMarshallerKeywordsResponse: ToEntityMarshaller[KeywordsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def trendingKeywordsList200(responseTrendingKeywordsResponse: TrendingKeywordsResponse)(implicit toEntityMarshallerTrendingKeywordsResponse: ToEntityMarshaller[TrendingKeywordsResponse]): Route =
    complete((200, responseTrendingKeywordsResponse))
  def trendingKeywordsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def trendingKeywordsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: TrendingKeywordsResponse
   * Code: 400, Message: Invalid trending keywords request parameters, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def trendingKeywordsList(region: String, trendType: String, interests: Option[String], genders: Option[String], ages: Option[String], normalizeAgainstGroup: Boolean, limit: Int)
      (implicit toEntityMarshallerTrendingKeywordsResponse: ToEntityMarshaller[TrendingKeywordsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait KeywordsApiMarshaller {
  implicit def fromEntityUnmarshallerKeywordsRequest: FromEntityUnmarshaller[KeywordsRequest]

  implicit def fromEntityUnmarshallerKeywordUpdateBody: FromEntityUnmarshaller[KeywordUpdateBody]



  implicit def toEntityMarshallerKeywordsResponse: ToEntityMarshaller[KeywordsResponse]

  implicit def toEntityMarshallerTrendingKeywordsResponse: ToEntityMarshaller[TrendingKeywordsResponse]

  implicit def toEntityMarshallerKeywordsGet200Response: ToEntityMarshaller[KeywordsGet200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerKeywordsMetricsArrayResponse: ToEntityMarshaller[KeywordsMetricsArrayResponse]

}

