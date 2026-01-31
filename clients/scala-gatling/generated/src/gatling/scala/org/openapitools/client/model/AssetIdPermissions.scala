
package org.openapitools.client.model


case class AssetIdPermissions (
    _assetGroupInfo: Option[AssetGroupBinding],
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    _assetType: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object AssetIdPermissions {
    def toStringBody(var_assetGroupInfo: Object, var_assetId: Object, var_assetType: Object, var_permissions: Object) =
        s"""
        | {
        | "assetGroupInfo":$var_assetGroupInfo,"assetId":$var_assetId,"assetType":$var_assetType,"permissions":$var_permissions
        | }
        """.stripMargin
}
