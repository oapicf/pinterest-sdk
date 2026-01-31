
package org.openapitools.client.model


case class AnyOf (
    _anyOf: List[CatalogsProductGroupFilterKeys]
)
object AnyOf {
    def toStringBody(var_anyOf: Object) =
        s"""
        | {
        | "anyOf":$var_anyOf
        | }
        """.stripMargin
}
