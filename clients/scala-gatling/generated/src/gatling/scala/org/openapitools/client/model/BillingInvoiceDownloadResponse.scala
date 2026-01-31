
package org.openapitools.client.model


case class BillingInvoiceDownloadResponse (
    /* The download url for the billing invoice */
    _downloadUrl: Option[String],
    /* The billing invoice id */
    _id: Option[String]
)
object BillingInvoiceDownloadResponse {
    def toStringBody(var_downloadUrl: Object, var_id: Object) =
        s"""
        | {
        | "downloadUrl":$var_downloadUrl,"id":$var_id
        | }
        """.stripMargin
}
