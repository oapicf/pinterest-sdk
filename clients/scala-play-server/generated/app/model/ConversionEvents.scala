package model

import play.api.libs.json._

/**
  * A list of events (one or more) encapsulated by a data object.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionEvents(
  data: List[ConversionEventsDataInner]
)

object ConversionEvents {
  implicit lazy val conversionEventsJsonFormat: Format[ConversionEvents] = Json.format[ConversionEvents]
}

