
package org.openapitools.client.model


case class AssetIdPermissions (
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    _assetType: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]],
    _assetGroupInfo: Option[AssetGroupBinding]
)
object AssetIdPermissions {
    def toStringBody(var_assetId: Object, var_assetType: Object, var_permissions: Object, var_assetGroupInfo: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"assetType":$var_assetType,"permissions":$var_permissions,"assetGroupInfo":$var_assetGroupInfo
        | }
        """.stripMargin
}
