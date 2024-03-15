
package org.openapitools.client.model


case class CatalogsHotelProductGroupFilters (
    _anyOf: List[CatalogsHotelProductGroupFilterKeys],
    _allOf: List[CatalogsHotelProductGroupFilterKeys]
)
object CatalogsHotelProductGroupFilters {
    def toStringBody(var_anyOf: Object, var_allOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf,"allOf":$var_allOf
        | }
        """.stripMargin
}
