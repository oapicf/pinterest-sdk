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
import org.openapitools.server.model.Keywords
import org.openapitools.server.model.KeywordsCreate
import org.openapitools.server.model.KeywordsGet200Response
import org.openapitools.server.model.KeywordsMetricsArrayResponse
import org.openapitools.server.model.KeywordsUpdate
import org.openapitools.server.model.MatchType
import org.openapitools.server.model.TrendType
import org.openapitools.server.model.TrendingKeywordsResponse
import org.openapitools.server.model.TrendsAgeBucket
import org.openapitools.server.model.TrendsGenderFilter
import org.openapitools.server.model.TrendsL1Interest
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
            entity(as[KeywordsCreate]){ keywordsCreate =>
              keywordsService.keywordsCreate(adAccountId = adAccountId, keywordsCreate = keywordsCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "keywords") { (adAccountId) => 
      get { 
        parameters("campaign_id".as[String].?, "ad_group_id".as[String].?, "ad_group_ids".as[String].?, "match_types".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize) => 
            keywordsService.keywordsGet(adAccountId = adAccountId, campaignId = campaignId, adGroupId = adGroupId, adGroupIds = adGroupIds, matchTypes = matchTypes, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "keywords") { (adAccountId) => 
      patch {  
            entity(as[KeywordsUpdate]){ keywordsUpdate =>
              keywordsService.keywordsUpdate(adAccountId = adAccountId, keywordsUpdate = keywordsUpdate)
            }
      }
    } ~
    path("trends" / "keywords" / Segment / "top" / Segment) { (region, trendType) => 
      get { 
        parameters("interests".as[String].?, "genders".as[String].?, "ages".as[String].?, "include_keywords".as[String].?, "normalize_against_group".as[Boolean].?(false), "limit".as[Int].?(50), "include_demographics".as[Boolean].?(false)) { (interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics) => 
            keywordsService.trendingKeywordsList(region = region, trendType = trendType, interests = interests, genders = genders, ages = ages, includeKeywords = includeKeywords, normalizeAgainstGroup = normalizeAgainstGroup, limit = limit, includeDemographics = includeDemographics)
        }
      }
    }
}

object KeywordsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait KeywordsApiService {

  def countryKeywordsMetricsGet200(responseKeywordsMetricsArrayResponse: KeywordsMetricsArrayResponse)(implicit toEntityMarshallerKeywordsMetricsArrayResponse: ToEntityMarshaller[KeywordsMetricsArrayResponse]): Route =
    complete((200, responseKeywordsMetricsArrayResponse))
  def countryKeywordsMetricsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def countryKeywordsMetricsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def countryKeywordsMetricsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def countryKeywordsMetricsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def countryKeywordsMetricsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def countryKeywordsMetricsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: KeywordsMetricsArrayResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def countryKeywordsMetricsGet(adAccountId: String, countryCode: String, keywords: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerKeywordsMetricsArrayResponse: ToEntityMarshaller[KeywordsMetricsArrayResponse]): Route

  def keywordsCreate200(responseKeywords: Keywords)(implicit toEntityMarshallerKeywords: ToEntityMarshaller[Keywords]): Route =
    complete((200, responseKeywords))
  def keywordsCreate201(responseKeywords: Keywords)(implicit toEntityMarshallerKeywords: ToEntityMarshaller[Keywords]): Route =
    complete((201, responseKeywords))
  def keywordsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def keywordsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def keywordsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def keywordsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def keywordsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def keywordsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Keywords
   * Code: 201, Message: Resource create operation completed successfully., DataType: Keywords
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def keywordsCreate(adAccountId: String, keywordsCreate: KeywordsCreate)
      (implicit toEntityMarshallerKeywords: ToEntityMarshaller[Keywords], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def keywordsGet200(responseKeywordsGet200Response: KeywordsGet200Response)(implicit toEntityMarshallerKeywordsGet200Response: ToEntityMarshaller[KeywordsGet200Response]): Route =
    complete((200, responseKeywordsGet200Response))
  def keywordsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def keywordsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def keywordsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def keywordsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def keywordsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def keywordsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: KeywordsGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def keywordsGet(adAccountId: String, campaignId: Option[String], adGroupId: Option[String], adGroupIds: Option[String], matchTypes: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerKeywordsGet200Response: ToEntityMarshaller[KeywordsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def keywordsUpdate200(responseKeywords: Keywords)(implicit toEntityMarshallerKeywords: ToEntityMarshaller[Keywords]): Route =
    complete((200, responseKeywords))
  def keywordsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def keywordsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def keywordsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def keywordsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def keywordsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def keywordsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Keywords
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def keywordsUpdate(adAccountId: String, keywordsUpdate: KeywordsUpdate)
      (implicit toEntityMarshallerKeywords: ToEntityMarshaller[Keywords], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def trendingKeywordsList200(responseTrendingKeywordsResponse: TrendingKeywordsResponse)(implicit toEntityMarshallerTrendingKeywordsResponse: ToEntityMarshaller[TrendingKeywordsResponse]): Route =
    complete((200, responseTrendingKeywordsResponse))
  def trendingKeywordsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def trendingKeywordsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def trendingKeywordsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def trendingKeywordsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def trendingKeywordsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def trendingKeywordsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: TrendingKeywordsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def trendingKeywordsList(region: String, trendType: String, interests: Option[String], genders: Option[String], ages: Option[String], includeKeywords: Option[String], normalizeAgainstGroup: Boolean, limit: Int, includeDemographics: Boolean)
      (implicit toEntityMarshallerTrendingKeywordsResponse: ToEntityMarshaller[TrendingKeywordsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait KeywordsApiMarshaller {
  implicit def fromEntityUnmarshallerKeywordsCreate: FromEntityUnmarshaller[KeywordsCreate]

  implicit def fromEntityUnmarshallerKeywordsUpdate: FromEntityUnmarshaller[KeywordsUpdate]



  implicit def toEntityMarshallerKeywords: ToEntityMarshaller[Keywords]

  implicit def toEntityMarshallerTrendingKeywordsResponse: ToEntityMarshaller[TrendingKeywordsResponse]

  implicit def toEntityMarshallerKeywordsGet200Response: ToEntityMarshaller[KeywordsGet200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerKeywordsMetricsArrayResponse: ToEntityMarshaller[KeywordsMetricsArrayResponse]

}

