
package org.openapitools.client.model


case class CatalogsFeedIngestionDetails (
    _errors: CatalogsFeedIngestionErrors,
    _info: CatalogsFeedIngestionInfo
)
object CatalogsFeedIngestionDetails {
    def toStringBody(var_errors: Object, var_info: Object) =
        s"""
        | {
        | "errors":$var_errors,"info":$var_info
        | }
        """.stripMargin
}
