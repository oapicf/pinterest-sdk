
package org.openapitools.client.model


case class CatalogsProductGroupFiltersAllOf (
    _allOf: List[CatalogsProductGroupFilterKeys]
)
object CatalogsProductGroupFiltersAllOf {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
