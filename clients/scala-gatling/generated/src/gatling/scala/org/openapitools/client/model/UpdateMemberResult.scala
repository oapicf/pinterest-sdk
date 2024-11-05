
package org.openapitools.client.model


case class UpdateMemberResult (
    /* The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. */
    _businessRole: Option[String],
    /* Unique identifier of the business member. */
    _memberId: Option[String]
)
object UpdateMemberResult {
    def toStringBody(var_businessRole: Object, var_memberId: Object) =
        s"""
        | {
        | "businessRole":$var_businessRole,"memberId":$var_memberId
        | }
        """.stripMargin
}
