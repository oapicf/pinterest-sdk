
package org.openapitools.client.model


case class NotificationResponse (
    /* Returns true if the notification accepted. */
    _success: Option[Boolean],
    /* Received time. Unix timestamp in seconds. */
    _receivedAt: Option[Integer],
    /* error message when success is false */
    _errorMsg: Option[String]
)
object NotificationResponse {
    def toStringBody(var_success: Object, var_receivedAt: Object, var_errorMsg: Object) =
        s"""
        | {
        | "success":$var_success,"receivedAt":$var_receivedAt,"errorMsg":$var_errorMsg
        | }
        """.stripMargin
}
