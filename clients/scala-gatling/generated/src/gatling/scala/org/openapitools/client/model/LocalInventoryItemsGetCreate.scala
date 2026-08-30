
package org.openapitools.client.model


case class LocalInventoryItemsGetCreate (
    /* Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. */
    _itemFilters: List[ItemIdStoreCodePair]
)
object LocalInventoryItemsGetCreate {
    def toStringBody(var_itemFilters: Object) =
        s"""
        | {
        | "itemFilters":$var_itemFilters
        | }
        """.stripMargin
}
