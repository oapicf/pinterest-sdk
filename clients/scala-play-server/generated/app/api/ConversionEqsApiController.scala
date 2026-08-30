package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.EventQualityScore
import model.IngestionSourceOptions
import model.LookbackPeriodOptions
import model.SourcePlatformOptions

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class ConversionEqsApiController @Inject()(cc: ControllerComponents, api: ConversionEqsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/conversion_eqs?lookbackPeriod=[value]&sourcePlatform=[value]&ingestionSource=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionEqsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[EventQualityScore] = {
      val lookbackPeriod = request.getQueryString("lookback_period")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("lookback_period", "query string")
        }
        
      val sourcePlatform = request.getQueryString("source_platform")
        .map(value => )
        
      val ingestionSource = request.getQueryString("ingestion_source")
        .map(value => )
        
      api.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)
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
