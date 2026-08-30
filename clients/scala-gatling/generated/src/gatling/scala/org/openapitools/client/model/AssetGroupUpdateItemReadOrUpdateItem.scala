
package org.openapitools.client.model


case class AssetGroupUpdateItemReadOrUpdateItem (
    /* Unique identifier of the asset group to update. */
    _assetGroupId: String,
    /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    _assetGroupTypes: Option[List[AssetGroupType]],
    /* A list of asset ids to add to the asset group. */
    _assetsToAdd: Option[List[String]],
    /* A list of asset ids to remove from the asset group. */
    _assetsToRemove: Option[List[String]],
    /* Asset group description. */
    _description: Option[String],
    /* Asset Group name. */
    _name: Option[String]
)
object AssetGroupUpdateItemReadOrUpdateItem {
    def toStringBody(var_assetGroupId: Object, var_assetGroupTypes: Object, var_assetsToAdd: Object, var_assetsToRemove: Object, var_description: Object, var_name: Object) =
        s"""
        | {
        | "assetGroupId":$var_assetGroupId,"assetGroupTypes":$var_assetGroupTypes,"assetsToAdd":$var_assetsToAdd,"assetsToRemove":$var_assetsToRemove,"description":$var_description,"name":$var_name
        | }
        """.stripMargin
}
