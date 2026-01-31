package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param createdAt  for example: ''2022-03-14T15:16:34Z''
 * @param feedId  for example: ''56789''
 * @param id  for example: ''01234''
 * @param status  for example: ''null''
*/
final case class CatalogsFeedIngestion (
  createdAt: OffsetDateTime,
  feedId: String,
  id: String,
  status: CatalogsFeedProcessingStatus
)

