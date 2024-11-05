package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsFeedIngestion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFeedIngestion(
  id: String,
  feedId: String,
  createdAt: OffsetDateTime,
  status: CatalogsFeedProcessingStatus
)

object CatalogsFeedIngestion {
  implicit lazy val catalogsFeedIngestionJsonFormat: Format[CatalogsFeedIngestion] = Json.format[CatalogsFeedIngestion]
}

