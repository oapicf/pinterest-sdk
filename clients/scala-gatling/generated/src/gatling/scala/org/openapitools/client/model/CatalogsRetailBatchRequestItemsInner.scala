
package org.openapitools.client.model


case class CatalogsRetailBatchRequestItemsInner (
    /* The catalog item id in the merchant namespace */
    _itemId: String,
    _operation: String,
    _attributes: ItemAttributesRequest,
    /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    _updateMask: Option[List[UpdateMaskFieldType]]
)
object CatalogsRetailBatchRequestItemsInner {
    def toStringBody(var_itemId: Object, var_operation: Object, var_attributes: Object, var_updateMask: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"operation":$var_operation,"attributes":$var_attributes,"updateMask":$var_updateMask
        | }
        """.stripMargin
}
