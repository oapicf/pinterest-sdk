
package org.openapitools.client.model


case class Exception (
    /* Exception error code. */
    _code: Option[Integer],
    /* Exception message. */
    _message: Option[String]
)
object Exception {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
