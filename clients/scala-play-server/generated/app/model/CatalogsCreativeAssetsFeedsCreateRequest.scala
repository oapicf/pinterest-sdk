package model

import play.api.libs.json._

/**
  * Request object for creating a feed.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsFeedsCreateRequest(
  catalogId: Option[String],
  catalogType: CatalogsType,
  credentials: Option[CatalogsFeedCredentials],
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsCreativeAssetsFeedsCreateRequest {
  implicit lazy val catalogsCreativeAssetsFeedsCreateRequestJsonFormat: Format[CatalogsCreativeAssetsFeedsCreateRequest] = Json.format[CatalogsCreativeAssetsFeedsCreateRequest]
}

