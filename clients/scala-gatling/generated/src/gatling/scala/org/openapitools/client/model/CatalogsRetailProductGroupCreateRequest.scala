
package org.openapitools.client.model


case class CatalogsRetailProductGroupCreateRequest (
    /* Catalog id pertaining to the retail product group. */
    _catalogId: String,
    /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    _catalogType: String,
    _country: Option[Country],
    _description: Option[String],
    _filters: CatalogsProductGroupFiltersRequest,
    _locale: Option[CatalogsLocale],
    _name: String
)
object CatalogsRetailProductGroupCreateRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_description: Object, var_filters: Object, var_locale: Object, var_name: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"description":$var_description,"filters":$var_filters,"locale":$var_locale,"name":$var_name
        | }
        """.stripMargin
}
