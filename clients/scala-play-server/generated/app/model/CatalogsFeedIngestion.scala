package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsFeedIngestion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsFeedIngestion(
  id: String,
  feedId: String,
  createdAt: OffsetDateTime,
  status: CatalogsFeedProcessingStatus
)

object CatalogsFeedIngestion {
  implicit lazy val catalogsFeedIngestionJsonFormat: Format[CatalogsFeedIngestion] = Json.format[CatalogsFeedIngestion]
}

