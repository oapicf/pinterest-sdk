package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel4Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomLabel4Filter(
  CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria
)

object CustomLabel4Filter {
  implicit lazy val customLabel4FilterJsonFormat: Format[CustomLabel4Filter] = Json.format[CustomLabel4Filter]
}

