
package org.openapitools.client.model


case class AuthRespondInvitesBodyItem (
    _action: AuthRespondInviteAction,
    /* Unique identifier of an invite. */
    _inviteId: String
)
object AuthRespondInvitesBodyItem {
    def toStringBody(var_action: Object, var_inviteId: Object) =
        s"""
        | {
        | "action":$var_action,"inviteId":$var_inviteId
        | }
        """.stripMargin
}
