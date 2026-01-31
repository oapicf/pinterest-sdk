
package org.openapitools.client.model


case class OrderLinesList200Response (
    _bookmark: Option[String],
    _items: List[OrderLine]
)
object OrderLinesList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
