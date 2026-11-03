package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomNumber2Filter(
  CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria
)

object CustomNumber2Filter {
  implicit lazy val customNumber2FilterJsonFormat: Format[CustomNumber2Filter] = Json.format[CustomNumber2Filter]
}

