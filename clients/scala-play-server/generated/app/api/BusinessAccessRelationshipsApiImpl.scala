package api

import model.BrandAccountsCreate200Response
import model.BrandAccountsCreateRequest
import model.BrandAccountsUpdateRequest
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
import model.SystemUserUpdateRequest
import model.UpdateMemberBusinessRoleBody
import model.UpdateMemberResultsResponseArray

/**
  * Provides a default implementation for [[BusinessAccessRelationshipsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class BusinessAccessRelationshipsApiImpl extends BusinessAccessRelationshipsApi {
  /**
    * @inheritdoc
    */
  override def brandAccountsCreate(businessHierarchyId: String, brandAccountsCreateRequest: BrandAccountsCreateRequest): BrandAccountsCreate200Response = {
    // TODO: Implement better logic

    BrandAccountsCreate200Response(None)
  }

  /**
    * @inheritdoc
    */
  override def brandAccountsUpdate(businessHierarchyId: String, brandAccountId: String, brandAccountsUpdateRequest: BrandAccountsUpdateRequest): BrandAccountsCreate200Response = {
    // TODO: Implement better logic

    BrandAccountsCreate200Response(None)
  }

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

    GetBusinessEmployers200Response(None, List.empty[UserBusinessRoleBinding])
  }

  /**
    * @inheritdoc
    */
  override def getBusinessMembers(businessId: String, fetchSystemUsers: Option[Boolean], assetsSummary: Option[Boolean], businessRoles: Option[List[MemberBusinessRole]], memberIds: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): GetBusinessMembers200Response = {
    // TODO: Implement better logic

    GetBusinessMembers200Response(None, List.empty[UserBusinessRoleBinding])
  }

  /**
    * @inheritdoc
    */
  override def getBusinessPartners(businessId: String, assetsSummary: Option[Boolean], partnerType: Option[PartnerType], partnerIds: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]): GetBusinessPartners200Response = {
    // TODO: Implement better logic

    GetBusinessPartners200Response(None, List.empty[UserBusinessRoleBinding])
  }

  /**
    * @inheritdoc
    */
  override def systemUserUpdate(businessId: String, systemUserId: String, systemUserUpdateRequest: SystemUserUpdateRequest): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessMemberships(businessId: String, updateMemberBusinessRoleBody: List[UpdateMemberBusinessRoleBody]): UpdateMemberResultsResponseArray = {
    // TODO: Implement better logic

    UpdateMemberResultsResponseArray(None)
  }
}
