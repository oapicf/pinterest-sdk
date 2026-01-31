package api

import model.Error
import model.EventQualityScore
import model.IngestionSourceOptions
import model.LookbackPeriodOptions
import model.SourcePlatformOptions

/**
  * Provides a default implementation for [[ConversionEqsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ConversionEqsApiImpl extends ConversionEqsApi {
  /**
    * @inheritdoc
    */
  override def conversionEqsList(lookbackPeriod: LookbackPeriodOptions, adAccountId: String, sourcePlatform: Option[SourcePlatformOptions], ingestionSource: Option[IngestionSourceOptions]): List[EventQualityScore] = {
    // TODO: Implement better logic

    List.empty[EventQualityScore]
  }
}
