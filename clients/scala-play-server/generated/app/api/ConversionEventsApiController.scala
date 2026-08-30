package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionEvents
import model.ConversionEventsCreate
import model.DetailedError
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class ConversionEventsApiController @Inject()(cc: ControllerComponents, api: ConversionEventsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/events?test=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def eventsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionEvents = {
      val conversionEventsCreate = request.body.asJson.map(_.as[ConversionEventsCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "conversionEventsCreate")
      }
      val test = request.getQueryString("test")
        .map(value => value.toBoolean)
        
      api.eventsCreate(adAccountId, conversionEventsCreate, test)
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
