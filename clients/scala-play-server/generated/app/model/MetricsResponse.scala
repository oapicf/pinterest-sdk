package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MetricsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MetricsResponse(
  data: Option[List[MetricsResponseDataItems]]
)

object MetricsResponse {
  implicit lazy val metricsResponseJsonFormat: Format[MetricsResponse] = Json.format[MetricsResponse]
}

