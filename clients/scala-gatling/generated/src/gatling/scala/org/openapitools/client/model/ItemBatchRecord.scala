
package org.openapitools.client.model


case class ItemBatchRecord (
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    _attributes: Option[ItemAttributesRequest],
    /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    _updateMask: Option[List[UpdateMaskFieldType]]
)
object ItemBatchRecord {
    def toStringBody(var_itemId: Object, var_attributes: Object, var_updateMask: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"attributes":$var_attributes,"updateMask":$var_updateMask
        | }
        """.stripMargin
}
