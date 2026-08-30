package api

import play.api.libs.json._
import model.BrandAccount
import model.BrandAccountCreate
import model.BrandAccountUpdate
import model.BusinessMembershipMember
import model.DeleteBusinessMembership200Response
import model.DeleteBusinessMembershipBody
import model.DeleteBusinessPartners
import model.DeleteBusinessPartnersDelete
import model.Error
import model.GetBusinessEmployers200Response
import model.MemberBusinessRole
import model.PartnerType
import model.SystemUserUpdateWithRequiredBody
import model.UpdateBusinessMembershipsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait BusinessAccessRelationshipsApi {
  /**
    * Create a Brand Account
    * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
    * @param businessHierarchyId business hierarchy node id
    */
  def brandAccountsCreate(businessHierarchyId: String, brandAccountCreate: BrandAccountCreate): BrandAccount

  /**
    * Update a Brand Account
    * Update an existing Brand Account
    * @param businessHierarchyId business hierarchy node id
    */
  def brandAccountsUpdate(brandAccountId: String, businessHierarchyId: String, brandAccountUpdate: BrandAccountUpdate): BrandAccount

  /**
    * Terminate business memberships
    * Terminate memberships between the specified members and your business.
    * @param businessId Business id
    */
  def deleteBusinessMembership(businessId: String, deleteBusinessMembershipBody: DeleteBusinessMembershipBody): DeleteBusinessMembership200Response

  /**
    * Terminate business partnerships
    * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
    * @param businessId Unique identifier of the requesting business.
    */
  def deleteBusinessPartners(businessId: String, deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete): DeleteBusinessPartners

  /**
    * List business employers for user
    * Get all of the viewing user&#39;s business employers.
    * @param assetsSummary Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def getBusinessEmployers(assetsSummary: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): GetBusinessEmployers200Response

  /**
    * Get business members
    * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
    * @param businessId Unique identifier of the requesting business.
    * @param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False.
    * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * @param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
    * @param memberIds A list of business members ids separated by comma.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def getBusinessMembers(businessId: String, fetchSystemUsers: Option[Boolean], assetsSummary: Option[Boolean], businessRoles: Option[List[MemberBusinessRole]], memberIds: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): GetBusinessEmployers200Response

  /**
    * Get business partners
    * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
    * @param businessId Unique identifier of the requesting business.
    * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    * @param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param sortAscending Sort ascending.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def getBusinessPartners(businessId: String, assetsSummary: Option[Boolean], partnerType: Option[PartnerType], partnerIds: Option[String], startIndex: Option[Int], sortAscending: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): GetBusinessEmployers200Response

  /**
    * Update a system user information.
    * Update a system user information such as name.
    * @param businessId Unique identifier of the requesting business.
    * @param systemUserId Unique identifier of a system user.
    */
  def systemUserUpdate(businessId: String, systemUserId: String, systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody): Unit

  /**
    * Update member&#39;s business role
    * Update a member&#39;s business role within the business.
    * @param businessId Business id
    */
  def updateBusinessMemberships(businessId: String, businessMembershipMember: List[BusinessMembershipMember]): UpdateBusinessMembershipsResponse
}
