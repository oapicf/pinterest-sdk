package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdvertiserDefinedEventsResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ConversionsApiController @Inject()(cc: ControllerComponents, api: ConversionsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/advertiser_defined_events
    * @param adAccountId Unique identifier of an ad account.
    */
  def advertiserDefinedEventsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdvertiserDefinedEventsResponse = {
      api.advertiserDefinedEventsGet(adAccountId)
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
