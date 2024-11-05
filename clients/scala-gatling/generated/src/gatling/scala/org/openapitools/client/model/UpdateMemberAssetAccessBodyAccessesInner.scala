
package org.openapitools.client.model


case class UpdateMemberAssetAccessBodyAccessesInner (
    /* Id of the asset to update. */
    _assetId: String,
    /* Unique identifier of the member on which to perform the update */
    _memberId: String,
    /* A non-empty array of permissions to assign to the member. */
    _permissions: List[Permissions]
)
object UpdateMemberAssetAccessBodyAccessesInner {
    def toStringBody(var_assetId: Object, var_memberId: Object, var_permissions: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"memberId":$var_memberId,"permissions":$var_permissions
        | }
        """.stripMargin
}
