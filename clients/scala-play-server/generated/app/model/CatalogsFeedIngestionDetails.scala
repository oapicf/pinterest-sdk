package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionDetails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedIngestionDetails(
  errors: CatalogsFeedIngestionErrors,
  info: CatalogsFeedIngestionInfo,
  warnings: CatalogsFeedIngestionWarnings
)

object CatalogsFeedIngestionDetails {
  implicit lazy val catalogsFeedIngestionDetailsJsonFormat: Format[CatalogsFeedIngestionDetails] = Json.format[CatalogsFeedIngestionDetails]
}

