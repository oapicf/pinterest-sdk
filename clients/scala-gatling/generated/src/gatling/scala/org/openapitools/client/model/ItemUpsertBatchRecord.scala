
package org.openapitools.client.model


case class ItemUpsertBatchRecord (
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    _attributes: Option[ItemAttributesRequest]
)
object ItemUpsertBatchRecord {
    def toStringBody(var_itemId: Object, var_attributes: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"attributes":$var_attributes
        | }
        """.stripMargin
}
