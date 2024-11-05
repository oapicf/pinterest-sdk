
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroup (
    _catalogType: String,
    /* ID of the creative assets product group. */
    _id: String,
    /* Name of creative assets product group */
    _name: Option[String],
    _description: Option[String],
    _filters: CatalogsCreativeAssetsProductGroupFilters,
    /* Unix timestamp in seconds of when catalog product group was created. */
    _createdAt: Option[Integer],
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    _updatedAt: Option[Integer],
    /* Catalog id pertaining to the creative assets product group. */
    _catalogId: String
)
object CatalogsCreativeAssetsProductGroup {
    def toStringBody(var_catalogType: Object, var_id: Object, var_name: Object, var_description: Object, var_filters: Object, var_createdAt: Object, var_updatedAt: Object, var_catalogId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"id":$var_id,"name":$var_name,"description":$var_description,"filters":$var_filters,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt,"catalogId":$var_catalogId
        | }
        """.stripMargin
}
