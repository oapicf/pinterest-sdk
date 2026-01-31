package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel4Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomLabel4Filter(
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel4Filter {
  implicit lazy val customLabel4FilterJsonFormat: Format[CustomLabel4Filter] = Json.format[CustomLabel4Filter]
}

