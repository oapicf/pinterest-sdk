package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel0Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CustomLabel0Filter(
  CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel0Filter {
  implicit lazy val customLabel0FilterJsonFormat: Format[CustomLabel0Filter] = Json.format[CustomLabel0Filter]
}

