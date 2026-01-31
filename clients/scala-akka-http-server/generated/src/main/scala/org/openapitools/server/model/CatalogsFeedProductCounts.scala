package org.openapitools.server.model


/**
 * The counts can be null early in the process.
 *
 * @param ingested The number of products successfully ingested from the feed file. for example: ''null''
 * @param original The number of products in the feed file. for example: ''null''
*/
final case class CatalogsFeedProductCounts (
  ingested: Option[Int] = None,
  original: Option[Int] = None
)

