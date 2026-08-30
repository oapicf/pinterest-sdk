package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedUpdateRequestSchema.
  * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @param name A human-friendly name associated to a given feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedUpdateRequestSchema(
  catalogType: CatalogsFeedUpdateRequestSchema.CatalogType.Value,
  credentials: Option[CatalogsFeedCredentials],
  defaultAvailability: Option[ProductAvailabilityType],
  defaultCurrency: Option[NullableCurrency],
  format: Option[CatalogsFormat],
  location: Option[String],
  name: Option[String],
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
  status: Option[CatalogsStatus]
)

object CatalogsFeedUpdateRequestSchema {
  implicit lazy val catalogsFeedUpdateRequestSchemaJsonFormat: Format[CatalogsFeedUpdateRequestSchema] = Json.format[CatalogsFeedUpdateRequestSchema]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

