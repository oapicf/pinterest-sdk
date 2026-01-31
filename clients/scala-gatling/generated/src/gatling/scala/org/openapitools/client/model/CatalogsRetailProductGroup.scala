
package org.openapitools.client.model


case class CatalogsRetailProductGroup (
    /* Catalog id pertaining to the retail product group. */
    _catalogId: String,
    _catalogType: String,
    _country: Option[String],
    /* Unix timestamp in seconds of when catalog product group was created. */
    _createdAt: Option[Integer],
    _description: Option[String],
    /* id of the catalogs feed belonging to this catalog product group */
    _feedId: String,
    _filters: CatalogsProductGroupFilters,
    /* ID of the catalog product group. */
    _id: String,
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _locale: Option[String],
    /* Name of catalog product group */
    _name: Option[String],
    _status: Option[CatalogsProductGroupStatus],
    _type: CatalogsProductGroupType,
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    _updatedAt: Option[Integer]
)
object CatalogsRetailProductGroup {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_createdAt: Object, var_description: Object, var_feedId: Object, var_filters: Object, var_id: Object, var_isFeatured: Object, var_locale: Object, var_name: Object, var_status: Object, var_type: Object, var_updatedAt: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"createdAt":$var_createdAt,"description":$var_description,"feedId":$var_feedId,"filters":$var_filters,"id":$var_id,"isFeatured":$var_isFeatured,"locale":$var_locale,"name":$var_name,"status":$var_status,"type":$var_type,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
