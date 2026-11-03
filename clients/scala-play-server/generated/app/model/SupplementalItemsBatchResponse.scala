package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Response model for supplemental items batch operation
  * @param batchId Id of the batch operation
  * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  * @param operationResults Array of operation results
  * @param status Status of the batch: PROCESSING, COMPLETED, FAILED
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SupplementalItemsBatchResponse(
  batchId: String,
  completedTime: Option[OffsetDateTime],
  createdTime: OffsetDateTime,
  operationResults: List[SupplementalOperationResult],
  status: SupplementalItemBatchOperationStatus
)

object SupplementalItemsBatchResponse {
  implicit lazy val supplementalItemsBatchResponseJsonFormat: Format[SupplementalItemsBatchResponse] = Json.format[SupplementalItemsBatchResponse]
}

