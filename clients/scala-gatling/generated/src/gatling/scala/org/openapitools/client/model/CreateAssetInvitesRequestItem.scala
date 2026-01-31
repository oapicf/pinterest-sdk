
package org.openapitools.client.model


case class CreateAssetInvitesRequestItem (
    /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
    _assetIdToPermissions: Map[String, List[Permissions]],
    /* Unique identifier of an invite. */
    _inviteId: String,
    _inviteType: InviteType
)
object CreateAssetInvitesRequestItem {
    def toStringBody(var_assetIdToPermissions: Object, var_inviteId: Object, var_inviteType: Object) =
        s"""
        | {
        | "assetIdToPermissions":$var_assetIdToPermissions,"inviteId":$var_inviteId,"inviteType":$var_inviteType
        | }
        """.stripMargin
}
