
package org.openapitools.client.model


case class BulkJobData (
    /* Presigned s3 file url for the bulk request result. */
    _resultUrl: Option[String],
    _status: BulkRequestStatus,
    /* Bulk Workload Id. */
    _workloadId: Option[Integer]
)
object BulkJobData {
    def toStringBody(var_resultUrl: Object, var_status: Object, var_workloadId: Object) =
        s"""
        | {
        | "resultUrl":$var_resultUrl,"status":$var_status,"workloadId":$var_workloadId
        | }
        """.stripMargin
}
