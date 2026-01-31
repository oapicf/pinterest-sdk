package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationIssues.
  * @param itemId The merchant-created unique ID that represents the product.
  * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsItemValidationIssues(
  errors: CatalogsItemValidationErrors,
  itemId: String,
  itemNumber: Int,
  warnings: CatalogsItemValidationWarnings
)

object CatalogsItemValidationIssues {
  implicit lazy val catalogsItemValidationIssuesJsonFormat: Format[CatalogsItemValidationIssues] = Json.format[CatalogsItemValidationIssues]
}

