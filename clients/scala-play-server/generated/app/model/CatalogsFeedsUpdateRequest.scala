package model

import play.api.libs.json._

/**
  * Request object for updating a feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedsUpdateRequest(
  credentials: Option[CatalogsFeedCredentials],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCurrency: Option[NullableCurrency],
  format: Option[CatalogsFormat],
  location: Option[String],
  name: Option[String],
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsFeedsUpdateRequest {
  implicit lazy val catalogsFeedsUpdateRequestJsonFormat: Format[CatalogsFeedsUpdateRequest] = Json.format[CatalogsFeedsUpdateRequest]
}

