package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param createdAt Timestamp of the feed ingestion. for example: ''2022-03-14T15:15:22Z''
 * @param feedId Catalog Feed id pertaining to the feed ingestion. for example: ''2680059592705''
 * @param id Unique identifier of a feed ingestion. for example: ''2680059592705''
 * @param status Status of the feed ingestion. for example: ''null''
*/
final case class CatalogsFeedIngestion (
  createdAt: OffsetDateTime,
  feedId: String,
  id: String,
  status: CatalogsFeedProcessingStatus
)

