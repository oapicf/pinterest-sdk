package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FollowUser.
  * @param `type` Always 'user'
  * @param username Username
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FollowUser(
  `type`: Option[String],
  username: Option[String]
)

object FollowUser {
  implicit lazy val followUserJsonFormat: Format[FollowUser] = Json.format[FollowUser]
}

