package model

import play.api.libs.json._

/**
  * Specifies the type of followees to be kept when filtering them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UserFollowingFeedType(
)

object UserFollowingFeedType {
  implicit lazy val userFollowingFeedTypeJsonFormat: Format[UserFollowingFeedType] = Json.format[UserFollowingFeedType]
}

