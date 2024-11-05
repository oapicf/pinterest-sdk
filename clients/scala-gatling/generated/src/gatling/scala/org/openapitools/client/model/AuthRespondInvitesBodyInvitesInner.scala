
package org.openapitools.client.model


case class AuthRespondInvitesBodyInvitesInner (
    _action: AuthRespondInvitesBodyInvitesInnerAction,
    /* Unique identifier of an invite. */
    _inviteId: String
)
object AuthRespondInvitesBodyInvitesInner {
    def toStringBody(var_action: Object, var_inviteId: Object) =
        s"""
        | {
        | "action":$var_action,"inviteId":$var_inviteId
        | }
        """.stripMargin
}
