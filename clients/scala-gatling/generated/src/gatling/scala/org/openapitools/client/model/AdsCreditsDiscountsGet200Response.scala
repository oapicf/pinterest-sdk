
package org.openapitools.client.model


case class AdsCreditsDiscountsGet200Response (
    _bookmark: Option[String],
    _items: List[AdsCreditDiscountsResponse]
)
object AdsCreditsDiscountsGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
