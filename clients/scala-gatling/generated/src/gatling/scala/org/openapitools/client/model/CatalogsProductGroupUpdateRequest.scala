
package org.openapitools.client.model


case class CatalogsProductGroupUpdateRequest (
    _description: Option[String],
    _filters: Option[CatalogsProductGroupFiltersRequest],
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _name: Option[String]
)
object CatalogsProductGroupUpdateRequest {
    def toStringBody(var_description: Object, var_filters: Object, var_isFeatured: Object, var_name: Object) =
        s"""
        | {
        | "description":$var_description,"filters":$var_filters,"isFeatured":$var_isFeatured,"name":$var_name
        | }
        """.stripMargin
}
