
package org.openapitools.client.model


case class CatalogsRetailBatchRequestItemsItems (
    _attributes: ItemAttributesRequest,
    /* The catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String,
    /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    _updateMask: Option[List[UpdateMaskFieldType]],
    /* The millisecond timestamp when the item was lastly modified by the merchant. */
    _lastUpdatedTime: Option[Long]
)
object CatalogsRetailBatchRequestItemsItems {
    def toStringBody(var_attributes: Object, var_itemId: Object, var_operation: Object, var_updateMask: Object, var_lastUpdatedTime: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"itemId":$var_itemId,"operation":$var_operation,"updateMask":$var_updateMask,"lastUpdatedTime":$var_lastUpdatedTime
        | }
        """.stripMargin
}
