package api

import play.api.libs.json._
import model.AdsCreditRedeemRequest
import model.AdsCreditRedeemResponse
import model.AdsCreditsDiscountsGet200Response
import model.BillingProfilesGet200Response
import model.Error
import model.SSIOAccountResponse
import model.SSIOCreateInsertionOrderRequest
import model.SSIOCreateInsertionOrderResponse
import model.SSIOEditInsertionOrderRequest
import model.SSIOEditInsertionOrderResponse
import model.SSIOInsertionOrderStatusResponse
import model.SsioInsertionOrdersStatusGetByAdAccount200Response
import model.SsioOrderLinesGetByAdAccount200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait BillingApi {
  /**
    * Redeem ad credits
    * Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param adsCreditRedeemRequest Redeem ad credits request.
    */
  def adsCreditRedeem(adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest): AdsCreditRedeemResponse

  /**
    * Get ads credit discounts
    * Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def adsCreditsDiscountsGet(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): AdsCreditsDiscountsGet200Response

  /**
    * Get billing profiles
    * Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param isActive Return active billing profiles, if false return all billing profiles.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def billingProfilesGet(adAccountId: String, isActive: Boolean, bookmark: Option[String], pageSize: Option[Int]): BillingProfilesGet200Response

  /**
    * Get Salesforce account details including bill-to information.
    * Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioAccountsGet(adAccountId: String): SSIOAccountResponse

  /**
    * Create insertion order through SSIO.
    * Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param sSIOCreateInsertionOrderRequest Order line to create.
    */
  def ssioInsertionOrderCreate(adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest): SSIOCreateInsertionOrderResponse

  /**
    * Edit insertion order through SSIO.
    * Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param sSIOEditInsertionOrderRequest Order line to create.
    */
  def ssioInsertionOrderEdit(adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest): SSIOEditInsertionOrderResponse

  /**
    * Get insertion order status by ad account id.
    * Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): SsioInsertionOrdersStatusGetByAdAccount200Response

  /**
    * Get insertion order status by pin order id.
    * Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param pinOrderId The pin order id associated with the ssio insertion order
    */
  def ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String): SSIOInsertionOrderStatusResponse

  /**
    * Get Salesforce order lines by ad account id.
    * Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param pinOrderId The pin order id associated with the ssio insertino order
    */
  def ssioOrderLinesGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], pinOrderId: Option[String]): SsioOrderLinesGetByAdAccount200Response
}
