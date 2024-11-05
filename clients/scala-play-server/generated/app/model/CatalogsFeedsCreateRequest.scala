package model

import play.api.libs.json._

/**
  * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFeedsCreateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: String,
  format: CatalogsFormat,
  defaultLocale: Option[CatalogsFeedsCreateRequestDefaultLocale],
  credentials: Option[CatalogsFeedCredentials],
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  defaultCountry: Option[Country],
  defaultAvailability: Option[ProductAvailabilityType],
  status: Option[CatalogsStatus]
)

object CatalogsFeedsCreateRequest {
  implicit lazy val catalogsFeedsCreateRequestJsonFormat: Format[CatalogsFeedsCreateRequest] = Json.format[CatalogsFeedsCreateRequest]
}

