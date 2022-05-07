
package org.openapitools.client.model


case class CatalogsFeedValidationDetails (
    _errors: CatalogsFeedValidationErrors,
    _warnings: CatalogsFeedValidationWarnings
)
object CatalogsFeedValidationDetails {
    def toStringBody(var_errors: Object, var_warnings: Object) =
        s"""
        | {
        | "errors":$var_errors,"warnings":$var_warnings
        | }
        """.stripMargin
}
