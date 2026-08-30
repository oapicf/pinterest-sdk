
package org.openapitools.client.model


case class ConversionEvents (
    /* Specific messages for each event received. The order will match the order in which the events were received in the request. */
    _events: List[ConversionApiResponseEventsItems],
    /* Number of events that were successfully processed from the events. */
    _numEventsProcessed: Integer,
    /* Total number of events received in the request. */
    _numEventsReceived: Integer
)
object ConversionEvents {
    def toStringBody(var_events: Object, var_numEventsProcessed: Object, var_numEventsReceived: Object) =
        s"""
        | {
        | "events":$var_events,"numEventsProcessed":$var_numEventsProcessed,"numEventsReceived":$var_numEventsReceived
        | }
        """.stripMargin
}
