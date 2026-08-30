package model

import play.api.libs.json._

/**
  * A business member identified by `member_id` with their `business_role` in the business.
  * @param memberId Unique identifier of the member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessMembershipMember(
  businessRole: BusinessRoleForMembers,
  memberId: String
)

object BusinessMembershipMember {
  implicit lazy val businessMembershipMemberJsonFormat: Format[BusinessMembershipMember] = Json.format[BusinessMembershipMember]
}

