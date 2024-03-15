package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class FeedsList200Response (
  items: Seq[CatalogsFeed],
  bookmark: Option[String] = None
)

