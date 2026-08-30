package model

import play.api.libs.json._

/**
  * Schema for GET Conversion EQS response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EventQualityScore(
  ingestionSource: IngestionSourceOptions,
  lookbackPeriod: LookbackPeriodOptions,
  overallStatus: OverallStatusOptions,
  qualityComponents: QualityComponents,
  sourcePlatform: SourcePlatformOptions
)

object EventQualityScore {
  implicit lazy val eventQualityScoreJsonFormat: Format[EventQualityScore] = Json.format[EventQualityScore]
}

