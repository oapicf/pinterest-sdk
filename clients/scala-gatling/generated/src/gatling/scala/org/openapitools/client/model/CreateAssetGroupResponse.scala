
package org.openapitools.client.model


case class CreateAssetGroupResponse (
    _assetGroup: Option[AssetGroupBinding]
)
object CreateAssetGroupResponse {
    def toStringBody(var_assetGroup: Object) =
        s"""
        | {
        | "assetGroup":$var_assetGroup
        | }
        """.stripMargin
}
