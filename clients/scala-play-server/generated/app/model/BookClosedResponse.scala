package model

import play.api.libs.json._

/**
  * Creation fields
  * @param conversionMetricsReady Are conversion metrics ready?
  * @param nonConversionMetricsReady Are non-conversion metrics ready?
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BookClosedResponse(
  conversionMetricsReady: Option[Boolean],
  nonConversionMetricsReady: Option[Boolean]
)

object BookClosedResponse {
  implicit lazy val bookClosedResponseJsonFormat: Format[BookClosedResponse] = Json.format[BookClosedResponse]
}

