
package org.openapitools.client.model


case class CatalogsCreateRetailItem (
    _attributes: ItemAttributesRequest,
    /* The catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String
)
object CatalogsCreateRetailItem {
    def toStringBody(var_attributes: Object, var_itemId: Object, var_operation: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"itemId":$var_itemId,"operation":$var_operation
        | }
        """.stripMargin
}
