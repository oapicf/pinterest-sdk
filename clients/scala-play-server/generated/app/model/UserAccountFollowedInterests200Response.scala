package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_account_followed_interests_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class UserAccountFollowedInterests200Response(
  bookmark: Option[String],
  items: List[Interest]
)

object UserAccountFollowedInterests200Response {
  implicit lazy val userAccountFollowedInterests200ResponseJsonFormat: Format[UserAccountFollowedInterests200Response] = Json.format[UserAccountFollowedInterests200Response]
}

