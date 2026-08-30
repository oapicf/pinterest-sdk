package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Unified model for local inventory items batch operation
 *
 * @param batchId Id of the batch operation for example: ''66753b9bb65c46c49bd''
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss for example: ''2022-03-14T15:16:34Z''
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss for example: ''2022-03-14T15:15:22Z''
 * @param operationResults Array of operation results for example: ''null''
 * @param status Status of the batch: PROCESSING, COMPLETED, FAILED for example: ''null''
*/
final case class LocalInventoryItemsBatch (
  batchId: String,
  completedTime: Option[OffsetDateTime] = None,
  createdTime: OffsetDateTime,
  operationResults: Seq[SupplementalOperationResult],
  status: SupplementalItemBatchOperationStatus
)

