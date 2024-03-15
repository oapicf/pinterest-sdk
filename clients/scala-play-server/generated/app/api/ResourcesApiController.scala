package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccountsCountryResponse
import model.BookClosedResponse
import model.DeliveryMetricsResponse
import model.Error
import model.JsObject
import model.SingleInterestTargetingOptionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class ResourcesApiController @Inject()(cc: ControllerComponents, api: ResourcesApi) extends AbstractController(cc) {
  /**
    * GET /v5/resources/ad_account_countries
    */
  def adAccountCountriesGet(): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsCountryResponse = {
      api.adAccountCountriesGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/resources/delivery_metrics?reportType=[value]
    */
  def deliveryMetricsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): DeliveryMetricsResponse = {
      val reportType = request.getQueryString("report_type")
        
      api.deliveryMetricsGet(reportType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/resources/targeting/interests/:interestId
    * @param interestId Unique identifier of an interest.
    */
  def interestTargetingOptionsGet(interestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SingleInterestTargetingOptionResponse = {
      api.interestTargetingOptionsGet(interestId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/resources/lead_form_questions
    */
  def leadFormQuestionsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.leadFormQuestionsGet()
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/resources/metrics_ready_state?date=[value]
    */
  def metricsReadyStateGet(): Action[AnyContent] = Action { request =>
    def executeApi(): BookClosedResponse = {
      val date = request.getQueryString("date")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("date", "query string")
        }
        
      api.metricsReadyStateGet(date)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/resources/targeting/:targetingType?clientId=[value]&oauthSignature=[value]&timestamp=[value]
    * @param targetingType Public targeting type.
    */
  def targetingOptionsGet(targetingType: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[JsObject] = {
      val clientId = request.getQueryString("client_id")
        
      val oauthSignature = request.getQueryString("oauth_signature")
        
      val timestamp = request.getQueryString("timestamp")
        
      api.targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp)
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
