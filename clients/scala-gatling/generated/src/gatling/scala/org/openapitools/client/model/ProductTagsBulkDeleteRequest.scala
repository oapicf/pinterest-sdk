
package org.openapitools.client.model


case class ProductTagsBulkDeleteRequest (
    /* List of product tags to delete. */
    _productTags: List[ProductTagItem]
)
object ProductTagsBulkDeleteRequest {
    def toStringBody(var_productTags: Object) =
        s"""
        | {
        | "productTags":$var_productTags
        | }
        """.stripMargin
}
