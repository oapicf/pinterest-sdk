
package org.openapitools.client.model

import java.time.OffsetDateTime

case class LocalInventoryItemsBatch (
    /* Id of the batch operation */
    _batchId: String,
    /* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
    _completedTime: Option[OffsetDateTime],
    /* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
    _createdTime: OffsetDateTime,
    /* Array of operation results */
    _operationResults: List[SupplementalOperationResult],
    /* Status of the batch: PROCESSING, COMPLETED, FAILED */
    _status: SupplementalItemBatchOperationStatus
)
object LocalInventoryItemsBatch {
    def toStringBody(var_batchId: Object, var_completedTime: Object, var_createdTime: Object, var_operationResults: Object, var_status: Object) =
        s"""
        | {
        | "batchId":$var_batchId,"completedTime":$var_completedTime,"createdTime":$var_createdTime,"operationResults":$var_operationResults,"status":$var_status
        | }
        """.stripMargin
}
