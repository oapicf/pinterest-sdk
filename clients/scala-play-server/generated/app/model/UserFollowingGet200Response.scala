package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_following_get_200_response.
  * @param items Users
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UserFollowingGet200Response(
  items: List[UserSummary],
  bookmark: Option[String]
)

object UserFollowingGet200Response {
  implicit lazy val userFollowingGet200ResponseJsonFormat: Format[UserFollowingGet200Response] = Json.format[UserFollowingGet200Response]
}

