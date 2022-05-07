package org.openapitools.server.model


/**
 * = feeds_create_request =
 *
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 *
 * @param defaultCountry  for example: ''null''
 * @param defaultAvailability  for example: ''null''
 * @param defaultCurrency  for example: ''null''
 * @param name A human-friendly name associated to a given feed. for example: ''null''
 * @param format  for example: ''null''
 * @param defaultLocale The locale used within a feed for product descriptions. for example: ''en_US''
 * @param credentials  for example: ''null''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
*/
final case class CatalogsFeedsCreateRequest (
  defaultCountry: Option[Country],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCurrency: Option[NullableCurrency],
  name: String,
  format: CatalogsFormat,
  defaultLocale: Option[String],
  credentials: Option[CatalogsFeedCredentials],
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule]
)

