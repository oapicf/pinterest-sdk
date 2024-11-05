
package org.openapitools.client.model


case class CreateAssetInvitesRequest (
    _invites: List[CreateAssetInvitesRequestItem]
)
object CreateAssetInvitesRequest {
    def toStringBody(var_invites: Object) =
        s"""
        | {
        | "invites":$var_invites
        | }
        """.stripMargin
}
