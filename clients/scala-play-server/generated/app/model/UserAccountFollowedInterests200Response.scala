package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_account_followed_interests_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UserAccountFollowedInterests200Response(
  items: List[Interest],
  bookmark: Option[String]
)

object UserAccountFollowedInterests200Response {
  implicit lazy val userAccountFollowedInterests200ResponseJsonFormat: Format[UserAccountFollowedInterests200Response] = Json.format[UserAccountFollowedInterests200Response]
}

