
package org.openapitools.client.model


case class CatalogsListProductsByFilterRequest (
    /* Catalog Feed id pertaining to the catalog product group filter. */
    _feedId: String,
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    /* Catalog ID pertaining to the product group. */
    _catalogId: String,
    _catalogType: String,
    _country: Country,
    _locale: CatalogsLocale
)
object CatalogsListProductsByFilterRequest {
    def toStringBody(var_feedId: Object, var_filters: Object, var_catalogId: Object, var_catalogType: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "feedId":$var_feedId,"filters":$var_filters,"catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
