package model

import play.api.libs.json._

/**
  * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelFeedsCreateRequest(
  catalogId: Option[String],
  catalogType: CatalogsHotelFeedsCreateRequest.CatalogType.Value,
  credentials: Option[CatalogsFeedCredentials],
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsHotelFeedsCreateRequest {
  implicit lazy val catalogsHotelFeedsCreateRequestJsonFormat: Format[CatalogsHotelFeedsCreateRequest] = Json.format[CatalogsHotelFeedsCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

