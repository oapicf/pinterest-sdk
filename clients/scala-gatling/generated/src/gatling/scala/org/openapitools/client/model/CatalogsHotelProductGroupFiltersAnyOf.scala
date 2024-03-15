
package org.openapitools.client.model


case class CatalogsHotelProductGroupFiltersAnyOf (
    _anyOf: List[CatalogsHotelProductGroupFilterKeys]
)
object CatalogsHotelProductGroupFiltersAnyOf {
    def toStringBody(var_anyOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf
        | }
        """.stripMargin
}
