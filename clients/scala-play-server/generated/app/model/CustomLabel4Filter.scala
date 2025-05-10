package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel4Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CustomLabel4Filter(
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel4Filter {
  implicit lazy val customLabel4FilterJsonFormat: Format[CustomLabel4Filter] = Json.format[CustomLabel4Filter]
}

