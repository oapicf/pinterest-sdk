
package org.openapitools.client.model


case class CatalogsProductGroupMultiplePinterestProductCategoryCriteria (
    _negated: Option[Boolean],
    _values: List[ProductCategoryEnum]
)
object CatalogsProductGroupMultiplePinterestProductCategoryCriteria {
    def toStringBody(var_negated: Object, var_values: Object) =
        s"""
        | {
        | "negated":$var_negated,"values":$var_values
        | }
        """.stripMargin
}
