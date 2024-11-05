package api

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

/**
  * Provides a default implementation for [[BusinessAccessRelationshipsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class BusinessAccessRelationshipsApiImpl extends BusinessAccessRelationshipsApi {
  /**
    * @inheritdoc
    */
  override def deleteBusinessMembership(businessId: String, membersToDeleteBody: MembersToDeleteBody): DeletedMembersResponse = {
    // TODO: Implement better logic

    DeletedMembersResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def deleteBusinessPartners(businessId: String, deletePartnersRequest: DeletePartnersRequest): DeletePartnersResponse = {
    // TODO: Implement better logic

    DeletePartnersResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getBusinessEmployers(pageSize: Option[Int], bookmark: Option[String]): GetBusinessEmployers200Response = {
    // TODO: Implement better logic

    GetBusinessEmployers200Response(List.empty[UserBusinessRoleBinding], None)
  }

  /**
    * @inheritdoc
    */
  override def getBusinessMembers(businessId: String, assetsSummary: Option[Boolean], businessRoles: Option[List[MemberBusinessRole]], memberIds: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): GetBusinessMembers200Response = {
    // TODO: Implement better logic

    GetBusinessMembers200Response(List.empty[UserBusinessRoleBinding], None)
  }

  /**
    * @inheritdoc
    */
  override def getBusinessPartners(businessId: String, assetsSummary: Option[Boolean], partnerType: Option[PartnerType], partnerIds: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]): GetBusinessPartners200Response = {
    // TODO: Implement better logic

    GetBusinessPartners200Response(List.empty[UserBusinessRoleBinding], None)
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessMemberships(businessId: String, updateMemberBusinessRoleBody: List[UpdateMemberBusinessRoleBody]): UpdateMemberResultsResponseArray = {
    // TODO: Implement better logic

    UpdateMemberResultsResponseArray(None)
  }
}
