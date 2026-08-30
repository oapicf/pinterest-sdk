
package org.openapitools.client.model


case class CancelInviteResultItem (
    _exception: Option[CancelInviteException],
    _invite: Option[CancelInviteResult]
)
object CancelInviteResultItem {
    def toStringBody(var_exception: Object, var_invite: Object) =
        s"""
        | {
        | "exception":$var_exception,"invite":$var_invite
        | }
        """.stripMargin
}
