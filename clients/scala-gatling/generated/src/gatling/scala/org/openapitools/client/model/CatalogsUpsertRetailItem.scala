
package org.openapitools.client.model


case class CatalogsUpsertRetailItem (
    /* The catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String,
    _attributes: ItemAttributes
)
object CatalogsUpsertRetailItem {
    def toStringBody(var_itemId: Object, var_operation: Object, var_attributes: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"operation":$var_operation,"attributes":$var_attributes
        | }
        """.stripMargin
}
