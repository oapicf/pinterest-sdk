
package org.openapitools.client.model


case class CatalogsProductGroupPricingCriteria (
    _inclusion: Boolean,
    _values: Number,
    _negated: Boolean
)
object CatalogsProductGroupPricingCriteria {
    def toStringBody(var_inclusion: Object, var_values: Object, var_negated: Object) =
        s"""
        | {
        | "inclusion":$var_inclusion,"values":$var_values,"negated":$var_negated
        | }
        """.stripMargin
}
