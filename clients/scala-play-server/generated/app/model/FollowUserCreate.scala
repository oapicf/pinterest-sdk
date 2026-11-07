package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param autoFollow   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FollowUserCreate(
  autoFollow: Option[Boolean]
)

object FollowUserCreate {
  implicit lazy val followUserCreateJsonFormat: Format[FollowUserCreate] = Json.format[FollowUserCreate]
}

