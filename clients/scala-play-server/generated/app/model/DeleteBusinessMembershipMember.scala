package model

import play.api.libs.json._

/**
  * Single instance of a business member to be removed from the business.
  * @param memberId Unique identifier of the member
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DeleteBusinessMembershipMember(
  businessRole: BusinessRoleForMembers,
  memberId: String
)

object DeleteBusinessMembershipMember {
  implicit lazy val deleteBusinessMembershipMemberJsonFormat: Format[DeleteBusinessMembershipMember] = Json.format[DeleteBusinessMembershipMember]
}

