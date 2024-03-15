package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CatalogsFeed
import model.CatalogsItemValidationIssue
import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsFilters
import model.CatalogsList200Response
import model.CatalogsListProductsByFilterRequest
import model.CatalogsProductGroupPinsList200Response
import model.CatalogsProductGroupProductCounts
import model.CatalogsProductGroupsCreate201Response
import model.CatalogsProductGroupsCreateRequest
import model.CatalogsProductGroupsList200Response
import model.CatalogsProductGroupsUpdateRequest
import model.Error
import model.FeedProcessingResultsList200Response
import model.FeedsCreateRequest
import model.FeedsList200Response
import model.FeedsUpdateRequest
import model.ItemsBatchPostRequest
import model.ItemsIssuesList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class CatalogsApiController @Inject()(cc: ControllerComponents, api: CatalogsApi) extends AbstractController(cc) {
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

  /**
    * GET /v5/catalogs/product_groups/:productGroupId/products?bookmark=[value]&pageSize=[value]&adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupPinsList(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupPinsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/product_groups?adAccountId=[value]
    */
  def catalogsProductGroupsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupsCreate201Response = {
      val catalogsProductGroupsCreateRequest = request.body.asJson.map(_.as[CatalogsProductGroupsCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsProductGroupsCreateRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/catalogs/product_groups/:productGroupId?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsDelete(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsDelete(productGroupId, adAccountId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/catalogs/product_groups/:productGroupId?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsGet(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupsCreate201Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsGet(productGroupId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/product_groups?feedId=[value]&catalogId=[value]&bookmark=[value]&pageSize=[value]&adAccountId=[value]
    */
  def catalogsProductGroupsList(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupsList200Response = {
      val feedId = request.getQueryString("feed_id")
        
      val catalogId = request.getQueryString("catalog_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/product_groups/:productGroupId/product_counts?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsProductCountsGet(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupProductCounts = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/catalogs/product_groups/:productGroupId?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsUpdate(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupsCreate201Response = {
      val catalogsProductGroupsUpdateRequest = request.body.asJson.map(_.as[CatalogsProductGroupsUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsProductGroupsUpdateRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/feeds/:feedId/processing_results?bookmark=[value]&pageSize=[value]&adAccountId=[value]
    * @param feedId Unique identifier of a feed
    */
  def feedProcessingResultsList(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): FeedProcessingResultsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/feeds?adAccountId=[value]
    */
  def feedsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsFeed = {
      val feedsCreateRequest = request.body.asJson.map(_.as[FeedsCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "feedsCreateRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.feedsCreate(feedsCreateRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/catalogs/feeds/:feedId?adAccountId=[value]
    * @param feedId Unique identifier of a feed
    */
  def feedsDelete(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.feedsDelete(feedId, adAccountId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/catalogs/feeds/:feedId?adAccountId=[value]
    * @param feedId Unique identifier of a feed
    */
  def feedsGet(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsFeed = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.feedsGet(feedId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/feeds?bookmark=[value]&pageSize=[value]&catalogId=[value]&adAccountId=[value]
    */
  def feedsList(): Action[AnyContent] = Action { request =>
    def executeApi(): FeedsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val catalogId = request.getQueryString("catalog_id")
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.feedsList(bookmark, pageSize, catalogId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/catalogs/feeds/:feedId?adAccountId=[value]
    * @param feedId Unique identifier of a feed
    */
  def feedsUpdate(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsFeed = {
      val feedsUpdateRequest = request.body.asJson.map(_.as[FeedsUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "feedsUpdateRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.feedsUpdate(feedId, feedsUpdateRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

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
      val itemsBatchPostRequest = request.body.asJson.map(_.as[ItemsBatchPostRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "itemsBatchPostRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.itemsBatchPost(itemsBatchPostRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/items?adAccountId=[value]&country=[value]&language=[value]&itemIds=[value]&filters=[value]
    */
  def itemsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsItems = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val country = request.getQueryString("country")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("country", "query string")
        }
        
      val language = request.getQueryString("language")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("language", "query string")
        }
        
      val itemIds = request.queryString.get("item_ids")
        .map(_.toList)
        
      val filters = request.getQueryString("filters")
        .map(value => )
        
      api.itemsGet(country, language, adAccountId, itemIds, filters)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/processing_results/:processingResultId/item_issues?bookmark=[value]&pageSize=[value]&itemNumbers=[value]&itemValidationIssue=[value]&adAccountId=[value]
    * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
    */
  def itemsIssuesList(processingResultId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ItemsIssuesList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val itemNumbers = request.queryString.get("item_numbers")
        .map(_.toList)
        .map(_.map(value => value.toInt)
        
      val itemValidationIssue = request.getQueryString("item_validation_issue")
        .map(value => )
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/products/get_by_product_group_filters?bookmark=[value]&pageSize=[value]&adAccountId=[value]
    */
  def productsByProductGroupFilterList(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupPinsList200Response = {
      val catalogsListProductsByFilterRequest = request.body.asJson.map(_.as[CatalogsListProductsByFilterRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsListProductsByFilterRequest")
      }
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId)
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
