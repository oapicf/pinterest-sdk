package model

import play.api.libs.json._

/**
  * Single instance of a business member to have its role updated
  * @param memberId Unique identifier of the member
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UpdateMemberBusinessRoleBody(
  businessRole: BusinessRoleForMembers,
  memberId: String
)

object UpdateMemberBusinessRoleBody {
  implicit lazy val updateMemberBusinessRoleBodyJsonFormat: Format[UpdateMemberBusinessRoleBody] = Json.format[UpdateMemberBusinessRoleBody]
}

