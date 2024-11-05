
package org.openapitools.client.model


case class AdvancedAuctionOperationError (
    /* The error code for the item bid option operation validation error */
    _code: Option[Integer],
    /* Message describing the item bid option operation validation error */
    _message: Option[String]
)
object AdvancedAuctionOperationError {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
