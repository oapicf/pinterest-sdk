package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel0Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CustomLabel0Filter(
  CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel0Filter {
  implicit lazy val customLabel0FilterJsonFormat: Format[CustomLabel0Filter] = Json.format[CustomLabel0Filter]
}

