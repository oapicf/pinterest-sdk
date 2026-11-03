package model

import play.api.libs.json._

/**
  * A business member identified by `member_id` with their `business_role` in the business.
  * @param memberId Unique identifier of the member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BusinessMembershipMember(
  businessRole: BusinessRoleForMembers,
  memberId: String
)

object BusinessMembershipMember {
  implicit lazy val businessMembershipMemberJsonFormat: Format[BusinessMembershipMember] = Json.format[BusinessMembershipMember]
}

