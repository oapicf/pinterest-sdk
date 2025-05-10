package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CustomLabel3Filter(
  CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel3Filter {
  implicit lazy val customLabel3FilterJsonFormat: Format[CustomLabel3Filter] = Json.format[CustomLabel3Filter]
}

