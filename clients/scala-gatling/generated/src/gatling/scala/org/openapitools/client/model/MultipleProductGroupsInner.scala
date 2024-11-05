
package org.openapitools.client.model


case class MultipleProductGroupsInner (
    _name: String,
    _description: Option[String],
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    /* Catalog Feed id pertaining to the catalog product group. */
    _feedId: String,
    _catalogType: String,
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String,
    _country: Country,
    _locale: CatalogsLocale
)
object MultipleProductGroupsInner {
    def toStringBody(var_name: Object, var_description: Object, var_isFeatured: Object, var_filters: Object, var_feedId: Object, var_catalogType: Object, var_catalogId: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"isFeatured":$var_isFeatured,"filters":$var_filters,"feedId":$var_feedId,"catalogType":$var_catalogType,"catalogId":$var_catalogId,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
