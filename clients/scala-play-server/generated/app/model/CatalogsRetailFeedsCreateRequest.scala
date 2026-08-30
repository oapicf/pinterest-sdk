package model

import play.api.libs.json._

/**
  * Request object for creating a retail feed.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailFeedsCreateRequest(
  catalogId: Option[String],
  catalogType: CatalogsRetailFeedsCreateRequest.CatalogType.Value,
  credentials: Option[CatalogsFeedCredentials],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCountry: Country,
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsRetailFeedsCreateRequest {
  implicit lazy val catalogsRetailFeedsCreateRequestJsonFormat: Format[CatalogsRetailFeedsCreateRequest] = Json.format[CatalogsRetailFeedsCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

