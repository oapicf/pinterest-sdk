
package org.openapitools.client.model


case class AssetGroupUpdateError (
    _assetGroupId: Option[String],
    _code: Option[Integer],
    _message: Option[String]
)
object AssetGroupUpdateError {
    def toStringBody(var_assetGroupId: Object, var_code: Object, var_message: Object) =
        s"""
        | {
        | "assetGroupId":$var_assetGroupId,"code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
