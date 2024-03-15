
package org.openapitools.client.model


case class CatalogsDeleteRetailItem (
    /* The catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String
)
object CatalogsDeleteRetailItem {
    def toStringBody(var_itemId: Object, var_operation: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"operation":$var_operation
        | }
        """.stripMargin
}
