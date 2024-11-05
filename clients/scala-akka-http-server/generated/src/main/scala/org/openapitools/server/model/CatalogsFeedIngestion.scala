package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param id  for example: ''01234''
 * @param feedId  for example: ''56789''
 * @param createdAt  for example: ''2022-03-14T15:16:34Z''
 * @param status  for example: ''null''
*/
final case class CatalogsFeedIngestion (
  id: String,
  feedId: String,
  createdAt: OffsetDateTime,
  status: CatalogsFeedProcessingStatus
)

