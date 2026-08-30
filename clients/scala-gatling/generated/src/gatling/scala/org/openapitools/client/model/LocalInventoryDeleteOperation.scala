
package org.openapitools.client.model


case class LocalInventoryDeleteOperation (
    /* Catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String,
    /* Store code for the local inventory item */
    _storeCode: String
)
object LocalInventoryDeleteOperation {
    def toStringBody(var_itemId: Object, var_operation: Object, var_storeCode: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"operation":$var_operation,"storeCode":$var_storeCode
        | }
        """.stripMargin
}
