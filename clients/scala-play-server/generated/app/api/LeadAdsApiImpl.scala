package api

import model.AdAccountCreateSubscriptionRequest
import model.AdAccountCreateSubscriptionResponse
import model.AdAccountGetSubscriptionResponse
import model.AdAccountsSubscriptionsGetList200Response
import model.Error

/**
  * Provides a default implementation for [[LeadAdsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class LeadAdsApiImpl extends LeadAdsApi {
  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String): AdAccountGetSubscriptionResponse = {
    // TODO: Implement better logic

    AdAccountGetSubscriptionResponse(None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsGetList(adAccountId: String, pageSize: Option[Int], bookmark: Option[String]): AdAccountsSubscriptionsGetList200Response = {
    // TODO: Implement better logic

    AdAccountsSubscriptionsGetList200Response(List.empty[AdAccountGetSubscriptionResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsPost(adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest): AdAccountCreateSubscriptionResponse = {
    // TODO: Implement better logic

    AdAccountCreateSubscriptionResponse(None, None, None, None)
  }
}
