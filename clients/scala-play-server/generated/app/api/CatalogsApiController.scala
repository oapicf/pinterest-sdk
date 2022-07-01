package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CatalogsFeed
import model.CatalogsFeedsCreateRequest
import model.CatalogsFeedsUpdateRequest
import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsBatchRequest
import model.CatalogsProductGroup
import model.CatalogsProductGroupCreateRequest
import model.CatalogsProductGroupUpdateRequest
import model.Error
import model.JsObject
import model.Paginated

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
@Singleton
class CatalogsApiController @Inject()(cc: ControllerComponents, api: CatalogsApi) extends AbstractController(cc) {
  /**
    * POST /v5/catalogs/product_groups
    */
  def catalogsProductGroupsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): JsObject = {
      val catalogsProductGroupCreateRequest = request.body.asJson.map(_.as[CatalogsProductGroupCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsProductGroupCreateRequest")
      }
      api.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/catalogs/product_groups/:productGroupId
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsDelete(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.catalogsProductGroupsDelete(productGroupId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/catalogs/product_groups?feedId=[value]&bookmark=[value]&pageSize=[value]
    */
  def catalogsProductGroupsList(): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val feedId = request.getQueryString("feed_id")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("feed_id", "query string")
        }
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      api.catalogsProductGroupsList(feedId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/catalogs/product_groups/:productGroupId
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsUpdate(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroup = {
      val catalogsProductGroupUpdateRequest = request.body.asJson.map(_.as[CatalogsProductGroupUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsProductGroupUpdateRequest")
      }
      api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/feeds/:feedId/processing_results?bookmark=[value]&pageSize=[value]
    * @param feedId Unique identifier of a feed
    */
  def feedProcessingResultsList(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      api.feedProcessingResultsList(feedId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/feeds
    */
  def feedsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsFeed = {
      val catalogsFeedsCreateRequest = request.body.asJson.map(_.as[CatalogsFeedsCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsFeedsCreateRequest")
      }
      api.feedsCreate(catalogsFeedsCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/catalogs/feeds/:feedId
    * @param feedId Unique identifier of a feed
    */
  def feedsDelete(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.feedsDelete(feedId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/catalogs/feeds/:feedId
    * @param feedId Unique identifier of a feed
    */
  def feedsGet(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsFeed = {
      api.feedsGet(feedId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/feeds?bookmark=[value]&pageSize=[value]
    */
  def feedsList(): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      api.feedsList(bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/catalogs/feeds/:feedId
    * @param feedId Unique identifier of a feed
    */
  def feedsUpdate(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsFeed = {
      val catalogsFeedsUpdateRequest = request.body.asJson.map(_.as[CatalogsFeedsUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsFeedsUpdateRequest")
      }
      api.feedsUpdate(feedId, catalogsFeedsUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/items/batch/:batchId
    * @param batchId Id of a catalogs items batch to fetch
    */
  def itemsBatchGet(batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsItemsBatch = {
      api.itemsBatchGet(batchId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/items/batch
    */
  def itemsBatchPost(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsItemsBatch = {
      val catalogsItemsBatchRequest = request.body.asJson.map(_.as[CatalogsItemsBatchRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsItemsBatchRequest")
      }
      api.itemsBatchPost(catalogsItemsBatchRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/items?country=[value]&itemIds=[value]&language=[value]
    */
  def itemsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsItems = {
      val country = request.getQueryString("country")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("country", "query string")
        }
      val itemIds = request.queryString.get("item_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("item_ids", "query string")
        }
      val language = request.getQueryString("language")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("language", "query string")
        }
      api.itemsGet(country, itemIds, language)
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
