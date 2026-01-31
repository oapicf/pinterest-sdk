
package org.openapitools.client.model


case class CatalogsHotelProductGroup (
    /* Catalog id pertaining to the hotel product group. */
    _catalogId: String,
    _catalogType: String,
    /* Unix timestamp in seconds of when catalog product group was created. */
    _createdAt: Option[Integer],
    _description: Option[String],
    _filters: CatalogsHotelProductGroupFilters,
    /* ID of the hotel product group. */
    _id: String,
    /* Name of hotel product group */
    _name: Option[String],
    _type: CatalogsHotelProductGroupType,
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    _updatedAt: Option[Integer]
)
object CatalogsHotelProductGroup {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_createdAt: Object, var_description: Object, var_filters: Object, var_id: Object, var_name: Object, var_type: Object, var_updatedAt: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"createdAt":$var_createdAt,"description":$var_description,"filters":$var_filters,"id":$var_id,"name":$var_name,"type":$var_type,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
