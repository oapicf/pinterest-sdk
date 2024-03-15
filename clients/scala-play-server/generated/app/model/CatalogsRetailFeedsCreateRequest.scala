package model

import play.api.libs.json._

/**
  * Request object for creating a retail feed.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsRetailFeedsCreateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: String,
  format: CatalogsFormat,
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  credentials: Option[CatalogsFeedCredentials],
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  catalogType: CatalogsType,
  defaultCountry: Country,
  defaultAvailability: Option[ProductAvailabilityType]
)

object CatalogsRetailFeedsCreateRequest {
  implicit lazy val catalogsRetailFeedsCreateRequestJsonFormat: Format[CatalogsRetailFeedsCreateRequest] = Json.format[CatalogsRetailFeedsCreateRequest]
}

