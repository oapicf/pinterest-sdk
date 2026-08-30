
package org.openapitools.client.model


case class OrderLineMutationResult (
    /* Error list if update(s) fail. */
    _errors: Option[List[OrderLineMutationError]],
    /* Order Line object array. */
    _orderLine: Option[List[OrderLine]]
)
object OrderLineMutationResult {
    def toStringBody(var_errors: Object, var_orderLine: Object) =
        s"""
        | {
        | "errors":$var_errors,"orderLine":$var_orderLine
        | }
        """.stripMargin
}
