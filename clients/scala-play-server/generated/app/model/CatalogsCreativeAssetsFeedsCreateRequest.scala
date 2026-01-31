package model

import play.api.libs.json._

/**
  * Request object for creating a feed.
  * @param name A human-friendly name associated to a given feed.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsFeedsCreateRequest(
  defaultCurrency: Option[NullableCurrency],
  name: String,
  format: CatalogsFormat,
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  defaultCountry: Country,
  credentials: Option[CatalogsFeedCredentials],
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  catalogType: CatalogsType,
  catalogId: Option[String],
  status: Option[CatalogsStatus]
)

object CatalogsCreativeAssetsFeedsCreateRequest {
  implicit lazy val catalogsCreativeAssetsFeedsCreateRequestJsonFormat: Format[CatalogsCreativeAssetsFeedsCreateRequest] = Json.format[CatalogsCreativeAssetsFeedsCreateRequest]
}

