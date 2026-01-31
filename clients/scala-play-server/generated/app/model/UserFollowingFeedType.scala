package model

import play.api.libs.json._

/**
  * Specifies the type of followees to be kept when filtering them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserFollowingFeedType(
)

object UserFollowingFeedType {
  implicit lazy val userFollowingFeedTypeJsonFormat: Format[UserFollowingFeedType] = Json.format[UserFollowingFeedType]
}

