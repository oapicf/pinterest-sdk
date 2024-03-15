
package org.openapitools.client.model


case class BulkUpsertResponse (
    _requestId: Option[String]
)
object BulkUpsertResponse {
    def toStringBody(var_requestId: Object) =
        s"""
        | {
        | "requestId":$var_requestId
        | }
        """.stripMargin
}
