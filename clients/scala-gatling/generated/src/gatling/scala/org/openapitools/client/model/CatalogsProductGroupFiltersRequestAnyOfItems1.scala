
package org.openapitools.client.model


case class CatalogsProductGroupFiltersRequestAnyOfItems1 (
    _allOf: List[CatalogsProductGroupFilterKeys]
)
object CatalogsProductGroupFiltersRequestAnyOfItems1 {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
