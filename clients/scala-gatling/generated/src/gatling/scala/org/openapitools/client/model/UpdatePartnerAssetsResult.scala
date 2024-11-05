
package org.openapitools.client.model


case class UpdatePartnerAssetsResult (
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    _assetType: Option[String],
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
