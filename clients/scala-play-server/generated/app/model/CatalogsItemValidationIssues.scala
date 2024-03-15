package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationIssues.
  * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  * @param itemId The merchant-created unique ID that represents the product.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItemValidationIssues(
  itemNumber: Int,
  itemId: String,
  errors: CatalogsItemValidationErrors,
  warnings: CatalogsItemValidationWarnings
)

object CatalogsItemValidationIssues {
  implicit lazy val catalogsItemValidationIssuesJsonFormat: Format[CatalogsItemValidationIssues] = Json.format[CatalogsItemValidationIssues]
}

