package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for followers_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class FollowersList200Response(
  items: List[UserSummary],
  bookmark: Option[String]
)

object FollowersList200Response {
  implicit lazy val followersList200ResponseJsonFormat: Format[FollowersList200Response] = Json.format[FollowersList200Response]
}

