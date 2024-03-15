
package org.openapitools.client.model


case class CatalogsProductGroupFiltersRequestAnyOf1 (
    _allOf: List[CatalogsProductGroupFilterKeys]
)
object CatalogsProductGroupFiltersRequestAnyOf1 {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
