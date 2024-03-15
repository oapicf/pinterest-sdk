
package org.openapitools.client.model


case class IntegrationsGetList200Response (
    _items: List[IntegrationRecord],
    _bookmark: Option[String]
)
object IntegrationsGetList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
