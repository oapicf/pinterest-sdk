
package org.openapitools.client.model


case class AssetIdPermissions (
    /* An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. */
    _assetGroupInfo: Option[AssetGroupBinding],
    /* Unique identifier of a business asset. */
    _assetId: String,
    _assetType: AssetTypeResponse,
    /* Permission levels member or partner has on an asset. */
    _permissions: List[String]
)
object AssetIdPermissions {
    def toStringBody(var_assetGroupInfo: Object, var_assetId: Object, var_assetType: Object, var_permissions: Object) =
        s"""
        | {
        | "assetGroupInfo":$var_assetGroupInfo,"assetId":$var_assetId,"assetType":$var_assetType,"permissions":$var_permissions
        | }
        """.stripMargin
}
