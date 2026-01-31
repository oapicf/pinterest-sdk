package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_following_get_200_response.
  * @param items Users
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserFollowingGet200Response(
  bookmark: Option[String],
  items: List[UserSummary]
)

object UserFollowingGet200Response {
  implicit lazy val userFollowingGet200ResponseJsonFormat: Format[UserFollowingGet200Response] = Json.format[UserFollowingGet200Response]
}

