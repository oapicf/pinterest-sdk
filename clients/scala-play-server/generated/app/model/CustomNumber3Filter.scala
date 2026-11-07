package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomNumber3Filter(
  CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria
)

object CustomNumber3Filter {
  implicit lazy val customNumber3FilterJsonFormat: Format[CustomNumber3Filter] = Json.format[CustomNumber3Filter]
}

