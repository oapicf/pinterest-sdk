
package org.openapitools.client.model


case class BulkDownload (
    /* ID of the bulk request. */
    _requestId: Option[String]
)
object BulkDownload {
    def toStringBody(var_requestId: Object) =
        s"""
        | {
        | "requestId":$var_requestId
        | }
        """.stripMargin
}
