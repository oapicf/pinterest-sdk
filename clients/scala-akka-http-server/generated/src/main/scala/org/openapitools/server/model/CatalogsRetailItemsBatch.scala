package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Object describing the catalogs retail items batch
 *
 * @param batchId Id of the catalogs items batch for example: ''595953100599279259''
 * @param catalogType  for example: ''null''
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss for example: ''2024-01-01T20:20Z''
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. for example: ''2024-01-01T20:10:40Z''
 * @param items Array with the catalogs items processing records part of the catalogs items batch for example: ''null''
 * @param status  for example: ''null''
*/
final case class CatalogsRetailItemsBatch (
  batchId: Option[String] = None,
  catalogType: String,
  completedTime: Option[OffsetDateTime] = None,
  createdTime: OffsetDateTime,
  items: Option[Seq[ItemProcessingRecord]] = None,
  status: Option[BatchOperationStatus] = None
)

