
package org.openapitools.client.model


case class ItemsPost200Response (
    _items: List[ItemResponse]
)
object ItemsPost200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
