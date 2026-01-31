
package org.openapitools.client.model


case class DetailedError (
    _code: Integer,
    _details: Any,
    _message: String
)
object DetailedError {
    def toStringBody(var_code: Object, var_details: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"details":$var_details,"message":$var_message
        | }
        """.stripMargin
}
