
package org.openapitools.client.model


case class CatalogsProductGroupFiltersRequestAnyOf (
    _anyOf: List[CatalogsProductGroupFilterKeys]
)
object CatalogsProductGroupFiltersRequestAnyOf {
    def toStringBody(var_anyOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf
        | }
        """.stripMargin
}
