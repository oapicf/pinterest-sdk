package org.openapitools.server.model


/**
 * = feed_fields =
 *
 * @param defaultCountry  for example: ''null''
 * @param defaultAvailability  for example: ''null''
 * @param defaultCurrency  for example: ''null''
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. for example: ''null''
 * @param format  for example: ''null''
 * @param defaultLocale The locale used within a feed for product descriptions. for example: ''en_US''
 * @param credentials  for example: ''null''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
 * @param status  for example: ''null''
*/
final case class FeedFields (
  defaultCountry: Country,
  defaultAvailability: ProductAvailabilityType,
  defaultCurrency: NullableCurrency,
  name: String,
  format: CatalogsFormat,
  defaultLocale: String,
  credentials: CatalogsFeedCredentials,
  location: String,
  preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
  status: CatalogsStatus
)

