package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserBusinessRoleBinding.
  * @param businessRoles The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  * @param createdByBusiness Metadata for the business that created the business relationship.
  * @param createdByUser Metadata for the user that created the business relationship.
  * @param createdTime The time the business relationship was created. Returned in milliseconds.
  * @param id Unique identifier of the business member/business partner/employer.
  * @param isSharedPartner This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
  * @param user Metadata for the business member/business partner/employer.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UserBusinessRoleBinding(
  assetsSummary: Option[BusinessMemberAssetsSummary],
  businessRoles: Option[List[String]],
  createdByBusiness: Option[BusinessAccessUserSummary],
  createdByUser: Option[BusinessAccessUserSummary],
  createdTime: Option[Int],
  id: Option[String],
  isSharedPartner: Option[Boolean],
  user: Option[BusinessAccessUserSummary]
)

object UserBusinessRoleBinding {
  implicit lazy val userBusinessRoleBindingJsonFormat: Format[UserBusinessRoleBinding] = Json.format[UserBusinessRoleBinding]
}

