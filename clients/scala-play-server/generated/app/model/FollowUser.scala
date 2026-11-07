package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FollowUser.
  * @param `type` Always 'user'
  * @param username Username
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FollowUser(
  `type`: Option[String],
  username: Option[String]
)

object FollowUser {
  implicit lazy val followUserJsonFormat: Format[FollowUser] = Json.format[FollowUser]
}

