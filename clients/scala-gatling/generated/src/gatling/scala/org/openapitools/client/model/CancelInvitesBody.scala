
package org.openapitools.client.model


case class CancelInvitesBody (
    /* List of invite/request ids to be cancelled */
    _inviteIds: List[String]
)
object CancelInvitesBody {
    def toStringBody(var_inviteIds: Object) =
        s"""
        | {
        | "inviteIds":$var_inviteIds
        | }
        """.stripMargin
}
