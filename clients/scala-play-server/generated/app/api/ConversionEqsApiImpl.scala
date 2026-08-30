package api

import model.Error
import model.EventQualityScore
import model.IngestionSourceOptions
import model.LookbackPeriodOptions
import model.SourcePlatformOptions

/**
  * Provides a default implementation for [[ConversionEqsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ConversionEqsApiImpl extends ConversionEqsApi {
  /**
    * @inheritdoc
    */
  override def conversionEqsList(lookbackPeriod: LookbackPeriodOptions, adAccountId: String, sourcePlatform: Option[SourcePlatformOptions], ingestionSource: Option[IngestionSourceOptions]): List[EventQualityScore] = {
    // TODO: Implement better logic

    List.empty[EventQualityScore]
  }
}
