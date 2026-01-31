
package org.openapitools.client.model


case class PromotionsResponse (
    _promotions: Option[List[PromotionArrayElement]]
)
object PromotionsResponse {
    def toStringBody(var_promotions: Object) =
        s"""
        | {
        | "promotions":$var_promotions
        | }
        """.stripMargin
}
