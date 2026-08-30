
package org.openapitools.client.model


case class AdBatchWriteResponseModel (
    _items: List[AdBatchItem]
)
object AdBatchWriteResponseModel {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
