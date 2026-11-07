package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationDetails.
  * @param attributeName Attribute that has a validation issue.
  * @param providedValue Provided value that caused the validation issue.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsItemValidationDetails(
  attributeName: NullableCatalogsItemFieldType,
  providedValue: String
)

object CatalogsItemValidationDetails {
  implicit lazy val catalogsItemValidationDetailsJsonFormat: Format[CatalogsItemValidationDetails] = Json.format[CatalogsItemValidationDetails]
}

