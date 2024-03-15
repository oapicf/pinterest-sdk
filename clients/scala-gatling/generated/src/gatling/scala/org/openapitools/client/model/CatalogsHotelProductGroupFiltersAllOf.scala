
package org.openapitools.client.model


case class CatalogsHotelProductGroupFiltersAllOf (
    _allOf: List[CatalogsHotelProductGroupFilterKeys]
)
object CatalogsHotelProductGroupFiltersAllOf {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
