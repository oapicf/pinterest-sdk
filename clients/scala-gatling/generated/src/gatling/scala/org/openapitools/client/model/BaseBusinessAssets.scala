
package org.openapitools.client.model


case class BaseBusinessAssets (
    /* An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. */
    _assetGroupInfo: Option[AssetGroupBinding],
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    _assetType: Option[AssetTypeResponse],
    /* Permission levels the requesting business has on an asset. */
    _permissions: Option[List[String]]
)
object BaseBusinessAssets {
    def toStringBody(var_assetGroupInfo: Object, var_assetId: Object, var_assetType: Object, var_permissions: Object) =
        s"""
        | {
        | "assetGroupInfo":$var_assetGroupInfo,"assetId":$var_assetId,"assetType":$var_assetType,"permissions":$var_permissions
        | }
        """.stripMargin
}
