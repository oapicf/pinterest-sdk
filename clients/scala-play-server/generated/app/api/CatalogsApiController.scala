package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Catalog
import model.CatalogCreate
import model.CatalogsAvailableFilterValues
import model.CatalogsList200Response
import model.CatalogsLocale
import model.Country
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
      val catalogCreate = request.body.asJson.map(_.as[CatalogCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsCreate(catalogCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs?adAccountId=[value]&bookmark=[value]&pageSize=[value]
    */
  def catalogsList(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.catalogsList(adAccountId, bookmark, pageSize)
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
