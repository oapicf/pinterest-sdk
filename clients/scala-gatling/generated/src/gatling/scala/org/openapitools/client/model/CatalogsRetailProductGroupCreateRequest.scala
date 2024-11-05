
package org.openapitools.client.model


case class CatalogsRetailProductGroupCreateRequest (
    /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    _catalogType: String,
    _name: String,
    _description: Option[String],
    _filters: CatalogsProductGroupFiltersRequest,
    /* Catalog id pertaining to the retail product group. */
    _catalogId: String,
    _country: Country,
    _locale: CatalogsLocale
)
object CatalogsRetailProductGroupCreateRequest {
    def toStringBody(var_catalogType: Object, var_name: Object, var_description: Object, var_filters: Object, var_catalogId: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"name":$var_name,"description":$var_description,"filters":$var_filters,"catalogId":$var_catalogId,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
