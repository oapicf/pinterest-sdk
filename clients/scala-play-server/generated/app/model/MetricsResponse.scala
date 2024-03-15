package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MetricsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MetricsResponse(
  data: Option[List[JsObject]]
)

object MetricsResponse {
  implicit lazy val metricsResponseJsonFormat: Format[MetricsResponse] = Json.format[MetricsResponse]
}

