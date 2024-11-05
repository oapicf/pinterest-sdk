
package org.openapitools.client.model


case class AuthRespondInvitesBody (
    _invites: List[AuthRespondInvitesBodyInvitesInner]
)
object AuthRespondInvitesBody {
    def toStringBody(var_invites: Object) =
        s"""
        | {
        | "invites":$var_invites
        | }
        """.stripMargin
}
