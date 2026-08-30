
package org.openapitools.client.model


case class UpdatePartnerAssetsResult (
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    _assetType: Option[AssetTypeResponse],
    /* Unique identifier of a business partner. */
    _partnerId: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object UpdatePartnerAssetsResult {
    def toStringBody(var_assetId: Object, var_assetType: Object, var_partnerId: Object, var_permissions: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"assetType":$var_assetType,"partnerId":$var_partnerId,"permissions":$var_permissions
        | }
        """.stripMargin
}
