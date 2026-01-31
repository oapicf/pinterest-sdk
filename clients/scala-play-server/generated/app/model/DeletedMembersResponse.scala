package model

import play.api.libs.json._

/**
  * An object with a list of members that were deleted.
  * @param deletedMembers List of members whose business membership have been terminated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeletedMembersResponse(
  deletedMembers: Option[List[String]]
)

object DeletedMembersResponse {
  implicit lazy val deletedMembersResponseJsonFormat: Format[DeletedMembersResponse] = Json.format[DeletedMembersResponse]
}

