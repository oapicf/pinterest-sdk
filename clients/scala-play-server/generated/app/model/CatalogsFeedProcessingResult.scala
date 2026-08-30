package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsFeedProcessingResult.
  * @param id ID of the feed processing result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedProcessingResult(
  createdAt: OffsetDateTime,
  id: String,
  ingestionDetails: CatalogsFeedIngestionDetails,
  productCounts: CatalogsFeedProductCounts,
  status: CatalogsFeedProcessingStatus,
  updatedAt: OffsetDateTime,
  validationDetails: CatalogsFeedValidationDetails,
  videoCounts: Option[CatalogsFeedVideoCounts]
)

object CatalogsFeedProcessingResult {
  implicit lazy val catalogsFeedProcessingResultJsonFormat: Format[CatalogsFeedProcessingResult] = Json.format[CatalogsFeedProcessingResult]
}

