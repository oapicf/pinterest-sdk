package model

import play.api.libs.json._

/**
  * Schema for GET Conversion EQS response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

