package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CatalogsLocalStoresCreate200ResponseInner
import model.CatalogsLocalStoresDelete200ResponseInner
import model.CatalogsLocalStoresList200Response
import model.Error
import model.LocalInventoryItemsBatch
import model.LocalInventoryItemsBatchCreate
import model.LocalInventoryItemsGet
import model.LocalInventoryItemsGetCreate
import model.LocalStore
import model.LocalStoreBatchUpdate
import model.LocalStoreCreate
import model.SupplementalItemsBatchResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CatalogSupplementalApiController @Inject()(cc: ControllerComponents, api: CatalogSupplementalApi) extends AbstractController(cc) {
  /**
    * POST /v5/catalogs/:catalogId/local_inventory_items/batch?adAccountId=[value]
    * @param catalogId Unique identifier of a catalog.
    */
  def catalogsLocalInventoryItemsBatchOperate(catalogId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SupplementalItemsBatchResponse = {
      val localInventoryItemsBatchCreate = request.body.asJson.map(_.as[LocalInventoryItemsBatchCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "localInventoryItemsBatchCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/:catalogId/local_inventory_items/query?adAccountId=[value]
    * @param catalogId Unique identifier of a catalog.
    */
  def catalogsLocalInventoryItemsPost(catalogId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LocalInventoryItemsGet = {
      val localInventoryItemsGetCreate = request.body.asJson.map(_.as[LocalInventoryItemsGetCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "localInventoryItemsGetCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/:catalogId/local_stores?adAccountId=[value]
    * @param catalogId Unique identifier of a catalog.
    */
  def catalogsLocalStoresCreate(catalogId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CatalogsLocalStoresCreate200ResponseInner] = {
      val localStoreCreate = request.body.asJson.map(_.as[List[LocalStoreCreate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "localStoreCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/catalogs/:catalogId/local_stores?ids=[value]&adAccountId=[value]
    * @param catalogId Unique identifier of a catalog.
    */
  def catalogsLocalStoresDelete(catalogId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CatalogsLocalStoresDelete200ResponseInner] = {
      val ids = request.getQueryString("ids")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ids", "query string")
        }
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsLocalStoresDelete(catalogId, ids, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/:catalogId/local_stores?ids=[value]&adAccountId=[value]&bookmark=[value]&pageSize=[value]
    * @param catalogId Unique identifier of a catalog.
    */
  def catalogsLocalStoresList(catalogId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsLocalStoresList200Response = {
      val ids = request.getQueryString("ids")
        .map(values => splitCollectionParam(values, "csv"))
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/catalogs/:catalogId/local_stores?adAccountId=[value]
    * @param catalogId Unique identifier of a catalog.
    */
  def catalogsLocalStoresUpdate(catalogId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CatalogsLocalStoresCreate200ResponseInner] = {
      val localStoreBatchUpdate = request.body.asJson.map(_.as[List[LocalStoreBatchUpdate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "localStoreBatchUpdate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/:catalogId/supplemental_items/batch/:batchId?adAccountId=[value]
    * @param catalogId Unique identifier of a catalog.
    * @param batchId Unique identifier of an items batch operation.
    */
  def catalogsSupplementalItemsBatchGet(catalogId: String, batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SupplementalItemsBatchResponse = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)
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
