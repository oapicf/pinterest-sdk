
package org.openapitools.client.model


case class CatalogsListProductsByFilterRequest (
    /* Catalog Feed id pertaining to the catalog product group filter. */
    _feedId: String,
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    _catalogType: String,
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String,
    _country: Country,
    _locale: CatalogsLocale
)
object CatalogsListProductsByFilterRequest {
    def toStringBody(var_feedId: Object, var_filters: Object, var_catalogType: Object, var_catalogId: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "feedId":$var_feedId,"filters":$var_filters,"catalogType":$var_catalogType,"catalogId":$var_catalogId,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
