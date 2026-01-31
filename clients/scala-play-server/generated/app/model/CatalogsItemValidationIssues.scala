package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationIssues.
  * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  * @param itemId The merchant-created unique ID that represents the product.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsItemValidationIssues(
  itemNumber: Int,
  itemId: String,
  errors: CatalogsItemValidationErrors,
  warnings: CatalogsItemValidationWarnings
)

object CatalogsItemValidationIssues {
  implicit lazy val catalogsItemValidationIssuesJsonFormat: Format[CatalogsItemValidationIssues] = Json.format[CatalogsItemValidationIssues]
}

