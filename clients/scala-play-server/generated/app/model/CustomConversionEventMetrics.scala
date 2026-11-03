package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomConversionEventMetrics.
  * @param customEventName Name of the advertiser-defined custom conversion event
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomConversionEventMetrics(
  customEventMetricsType: AdeColumnType,
  customEventName: String
)

object CustomConversionEventMetrics {
  implicit lazy val customConversionEventMetricsJsonFormat: Format[CustomConversionEventMetrics] = Json.format[CustomConversionEventMetrics]
}

