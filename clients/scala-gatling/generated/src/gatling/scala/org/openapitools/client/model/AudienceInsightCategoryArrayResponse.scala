
package org.openapitools.client.model


case class AudienceInsightCategoryArrayResponse (
    _items: Option[List[AudienceInsightCategoryCommon]]
)
object AudienceInsightCategoryArrayResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
