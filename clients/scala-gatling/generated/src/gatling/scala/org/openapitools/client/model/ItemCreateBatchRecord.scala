
package org.openapitools.client.model


case class ItemCreateBatchRecord (
    _attributes: Option[ItemAttributesRequest],
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String]
)
object ItemCreateBatchRecord {
    def toStringBody(var_attributes: Object, var_itemId: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"itemId":$var_itemId
        | }
        """.stripMargin
}
