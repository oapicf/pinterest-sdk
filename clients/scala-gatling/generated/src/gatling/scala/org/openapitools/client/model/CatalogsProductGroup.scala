
package org.openapitools.client.model


case class CatalogsProductGroup (
    /* ID of the catalog product group. */
    _id: String,
    /* Name of catalog product group */
    _name: Option[String],
    _description: Option[String],
    _filters: CatalogsProductGroupFilters,
    _type: Option[CatalogsProductGroupType],
    _status: Option[CatalogsProductGroupStatus],
    /* id of the catalogs feed belonging to this catalog product group */
    _feedId: Option[String],
    /* Unix timestamp in seconds of when catalog product group was created. */
    _createdAt: Option[Integer],
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    _updatedAt: Option[Integer]
)
object CatalogsProductGroup {
    def toStringBody(var_id: Object, var_name: Object, var_description: Object, var_filters: Object, var_type: Object, var_status: Object, var_feedId: Object, var_createdAt: Object, var_updatedAt: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"description":$var_description,"filters":$var_filters,"type":$var_type,"status":$var_status,"feedId":$var_feedId,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
