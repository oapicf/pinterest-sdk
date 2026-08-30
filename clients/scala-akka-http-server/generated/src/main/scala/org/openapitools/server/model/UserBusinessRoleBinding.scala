package org.openapitools.server.model


/**
 * @param assetsSummary Ad accounts and profiles the business member/partner has access to. for example: ''null''
 * @param businessRoles The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. for example: ''["BIZ_ADMIN"]''
 * @param createdByBusiness Metadata for the business that created the business relationship. for example: ''null''
 * @param createdByUser Metadata for the user that created the business relationship. for example: ''null''
 * @param createdTime The time the business relationship was created. Returned in milliseconds. for example: ''1646767577816''
 * @param id Unique identifier of the business member/business partner/employer. for example: ''549755885175''
 * @param isSharedPartner This field is only relevant when business_role=\"PARTNER\". If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. for example: ''false''
 * @param user Metadata for the business member/business partner/employer. for example: ''null''
*/
final case class UserBusinessRoleBinding (
  assetsSummary: Option[BusinessMemberAssetsSummary] = None,
  businessRoles: Option[Seq[String]] = None,
  createdByBusiness: Option[BusinessAccessUserSummary] = None,
  createdByUser: Option[BusinessAccessUserSummary] = None,
  createdTime: Option[Int] = None,
  id: Option[String] = None,
  isSharedPartner: Option[Boolean] = None,
  user: Option[BusinessAccessUserSummary] = None
)

