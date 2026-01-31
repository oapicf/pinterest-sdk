package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Catalog
import model.CatalogsAvailableFilterValues
import model.CatalogsCreateRequest
import model.CatalogsList200Response
import model.CatalogsLocale
import model.Country
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class CatalogsApiController @Inject()(cc: ControllerComponents, api: CatalogsApi) extends AbstractController(cc) {
  /**
    * GET /v5/catalogs/available_filter_values?catalogId=[value]&feedId=[value]&country=[value]&language=[value]&adAccountId=[value]
    */
  def catalogsAvailableFilterValues(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsAvailableFilterValues = {
      val catalogId = request.getQueryString("catalog_id")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("catalog_id", "query string")
        }
        
      val feedId = request.getQueryString("feed_id")
        
      val country = request.getQueryString("country")
        .map(value => )
        
      val language = request.getQueryString("language")
        .map(value => )
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs?adAccountId=[value]
    */
  def catalogsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): Catalog = {
      val catalogsCreateRequest = request.body.asJson.map(_.as[CatalogsCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsCreateRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsCreate(catalogsCreateRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs?bookmark=[value]&pageSize=[value]&adAccountId=[value]
    */
  def catalogsList(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsList(bookmark, pageSize, adAccountId)
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
