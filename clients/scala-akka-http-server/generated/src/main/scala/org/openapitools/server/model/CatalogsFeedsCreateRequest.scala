package org.openapitools.server.model


/**
 * = legacy_retail_only =
 *
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 *
 * @param defaultCurrency  for example: ''null''
 * @param name A human-friendly name associated to a given feed. for example: ''null''
 * @param format  for example: ''null''
 * @param defaultLocale  for example: ''null''
 * @param credentials  for example: ''null''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
 * @param defaultCountry  for example: ''null''
 * @param defaultAvailability  for example: ''null''
*/
final case class CatalogsFeedsCreateRequest (
  defaultCurrency: Option[NullableCurrency] = None,
  name: String,
  format: CatalogsFormat,
  defaultLocale: Option[CatalogsFeedsCreateRequestDefaultLocale] = None,
  credentials: Option[CatalogsFeedCredentials] = None,
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule] = None,
  defaultCountry: Option[Country] = None,
  defaultAvailability: Option[ProductAvailabilityType] = None
)

