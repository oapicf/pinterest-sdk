
package org.openapitools.client.model


case class UpdateAssetGroupResponse (
    /* A list of successfully edited asset groups. */
    _updatedAssetGroups: Option[List[AssetGroupBinding]],
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    _exceptions: Option[List[UpdateAssetGroupResponseExceptionsInner]]
)
object UpdateAssetGroupResponse {
    def toStringBody(var_updatedAssetGroups: Object, var_exceptions: Object) =
        s"""
        | {
        | "updatedAssetGroups":$var_updatedAssetGroups,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
