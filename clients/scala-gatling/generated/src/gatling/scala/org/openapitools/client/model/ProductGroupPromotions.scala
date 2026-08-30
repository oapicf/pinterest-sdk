
package org.openapitools.client.model


case class ProductGroupPromotions (
    /* Response-only: created or updated product group promotions, or exceptions. */
    _items: Option[List[ProductGroupPromotionResponseItem]]
)
object ProductGroupPromotions {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
