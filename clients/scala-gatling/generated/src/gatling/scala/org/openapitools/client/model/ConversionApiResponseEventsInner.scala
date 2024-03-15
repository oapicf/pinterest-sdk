
package org.openapitools.client.model


case class ConversionApiResponseEventsInner (
    /* Whether the event was processed successfully. */
    _status: String,
    /* Error message containing more information about why the event failed to be processed. */
    _errorMessage: Option[String],
    /* Warning messages about any fields in the event which are not standard. These are not critical to event processing. */
    _warningMessage: Option[String]
)
object ConversionApiResponseEventsInner {
    def toStringBody(var_status: Object, var_errorMessage: Object, var_warningMessage: Object) =
        s"""
        | {
        | "status":$var_status,"errorMessage":$var_errorMessage,"warningMessage":$var_warningMessage
        | }
        """.stripMargin
}
