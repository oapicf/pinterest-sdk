
package org.openapitools.client.model


case class IneligibleProductTagsErrorDetails (
    /* List of product tags that failed eligibility check. */
    _productTags: List[IneligibleProductTagErrorItem]
)
object IneligibleProductTagsErrorDetails {
    def toStringBody(var_productTags: Object) =
        s"""
        | {
        | "productTags":$var_productTags
        | }
        """.stripMargin
}
