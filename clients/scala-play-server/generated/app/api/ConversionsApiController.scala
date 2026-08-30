package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdvertiserDefinedEventsCreate200Response
import model.AdvertiserDefinedEventsCreateRequest
import model.AdvertiserDefinedEventsGet200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class ConversionsApiController @Inject()(cc: ControllerComponents, api: ConversionsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/advertiser_defined_events
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdvertiserDefinedEventsCreate200Response = {
      val advertiserDefinedEventsCreateRequest = request.body.asJson.map(_.as[AdvertiserDefinedEventsCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "advertiserDefinedEventsCreateRequest")
      }
      api.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/ad_accounts/:adAccountId/advertiser_defined_events?eventNames=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsDelete(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdvertiserDefinedEventsCreate200Response = {
      val eventNames = request.getQueryString("event_names")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("event_names", "query string")
        }
        
      api.advertiserDefinedEventsDelete(adAccountId, eventNames)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/advertiser_defined_events
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdvertiserDefinedEventsGet200Response = {
      api.advertiserDefinedEventsGet(adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/advertiser_defined_events
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdvertiserDefinedEventsCreate200Response = {
      val advertiserDefinedEventsCreateRequest = request.body.asJson.map(_.as[AdvertiserDefinedEventsCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "advertiserDefinedEventsCreateRequest")
      }
      api.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)
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
