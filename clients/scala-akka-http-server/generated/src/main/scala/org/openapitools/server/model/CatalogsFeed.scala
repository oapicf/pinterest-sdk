package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = feed =
 *
 * Catalogs Catalogs Feed object
 *
 * @param createdAt  for example: ''2022-03-14T15:15:22Z''
 * @param id  for example: ''null''
 * @param updatedAt  for example: ''2022-03-14T15:16:34Z''
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
final case class CatalogsFeed (
  createdAt: Option[OffsetDateTime],
  id: Option[String],
  updatedAt: Option[OffsetDateTime],
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

