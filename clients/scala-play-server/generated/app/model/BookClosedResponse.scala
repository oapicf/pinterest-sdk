package model

import play.api.libs.json._

/**
  * Creation fields
  * @param conversionMetricsReady Are conversion metrics ready?
  * @param nonConversionMetricsReady Are non-conversion metrics ready?
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BookClosedResponse(
  conversionMetricsReady: Option[Boolean],
  nonConversionMetricsReady: Option[Boolean]
)

object BookClosedResponse {
  implicit lazy val bookClosedResponseJsonFormat: Format[BookClosedResponse] = Json.format[BookClosedResponse]
}

