
package org.openapitools.client.model


case class ItemBatchRecord (
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String],
    _attributes: Option[ItemAttributes]
)
object ItemBatchRecord {
    def toStringBody(var_itemId: Object, var_attributes: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"attributes":$var_attributes
        | }
        """.stripMargin
}
