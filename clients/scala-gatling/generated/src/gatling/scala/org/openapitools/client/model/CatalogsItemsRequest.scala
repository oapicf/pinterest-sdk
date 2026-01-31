
package org.openapitools.client.model


case class CatalogsItemsRequest (
    _country: Country,
    /* We recommend using the CatalogsLocale values. */
    _language: String,
    _filters: CatalogsItemsPostFilters
)
object CatalogsItemsRequest {
    def toStringBody(var_country: Object, var_language: Object, var_filters: Object) =
        s"""
        | {
        | "country":$var_country,"language":$var_language,"filters":$var_filters
        | }
        """.stripMargin
}
