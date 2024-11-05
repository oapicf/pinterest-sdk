
package org.openapitools.client.model


case class CatalogsVerticalsListProductsByCatalogBasedFilterRequest (
    _catalogType: String,
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String,
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    _country: Country,
    _locale: CatalogsLocale
)
object CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogType: Object, var_catalogId: Object, var_filters: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"catalogId":$var_catalogId,"filters":$var_filters,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
