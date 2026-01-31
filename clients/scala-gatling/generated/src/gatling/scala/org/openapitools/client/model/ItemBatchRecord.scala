
package org.openapitools.client.model


case class ItemBatchRecord (
    _attributes: Option[ItemAttributesRequest],
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    _updateMask: Option[List[UpdateMaskFieldType]]
)
object ItemBatchRecord {
    def toStringBody(var_attributes: Object, var_itemId: Object, var_updateMask: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"itemId":$var_itemId,"updateMask":$var_updateMask
        | }
        """.stripMargin
}
