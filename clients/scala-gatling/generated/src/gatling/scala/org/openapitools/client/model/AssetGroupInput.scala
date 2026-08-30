
package org.openapitools.client.model


case class AssetGroupInput (
    _assetGroup: Option[AssetGroupBinding]
)
object AssetGroupInput {
    def toStringBody(var_assetGroup: Object) =
        s"""
        | {
        | "assetGroup":$var_assetGroup
        | }
        """.stripMargin
}
