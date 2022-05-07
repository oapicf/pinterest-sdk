
package org.openapitools.client.model


case class CatalogsFeedIngestionInfo (
    _inStock: Option[Integer],
    _outOfStock: Option[Integer],
    _preorder: Option[Integer]
)
object CatalogsFeedIngestionInfo {
    def toStringBody(var_inStock: Object, var_outOfStock: Object, var_preorder: Object) =
        s"""
        | {
        | "inStock":$var_inStock,"outOfStock":$var_outOfStock,"preorder":$var_preorder
        | }
        """.stripMargin
}
