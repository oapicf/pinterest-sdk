
package org.openapitools.client.model


case class BulkUpsertStatusResponse (
    _resultUrl: Option[String],
    _status: Option[BulkUpsertStatus]
)
object BulkUpsertStatusResponse {
    def toStringBody(var_resultUrl: Object, var_status: Object) =
        s"""
        | {
        | "resultUrl":$var_resultUrl,"status":$var_status
        | }
        """.stripMargin
}
