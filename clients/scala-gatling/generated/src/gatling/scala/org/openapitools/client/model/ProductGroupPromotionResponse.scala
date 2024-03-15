
package org.openapitools.client.model


case class ProductGroupPromotionResponse (
    _items: Option[List[ProductGroupPromotionResponseItem]]
)
object ProductGroupPromotionResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
