
package org.openapitools.client.model


case class GetPartnerAssetsResponse (
    _assetGroupInfo: Option[AssetGroupBinding],
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    _assetType: Option[String],
    /* The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. */
    _permissions: Option[List[String]]
)
object GetPartnerAssetsResponse {
    def toStringBody(var_assetGroupInfo: Object, var_assetId: Object, var_assetType: Object, var_permissions: Object) =
        s"""
        | {
        | "assetGroupInfo":$var_assetGroupInfo,"assetId":$var_assetId,"assetType":$var_assetType,"permissions":$var_permissions
        | }
        """.stripMargin
}
