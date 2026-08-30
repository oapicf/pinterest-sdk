package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = catalogs_creative_assets_feed =
 *
 * Catalogs Creative Asset Feed object
 *
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. for example: ''null''
 * @param catalogType  for example: ''null''
 * @param createdAt  for example: ''null''
 * @param credentials  for example: ''null''
 * @param defaultCountry  for example: ''null''
 * @param defaultCurrency  for example: ''null''
 * @param defaultLocale The locale used within a feed for product descriptions. for example: ''null''
 * @param format  for example: ''null''
 * @param id ID of the feed entity. for example: ''864344156814050986''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
 * @param status  for example: ''null''
 * @param updatedAt  for example: ''null''
*/
final case class CatalogsCreativeAssetsFeed (
  catalogId: String,
  catalogType: String,
  createdAt: OffsetDateTime,
  credentials: Option[CatalogsFeedCredentials] = None,
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency] = None,
  defaultLocale: String,
  format: CatalogsFormat,
  id: String,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule] = None,
  status: CatalogsStatus,
  updatedAt: OffsetDateTime
)

