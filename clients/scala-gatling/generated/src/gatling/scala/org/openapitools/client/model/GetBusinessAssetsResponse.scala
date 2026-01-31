
package org.openapitools.client.model


case class GetBusinessAssetsResponse (
    _assetGroupInfo: Option[AssetGroupBinding],
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    _assetType: Option[String],
    _catalogInfo: Option[GetBusinessAssetsResponseCatalogInfo]
)
object GetBusinessAssetsResponse {
    def toStringBody(var_assetGroupInfo: Object, var_assetId: Object, var_assetType: Object, var_catalogInfo: Object) =
        s"""
        | {
        | "assetGroupInfo":$var_assetGroupInfo,"assetId":$var_assetId,"assetType":$var_assetType,"catalogInfo":$var_catalogInfo
        | }
        """.stripMargin
}
