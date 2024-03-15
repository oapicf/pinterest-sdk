
package org.openapitools.client.model


case class OrderLineResponse (
    /* Error list if update(s) fail. */
    _errors: Option[List[OrderLineError]],
    /* Order Line object array. */
    _orderLine: Option[List[OrderLine]]
)
object OrderLineResponse {
    def toStringBody(var_errors: Object, var_orderLine: Object) =
        s"""
        | {
        | "errors":$var_errors,"orderLine":$var_orderLine
        | }
        """.stripMargin
}
