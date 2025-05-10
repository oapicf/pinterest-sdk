package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_following_get_200_response.
  * @param items Users
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UserFollowingGet200Response(
  items: List[UserSummary],
  bookmark: Option[String]
)

object UserFollowingGet200Response {
  implicit lazy val userFollowingGet200ResponseJsonFormat: Format[UserFollowingGet200Response] = Json.format[UserFollowingGet200Response]
}

