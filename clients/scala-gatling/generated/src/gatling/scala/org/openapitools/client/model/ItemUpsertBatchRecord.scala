
package org.openapitools.client.model


case class ItemUpsertBatchRecord (
    _attributes: Option[ItemAttributesRequest],
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String]
)
object ItemUpsertBatchRecord {
    def toStringBody(var_attributes: Object, var_itemId: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"itemId":$var_itemId
        | }
        """.stripMargin
}
