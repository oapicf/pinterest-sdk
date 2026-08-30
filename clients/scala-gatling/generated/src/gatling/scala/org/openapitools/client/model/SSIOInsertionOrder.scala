
package org.openapitools.client.model


case class SSIOInsertionOrder (
    /* Salesforce order id */
    _pinOrderId: Option[String]
)
object SSIOInsertionOrder {
    def toStringBody(var_pinOrderId: Object) =
        s"""
        | {
        | "pinOrderId":$var_pinOrderId
        | }
        """.stripMargin
}
