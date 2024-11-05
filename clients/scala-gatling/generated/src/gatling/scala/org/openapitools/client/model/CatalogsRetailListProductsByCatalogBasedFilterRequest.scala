
package org.openapitools.client.model


case class CatalogsRetailListProductsByCatalogBasedFilterRequest (
    /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    _catalogType: String,
    /* Catalog id pertaining to the retail product group. */
    _catalogId: String,
    _filters: CatalogsProductGroupFilters,
    _country: Country,
    _locale: CatalogsLocale
)
object CatalogsRetailListProductsByCatalogBasedFilterRequest {
    def toStringBody(var_catalogType: Object, var_catalogId: Object, var_filters: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"catalogId":$var_catalogId,"filters":$var_filters,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
