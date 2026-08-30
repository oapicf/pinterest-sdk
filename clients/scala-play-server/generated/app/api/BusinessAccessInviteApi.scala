package api

import play.api.libs.json._
import model.AuthRespondInvitesBody
import model.CancelInvitesRequest
import model.CancelInvitesResponse
import model.CreateAssetAccessRequestBody
import model.CreateAssetAccessRequestResponse
import model.CreateAssetInvitesRequest
import model.CreateInvitesResultsResponseArray
import model.CreateMembershipOrPartnershipInvitesBody
import model.Error
import model.GetInvites200Response
import model.InviteFilterStatus
import model.InviteType
import model.RespondToInvitesResponseArray
import model.UpdateInvitesResultsResponseArray

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait BusinessAccessInviteApi {
  /**
    * Create a request to access an existing partner&#39;s assets.
    * Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
    * @param businessId Unique identifier of the requesting business.
    */
  def assetAccessRequestsCreate(businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody): CreateAssetAccessRequestResponse

  /**
    * Cancel invites/requests
    * Cancel membership/partnership invites and/or requests.
    * @param businessId Unique identifier of the requesting business.
    */
  def cancelInvitesOrRequests(businessId: String, cancelInvitesRequest: CancelInvitesRequest): CancelInvitesResponse

  /**
    * Update invite/request with an asset permission
    * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
    * @param businessId Unique identifier of the requesting business.
    */
  def createAssetInvites(businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest): UpdateInvitesResultsResponseArray

  /**
    * Create invites or requests
    * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
    * @param businessId Unique identifier of the requesting business.
    */
  def createMembershipOrPartnershipInvites(businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody): CreateInvitesResultsResponseArray

  /**
    * Get invites/requests
    * Get the membership/partnership invites and/or requests for the authorized user.
    * @param businessId Unique identifier of the requesting business.
    * @param isMember A boolean field to indicate whether the invite is to create a partnership or a membership.
    * @param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
    * @param inviteType Invite type to filter invites by. Only invites of the specified type will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def getInvites(businessId: String, isMember: Option[Boolean], inviteStatus: Option[List[InviteFilterStatus]], inviteType: Option[InviteType], bookmark: Option[String], pageSize: Option[Int]): GetInvites200Response

  /**
    * Accept or decline an invite/request
    * Accept or decline invites or requests.
    */
  def respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody): RespondToInvitesResponseArray
}
