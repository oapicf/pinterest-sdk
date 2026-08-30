package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomLabel3Filter(
  CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria
)

object CustomLabel3Filter {
  implicit lazy val customLabel3FilterJsonFormat: Format[CustomLabel3Filter] = Json.format[CustomLabel3Filter]
}

