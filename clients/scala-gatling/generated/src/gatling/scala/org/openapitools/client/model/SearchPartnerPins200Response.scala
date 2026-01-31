
package org.openapitools.client.model


case class SearchPartnerPins200Response (
    _bookmark: Option[String],
    _items: List[SummaryPin]
)
object SearchPartnerPins200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
