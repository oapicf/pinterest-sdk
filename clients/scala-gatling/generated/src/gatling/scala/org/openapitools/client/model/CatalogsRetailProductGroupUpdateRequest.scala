
package org.openapitools.client.model


case class CatalogsRetailProductGroupUpdateRequest (
    /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    _catalogType: Option[String],
    _country: Option[Country],
    _description: Option[String],
    _filters: Option[CatalogsProductGroupFiltersRequest],
    _locale: Option[CatalogsLocale],
    /* Name of catalog product group */
    _name: Option[String]
)
object CatalogsRetailProductGroupUpdateRequest {
    def toStringBody(var_catalogType: Object, var_country: Object, var_description: Object, var_filters: Object, var_locale: Object, var_name: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"country":$var_country,"description":$var_description,"filters":$var_filters,"locale":$var_locale,"name":$var_name
        | }
        """.stripMargin
}
