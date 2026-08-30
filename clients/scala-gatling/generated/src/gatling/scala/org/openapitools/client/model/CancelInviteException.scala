
package org.openapitools.client.model


case class CancelInviteException (
    _inviteId: Option[String],
    _message: Option[String]
)
object CancelInviteException {
    def toStringBody(var_inviteId: Object, var_message: Object) =
        s"""
        | {
        | "inviteId":$var_inviteId,"message":$var_message
        | }
        """.stripMargin
}
