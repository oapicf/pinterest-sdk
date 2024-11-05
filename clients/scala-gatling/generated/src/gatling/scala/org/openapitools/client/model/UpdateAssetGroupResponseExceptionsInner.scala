
package org.openapitools.client.model


case class UpdateAssetGroupResponseExceptionsInner (
    /* Error code associated with the error editing asset group. */
    _code: Option[Integer],
    /* Error message associated with the error editing asset group. */
    _message: Option[String],
    /* Asset group id of the exception. */
    _assetGroupId: Option[String]
)
object UpdateAssetGroupResponseExceptionsInner {
    def toStringBody(var_code: Object, var_message: Object, var_assetGroupId: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message,"assetGroupId":$var_assetGroupId
        | }
        """.stripMargin
}
