package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccountsSubscriptionsGetList200Response
import model.Error
import model.LeadSubscription
import model.LeadSubscriptionPostParamsCreate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class LeadAdsApiController @Inject()(cc: ControllerComponents, api: LeadAdsApi) extends AbstractController(cc) {
  /**
    * DELETE /v5/ad_accounts/:adAccountId/leads/subscriptions/:subscriptionId
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadSubscription = {
      api.adAccountsSubscriptionsDelById(adAccountId, subscriptionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/leads/subscriptions/:subscriptionId
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadSubscription = {
      api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/leads/subscriptions?bookmark=[value]&pageSize=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountsSubscriptionsGetList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsSubscriptionsGetList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize)
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
    def executeApi(): LeadSubscription = {
      val leadSubscriptionPostParamsCreate = request.body.asJson.map(_.as[LeadSubscriptionPostParamsCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadSubscriptionPostParamsCreate")
      }
      api.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate)
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
