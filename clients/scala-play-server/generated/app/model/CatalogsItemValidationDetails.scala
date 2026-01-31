package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationDetails.
  * @param providedValue Provided value that caused the validation issue.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsItemValidationDetails(
  attributeName: NullableCatalogsItemFieldType,
  providedValue: String
)

object CatalogsItemValidationDetails {
  implicit lazy val catalogsItemValidationDetailsJsonFormat: Format[CatalogsItemValidationDetails] = Json.format[CatalogsItemValidationDetails]
}

