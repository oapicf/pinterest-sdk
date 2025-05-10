package model

import play.api.libs.json._

/**
  * Single instance of a business member to have its role updated
  * @param memberId Unique identifier of the member
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdateMemberBusinessRoleBody(
  businessRole: BusinessRoleForMembers,
  memberId: String
)

object UpdateMemberBusinessRoleBody {
  implicit lazy val updateMemberBusinessRoleBodyJsonFormat: Format[UpdateMemberBusinessRoleBody] = Json.format[UpdateMemberBusinessRoleBody]
}

