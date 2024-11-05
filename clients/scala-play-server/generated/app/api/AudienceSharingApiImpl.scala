package api

import model.AdAccountsAudiencesSharedAccountsList200Response
import model.AudienceAccountType
import model.AudiencesList200Response
import model.BusinessSharedAudience
import model.BusinessSharedAudienceResponse
import model.Error
import model.SharedAudience
import model.SharedAudienceResponse

/**
  * Provides a default implementation for [[AudienceSharingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class AudienceSharingApiImpl extends AudienceSharingApi {
  /**
    * @inheritdoc
    */
  override def adAccountsAudiencesSharedAccountsList(adAccountId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]): AdAccountsAudiencesSharedAccountsList200Response = {
    // TODO: Implement better logic

    AdAccountsAudiencesSharedAccountsList200Response(List.empty[SharedAudienceAccount], None)
  }

  /**
    * @inheritdoc
    */
  override def businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]): AdAccountsAudiencesSharedAccountsList200Response = {
    // TODO: Implement better logic

    AdAccountsAudiencesSharedAccountsList200Response(List.empty[SharedAudienceAccount], None)
  }

  /**
    * @inheritdoc
    */
  override def sharedAudiencesForBusinessList(businessId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int]): AudiencesList200Response = {
    // TODO: Implement better logic

    AudiencesList200Response(List.empty[Audience], None)
  }

  /**
    * @inheritdoc
    */
  override def updateAdAccountToAdAccountSharedAudience(adAccountId: String, sharedAudience: SharedAudience): SharedAudienceResponse = {
    // TODO: Implement better logic

    SharedAudienceResponse(None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateAdAccountToBusinessSharedAudience(adAccountId: String, businessSharedAudience: BusinessSharedAudience): BusinessSharedAudienceResponse = {
    // TODO: Implement better logic

    BusinessSharedAudienceResponse(None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessToAdAccountSharedAudience(businessId: String, sharedAudience: SharedAudience): SharedAudienceResponse = {
    // TODO: Implement better logic

    SharedAudienceResponse(None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessToBusinessSharedAudience(businessId: String, businessSharedAudience: BusinessSharedAudience): BusinessSharedAudienceResponse = {
    // TODO: Implement better logic

    BusinessSharedAudienceResponse(None, None, None, Map.empty)
  }
}
