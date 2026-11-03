package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomLabel3Filter(
  CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria
)

object CustomLabel3Filter {
  implicit lazy val customLabel3FilterJsonFormat: Format[CustomLabel3Filter] = Json.format[CustomLabel3Filter]
}

