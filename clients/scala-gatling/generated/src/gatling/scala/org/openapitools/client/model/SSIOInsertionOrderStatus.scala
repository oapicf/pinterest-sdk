
package org.openapitools.client.model


case class SSIOInsertionOrderStatus (
    /* Salesforce order id */
    _pinOrderId: Option[String],
    /* Salesforce insertion order status */
    _status: Option[String],
    /* Salesforce insertion order creation time */
    _creationTime: Option[String]
)
object SSIOInsertionOrderStatus {
    def toStringBody(var_pinOrderId: Object, var_status: Object, var_creationTime: Object) =
        s"""
        | {
        | "pinOrderId":$var_pinOrderId,"status":$var_status,"creationTime":$var_creationTime
        | }
        """.stripMargin
}
