package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel1Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomLabel1Filter(
  CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria
)

object CustomLabel1Filter {
  implicit lazy val customLabel1FilterJsonFormat: Format[CustomLabel1Filter] = Json.format[CustomLabel1Filter]
}

