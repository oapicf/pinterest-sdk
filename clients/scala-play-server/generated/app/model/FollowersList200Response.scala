package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for followers_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FollowersList200Response(
  items: List[UserSummary],
  bookmark: Option[String]
)

object FollowersList200Response {
  implicit lazy val followersList200ResponseJsonFormat: Format[FollowersList200Response] = Json.format[FollowersList200Response]
}

