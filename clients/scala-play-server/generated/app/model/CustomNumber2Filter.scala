package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomNumber2Filter(
  CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria
)

object CustomNumber2Filter {
  implicit lazy val customNumber2FilterJsonFormat: Format[CustomNumber2Filter] = Json.format[CustomNumber2Filter]
}

