package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SingleInterestTargetingOption.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SingleInterestTargetingOption(
  childInterests: List[String],
  id: String,
  level: Int,
  name: String
)

object SingleInterestTargetingOption {
  implicit lazy val singleInterestTargetingOptionJsonFormat: Format[SingleInterestTargetingOption] = Json.format[SingleInterestTargetingOption]
}

