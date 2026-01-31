
package org.openapitools.client.model


case class CatalogsVerticalsListProductsByCatalogBasedFilterRequest (
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String,
    _catalogType: String,
    _country: Country,
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    _locale: CatalogsLocale
)
object CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_filters: Object, var_locale: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"filters":$var_filters,"locale":$var_locale
        | }
        """.stripMargin
}
