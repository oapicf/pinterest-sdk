
package org.openapitools.client.model


case class NotificationResponse (
    /* error message when success is false */
    _errorMsg: Option[String],
    /* Received time. Unix timestamp in seconds. */
    _receivedAt: Option[Integer],
    /* Returns true if the notification accepted. */
    _success: Option[Boolean]
)
object NotificationResponse {
    def toStringBody(var_errorMsg: Object, var_receivedAt: Object, var_success: Object) =
        s"""
        | {
        | "errorMsg":$var_errorMsg,"receivedAt":$var_receivedAt,"success":$var_success
        | }
        """.stripMargin
}
