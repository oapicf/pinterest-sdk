
package org.openapitools.client.model


case class ItemDeleteBatchRecord (
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String]
)
object ItemDeleteBatchRecord {
    def toStringBody(var_itemId: Object) =
        s"""
        | {
        | "itemId":$var_itemId
        | }
        """.stripMargin
}
