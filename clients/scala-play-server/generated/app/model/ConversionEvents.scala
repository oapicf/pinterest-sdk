package model

import play.api.libs.json._

/**
  * A list of events (one or more) encapsulated by a data object.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class ConversionEvents(
  data: List[ConversionEventsDataInner]
)

object ConversionEvents {
  implicit lazy val conversionEventsJsonFormat: Format[ConversionEvents] = Json.format[ConversionEvents]
}

