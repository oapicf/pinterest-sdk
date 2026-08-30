
package org.openapitools.client.model


case class CatalogsVerticalProductGroupCreateRequest (
    /* Catalog ID pertaining to the product group. */
    _catalogId: String,
    _catalogType: String,
    _country: Option[Country],
    _description: Option[String],
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    _locale: Option[CatalogsLocale],
    _name: String
)
object CatalogsVerticalProductGroupCreateRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_description: Object, var_filters: Object, var_locale: Object, var_name: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"description":$var_description,"filters":$var_filters,"locale":$var_locale,"name":$var_name
        | }
        """.stripMargin
}
