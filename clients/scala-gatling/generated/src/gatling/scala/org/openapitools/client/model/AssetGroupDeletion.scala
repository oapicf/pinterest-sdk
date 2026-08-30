
package org.openapitools.client.model


case class AssetGroupDeletion (
    _deletedAssetGroups: Option[List[String]],
    _exceptions: Option[List[AssetGroupDeleteError]]
)
object AssetGroupDeletion {
    def toStringBody(var_deletedAssetGroups: Object, var_exceptions: Object) =
        s"""
        | {
        | "deletedAssetGroups":$var_deletedAssetGroups,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
