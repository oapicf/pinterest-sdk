package model

import play.api.libs.json._

/**
  * Request object for updating a feed.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsFeedsUpdateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: Option[String],
  format: Option[CatalogsFormat],
  credentials: Option[CatalogsFeedCredentials],
  location: Option[String],
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus],
  catalogType: CatalogsType
)

object CatalogsCreativeAssetsFeedsUpdateRequest {
  implicit lazy val catalogsCreativeAssetsFeedsUpdateRequestJsonFormat: Format[CatalogsCreativeAssetsFeedsUpdateRequest] = Json.format[CatalogsCreativeAssetsFeedsUpdateRequest]
}

