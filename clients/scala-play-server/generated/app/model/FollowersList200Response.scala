package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for followers_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FollowersList200Response(
  bookmark: Option[String],
  items: List[FollowUser]
)

object FollowersList200Response {
  implicit lazy val followersList200ResponseJsonFormat: Format[FollowersList200Response] = Json.format[FollowersList200Response]
}

