
package org.openapitools.client.model


case class CatalogsRetailListProductsByCatalogBasedFilterRequest (
    /* Catalog id pertaining to the retail product group. */
    _catalogId: String,
    /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    _catalogType: String,
    _country: Country,
    _filters: CatalogsProductGroupFilters,
    _locale: CatalogsLocale
)
object CatalogsRetailListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_filters: Object, var_locale: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"filters":$var_filters,"locale":$var_locale
        | }
        """.stripMargin
}
