
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupFilters (
    _anyOf: List[CatalogsCreativeAssetsProductGroupFilterKeys],
    _allOf: List[CatalogsCreativeAssetsProductGroupFilterKeys]
)
object CatalogsCreativeAssetsProductGroupFilters {
    def toStringBody(var_anyOf: Object, var_allOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf,"allOf":$var_allOf
        | }
        """.stripMargin
}
