
package org.openapitools.client.model


case class CreateAssetInvitesRequestItem (
    /* Unique identifier of an invite. */
    _inviteId: String,
    _inviteType: InviteType,
    /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
    _assetIdToPermissions: Map[String, List[Permissions]]
)
object CreateAssetInvitesRequestItem {
    def toStringBody(var_inviteId: Object, var_inviteType: Object, var_assetIdToPermissions: Object) =
        s"""
        | {
        | "inviteId":$var_inviteId,"inviteType":$var_inviteType,"assetIdToPermissions":$var_assetIdToPermissions
        | }
        """.stripMargin
}
