
package org.openapitools.client.model


case class ConversionApiResponseEventsItems (
    /* Error message containing more information about why the event failed to be processed. */
    _errorMessage: Option[String],
    /* Whether the event was processed successfully. */
    _status: EventProcessingStatus,
    /* Warning messages about any fields in the event which are not standard. These are not critical to event processing. */
    _warningMessage: Option[String]
)
object ConversionApiResponseEventsItems {
    def toStringBody(var_errorMessage: Object, var_status: Object, var_warningMessage: Object) =
        s"""
        | {
        | "errorMessage":$var_errorMessage,"status":$var_status,"warningMessage":$var_warningMessage
        | }
        """.stripMargin
}
