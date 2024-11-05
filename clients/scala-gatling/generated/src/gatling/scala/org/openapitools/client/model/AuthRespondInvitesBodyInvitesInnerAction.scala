
package org.openapitools.client.model


case class AuthRespondInvitesBodyInvitesInnerAction (
    /* Whether the invite/request is accepted. */
    _acceptInvite: Boolean,
    /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
    _assetIdToPermissions: Option[Map[String, List[Permissions]]]
)
object AuthRespondInvitesBodyInvitesInnerAction {
    def toStringBody(var_acceptInvite: Object, var_assetIdToPermissions: Object) =
        s"""
        | {
        | "acceptInvite":$var_acceptInvite,"assetIdToPermissions":$var_assetIdToPermissions
        | }
        """.stripMargin
}
