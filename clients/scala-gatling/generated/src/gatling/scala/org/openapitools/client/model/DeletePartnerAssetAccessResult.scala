
package org.openapitools.client.model


case class DeletePartnerAssetAccessResult (
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    _assetType: Option[String],
    /* If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. */
    _isSharedPartner: Option[Boolean],
    /* Unique identifier of a business partner. */
    _partnerId: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object DeletePartnerAssetAccessResult {
    def toStringBody(var_assetId: Object, var_assetType: Object, var_isSharedPartner: Object, var_partnerId: Object, var_permissions: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"assetType":$var_assetType,"isSharedPartner":$var_isSharedPartner,"partnerId":$var_partnerId,"permissions":$var_permissions
        | }
        """.stripMargin
}
