
package org.openapitools.client.model


case class SSIOInsertionOrderStatusResponse (
    /* Salesforce insertion order creation time */
    _creationTime: Option[String],
    /* Salesforce order id */
    _pinOrderId: Option[String],
    /* Salesforce insertion order status */
    _status: Option[String]
)
object SSIOInsertionOrderStatusResponse {
    def toStringBody(var_creationTime: Object, var_pinOrderId: Object, var_status: Object) =
        s"""
        | {
        | "creationTime":$var_creationTime,"pinOrderId":$var_pinOrderId,"status":$var_status
        | }
        """.stripMargin
}
