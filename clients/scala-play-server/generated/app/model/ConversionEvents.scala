package model

import play.api.libs.json._

/**
  * Conversion events.
  * @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
  * @param numEventsProcessed Number of events that were successfully processed from the events.
  * @param numEventsReceived Total number of events received in the request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionEvents(
  events: List[ConversionApiResponseEventsItems],
  numEventsProcessed: Int,
  numEventsReceived: Int
)

object ConversionEvents {
  implicit lazy val conversionEventsJsonFormat: Format[ConversionEvents] = Json.format[ConversionEvents]
}

