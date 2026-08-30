
package org.openapitools.client.model


case class CatalogsBaseFiltersAnyOf (
    _anyOf: List[CatalogsBaseFilterKeys]
)
object CatalogsBaseFiltersAnyOf {
    def toStringBody(var_anyOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf
        | }
        """.stripMargin
}
