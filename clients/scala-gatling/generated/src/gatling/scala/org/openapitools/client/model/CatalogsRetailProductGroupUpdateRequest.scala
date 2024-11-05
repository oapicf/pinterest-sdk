
package org.openapitools.client.model


case class CatalogsRetailProductGroupUpdateRequest (
    /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    _catalogType: Option[String],
    _name: Option[String],
    _description: Option[String],
    _filters: Option[CatalogsProductGroupFiltersRequest],
    _country: Option[Country],
    _locale: Option[CatalogsLocale]
)
object CatalogsRetailProductGroupUpdateRequest {
    def toStringBody(var_catalogType: Object, var_name: Object, var_description: Object, var_filters: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"name":$var_name,"description":$var_description,"filters":$var_filters,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
