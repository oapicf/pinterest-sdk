package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_account_followed_interests_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserAccountFollowedInterests200Response(
  items: List[Interest],
  bookmark: Option[String]
)

object UserAccountFollowedInterests200Response {
  implicit lazy val userAccountFollowedInterests200ResponseJsonFormat: Format[UserAccountFollowedInterests200Response] = Json.format[UserAccountFollowedInterests200Response]
}

