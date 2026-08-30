package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BoardsList200Response
import model.Error
import model.PinsList200Response
import model.SearchPartnerPins200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class SearchApiController @Inject()(cc: ControllerComponents, api: SearchApi) extends AbstractController(cc) {
  /**
    * GET /v5/search/partner/pins?term=[value]&countryCode=[value]&bookmark=[value]&locale=[value]&limit=[value]
    */
  def searchPartnerPins(): Action[AnyContent] = Action { request =>
    def executeApi(): SearchPartnerPins200Response = {
      val term = request.getQueryString("term")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("term", "query string")
        }
        
      val countryCode = request.getQueryString("country_code")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("country_code", "query string")
        }
        
      val bookmark = request.getQueryString("bookmark")
        
      val locale = request.getQueryString("locale")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchPartnerPins(term, countryCode, bookmark, locale, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/search/boards?adAccountId=[value]&query=[value]&bookmark=[value]&pageSize=[value]
    */
  def searchUserBoardsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val query = request.getQueryString("query")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.searchUserBoardsGet(adAccountId, query, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/search/pins?adAccountId=[value]&query=[value]&bookmark=[value]
    */
  def searchUserPinsList(): Action[AnyContent] = Action { request =>
    def executeApi(): PinsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val query = request.getQueryString("query")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("query", "query string")
        }
        
      val bookmark = request.getQueryString("bookmark")
        
      api.searchUserPinsList(query, adAccountId, bookmark)
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
