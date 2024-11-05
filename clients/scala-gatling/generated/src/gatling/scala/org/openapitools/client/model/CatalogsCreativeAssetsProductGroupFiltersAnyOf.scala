
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupFiltersAnyOf (
    _anyOf: List[CatalogsCreativeAssetsProductGroupFilterKeys]
)
object CatalogsCreativeAssetsProductGroupFiltersAnyOf {
    def toStringBody(var_anyOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf
        | }
        """.stripMargin
}
