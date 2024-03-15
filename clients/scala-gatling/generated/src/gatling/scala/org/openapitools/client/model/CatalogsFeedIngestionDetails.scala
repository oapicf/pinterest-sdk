
package org.openapitools.client.model


case class CatalogsFeedIngestionDetails (
    _errors: CatalogsFeedIngestionErrors,
    _info: CatalogsFeedIngestionInfo,
    _warnings: CatalogsFeedIngestionWarnings
)
object CatalogsFeedIngestionDetails {
    def toStringBody(var_errors: Object, var_info: Object, var_warnings: Object) =
        s"""
        | {
        | "errors":$var_errors,"info":$var_info,"warnings":$var_warnings
        | }
        """.stripMargin
}
