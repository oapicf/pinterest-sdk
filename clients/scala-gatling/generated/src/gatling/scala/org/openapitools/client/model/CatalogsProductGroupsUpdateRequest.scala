
package org.openapitools.client.model


case class CatalogsProductGroupsUpdateRequest (
    _description: Option[String],
    _filters: Option[CatalogsCreativeAssetsProductGroupFilters],
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _name: Option[String],
    _catalogType: Option[String],
    _country: Option[Country],
    _locale: Option[CatalogsLocale]
)
object CatalogsProductGroupsUpdateRequest {
    def toStringBody(var_description: Object, var_filters: Object, var_isFeatured: Object, var_name: Object, var_catalogType: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "description":$var_description,"filters":$var_filters,"isFeatured":$var_isFeatured,"name":$var_name,"catalogType":$var_catalogType,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
