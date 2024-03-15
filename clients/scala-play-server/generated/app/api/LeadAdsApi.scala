package api

import play.api.libs.json._
import model.AdAccountCreateSubscriptionRequest
import model.AdAccountCreateSubscriptionResponse
import model.AdAccountGetSubscriptionResponse
import model.AdAccountsSubscriptionsGetList200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait LeadAdsApi {
  /**
    * Delete lead ads subscription
    * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String): Unit

  /**
    * Get lead ads subscription
    * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param subscriptionId Unique identifier of a subscription.
    */
  def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String): AdAccountGetSubscriptionResponse

  /**
    * Get lead ads subscriptions
    * Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def adAccountsSubscriptionsGetList(adAccountId: String, pageSize: Option[Int], bookmark: Option[String]): AdAccountsSubscriptionsGetList200Response

  /**
    * Create lead ads subscription
    * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param adAccountCreateSubscriptionRequest Subscription to create.
    */
  def adAccountsSubscriptionsPost(adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest): AdAccountCreateSubscriptionResponse
}
