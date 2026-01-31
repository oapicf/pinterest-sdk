package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_account_followed_interests_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserAccountFollowedInterests200Response(
  bookmark: Option[String],
  items: List[Interest]
)

object UserAccountFollowedInterests200Response {
  implicit lazy val userAccountFollowedInterests200ResponseJsonFormat: Format[UserAccountFollowedInterests200Response] = Json.format[UserAccountFollowedInterests200Response]
}

