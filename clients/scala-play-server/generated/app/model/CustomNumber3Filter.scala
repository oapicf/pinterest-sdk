package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomNumber3Filter(
  CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria
)

object CustomNumber3Filter {
  implicit lazy val customNumber3FilterJsonFormat: Format[CustomNumber3Filter] = Json.format[CustomNumber3Filter]
}

