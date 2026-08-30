
package org.openapitools.client.model


case class AmazonConnectResponse (
    /* Amazon connect response message */
    _message: Option[String]
)
object AmazonConnectResponse {
    def toStringBody(var_message: Object) =
        s"""
        | {
        | "message":$var_message
        | }
        """.stripMargin
}
