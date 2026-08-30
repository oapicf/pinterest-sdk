
package org.openapitools.client.model


case class CancelInvitesRequest (
    /* A list of invite/request ids to cancel. */
    _inviteIds: List[String]
)
object CancelInvitesRequest {
    def toStringBody(var_inviteIds: Object) =
        s"""
        | {
        | "inviteIds":$var_inviteIds
        | }
        """.stripMargin
}
