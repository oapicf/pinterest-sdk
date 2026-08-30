package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Unified model for local inventory items batch operation
  * @param batchId Id of the batch operation
  * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  * @param operationResults Array of operation results
  * @param status Status of the batch: PROCESSING, COMPLETED, FAILED
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalInventoryItemsBatch(
  batchId: String,
  completedTime: Option[OffsetDateTime],
  createdTime: OffsetDateTime,
  operationResults: List[SupplementalOperationResult],
  status: SupplementalItemBatchOperationStatus
)

object LocalInventoryItemsBatch {
  implicit lazy val localInventoryItemsBatchJsonFormat: Format[LocalInventoryItemsBatch] = Json.format[LocalInventoryItemsBatch]
}

