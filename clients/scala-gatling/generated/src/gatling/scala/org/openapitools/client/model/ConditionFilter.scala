
package org.openapitools.client.model


case class ConditionFilter (
    _CONDITION: CatalogsProductGroupMultipleStringCriteria
)
object ConditionFilter {
    def toStringBody(var_CONDITION: Object) =
        s"""
        | {
        | "CONDITION":$var_CONDITION
        | }
        """.stripMargin
}
