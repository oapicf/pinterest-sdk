
package org.openapitools.client.model


case class UpdatePartnerAssetAccessBodyAccessesInner (
    /* Unique identifier of the business asset. */
    _assetId: String,
    /* Unique identifier of a business partner to update asset access to. */
    _partnerId: String,
    /* A non-empty array of permissions to assign to the partner. */
    _permissions: List[Permissions]
)
object UpdatePartnerAssetAccessBodyAccessesInner {
    def toStringBody(var_assetId: Object, var_partnerId: Object, var_permissions: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"partnerId":$var_partnerId,"permissions":$var_permissions
        | }
        """.stripMargin
}
