package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedValidationDetails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedValidationDetails(
  errors: CatalogsFeedValidationErrors,
  warnings: CatalogsFeedValidationWarnings
)

object CatalogsFeedValidationDetails {
  implicit lazy val catalogsFeedValidationDetailsJsonFormat: Format[CatalogsFeedValidationDetails] = Json.format[CatalogsFeedValidationDetails]
}

