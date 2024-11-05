package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SingleInterestTargetingOptionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SingleInterestTargetingOptionResponse(
  id: Option[String],
  name: Option[String],
  childInterests: Option[List[String]],
  level: Option[Int]
)

object SingleInterestTargetingOptionResponse {
  implicit lazy val singleInterestTargetingOptionResponseJsonFormat: Format[SingleInterestTargetingOptionResponse] = Json.format[SingleInterestTargetingOptionResponse]
}

