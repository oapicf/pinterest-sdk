
package org.openapitools.client.model


case class CatalogsDeleteRetailItem (
    /* The catalog item id in the merchant namespace */
    _itemId: String,
    /* The millisecond timestamp when the item was lastly modified by the merchant. */
    _lastUpdatedTime: Option[Long],
    _operation: String
)
object CatalogsDeleteRetailItem {
    def toStringBody(var_itemId: Object, var_lastUpdatedTime: Object, var_operation: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"lastUpdatedTime":$var_lastUpdatedTime,"operation":$var_operation
        | }
        """.stripMargin
}
