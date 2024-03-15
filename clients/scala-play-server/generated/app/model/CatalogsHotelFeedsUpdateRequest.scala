package model

import play.api.libs.json._

/**
  * Request object for updating a feed.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsHotelFeedsUpdateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: Option[String],
  format: Option[CatalogsFormat],
  credentials: Option[CatalogsFeedCredentials],
  location: Option[String],
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus],
  catalogType: CatalogsType
)

object CatalogsHotelFeedsUpdateRequest {
  implicit lazy val catalogsHotelFeedsUpdateRequestJsonFormat: Format[CatalogsHotelFeedsUpdateRequest] = Json.format[CatalogsHotelFeedsUpdateRequest]
}

