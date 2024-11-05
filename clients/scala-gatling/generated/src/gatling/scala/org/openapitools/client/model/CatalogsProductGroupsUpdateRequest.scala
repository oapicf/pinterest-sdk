
package org.openapitools.client.model


case class CatalogsProductGroupsUpdateRequest (
    _name: Option[String],
    _description: Option[String],
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _filters: Option[CatalogsCreativeAssetsProductGroupFilters],
    _catalogType: Option[String],
    _country: Option[Country],
    _locale: Option[CatalogsLocale]
)
object CatalogsProductGroupsUpdateRequest {
    def toStringBody(var_name: Object, var_description: Object, var_isFeatured: Object, var_filters: Object, var_catalogType: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"isFeatured":$var_isFeatured,"filters":$var_filters,"catalogType":$var_catalogType,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
