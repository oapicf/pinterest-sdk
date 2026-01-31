package model

import play.api.libs.json._

/**
  * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
  * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelFeedsCreateRequest(
  catalogId: Option[String],
  catalogType: CatalogsType,
  credentials: Option[CatalogsFeedCredentials],
  defaultCurrency: Option[NullableCurrency],
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  format: CatalogsFormat,
  location: String,
  name: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsHotelFeedsCreateRequest {
  implicit lazy val catalogsHotelFeedsCreateRequestJsonFormat: Format[CatalogsHotelFeedsCreateRequest] = Json.format[CatalogsHotelFeedsCreateRequest]
}

