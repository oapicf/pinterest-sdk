
package org.openapitools.client.model


case class OrderLinesList200Response (
    _items: List[OrderLine],
    _bookmark: Option[String]
)
object OrderLinesList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
