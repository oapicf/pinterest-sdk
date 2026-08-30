package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomConversionEventMetrics.
  * @param customEventName Name of the advertiser-defined custom conversion event
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomConversionEventMetrics(
  customEventMetricsType: AdeColumnType,
  customEventName: String
)

object CustomConversionEventMetrics {
  implicit lazy val customConversionEventMetricsJsonFormat: Format[CustomConversionEventMetrics] = Json.format[CustomConversionEventMetrics]
}

