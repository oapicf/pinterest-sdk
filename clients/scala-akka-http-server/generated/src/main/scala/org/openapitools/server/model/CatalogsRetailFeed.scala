package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = catalogs_retail_feed =
 *
 * Catalogs Retail Feed object
 *
 * @param createdAt  for example: ''2022-03-14T15:15:22Z''
 * @param id  for example: ''null''
 * @param updatedAt  for example: ''2022-03-14T15:16:34Z''
 * @param catalogType  for example: ''null''
 * @param credentials  for example: ''null''
 * @param defaultAvailability  for example: ''null''
 * @param defaultCountry  for example: ''null''
 * @param defaultCurrency  for example: ''null''
 * @param defaultLocale The locale used within a feed for product descriptions. for example: ''en-US''
 * @param format  for example: ''null''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
 * @param status  for example: ''null''
*/
final case class CatalogsRetailFeed (
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime,
  catalogType: CatalogsType,
  credentials: CatalogsFeedCredentials,
  defaultAvailability: ProductAvailabilityType,
  defaultCountry: Country,
  defaultCurrency: NullableCurrency,
  defaultLocale: String,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
  status: CatalogsStatus
)

