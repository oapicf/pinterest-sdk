package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdvancedAuctionItems
import model.AdvancedAuctionItemsGetRequest
import model.AdvancedAuctionItemsSubmitRequest
import model.AdvancedAuctionProcessedItems
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class AdvancedAuctionApiController @Inject()(cc: ControllerComponents, api: AdvancedAuctionApi) extends AbstractController(cc) {
  /**
    * POST /v5/advanced_auction/items/get?adAccountId=[value]
    */
  def advancedAuctionItemsGetPost(): Action[AnyContent] = Action { request =>
    def executeApi(): AdvancedAuctionItems = {
      val advancedAuctionItemsGetRequest = request.body.asJson.map(_.as[AdvancedAuctionItemsGetRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "advancedAuctionItemsGetRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/advanced_auction/items/submit?adAccountId=[value]
    */
  def advancedAuctionItemsSubmitPost(): Action[AnyContent] = Action { request =>
    def executeApi(): AdvancedAuctionProcessedItems = {
      val advancedAuctionItemsSubmitRequest = request.body.asJson.map(_.as[AdvancedAuctionItemsSubmitRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "advancedAuctionItemsSubmitRequest")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId)
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
