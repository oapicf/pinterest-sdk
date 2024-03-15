
package org.openapitools.client.model


case class ConversionApiResponse (
    /* Total number of events received in the request. */
    _numEventsReceived: Integer,
    /* Number of events that were successfully processed from the events. */
    _numEventsProcessed: Integer,
    /* Specific messages for each event received. The order will match the order in which the events were received in the request. */
    _events: List[ConversionApiResponseEventsInner]
)
object ConversionApiResponse {
    def toStringBody(var_numEventsReceived: Object, var_numEventsProcessed: Object, var_events: Object) =
        s"""
        | {
        | "numEventsReceived":$var_numEventsReceived,"numEventsProcessed":$var_numEventsProcessed,"events":$var_events
        | }
        """.stripMargin
}
