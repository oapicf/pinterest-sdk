
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupFiltersAllOf (
    _allOf: List[CatalogsCreativeAssetsProductGroupFilterKeys]
)
object CatalogsCreativeAssetsProductGroupFiltersAllOf {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
