
package org.openapitools.client.model


case class AssetGroupModification (
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    _exceptions: Option[List[AssetGroupUpdateError]],
    /* A list of successfully edited asset groups. */
    _updatedAssetGroups: Option[List[AssetGroupBinding]]
)
object AssetGroupModification {
    def toStringBody(var_exceptions: Object, var_updatedAssetGroups: Object) =
        s"""
        | {
        | "exceptions":$var_exceptions,"updatedAssetGroups":$var_updatedAssetGroups
        | }
        """.stripMargin
}
