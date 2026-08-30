package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CatalogsItemsBatch
import model.CatalogsItemsBatchPostRequest
import model.CatalogsItemsRequest
import model.Error
import model.ItemsPost200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CatalogItemsApiController @Inject()(cc: ControllerComponents, api: CatalogItemsApi) extends AbstractController(cc) {
  /**
    * GET /v5/catalogs/items/batch/:batchId?adAccountId=[value]
    * @param batchId Id of a catalogs items batch to fetch
    */
  def itemsBatchGet(batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsItemsBatch = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.itemsBatchGet(batchId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/items/batch?adAccountId=[value]
    */
  def itemsBatchPost(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsItemsBatch = {
      val catalogsItemsBatchPostRequest = request.body.asJson.map(_.as[CatalogsItemsBatchPostRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsItemsBatchPostRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/items?adAccountId=[value]
    */
  def itemsPost(): Action[AnyContent] = Action { request =>
    def executeApi(): ItemsPost200Response = {
      val catalogsItemsRequest = request.body.asJson.map(_.as[CatalogsItemsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsItemsRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.itemsPost(catalogsItemsRequest, adAccountId)
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
