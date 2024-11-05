
package org.openapitools.client.model


case class UpdateAssetGroupBody (
    /* A list of asset groups and the data that will be used to update them. */
    _assetGroupsToUpdate: Option[List[UpdateAssetGroupBodyAssetGroupsToUpdateInner]]
)
object UpdateAssetGroupBody {
    def toStringBody(var_assetGroupsToUpdate: Object) =
        s"""
        | {
        | "assetGroupsToUpdate":$var_assetGroupsToUpdate
        | }
        """.stripMargin
}
