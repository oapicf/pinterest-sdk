package model

import play.api.libs.json._

/**
  * Request object for updating a feed.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailFeedsUpdateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: Option[String],
  format: Option[CatalogsFormat],
  credentials: Option[CatalogsFeedCredentials],
  location: Option[String],
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus],
  catalogType: CatalogsType,
  defaultAvailability: Option[ProductAvailabilityType]
)

object CatalogsRetailFeedsUpdateRequest {
  implicit lazy val catalogsRetailFeedsUpdateRequestJsonFormat: Format[CatalogsRetailFeedsUpdateRequest] = Json.format[CatalogsRetailFeedsUpdateRequest]
}

