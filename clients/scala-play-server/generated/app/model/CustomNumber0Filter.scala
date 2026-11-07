package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomNumber0Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomNumber0Filter(
  CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria
)

object CustomNumber0Filter {
  implicit lazy val customNumber0FilterJsonFormat: Format[CustomNumber0Filter] = Json.format[CustomNumber0Filter]
}

