
package org.openapitools.client.model


case class ProductCategoriesDemographic (
    /* Age demographic distribution */
    _age: Map[String, Number],
    _gender: GenderDemographics
)
object ProductCategoriesDemographic {
    def toStringBody(var_age: Object, var_gender: Object) =
        s"""
        | {
        | "age":$var_age,"gender":$var_gender
        | }
        """.stripMargin
}
