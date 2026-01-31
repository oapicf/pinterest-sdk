
package org.openapitools.client.model


case class CatalogsItemsRequest (
    _country: Country,
    _filters: CatalogsItemsPostFilters,
    /* We recommend using the CatalogsLocale values. */
    _language: String
)
object CatalogsItemsRequest {
    def toStringBody(var_country: Object, var_filters: Object, var_language: Object) =
        s"""
        | {
        | "country":$var_country,"filters":$var_filters,"language":$var_language
        | }
        """.stripMargin
}
