package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel0Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomLabel0Filter(
  CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria
)

object CustomLabel0Filter {
  implicit lazy val customLabel0FilterJsonFormat: Format[CustomLabel0Filter] = Json.format[CustomLabel0Filter]
}

