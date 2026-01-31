
package org.openapitools.client.model


case class AudienceDefinitionType (
    _scope: Option[String]
)
object AudienceDefinitionType {
    def toStringBody(var_scope: Object) =
        s"""
        | {
        | "scope":$var_scope
        | }
        """.stripMargin
}
