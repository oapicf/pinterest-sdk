package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BookClosed.
  * @param conversionMetricsReady Are conversion metrics ready?
  * @param nonConversionMetricsReady Are non-conversion metrics ready?
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BookClosed(
  conversionMetricsReady: Boolean,
  nonConversionMetricsReady: Boolean
)

object BookClosed {
  implicit lazy val bookClosedJsonFormat: Format[BookClosed] = Json.format[BookClosed]
}

