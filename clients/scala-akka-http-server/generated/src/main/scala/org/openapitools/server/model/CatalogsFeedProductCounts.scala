package org.openapitools.server.model


/**
 * The counts can be null early in the process.
 *
 * @param original The number of products in the feed file for example: ''null''
*/
final case class CatalogsFeedProductCounts (
  original: Option[Int]
)

