package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomLabel2Filter(
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria
)

object CustomLabel2Filter {
  implicit lazy val customLabel2FilterJsonFormat: Format[CustomLabel2Filter] = Json.format[CustomLabel2Filter]
}

