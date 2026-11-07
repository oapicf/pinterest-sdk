package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber4Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomNumber4Filter(
  CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria
)

object CustomNumber4Filter {
  implicit lazy val customNumber4FilterJsonFormat: Format[CustomNumber4Filter] = Json.format[CustomNumber4Filter]
}

