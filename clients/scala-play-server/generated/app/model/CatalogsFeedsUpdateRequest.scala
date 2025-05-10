package model

import play.api.libs.json._

/**
  * Request object for updating a feed.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsFeedsUpdateRequest(
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCurrency: Option[NullableCurrency],
  name: Option[String],
  format: Option[CatalogsFormat],
  credentials: Option[CatalogsFeedCredentials],
  location: Option[String],
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsFeedsUpdateRequest {
  implicit lazy val catalogsFeedsUpdateRequestJsonFormat: Format[CatalogsFeedsUpdateRequest] = Json.format[CatalogsFeedsUpdateRequest]
}

