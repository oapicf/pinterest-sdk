
package org.openapitools.client.model


case class UpdatePartnerAssetAccessBodyAccessesInner (
    /* Unique identifier of a business partner to update asset access to. */
    _partnerId: String,
    /* Unique identifier of the business asset. */
    _assetId: String,
    /* A non-empty array of permissions to assign to the partner. */
    _permissions: List[Permissions]
)
object UpdatePartnerAssetAccessBodyAccessesInner {
    def toStringBody(var_partnerId: Object, var_assetId: Object, var_permissions: Object) =
        s"""
        | {
        | "partnerId":$var_partnerId,"assetId":$var_assetId,"permissions":$var_permissions
        | }
        """.stripMargin
}
