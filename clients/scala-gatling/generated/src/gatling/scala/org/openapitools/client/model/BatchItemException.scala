
package org.openapitools.client.model


case class BatchItemException (
    _code: Option[Integer],
    _message: String
)
object BatchItemException {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
