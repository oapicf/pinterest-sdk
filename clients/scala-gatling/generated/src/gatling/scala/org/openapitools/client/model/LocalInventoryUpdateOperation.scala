
package org.openapitools.client.model


case class LocalInventoryUpdateOperation (
    _attributes: RetailLocalInventoryItemAttributesOptional,
    /* Catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String,
    /* Store code for the local inventory item */
    _storeCode: String
)
object LocalInventoryUpdateOperation {
    def toStringBody(var_attributes: Object, var_itemId: Object, var_operation: Object, var_storeCode: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"itemId":$var_itemId,"operation":$var_operation,"storeCode":$var_storeCode
        | }
        """.stripMargin
}
