
package org.openapitools.client.model


case class ProductTagsBulkAddRequest (
    /* List of product tags to add. Maximum 24 items allowed. */
    _productTags: List[ProductTagItem]
)
object ProductTagsBulkAddRequest {
    def toStringBody(var_productTags: Object) =
        s"""
        | {
        | "productTags":$var_productTags
        | }
        """.stripMargin
}
