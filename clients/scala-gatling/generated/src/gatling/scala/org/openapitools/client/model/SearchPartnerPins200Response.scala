
package org.openapitools.client.model


case class SearchPartnerPins200Response (
    _items: List[SummaryPin],
    _bookmark: Option[String]
)
object SearchPartnerPins200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
