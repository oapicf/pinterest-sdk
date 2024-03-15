
package org.openapitools.client.model


case class ProductGroupPromotionsList200Response (
    _items: List[ProductGroupPromotionResponseItem],
    _bookmark: Option[String]
)
object ProductGroupPromotionsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
