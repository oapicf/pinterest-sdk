package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CustomLabel2Filter(
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel2Filter {
  implicit lazy val customLabel2FilterJsonFormat: Format[CustomLabel2Filter] = Json.format[CustomLabel2Filter]
}

