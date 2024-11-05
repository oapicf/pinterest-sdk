package org.openapitools.server.model


/**
 * @param businessRole The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. for example: ''EMPLOYEE''
 * @param memberId Unique identifier of the business member. for example: ''140943737684417''
*/
final case class UpdateMemberResult (
  businessRole: Option[String] = None,
  memberId: Option[String] = None
)

