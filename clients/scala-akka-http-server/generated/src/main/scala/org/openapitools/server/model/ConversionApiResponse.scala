package org.openapitools.server.model


/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 *
 * @param numEventsReceived Total number of events received in the request. for example: ''null''
 * @param numEventsProcessed Number of events that were successfully processed from the events. for example: ''null''
 * @param events Specific messages for each event received. The order will match the order in which the events were received in the request. for example: ''null''
*/
final case class ConversionApiResponse (
  numEventsReceived: Int,
  numEventsProcessed: Int,
  events: Seq[ConversionApiResponseEventsInner]
)

