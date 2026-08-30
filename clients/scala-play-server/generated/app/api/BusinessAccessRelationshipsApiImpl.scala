package api

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

/**
  * Provides a default implementation for [[BusinessAccessRelationshipsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class BusinessAccessRelationshipsApiImpl extends BusinessAccessRelationshipsApi {
  /**
    * @inheritdoc
    */
  override def brandAccountsCreate(businessHierarchyId: String, brandAccountCreate: BrandAccountCreate): BrandAccount = {
    // TODO: Implement better logic

    BrandAccount("")
  }

  /**
    * @inheritdoc
    */
  override def brandAccountsUpdate(brandAccountId: String, businessHierarchyId: String, brandAccountUpdate: BrandAccountUpdate): BrandAccount = {
    // TODO: Implement better logic

    BrandAccount("")
  }

  /**
    * @inheritdoc
    */
  override def deleteBusinessMembership(businessId: String, deleteBusinessMembershipBody: DeleteBusinessMembershipBody): DeleteBusinessMembership200Response = {
    // TODO: Implement better logic

    DeleteBusinessMembership200Response(None)
  }

  /**
    * @inheritdoc
    */
  override def deleteBusinessPartners(businessId: String, deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete): DeleteBusinessPartners = {
    // TODO: Implement better logic

    DeleteBusinessPartners(None)
  }

  /**
    * @inheritdoc
    */
  override def getBusinessEmployers(assetsSummary: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): GetBusinessEmployers200Response = {
    // TODO: Implement better logic

    GetBusinessEmployers200Response(None, List.empty[UserBusinessRoleBinding])
  }

  /**
    * @inheritdoc
    */
  override def getBusinessMembers(businessId: String, fetchSystemUsers: Option[Boolean], assetsSummary: Option[Boolean], businessRoles: Option[List[MemberBusinessRole]], memberIds: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): GetBusinessEmployers200Response = {
    // TODO: Implement better logic

    GetBusinessEmployers200Response(None, List.empty[UserBusinessRoleBinding])
  }

  /**
    * @inheritdoc
    */
  override def getBusinessPartners(businessId: String, assetsSummary: Option[Boolean], partnerType: Option[PartnerType], partnerIds: Option[String], startIndex: Option[Int], sortAscending: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): GetBusinessEmployers200Response = {
    // TODO: Implement better logic

    GetBusinessEmployers200Response(None, List.empty[UserBusinessRoleBinding])
  }

  /**
    * @inheritdoc
    */
  override def systemUserUpdate(businessId: String, systemUserId: String, systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessMemberships(businessId: String, businessMembershipMember: List[BusinessMembershipMember]): UpdateBusinessMembershipsResponse = {
    // TODO: Implement better logic

    UpdateBusinessMembershipsResponse(None)
  }
}
