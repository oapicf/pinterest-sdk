package model

import play.api.libs.json._

/**
  * Specifies the type of followees to be kept when filtering them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UserFollowingFeedType(
)

object UserFollowingFeedType {
  implicit lazy val userFollowingFeedTypeJsonFormat: Format[UserFollowingFeedType] = Json.format[UserFollowingFeedType]
}

