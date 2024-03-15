package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AudienceDefinitionResponse
import model.AudienceInsightType
import model.AudienceInsightsResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class AudienceInsightsApiController @Inject()(cc: ControllerComponents, api: AudienceInsightsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/audience_insights?audienceInsightType=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def audienceInsightsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AudienceInsightsResponse = {
      val audienceInsightType = request.getQueryString("audience_insight_type")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audience_insight_type", "query string")
        }
        
      api.audienceInsightsGet(adAccountId, audienceInsightType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/insights/audiences
    * @param adAccountId Unique identifier of an ad account.
    */
  def audienceInsightsScopeAndTypeGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AudienceDefinitionResponse = {
      api.audienceInsightsScopeAndTypeGet(adAccountId)
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
