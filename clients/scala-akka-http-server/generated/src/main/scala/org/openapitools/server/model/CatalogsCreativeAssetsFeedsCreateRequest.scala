package org.openapitools.server.model


/**
 * = feeds_creative_assets_create_request =
 *
 * Request object for creating a feed.
 *
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. for example: ''null''
 * @param catalogType  for example: ''null''
 * @param credentials  for example: ''null''
 * @param defaultCountry  for example: ''null''
 * @param defaultCurrency  for example: ''null''
 * @param defaultLocale  for example: ''null''
 * @param format  for example: ''null''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param name A human-friendly name associated to a given feed. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
 * @param status  for example: ''null''
*/
final case class CatalogsCreativeAssetsFeedsCreateRequest (
  catalogId: Option[String] = None,
  catalogType: CatalogsType,
  credentials: Option[CatalogsFeedCredentials] = None,
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency] = None,
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule] = None,
  status: Option[CatalogsStatus] = None
)

