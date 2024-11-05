package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Object describing the catalogs items batch
 *
 * @param catalogType  for example: ''null''
 * @param batchId Id of the catalogs items batch for example: ''595953100599279259-66753b9bb65c46c49bd8503b27fecf9e''
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss for example: ''null''
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss for example: ''null''
 * @param status  for example: ''null''
 * @param items Array with the catalogs items processing records part of the catalogs items batch for example: ''null''
*/
final case class CatalogsItemsBatch (
  catalogType: CatalogsType,
  batchId: Option[String] = None,
  createdTime: Option[OffsetDateTime] = None,
  completedTime: Option[OffsetDateTime] = None,
  status: Option[BatchOperationStatus] = None,
  items: Option[Seq[CreativeAssetsProcessingRecord]] = None
)

