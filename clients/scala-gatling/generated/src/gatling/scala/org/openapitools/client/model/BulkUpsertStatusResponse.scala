
package org.openapitools.client.model


case class BulkUpsertStatusResponse (
    _status: Option[BulkUpsertStatus],
    _resultUrl: Option[String]
)
object BulkUpsertStatusResponse {
    def toStringBody(var_status: Object, var_resultUrl: Object) =
        s"""
        | {
        | "status":$var_status,"resultUrl":$var_resultUrl
        | }
        """.stripMargin
}
