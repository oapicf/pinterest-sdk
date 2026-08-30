package model

import play.api.libs.json._

/**
  * Request object for creating a feed.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsFeedsCreateRequest(
  catalogId: Option[String],
  catalogType: CatalogsCreativeAssetsFeedsCreateRequest.CatalogType.Value,
  credentials: Option[CatalogsFeedCredentials],
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsCreativeAssetsFeedsCreateRequest {
  implicit lazy val catalogsCreativeAssetsFeedsCreateRequestJsonFormat: Format[CatalogsCreativeAssetsFeedsCreateRequest] = Json.format[CatalogsCreativeAssetsFeedsCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

