
package org.openapitools.client.model


case class DeleteAssetGroupResponseExceptionsInner (
    /* Asset group id of the exception. */
    _assetGroupId: Option[String],
    /* Error code associated with the error deleting asset group. */
    _code: Option[Integer],
    /* Error message associated with the error deleting asset group. */
    _message: Option[String]
)
object DeleteAssetGroupResponseExceptionsInner {
    def toStringBody(var_assetGroupId: Object, var_code: Object, var_message: Object) =
        s"""
        | {
        | "assetGroupId":$var_assetGroupId,"code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
