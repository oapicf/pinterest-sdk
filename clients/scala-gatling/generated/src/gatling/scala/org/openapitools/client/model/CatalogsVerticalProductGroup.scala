
package org.openapitools.client.model


case class CatalogsVerticalProductGroup (
    _catalogType: String,
    /* ID of the catalog product group. */
    _id: String,
    /* Name of catalog product group */
    _name: Option[String],
    _description: Option[String],
    _filters: CatalogsProductGroupFilters,
    /* Unix timestamp in seconds of when catalog product group was created. */
    _createdAt: Option[Integer],
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    _updatedAt: Option[Integer],
    _catalogId: String,
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _type: Option[CatalogsProductGroupType],
    _status: Option[CatalogsProductGroupStatus],
    _feedId: String
)
object CatalogsVerticalProductGroup {
    def toStringBody(var_catalogType: Object, var_id: Object, var_name: Object, var_description: Object, var_filters: Object, var_createdAt: Object, var_updatedAt: Object, var_catalogId: Object, var_isFeatured: Object, var_type: Object, var_status: Object, var_feedId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"id":$var_id,"name":$var_name,"description":$var_description,"filters":$var_filters,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt,"catalogId":$var_catalogId,"isFeatured":$var_isFeatured,"type":$var_type,"status":$var_status,"feedId":$var_feedId
        | }
        """.stripMargin
}
