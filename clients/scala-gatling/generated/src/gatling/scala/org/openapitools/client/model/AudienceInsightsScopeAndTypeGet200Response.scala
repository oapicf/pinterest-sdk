
package org.openapitools.client.model


case class AudienceInsightsScopeAndTypeGet200Response (
    _items: List[AudienceDefinition]
)
object AudienceInsightsScopeAndTypeGet200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
