package model

import play.api.libs.json._

/**
  * Conversion events.
  * @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
  * @param numEventsProcessed Number of events that were successfully processed from the events.
  * @param numEventsReceived Total number of events received in the request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionEvents(
  events: List[ConversionApiResponseEventsItems],
  numEventsProcessed: Int,
  numEventsReceived: Int
)

object ConversionEvents {
  implicit lazy val conversionEventsJsonFormat: Format[ConversionEvents] = Json.format[ConversionEvents]
}

