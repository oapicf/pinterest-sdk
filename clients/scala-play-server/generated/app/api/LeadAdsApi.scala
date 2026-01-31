package api

import play.api.libs.json._
import model.AdAccountsSubscriptionsGetList200Response
import model.Error
import model.LeadSubscription
import model.LeadSubscriptionPostParamsCreate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait LeadAdsApi {
  /**
    * Delete lead ads subscription
    * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String): Unit

  /**
    * Get lead ads subscription by ID
    * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String): LeadSubscription

  /**
    * Get lead ads subscriptions
    * Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def adAccountsSubscriptionsGetList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): AdAccountsSubscriptionsGetList200Response

  /**
    * Create lead ads subscription
    * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountsSubscriptionsPost(adAccountId: String, leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate): LeadSubscription
}
