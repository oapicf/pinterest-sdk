package model

import play.api.libs.json._

/**
  * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedsCreateRequest(
  credentials: Option[CatalogsFeedCredentials],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCountry: Option[Country],
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: Option[CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale],
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsFeedsCreateRequest {
  implicit lazy val catalogsFeedsCreateRequestJsonFormat: Format[CatalogsFeedsCreateRequest] = Json.format[CatalogsFeedsCreateRequest]
}

