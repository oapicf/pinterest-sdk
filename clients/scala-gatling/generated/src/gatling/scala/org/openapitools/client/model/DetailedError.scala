
package org.openapitools.client.model


case class DetailedError (
    _code: Integer,
    _message: String,
    _details: Any
)
object DetailedError {
    def toStringBody(var_code: Object, var_message: Object, var_details: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message,"details":$var_details
        | }
        """.stripMargin
}
