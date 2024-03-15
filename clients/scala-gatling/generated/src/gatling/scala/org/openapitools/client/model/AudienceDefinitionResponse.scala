
package org.openapitools.client.model


case class AudienceDefinitionResponse (
    _items: Option[List[AudienceDefinition]]
)
object AudienceDefinitionResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
