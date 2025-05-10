package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationDetails.
  * @param providedValue Provided value that caused the validation issue.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsItemValidationDetails(
  attributeName: NullableCatalogsItemFieldType,
  providedValue: String
)

object CatalogsItemValidationDetails {
  implicit lazy val catalogsItemValidationDetailsJsonFormat: Format[CatalogsItemValidationDetails] = Json.format[CatalogsItemValidationDetails]
}

