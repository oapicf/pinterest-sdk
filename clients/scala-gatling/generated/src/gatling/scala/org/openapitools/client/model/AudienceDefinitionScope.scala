
package org.openapitools.client.model


case class AudienceDefinitionScope (
    _scope: Option[String]
)
object AudienceDefinitionScope {
    def toStringBody(var_scope: Object) =
        s"""
        | {
        | "scope":$var_scope
        | }
        """.stripMargin
}
