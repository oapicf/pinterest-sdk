
package org.openapitools.client.model


case class ItemIdStoreCodePair (
    /* Catalog item id in the merchant namespace */
    _itemId: String,
    /* Store code for the local inventory item */
    _storeCode: String
)
object ItemIdStoreCodePair {
    def toStringBody(var_itemId: Object, var_storeCode: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"storeCode":$var_storeCode
        | }
        """.stripMargin
}
