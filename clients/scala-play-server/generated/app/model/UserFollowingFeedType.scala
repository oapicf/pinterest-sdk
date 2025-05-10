package model

import play.api.libs.json._

/**
  * Specifies the type of followees to be kept when filtering them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UserFollowingFeedType(
)

object UserFollowingFeedType {
  implicit lazy val userFollowingFeedTypeJsonFormat: Format[UserFollowingFeedType] = Json.format[UserFollowingFeedType]
}

