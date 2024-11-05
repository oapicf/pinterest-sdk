package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param createdAt  for example: ''2022-03-14T15:15:22Z''
 * @param id  for example: ''null''
 * @param updatedAt  for example: ''2022-03-14T15:16:34Z''
 * @param ingestionDetails  for example: ''null''
 * @param status  for example: ''null''
 * @param productCounts  for example: ''null''
 * @param validationDetails  for example: ''null''
*/
final case class CatalogsFeedProcessingResult (
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime,
  ingestionDetails: CatalogsFeedIngestionDetails,
  status: CatalogsFeedProcessingStatus,
  productCounts: CatalogsFeedProductCounts,
  validationDetails: CatalogsFeedValidationDetails
)

