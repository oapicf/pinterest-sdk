
package org.openapitools.client.model


case class CatalogsProductGroupCreateRequest (
    _description: Option[String],
    /* Catalog Feed id pertaining to the catalog product group. */
    _feedId: String,
    _filters: CatalogsProductGroupFiltersRequest,
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _name: String
)
object CatalogsProductGroupCreateRequest {
    def toStringBody(var_description: Object, var_feedId: Object, var_filters: Object, var_isFeatured: Object, var_name: Object) =
        s"""
        | {
        | "description":$var_description,"feedId":$var_feedId,"filters":$var_filters,"isFeatured":$var_isFeatured,"name":$var_name
        | }
        """.stripMargin
}
