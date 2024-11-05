
package org.openapitools.client.model


case class GetBusinessAssetsResponse (
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    _assetType: Option[String],
    _assetGroupInfo: Option[AssetGroupBinding]
)
object GetBusinessAssetsResponse {
    def toStringBody(var_assetId: Object, var_assetType: Object, var_assetGroupInfo: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"assetType":$var_assetType,"assetGroupInfo":$var_assetGroupInfo
        | }
        """.stripMargin
}
