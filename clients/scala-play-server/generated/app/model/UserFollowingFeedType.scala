package model

import play.api.libs.json._

/**
  * Specifies the type of followees to be kept when filtering them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserFollowingFeedType(
)

object UserFollowingFeedType {
  implicit lazy val userFollowingFeedTypeJsonFormat: Format[UserFollowingFeedType] = Json.format[UserFollowingFeedType]
}

