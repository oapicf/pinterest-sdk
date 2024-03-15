
package org.openapitools.client.model


case class CatalogsProductGroupsUpdateRequest (
    _name: Option[String],
    _description: Option[String],
    /* boolean indicator of whether the product group is being featured or not */
    _isFeatured: Option[Boolean],
    _filters: Option[CatalogsHotelProductGroupFilters],
    _catalogType: Option[String]
)
object CatalogsProductGroupsUpdateRequest {
    def toStringBody(var_name: Object, var_description: Object, var_isFeatured: Object, var_filters: Object, var_catalogType: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"isFeatured":$var_isFeatured,"filters":$var_filters,"catalogType":$var_catalogType
        | }
        """.stripMargin
}
