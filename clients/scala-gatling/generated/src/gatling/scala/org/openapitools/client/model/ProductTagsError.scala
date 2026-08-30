
package org.openapitools.client.model


case class ProductTagsError (
    _code: Integer,
    /* Details about which product tags failed eligibility check. */
    _details: Option[IneligibleProductTagsErrorDetails],
    _message: String
)
object ProductTagsError {
    def toStringBody(var_code: Object, var_details: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"details":$var_details,"message":$var_message
        | }
        """.stripMargin
}
