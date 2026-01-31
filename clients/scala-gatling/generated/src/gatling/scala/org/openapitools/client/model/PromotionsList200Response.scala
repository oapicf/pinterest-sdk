
package org.openapitools.client.model


case class PromotionsList200Response (
    _bookmark: Option[String],
    _items: List[PromotionResponse]
)
object PromotionsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
