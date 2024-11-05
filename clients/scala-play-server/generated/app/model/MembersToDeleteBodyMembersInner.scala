package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MembersToDeleteBody_members_inner.
  * @param memberId Unique identifier of the member
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MembersToDeleteBodyMembersInner(
  memberId: String,
  businessRole: BusinessRoleForMembers
)

object MembersToDeleteBodyMembersInner {
  implicit lazy val membersToDeleteBodyMembersInnerJsonFormat: Format[MembersToDeleteBodyMembersInner] = Json.format[MembersToDeleteBodyMembersInner]
}

