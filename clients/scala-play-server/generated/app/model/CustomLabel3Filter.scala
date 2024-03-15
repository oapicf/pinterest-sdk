package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CustomLabel3Filter(
  CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel3Filter {
  implicit lazy val customLabel3FilterJsonFormat: Format[CustomLabel3Filter] = Json.format[CustomLabel3Filter]
}

