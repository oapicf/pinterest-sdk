
package org.openapitools.client.model


case class Error (
    _code: Integer,
    _message: String
)
object Error {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
