package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param createdAt  for example: ''2022-03-14T15:15:22Z''
 * @param id ID of the feed processing result. for example: ''864344156814050986''
 * @param ingestionDetails  for example: ''null''
 * @param productCounts  for example: ''null''
 * @param status  for example: ''null''
 * @param updatedAt  for example: ''2022-03-14T15:16:34Z''
 * @param validationDetails  for example: ''null''
 * @param videoCounts  for example: ''null''
*/
final case class CatalogsFeedProcessingResult (
  createdAt: OffsetDateTime,
  id: String,
  ingestionDetails: CatalogsFeedIngestionDetails,
  productCounts: CatalogsFeedProductCounts,
  status: CatalogsFeedProcessingStatus,
  updatedAt: OffsetDateTime,
  validationDetails: CatalogsFeedValidationDetails,
  videoCounts: Option[CatalogsFeedVideoCounts] = None
)

