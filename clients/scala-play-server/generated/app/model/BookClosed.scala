package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BookClosed.
  * @param conversionMetricsReady Are conversion metrics ready?
  * @param nonConversionMetricsReady Are non-conversion metrics ready?
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BookClosed(
  conversionMetricsReady: Boolean,
  nonConversionMetricsReady: Boolean
)

object BookClosed {
  implicit lazy val bookClosedJsonFormat: Format[BookClosed] = Json.format[BookClosed]
}

