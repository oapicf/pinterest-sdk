package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CatalogsFeed
import model.CatalogsFeedIngestion
import model.CatalogsItemValidationIssue
import model.Error
import model.FeedProcessingResultsList200Response
import model.FeedsCreateRequest
import model.FeedsList200Response
import model.FeedsUpdateRequest
import model.ItemsIssuesList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class CatalogFeedsApiController @Inject()(cc: ControllerComponents, api: CatalogFeedsApi) extends AbstractController(cc) {
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
