package api

import model.AdAccountsSubscriptionsGetList200Response
import model.Error
import model.LeadSubscription
import model.LeadSubscriptionPostParamsCreate

/**
  * Provides a default implementation for [[LeadAdsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class LeadAdsApiImpl extends LeadAdsApi {
  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String): LeadSubscription = {
    // TODO: Implement better logic

    LeadSubscription(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String): LeadSubscription = {
    // TODO: Implement better logic

    LeadSubscription(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsGetList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): AdAccountsSubscriptionsGetList200Response = {
    // TODO: Implement better logic

    AdAccountsSubscriptionsGetList200Response(None, List.empty[LeadSubscription])
  }

  /**
    * @inheritdoc
    */
  override def adAccountsSubscriptionsPost(adAccountId: String, leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate): LeadSubscription = {
    // TODO: Implement better logic

    LeadSubscription(None, None, None, None, None, None, None, None, None)
  }
}
