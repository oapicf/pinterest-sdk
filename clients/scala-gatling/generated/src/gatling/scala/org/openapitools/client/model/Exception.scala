
package org.openapitools.client.model


case class Exception (
    _code: Option[Integer],
    _message: String
)
object Exception {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
