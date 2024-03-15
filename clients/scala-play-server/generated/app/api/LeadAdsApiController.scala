package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccountCreateSubscriptionRequest
import model.AdAccountCreateSubscriptionResponse
import model.AdAccountGetSubscriptionResponse
import model.AdAccountsSubscriptionsGetList200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class LeadAdsApiController @Inject()(cc: ControllerComponents, api: LeadAdsApi) extends AbstractController(cc) {
  /**
    * DELETE /v5/ad_accounts/:adAccountId/leads/subscriptions/:subscriptionId
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.adAccountsSubscriptionsDelById(adAccountId, subscriptionId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/leads/subscriptions/:subscriptionId
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountGetSubscriptionResponse = {
      api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/leads/subscriptions?pageSize=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountsSubscriptionsGetList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsSubscriptionsGetList200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/leads/subscriptions
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountsSubscriptionsPost(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountCreateSubscriptionResponse = {
      val adAccountCreateSubscriptionRequest = request.body.asJson.map(_.as[AdAccountCreateSubscriptionRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adAccountCreateSubscriptionRequest")
      }
      api.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest)
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
