
package org.openapitools.client.model


case class UpdateAssetGroupResponse (
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    _exceptions: Option[List[UpdateAssetGroupResponseExceptionsInner]],
    /* A list of successfully edited asset groups. */
    _updatedAssetGroups: Option[List[AssetGroupBinding]]
)
object UpdateAssetGroupResponse {
    def toStringBody(var_exceptions: Object, var_updatedAssetGroups: Object) =
        s"""
        | {
        | "exceptions":$var_exceptions,"updatedAssetGroups":$var_updatedAssetGroups
        | }
        """.stripMargin
}
