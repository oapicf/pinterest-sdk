package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feeds_create_request.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FeedsCreateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: String,
  format: CatalogsFormat,
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  credentials: Option[CatalogsFeedCredentials],
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  catalogType: CatalogsType,
  defaultCountry: Country,
  defaultAvailability: Option[ProductAvailabilityType],
  catalogId: Option[String]
)

object FeedsCreateRequest {
  implicit lazy val feedsCreateRequestJsonFormat: Format[FeedsCreateRequest] = Json.format[FeedsCreateRequest]
}

