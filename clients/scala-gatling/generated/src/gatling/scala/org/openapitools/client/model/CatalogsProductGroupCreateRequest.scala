
package org.openapitools.client.model


case class CatalogsProductGroupCreateRequest (
    /* Catalog Feed id pertaining to the catalog product group. */
    _feedId: String,
    _name: String,
    _description: Option[String],
    _filters: CatalogsProductGroupFilters
)
object CatalogsProductGroupCreateRequest {
    def toStringBody(var_feedId: Object, var_name: Object, var_description: Object, var_filters: Object) =
        s"""
        | {
        | "feedId":$var_feedId,"name":$var_name,"description":$var_description,"filters":$var_filters
        | }
        """.stripMargin
}
