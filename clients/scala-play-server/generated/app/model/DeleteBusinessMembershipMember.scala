package model

import play.api.libs.json._

/**
  * Single instance of a business member to be removed from the business.
  * @param memberId Unique identifier of the member
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeleteBusinessMembershipMember(
  businessRole: BusinessRoleForMembers,
  memberId: String
)

object DeleteBusinessMembershipMember {
  implicit lazy val deleteBusinessMembershipMemberJsonFormat: Format[DeleteBusinessMembershipMember] = Json.format[DeleteBusinessMembershipMember]
}

