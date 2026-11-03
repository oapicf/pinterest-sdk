package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomLabel2Filter(
  CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria
)

object CustomLabel2Filter {
  implicit lazy val customLabel2FilterJsonFormat: Format[CustomLabel2Filter] = Json.format[CustomLabel2Filter]
}

