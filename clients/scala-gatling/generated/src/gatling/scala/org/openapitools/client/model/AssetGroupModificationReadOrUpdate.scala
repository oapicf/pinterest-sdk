
package org.openapitools.client.model


case class AssetGroupModificationReadOrUpdate (
    /* A list of asset groups and the data that will be used to update them. */
    _assetGroupsToUpdate: Option[List[AssetGroupUpdateItemReadOrUpdateItem]],
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    _exceptions: Option[List[AssetGroupUpdateError]],
    /* A list of successfully edited asset groups. */
    _updatedAssetGroups: Option[List[AssetGroupBinding]]
)
object AssetGroupModificationReadOrUpdate {
    def toStringBody(var_assetGroupsToUpdate: Object, var_exceptions: Object, var_updatedAssetGroups: Object) =
        s"""
        | {
        | "assetGroupsToUpdate":$var_assetGroupsToUpdate,"exceptions":$var_exceptions,"updatedAssetGroups":$var_updatedAssetGroups
        | }
        """.stripMargin
}
