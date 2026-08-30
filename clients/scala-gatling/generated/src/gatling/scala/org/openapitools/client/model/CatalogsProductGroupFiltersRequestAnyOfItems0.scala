
package org.openapitools.client.model


case class CatalogsProductGroupFiltersRequestAnyOfItems0 (
    _anyOf: List[CatalogsProductGroupFilterKeys]
)
object CatalogsProductGroupFiltersRequestAnyOfItems0 {
    def toStringBody(var_anyOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf
        | }
        """.stripMargin
}
