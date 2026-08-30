
package org.openapitools.client.model


case class CatalogsProductGroupFilterOperatorTypeCriteria (
    _filterOperatorType: Option[FilterOperatorType],
    _negated: Option[Boolean],
    _values: List[String]
)
object CatalogsProductGroupFilterOperatorTypeCriteria {
    def toStringBody(var_filterOperatorType: Object, var_negated: Object, var_values: Object) =
        s"""
        | {
        | "filterOperatorType":$var_filterOperatorType,"negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
