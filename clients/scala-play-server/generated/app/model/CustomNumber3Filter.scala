package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomNumber3Filter(
  CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria
)

object CustomNumber3Filter {
  implicit lazy val customNumber3FilterJsonFormat: Format[CustomNumber3Filter] = Json.format[CustomNumber3Filter]
}

