
package org.openapitools.client.model


case class CatalogsProductGroupPricingCriteria (
    _inclusion: Option[Boolean],
    _negated: Option[Boolean],
    _values: Number
)
object CatalogsProductGroupPricingCriteria {
    def toStringBody(var_inclusion: Object, var_negated: Object, var_values: Object) =
        s"""
        | {
        | "inclusion":$var_inclusion,"negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
