package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AnalyticsMetricsResponse
import model.Error
import java.time.LocalDate
import model.Pin

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
@Singleton
class PinsApiController @Inject()(cc: ControllerComponents, api: PinsApi) extends AbstractController(cc) {
  /**
    * GET /v5/pins/:pinId/analytics?startDate=[value]&endDate=[value]&appTypes=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]
    * @param pinId Unique identifier of a Pin.
    */
  def pinsAnalytics(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Map[String, AnalyticsMetricsResponse] = {
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_date", "query string")
        }
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("end_date", "query string")
        }
      val appTypes = request.getQueryString("app_types")
        
      val metricTypes = request.getQueryString("metric_types")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("metric_types", "query string")
        }
      val splitField = request.getQueryString("split_field")
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/pins
    */
  def pinsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): Pin = {
      val pin = request.body.asJson.map(_.as[Pin]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "pin")
      }
      api.pinsCreate(pin)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/pins/:pinId
    * @param pinId Unique identifier of a Pin.
    */
  def pinsDelete(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.pinsDelete(pinId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/pins/:pinId?adAccountId=[value]
    * @param pinId Unique identifier of a Pin.
    */
  def pinsGet(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Pin = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.pinsGet(pinId, adAccountId)
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
