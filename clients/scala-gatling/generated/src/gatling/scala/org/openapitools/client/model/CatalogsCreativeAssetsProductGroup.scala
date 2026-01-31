
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroup (
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String,
    _catalogType: String,
    /* Unix timestamp in seconds of when catalog product group was created. */
    _createdAt: Option[Integer],
    _description: Option[String],
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    /* ID of the creative assets product group. */
    _id: String,
    /* Name of creative assets product group */
    _name: Option[String],
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    _updatedAt: Option[Integer]
)
object CatalogsCreativeAssetsProductGroup {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_createdAt: Object, var_description: Object, var_filters: Object, var_id: Object, var_name: Object, var_updatedAt: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"createdAt":$var_createdAt,"description":$var_description,"filters":$var_filters,"id":$var_id,"name":$var_name,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
