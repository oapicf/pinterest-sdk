
package org.openapitools.client.model


case class AdsCreditsDiscountsGet200Response (
    _items: List[AdsCreditDiscountsResponse],
    _bookmark: Option[String]
)
object AdsCreditsDiscountsGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
