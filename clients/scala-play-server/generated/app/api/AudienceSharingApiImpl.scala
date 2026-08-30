package api

import model.AdAccountToAdAccountSharedAudience
import model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import model.AdAccountToBusinessSharedAudience
import model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import model.AdAccountsAudiencesSharedAccountsList200Response
import model.AudienceAccountType
import model.BusinessToAdAccountSharedAudience
import model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import model.BusinessToBusinessSharedAudience
import model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import model.Error
import model.Order
import model.SharedAudiencesForBusinessList200Response

/**
  * Provides a default implementation for [[AudienceSharingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class AudienceSharingApiImpl extends AudienceSharingApi {
  /**
    * @inheritdoc
    */
  override def adAccountsAudiencesSharedAccountsList(audienceId: String, accountType: AudienceAccountType, adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): AdAccountsAudiencesSharedAccountsList200Response = {
    // TODO: Implement better logic

    AdAccountsAudiencesSharedAccountsList200Response(None, List.empty[SharedAudienceAccount])
  }

  /**
    * @inheritdoc
    */
  override def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: AudienceAccountType, bookmark: Option[String], pageSize: Option[Int]): AdAccountsAudiencesSharedAccountsList200Response = {
    // TODO: Implement better logic

    AdAccountsAudiencesSharedAccountsList200Response(None, List.empty[SharedAudienceAccount])
  }

  /**
    * @inheritdoc
    */
  override def sharedAudiencesForBusinessList(businessId: String, order: Option[Order], bookmark: Option[String], pageSize: Option[Int]): SharedAudiencesForBusinessList200Response = {
    // TODO: Implement better logic

    SharedAudiencesForBusinessList200Response(None, List.empty[Audience])
  }

  /**
    * @inheritdoc
    */
  override def updateAdAccountToAdAccountSharedAudience(adAccountId: String, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody): AdAccountToAdAccountSharedAudience = {
    // TODO: Implement better logic

    AdAccountToAdAccountSharedAudience(null, None, List.empty[String])
  }

  /**
    * @inheritdoc
    */
  override def updateAdAccountToBusinessSharedAudience(adAccountId: String, adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody): AdAccountToBusinessSharedAudience = {
    // TODO: Implement better logic

    AdAccountToBusinessSharedAudience(null, None, List.empty[String])
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessToAdAccountSharedAudience(businessId: String, businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody): BusinessToAdAccountSharedAudience = {
    // TODO: Implement better logic

    BusinessToAdAccountSharedAudience(null, None, List.empty[String])
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessToBusinessSharedAudience(businessId: String, businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody): BusinessToBusinessSharedAudience = {
    // TODO: Implement better logic

    BusinessToBusinessSharedAudience(null, None, List.empty[String])
  }
}
