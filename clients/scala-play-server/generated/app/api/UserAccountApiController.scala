package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Account
import model.AnalyticsMetricsResponse
import model.Error
import java.time.LocalDate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
@Singleton
class UserAccountApiController @Inject()(cc: ControllerComponents, api: UserAccountApi) extends AbstractController(cc) {
  /**
    * GET /v5/user_account/analytics?startDate=[value]&endDate=[value]&fromClaimedContent=[value]&pinFormat=[value]&appTypes=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]
    */
  def userAccountAnalytics(): Action[AnyContent] = Action { request =>
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
      val fromClaimedContent = request.getQueryString("from_claimed_content")
        
      val pinFormat = request.getQueryString("pin_format")
        
      val appTypes = request.getQueryString("app_types")
        
      val metricTypes = request.getQueryString("metric_types")
        .map(values => splitCollectionParam(values, "csv"))
      val splitField = request.getQueryString("split_field")
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/user_account?adAccountId=[value]
    */
  def userAccountGet(): Action[AnyContent] = Action { request =>
    def executeApi(): Account = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.userAccountGet(adAccountId)
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
