package api

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

/**
  * Provides a default implementation for [[BusinessAccessInviteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class BusinessAccessInviteApiImpl extends BusinessAccessInviteApi {
  /**
    * @inheritdoc
    */
  override def assetAccessRequestsCreate(businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody): CreateAssetAccessRequestResponse = {
    // TODO: Implement better logic

    CreateAssetAccessRequestResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def cancelInvitesOrRequests(businessId: String, cancelInvitesRequest: CancelInvitesRequest): CancelInvitesResponse = {
    // TODO: Implement better logic

    CancelInvitesResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def createAssetInvites(businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest): UpdateInvitesResultsResponseArray = {
    // TODO: Implement better logic

    UpdateInvitesResultsResponseArray(None)
  }

  /**
    * @inheritdoc
    */
  override def createMembershipOrPartnershipInvites(businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody): CreateInvitesResultsResponseArray = {
    // TODO: Implement better logic

    CreateInvitesResultsResponseArray(None)
  }

  /**
    * @inheritdoc
    */
  override def getInvites(businessId: String, isMember: Option[Boolean], inviteStatus: Option[List[InviteFilterStatus]], inviteType: Option[InviteType], bookmark: Option[String], pageSize: Option[Int]): GetInvites200Response = {
    // TODO: Implement better logic

    GetInvites200Response(None, List.empty[InviteResponse])
  }

  /**
    * @inheritdoc
    */
  override def respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody): RespondToInvitesResponseArray = {
    // TODO: Implement better logic

    RespondToInvitesResponseArray(None)
  }
}
