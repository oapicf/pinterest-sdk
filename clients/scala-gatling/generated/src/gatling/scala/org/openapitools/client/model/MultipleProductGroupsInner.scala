
package org.openapitools.client.model


case class MultipleProductGroupsInner (
    _description: Option[String],
    /* Catalog Feed id pertaining to the catalog product group. */
    _feedId: String,
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _name: String,
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String,
    _catalogType: String,
    _country: Option[Country],
    _locale: Option[CatalogsLocale]
)
object MultipleProductGroupsInner {
    def toStringBody(var_description: Object, var_feedId: Object, var_filters: Object, var_isFeatured: Object, var_name: Object, var_catalogId: Object, var_catalogType: Object, var_country: Object, var_locale: Object) =
        s"""
        | {
        | "description":$var_description,"feedId":$var_feedId,"filters":$var_filters,"isFeatured":$var_isFeatured,"name":$var_name,"catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"locale":$var_locale
        | }
        """.stripMargin
}
