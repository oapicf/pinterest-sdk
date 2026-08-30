
package org.openapitools.client.model


case class BusinessAssets (
    /* An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. */
    _assetGroupInfo: Option[AssetGroupBinding],
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    _assetType: Option[AssetTypeResponse],
    /* Permission levels the requesting business has on an asset. */
    _permissions: Option[List[String]],
    /* An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'. */
    _catalogInfo: Option[CatalogBinding]
)
object BusinessAssets {
    def toStringBody(var_assetGroupInfo: Object, var_assetId: Object, var_assetType: Object, var_permissions: Object, var_catalogInfo: Object) =
        s"""
        | {
        | "assetGroupInfo":$var_assetGroupInfo,"assetId":$var_assetId,"assetType":$var_assetType,"permissions":$var_permissions,"catalogInfo":$var_catalogInfo
        | }
        """.stripMargin
}
