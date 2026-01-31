package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MembersToDeleteBody_members_inner.
  * @param memberId Unique identifier of the member
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MembersToDeleteBodyMembersInner(
  memberId: String,
  businessRole: BusinessRoleForMembers
)

object MembersToDeleteBodyMembersInner {
  implicit lazy val membersToDeleteBodyMembersInnerJsonFormat: Format[MembersToDeleteBodyMembersInner] = Json.format[MembersToDeleteBodyMembersInner]
}

