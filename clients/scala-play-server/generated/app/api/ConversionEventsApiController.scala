package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionApiResponse
import model.ConversionEvents
import model.DetailedError
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class ConversionEventsApiController @Inject()(cc: ControllerComponents, api: ConversionEventsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/events?test=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def eventsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionApiResponse = {
      val conversionEvents = request.body.asJson.map(_.as[ConversionEvents]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "conversionEvents")
      }
      val test = request.getQueryString("test")
        .map(value => value.toBoolean)
        
      api.eventsCreate(adAccountId, conversionEvents, test)
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
