package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.KeywordUpdateBody
import model.KeywordsGet200Response
import model.KeywordsMetricsArrayResponse
import model.KeywordsRequest
import model.KeywordsResponse
import model.MatchType
import model.TrendType
import model.TrendingKeywordsResponse
import model.TrendsSupportedRegion

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class KeywordsApiController @Inject()(cc: ControllerComponents, api: KeywordsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/keywords/metrics?countryCode=[value]&keywords=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def countryKeywordsMetricsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): KeywordsMetricsArrayResponse = {
      val countryCode = request.getQueryString("country_code")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("country_code", "query string")
        }
        
      val keywords = request.getQueryString("keywords")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("keywords", "query string")
        }
        
      api.countryKeywordsMetricsGet(adAccountId, countryCode, keywords)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/keywords
    * @param adAccountId Unique identifier of an ad account.
    */
  def keywordsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): KeywordsResponse = {
      val keywordsRequest = request.body.asJson.map(_.as[KeywordsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "keywordsRequest")
      }
      api.keywordsCreate(adAccountId, keywordsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/keywords?campaignId=[value]&adGroupId=[value]&matchTypes=[value]&pageSize=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def keywordsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): KeywordsGet200Response = {
      val campaignId = request.getQueryString("campaign_id")
        
      val adGroupId = request.getQueryString("ad_group_id")
        
      val matchTypes = request.queryString.get("match_types")
        .map(_.toList)
        .map(_.map(value => )
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.keywordsGet(adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/keywords
    * @param adAccountId Unique identifier of an ad account.
    */
  def keywordsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): KeywordsResponse = {
      val keywordUpdateBody = request.body.asJson.map(_.as[KeywordUpdateBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "keywordUpdateBody")
      }
      api.keywordsUpdate(adAccountId, keywordUpdateBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/trends/keywords/:region/top/:trendType?interests=[value]&genders=[value]&ages=[value]&normalizeAgainstGroup=[value]&limit=[value]
    * @param region The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia
    * @param trendType The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
    */
  def trendingKeywordsList(region: TrendsSupportedRegion, trendType: TrendType): Action[AnyContent] = Action { request =>
    def executeApi(): TrendingKeywordsResponse = {
      val interests = request.queryString.get("interests")
        .map(_.toList)
        
      val genders = request.queryString.get("genders")
        .map(_.toList)
        
      val ages = request.queryString.get("ages")
        .map(_.toList)
        
      val normalizeAgainstGroup = request.getQueryString("normalize_against_group")
        .map(value => value.toBoolean)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.trendingKeywordsList(region, trendType, interests, genders, ages, normalizeAgainstGroup, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
