package api

import play.api.libs.json._
import model.DeletePartnersRequest
import model.DeletePartnersResponse
import model.DeletedMembersResponse
import model.Error
import model.GetBusinessEmployers200Response
import model.GetBusinessMembers200Response
import model.GetBusinessPartners200Response
import model.MemberBusinessRole
import model.MembersToDeleteBody
import model.PartnerType
import model.UpdateMemberBusinessRoleBody
import model.UpdateMemberResultsResponseArray

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait BusinessAccessRelationshipsApi {
  /**
    * Terminate business memberships
    * Terminate memberships between the specified members and your business.
    * @param businessId Business id
    * @param membersToDeleteBody List of members with role to delete.
    */
  def deleteBusinessMembership(businessId: String, membersToDeleteBody: MembersToDeleteBody): DeletedMembersResponse

  /**
    * Terminate business partnerships
    * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
    * @param businessId Unique identifier of the requesting business.
    * @param deletePartnersRequest An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. 
    */
  def deleteBusinessPartners(businessId: String, deletePartnersRequest: DeletePartnersRequest): DeletePartnersResponse

  /**
    * List business employers for user
    * Get all of the viewing user&#39;s business employers.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def getBusinessEmployers(pageSize: Option[Int], bookmark: Option[String]): GetBusinessEmployers200Response

  /**
    * Get business members
    * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
    * @param businessId Unique identifier of the requesting business.
    * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * @param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
    * @param memberIds A list of business members ids separated by comma.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def getBusinessMembers(businessId: String, assetsSummary: Option[Boolean], businessRoles: Option[List[MemberBusinessRole]], memberIds: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): GetBusinessMembers200Response

  /**
    * Get business partners
    * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
    * @param businessId Unique identifier of the requesting business.
    * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    * @param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def getBusinessPartners(businessId: String, assetsSummary: Option[Boolean], partnerType: Option[PartnerType], partnerIds: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]): GetBusinessPartners200Response

  /**
    * Update member&#39;s business role
    * Update a member&#39;s business role within the business.
    * @param businessId Business id
    * @param updateMemberBusinessRoleBody List of objects with the member id and the business_role.
    */
  def updateBusinessMemberships(businessId: String, updateMemberBusinessRoleBody: List[UpdateMemberBusinessRoleBody]): UpdateMemberResultsResponseArray
}
