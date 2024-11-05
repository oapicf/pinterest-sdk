
package org.openapitools.client.model


case class GetPartnerAssetsResponse (
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    _assetType: Option[String],
    /* The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. */
    _permissions: Option[List[String]],
    _assetGroupInfo: Option[AssetGroupBinding]
)
object GetPartnerAssetsResponse {
    def toStringBody(var_assetId: Object, var_assetType: Object, var_permissions: Object, var_assetGroupInfo: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"assetType":$var_assetType,"permissions":$var_permissions,"assetGroupInfo":$var_assetGroupInfo
        | }
        """.stripMargin
}
