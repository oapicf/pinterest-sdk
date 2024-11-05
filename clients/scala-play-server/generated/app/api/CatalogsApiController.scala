package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Catalog
import model.CatalogsCreateReportResponse
import model.CatalogsCreateRequest
import model.CatalogsFeed
import model.CatalogsFeedIngestion
import model.CatalogsItemValidationIssue
import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsFilters
import model.CatalogsItemsRequest
import model.CatalogsList200Response
import model.CatalogsListProductsByFilterRequest
import model.CatalogsProductGroupPinsList200Response
import model.CatalogsProductGroupProductCountsVertical
import model.CatalogsProductGroupsList200Response
import model.CatalogsProductGroupsUpdateRequest
import model.CatalogsReport
import model.CatalogsReportParameters
import model.CatalogsVerticalProductGroup
import model.Error
import model.FeedProcessingResultsList200Response
import model.FeedsCreateRequest
import model.FeedsList200Response
import model.FeedsUpdateRequest
import model.ItemsBatchPostRequest
import model.ItemsIssuesList200Response
import model.MultipleProductGroupsInner
import model.ReportsStats200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class CatalogsApiController @Inject()(cc: ControllerComponents, api: CatalogsApi) extends AbstractController(cc) {
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

  /**
    * GET /v5/catalogs/product_groups/:productGroupId/products?bookmark=[value]&pageSize=[value]&adAccountId=[value]&pinMetrics=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupPinsList(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupPinsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      api.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId, pinMetrics)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/product_groups?adAccountId=[value]
    */
  def catalogsProductGroupsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsVerticalProductGroup = {
      val multipleProductGroupsInner = request.body.asJson.map(_.as[MultipleProductGroupsInner]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "multipleProductGroupsInner")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsCreate(multipleProductGroupsInner, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/product_groups/multiple?adAccountId=[value]
    */
  def catalogsProductGroupsCreateMany(): Action[AnyContent] = Action { request =>
    def executeApi(): List[String] = {
      val multipleProductGroupsInner = request.body.asJson.map(_.as[List[MultipleProductGroupsInner]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "multipleProductGroupsInner")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsCreateMany(multipleProductGroupsInner, adAccountId)
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
    * DELETE /v5/catalogs/product_groups/multiple?id=[value]&adAccountId=[value]
    */
  def catalogsProductGroupsDeleteMany(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val id = request.getQueryString("id")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("id", "query string")
        }
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsDeleteMany(id, adAccountId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/catalogs/product_groups/:productGroupId?adAccountId=[value]
    * @param productGroupId Unique identifier of a product group
    */
  def catalogsProductGroupsGet(productGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsVerticalProductGroup = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsGet(productGroupId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/product_groups?id=[value]&feedId=[value]&catalogId=[value]&bookmark=[value]&pageSize=[value]&adAccountId=[value]
    */
  def catalogsProductGroupsList(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsProductGroupsList200Response = {
      val id = request.getQueryString("id")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toInt)
        
      val feedId = request.getQueryString("feed_id")
        
      val catalogId = request.getQueryString("catalog_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.catalogsProductGroupsList(id, feedId, catalogId, bookmark, pageSize, adAccountId)
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
    def executeApi(): CatalogsProductGroupProductCountsVertical = {
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
    def executeApi(): CatalogsVerticalProductGroup = {
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
    * POST /v5/catalogs/feeds/:feedId/ingest?adAccountId=[value]
    * @param feedId Unique identifier of a feed
    */
  def feedsIngest(feedId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsFeedIngestion = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.feedsIngest(feedId, adAccountId)
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
    * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
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
    * POST /v5/catalogs/items?adAccountId=[value]
    */
  def itemsPost(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsItems = {
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

  /**
    * POST /v5/catalogs/products/get_by_product_group_filters?bookmark=[value]&pageSize=[value]&adAccountId=[value]&pinMetrics=[value]
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
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/catalogs/reports?adAccountId=[value]
    */
  def reportsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsCreateReportResponse = {
      val catalogsReportParameters = request.body.asJson.map(_.as[CatalogsReportParameters]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsReportParameters")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.reportsCreate(catalogsReportParameters, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/reports?adAccountId=[value]&token=[value]
    */
  def reportsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsReport = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      api.reportsGet(token, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/reports/stats?adAccountId=[value]&pageSize=[value]&bookmark=[value]&parameters=[value]
    */
  def reportsStats(): Action[AnyContent] = Action { request =>
    def executeApi(): ReportsStats200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      val parameters = request.getQueryString("parameters")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("parameters", "query string")
        }
        
      api.reportsStats(parameters, adAccountId, pageSize, bookmark)
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
