
package org.openapitools.client.model


case class DeleteAssetGroupResponseExceptionsInner (
    /* Error code associated with the error deleting asset group. */
    _code: Option[Integer],
    /* Error message associated with the error deleting asset group. */
    _message: Option[String],
    /* Asset group id of the exception. */
    _assetGroupId: Option[String]
)
object DeleteAssetGroupResponseExceptionsInner {
    def toStringBody(var_code: Object, var_message: Object, var_assetGroupId: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message,"assetGroupId":$var_assetGroupId
        | }
        """.stripMargin
}
