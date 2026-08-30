package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalogs Creative Asset Feed object
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param id ID of the feed entity.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsFeed(
  catalogId: String,
  catalogType: CatalogsCreativeAssetsFeed.CatalogType.Value,
  createdAt: OffsetDateTime,
  credentials: Option[CatalogsFeedCredentials],
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: String,
  format: CatalogsFormat,
  id: String,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: CatalogsStatus,
  updatedAt: OffsetDateTime
)

object CatalogsCreativeAssetsFeed {
  implicit lazy val catalogsCreativeAssetsFeedJsonFormat: Format[CatalogsCreativeAssetsFeed] = Json.format[CatalogsCreativeAssetsFeed]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

