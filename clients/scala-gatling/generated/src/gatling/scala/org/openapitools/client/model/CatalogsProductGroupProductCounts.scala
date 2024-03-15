
package org.openapitools.client.model


case class CatalogsProductGroupProductCounts (
    _inStock: Number,
    _outOfStock: Number,
    _preorder: Number,
    _total: Number
)
object CatalogsProductGroupProductCounts {
    def toStringBody(var_inStock: Object, var_outOfStock: Object, var_preorder: Object, var_total: Object) =
        s"""
        | {
        | "inStock":$var_inStock,"outOfStock":$var_outOfStock,"preorder":$var_preorder,"total":$var_total
        | }
        """.stripMargin
}
