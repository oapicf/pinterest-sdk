
package org.openapitools.client.model


case class CatalogsProductGroupFiltersAllOf (
    _allOf: Option[List[CatalogsProductGroupFilterKeys]]
)
object CatalogsProductGroupFiltersAllOf {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
