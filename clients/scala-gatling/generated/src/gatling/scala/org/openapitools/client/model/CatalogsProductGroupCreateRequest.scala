
package org.openapitools.client.model


case class CatalogsProductGroupCreateRequest (
    _name: String,
    _description: Option[String],
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _filters: CatalogsProductGroupFiltersRequest,
    /* Catalog Feed id pertaining to the catalog product group. */
    _feedId: String
)
object CatalogsProductGroupCreateRequest {
    def toStringBody(var_name: Object, var_description: Object, var_isFeatured: Object, var_filters: Object, var_feedId: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"isFeatured":$var_isFeatured,"filters":$var_filters,"feedId":$var_feedId
        | }
        """.stripMargin
}
