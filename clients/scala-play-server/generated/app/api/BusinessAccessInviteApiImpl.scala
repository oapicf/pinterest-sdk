package api

import model.AuthRespondInvitesBody
import model.CancelInvitesBody
import model.CreateAssetAccessRequestBody
import model.CreateAssetAccessRequestResponse
import model.CreateAssetInvitesRequest
import model.CreateInvitesResultsResponseArray
import model.CreateMembershipOrPartnershipInvitesBody
import model.DeleteInvitesResultsResponseArray
import model.Error
import model.GetInvites200Response
import model.InviteType
import model.RespondToInvitesResponseArray
import model.UpdateInvitesResultsResponseArray

/**
  * Provides a default implementation for [[BusinessAccessInviteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
  override def cancelInvitesOrRequests(businessId: String, cancelInvitesBody: CancelInvitesBody): DeleteInvitesResultsResponseArray = {
    // TODO: Implement better logic

    DeleteInvitesResultsResponseArray(None)
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
  override def getInvites(businessId: String, isMember: Option[Boolean], inviteStatus: Option[List[String]], inviteType: Option[InviteType], bookmark: Option[String], pageSize: Option[Int]): GetInvites200Response = {
    // TODO: Implement better logic

    GetInvites200Response(List.empty[InviteResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody): RespondToInvitesResponseArray = {
    // TODO: Implement better logic

    RespondToInvitesResponseArray(None)
  }
}
