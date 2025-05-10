package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SingleInterestTargetingOptionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SingleInterestTargetingOptionResponse(
  id: Option[String],
  name: Option[String],
  childInterests: Option[List[String]],
  level: Option[Int]
)

object SingleInterestTargetingOptionResponse {
  implicit lazy val singleInterestTargetingOptionResponseJsonFormat: Format[SingleInterestTargetingOptionResponse] = Json.format[SingleInterestTargetingOptionResponse]
}

