package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber1Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomNumber1Filter(
  CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria
)

object CustomNumber1Filter {
  implicit lazy val customNumber1FilterJsonFormat: Format[CustomNumber1Filter] = Json.format[CustomNumber1Filter]
}

