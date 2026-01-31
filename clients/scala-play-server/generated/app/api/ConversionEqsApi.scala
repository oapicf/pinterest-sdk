package api

import play.api.libs.json._
import model.Error
import model.EventQualityScore
import model.IngestionSourceOptions
import model.LookbackPeriodOptions
import model.SourcePlatformOptions

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ConversionEqsApi {
  /**
    * Get event quality score (EQS)
    * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
    * @param lookbackPeriod Lookback window (number of days).
    * @param adAccountId Unique identifier of an ad account.
    * @param sourcePlatform Source platform of event.
    * @param ingestionSource Ingestion source of event.
    */
  def conversionEqsList(lookbackPeriod: LookbackPeriodOptions, adAccountId: String, sourcePlatform: Option[SourcePlatformOptions], ingestionSource: Option[IngestionSourceOptions]): List[EventQualityScore]
}
