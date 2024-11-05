
package org.openapitools.client.model


case class DeleteAssetGroupBody (
    /* List of ids of asset groups to be deleted */
    _assetGroupsToDelete: List[String]
)
object DeleteAssetGroupBody {
    def toStringBody(var_assetGroupsToDelete: Object) =
        s"""
        | {
        | "assetGroupsToDelete":$var_assetGroupsToDelete
        | }
        """.stripMargin
}
