
package org.openapitools.client.model


case class ErrorDetail (
    /* Number of records with this error */
    _count: Integer,
    /* Numeric error code */
    _errorCode: Integer,
    /* Error message description */
    _message: String
)
object ErrorDetail {
    def toStringBody(var_count: Object, var_errorCode: Object, var_message: Object) =
        s"""
        | {
        | "count":$var_count,"errorCode":$var_errorCode,"message":$var_message
        | }
        """.stripMargin
}
