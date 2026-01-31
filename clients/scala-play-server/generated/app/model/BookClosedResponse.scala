package model

import play.api.libs.json._

/**
  * Creation fields
  * @param conversionMetricsReady Are conversion metrics ready?
  * @param nonConversionMetricsReady Are non-conversion metrics ready?
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BookClosedResponse(
  conversionMetricsReady: Option[Boolean],
  nonConversionMetricsReady: Option[Boolean]
)

object BookClosedResponse {
  implicit lazy val bookClosedResponseJsonFormat: Format[BookClosedResponse] = Json.format[BookClosedResponse]
}

