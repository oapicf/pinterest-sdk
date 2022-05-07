
package org.openapitools.client.model


case class CatalogsProductGroupFilters (
    _anyOf: Option[List[CatalogsProductGroupFilterKeys]],
    _allOf: Option[List[CatalogsProductGroupFilterKeys]]
)
object CatalogsProductGroupFilters {
    def toStringBody(var_anyOf: Object, var_allOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf,"allOf":$var_allOf
        | }
        """.stripMargin
}
