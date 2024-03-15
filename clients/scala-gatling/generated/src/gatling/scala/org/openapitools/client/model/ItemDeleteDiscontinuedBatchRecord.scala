
package org.openapitools.client.model


case class ItemDeleteDiscontinuedBatchRecord (
    /* The catalog item id in the merchant namespace */
    _itemId: Option[String]
)
object ItemDeleteDiscontinuedBatchRecord {
    def toStringBody(var_itemId: Object) =
        s"""
        | {
        | "itemId":$var_itemId
        | }
        """.stripMargin
}
