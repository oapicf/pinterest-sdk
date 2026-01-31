package model

import play.api.libs.json._

/**
  * Schema describing the object in the response, which contains information about the events that were received and processed.
  * @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
  * @param numEventsProcessed Number of events that were successfully processed from the events.
  * @param numEventsReceived Total number of events received in the request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionApiResponse(
  events: List[ConversionApiResponseEventsInner],
  numEventsProcessed: Int,
  numEventsReceived: Int
)

object ConversionApiResponse {
  implicit lazy val conversionApiResponseJsonFormat: Format[ConversionApiResponse] = Json.format[ConversionApiResponse]
}

