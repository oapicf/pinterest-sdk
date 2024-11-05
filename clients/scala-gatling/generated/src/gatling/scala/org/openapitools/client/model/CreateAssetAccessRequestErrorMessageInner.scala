
package org.openapitools.client.model


case class CreateAssetAccessRequestErrorMessageInner (
    /* Error code associated with the error in requesting asset access. */
    _code: Option[Integer],
    _messages: Option[List[String]]
)
object CreateAssetAccessRequestErrorMessageInner {
    def toStringBody(var_code: Object, var_messages: Object) =
        s"""
        | {
        | "code":$var_code,"messages":$var_messages
        | }
        """.stripMargin
}
