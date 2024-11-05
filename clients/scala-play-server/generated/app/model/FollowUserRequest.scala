package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FollowUserRequest.
  * @param autoFollow Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class FollowUserRequest(
  autoFollow: Option[Boolean]
)

object FollowUserRequest {
  implicit lazy val followUserRequestJsonFormat: Format[FollowUserRequest] = Json.format[FollowUserRequest]
}

