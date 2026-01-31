package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsFeedIngestion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedIngestion(
  id: String,
  feedId: String,
  createdAt: OffsetDateTime,
  status: CatalogsFeedProcessingStatus
)

object CatalogsFeedIngestion {
  implicit lazy val catalogsFeedIngestionJsonFormat: Format[CatalogsFeedIngestion] = Json.format[CatalogsFeedIngestion]
}

