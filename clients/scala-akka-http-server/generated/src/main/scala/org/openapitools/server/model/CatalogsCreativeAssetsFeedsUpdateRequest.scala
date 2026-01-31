package org.openapitools.server.model


/**
 * = catalogs_feeds_update_request =
 *
 * Request object for updating a feed.
 *
 * @param catalogType  for example: ''null''
 * @param credentials  for example: ''null''
 * @param defaultCurrency  for example: ''null''
 * @param format  for example: ''null''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param name A human-friendly name associated to a given feed. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
 * @param status  for example: ''null''
*/
final case class CatalogsCreativeAssetsFeedsUpdateRequest (
  catalogType: CatalogsType,
  credentials: Option[CatalogsFeedCredentials] = None,
  defaultCurrency: Option[NullableCurrency] = None,
  format: Option[CatalogsFormat] = None,
  location: Option[String] = None,
  name: Option[String] = None,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule] = None,
  status: Option[CatalogsStatus] = None
)

