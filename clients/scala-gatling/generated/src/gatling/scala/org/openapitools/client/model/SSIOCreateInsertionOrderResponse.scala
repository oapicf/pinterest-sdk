
package org.openapitools.client.model


case class SSIOCreateInsertionOrderResponse (
    /* Salesforce order id */
    _pinOrderId: Option[String]
)
object SSIOCreateInsertionOrderResponse {
    def toStringBody(var_pinOrderId: Object) =
        s"""
        | {
        | "pinOrderId":$var_pinOrderId
        | }
        """.stripMargin
}
