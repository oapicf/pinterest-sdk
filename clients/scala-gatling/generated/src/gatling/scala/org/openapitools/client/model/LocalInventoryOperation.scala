
package org.openapitools.client.model


case class LocalInventoryOperation (
    _attributes: RetailLocalInventoryItemAttributes,
    /* Catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String,
    /* Store code for the local inventory item */
    _storeCode: String
)
object LocalInventoryOperation {
    def toStringBody(var_attributes: Object, var_itemId: Object, var_operation: Object, var_storeCode: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"itemId":$var_itemId,"operation":$var_operation,"storeCode":$var_storeCode
        | }
        """.stripMargin
}
