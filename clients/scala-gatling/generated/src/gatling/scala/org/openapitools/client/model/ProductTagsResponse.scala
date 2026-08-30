
package org.openapitools.client.model


case class ProductTagsResponse (
    /* List of product tags on the pin. */
    _productTags: List[ProductTagItem]
)
object ProductTagsResponse {
    def toStringBody(var_productTags: Object) =
        s"""
        | {
        | "productTags":$var_productTags
        | }
        """.stripMargin
}
