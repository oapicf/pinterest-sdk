package org.openapitools.server.model


/**
 * = feeds_hotel_create_request =
 *
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 *
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. for example: ''null''
 * @param catalogType  for example: ''null''
 * @param credentials  for example: ''null''
 * @param defaultCurrency  for example: ''null''
 * @param defaultLocale  for example: ''null''
 * @param format  for example: ''null''
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. for example: ''null''
 * @param name A human-friendly name associated to a given feed. for example: ''null''
 * @param preferredProcessingSchedule  for example: ''null''
 * @param status  for example: ''null''
*/
final case class CatalogsHotelFeedsCreateRequest (
  catalogId: Option[String] = None,
  catalogType: String,
  credentials: Option[CatalogsFeedCredentials] = None,
  defaultCurrency: Option[NullableCurrency] = None,
  defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule] = None,
  status: Option[CatalogsStatus] = None
)

