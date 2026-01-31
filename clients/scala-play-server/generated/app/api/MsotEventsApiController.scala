package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionMSOTEvents
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class MsotEventsApiController @Inject()(cc: ControllerComponents, api: MsotEventsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/msot/events
    * @param adAccountId Unique identifier of an ad account.
    */
  def msotEventsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val conversionMSOTEvents = request.body.asJson.map(_.as[ConversionMSOTEvents]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "conversionMSOTEvents")
      }
      api.msotEventsCreate(adAccountId, conversionMSOTEvents)
    }

    executeApi()
    Ok
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
