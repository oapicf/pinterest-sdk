
package org.openapitools.client.model


case class CatalogsProductGroupUpdateRequest (
    _name: Option[String],
    _description: Option[String],
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _filters: Option[CatalogsProductGroupFiltersRequest]
)
object CatalogsProductGroupUpdateRequest {
    def toStringBody(var_name: Object, var_description: Object, var_isFeatured: Object, var_filters: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"isFeatured":$var_isFeatured,"filters":$var_filters
        | }
        """.stripMargin
}
