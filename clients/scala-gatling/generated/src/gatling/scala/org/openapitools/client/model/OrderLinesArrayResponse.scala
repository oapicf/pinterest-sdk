
package org.openapitools.client.model


case class OrderLinesArrayResponse (
    _items: Option[List[OrderLines]]
)
object OrderLinesArrayResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
