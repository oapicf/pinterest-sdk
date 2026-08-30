
package org.openapitools.client.model


case class AssetGroupDeletionDelete (
    _assetGroupsToDelete: List[String]
)
object AssetGroupDeletionDelete {
    def toStringBody(var_assetGroupsToDelete: Object) =
        s"""
        | {
        | "assetGroupsToDelete":$var_assetGroupsToDelete
        | }
        """.stripMargin
}
