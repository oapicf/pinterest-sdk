
package org.openapitools.client.model


case class CatalogsProductGroupUpdateRequest (
    /* Catalog Feed id pertaining to the catalog product group. */
    _feedId: String,
    _name: String,
    _description: Option[String],
    _filters: CatalogsProductGroupFilters
)
object CatalogsProductGroupUpdateRequest {
    def toStringBody(var_feedId: Object, var_name: Object, var_description: Object, var_filters: Object) =
        s"""
        | {
        | "feedId":$var_feedId,"name":$var_name,"description":$var_description,"filters":$var_filters
        | }
        """.stripMargin
}
