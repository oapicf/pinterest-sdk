package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel1Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CustomLabel1Filter(
  CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel1Filter {
  implicit lazy val customLabel1FilterJsonFormat: Format[CustomLabel1Filter] = Json.format[CustomLabel1Filter]
}

