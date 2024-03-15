
package org.openapitools.client.model


case class SSIOEditInsertionOrderResponse (
    /* Salesforce order id */
    _pinOrderId: Option[String]
)
object SSIOEditInsertionOrderResponse {
    def toStringBody(var_pinOrderId: Object) =
        s"""
        | {
        | "pinOrderId":$var_pinOrderId
        | }
        """.stripMargin
}
