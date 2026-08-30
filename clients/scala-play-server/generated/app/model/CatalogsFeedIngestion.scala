package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsFeedIngestion.
  * @param createdAt Timestamp of the feed ingestion.
  * @param feedId Catalog Feed id pertaining to the feed ingestion.
  * @param id Unique identifier of a feed ingestion.
  * @param status Status of the feed ingestion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedIngestion(
  createdAt: OffsetDateTime,
  feedId: String,
  id: String,
  status: CatalogsFeedProcessingStatus
)

object CatalogsFeedIngestion {
  implicit lazy val catalogsFeedIngestionJsonFormat: Format[CatalogsFeedIngestion] = Json.format[CatalogsFeedIngestion]
}

