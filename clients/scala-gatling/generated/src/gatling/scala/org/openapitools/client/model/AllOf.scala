
package org.openapitools.client.model


case class AllOf (
    _allOf: List[CatalogsProductGroupFilterKeys]
)
object AllOf {
    def toStringBody(var_allOf: Object) =
        s"""
        | {
        | "allOf":$var_allOf
        | }
        """.stripMargin
}
