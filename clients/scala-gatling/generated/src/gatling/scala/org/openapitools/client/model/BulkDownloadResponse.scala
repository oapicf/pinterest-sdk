
package org.openapitools.client.model


case class BulkDownloadResponse (
    /* ID of the bulk request. */
    _requestId: Option[String]
)
object BulkDownloadResponse {
    def toStringBody(var_requestId: Object) =
        s"""
        | {
        | "requestId":$var_requestId
        | }
        """.stripMargin
}
