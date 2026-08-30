package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalogs Hotel Feed object
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param defaultLocale The locale used within a feed for product descriptions.
  * @param id ID of the feed entity.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelFeed(
  catalogId: String,
  catalogType: CatalogsHotelFeed.CatalogType.Value,
  createdAt: OffsetDateTime,
  credentials: Option[CatalogsFeedCredentials],
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

object CatalogsHotelFeed {
  implicit lazy val catalogsHotelFeedJsonFormat: Format[CatalogsHotelFeed] = Json.format[CatalogsHotelFeed]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

