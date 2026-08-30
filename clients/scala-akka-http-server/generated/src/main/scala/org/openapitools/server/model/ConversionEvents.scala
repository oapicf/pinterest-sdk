package org.openapitools.server.model


/**
 * Conversion events.
 *
 * @param events Specific messages for each event received. The order will match the order in which the events were received in the request. for example: ''null''
 * @param numEventsProcessed Number of events that were successfully processed from the events. for example: ''1''
 * @param numEventsReceived Total number of events received in the request. for example: ''1''
*/
final case class ConversionEvents (
  events: Seq[ConversionApiResponseEventsItems],
  numEventsProcessed: Int,
  numEventsReceived: Int
)

