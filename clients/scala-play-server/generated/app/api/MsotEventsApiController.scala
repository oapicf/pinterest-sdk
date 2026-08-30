package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionMSOTEventsCreate
import model.Error
import model.JsObject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class MsotEventsApiController @Inject()(cc: ControllerComponents, api: MsotEventsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/msot/events
    * @param adAccountId Unique identifier of an ad account.
    */
  def msotEventsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val conversionMSOTEventsCreate = request.body.asJson.map(_.as[ConversionMSOTEventsCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "conversionMSOTEventsCreate")
      }
      api.msotEventsCreate(adAccountId, conversionMSOTEventsCreate)
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
