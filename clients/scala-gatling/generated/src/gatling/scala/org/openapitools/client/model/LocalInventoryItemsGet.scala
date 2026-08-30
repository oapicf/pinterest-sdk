
package org.openapitools.client.model


case class LocalInventoryItemsGet (
    /* Array of local inventory items */
    _items: List[LocalInventoryItemResponse]
)
object LocalInventoryItemsGet {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
