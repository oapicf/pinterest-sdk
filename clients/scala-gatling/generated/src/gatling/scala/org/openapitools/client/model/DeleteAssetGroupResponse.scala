
package org.openapitools.client.model


case class DeleteAssetGroupResponse (
    /* A list of ids of successfully deleted asset groups. */
    _deletedAssetGroups: Option[List[String]],
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    _exceptions: Option[List[DeleteAssetGroupResponseExceptionsInner]]
)
object DeleteAssetGroupResponse {
    def toStringBody(var_deletedAssetGroups: Object, var_exceptions: Object) =
        s"""
        | {
        | "deletedAssetGroups":$var_deletedAssetGroups,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
