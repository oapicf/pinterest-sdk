
package org.openapitools.client.model


case class CatalogsBaseFiltersAllOf (
    _allOf: List[CatalogsBaseFilterKeys]
)
object CatalogsBaseFiltersAllOf {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
