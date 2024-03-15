package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_following_get_200_response.
  * @param items Users
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserFollowingGet200Response(
  items: List[UserSummary],
  bookmark: Option[String]
)

object UserFollowingGet200Response {
  implicit lazy val userFollowingGet200ResponseJsonFormat: Format[UserFollowingGet200Response] = Json.format[UserFollowingGet200Response]
}

