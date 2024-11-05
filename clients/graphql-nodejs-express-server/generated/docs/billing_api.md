# billing_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdsCreditRedeem**](billing_api.md#AdsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**AdsCreditsDiscountsGet**](billing_api.md#AdsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**BillingProfilesGet**](billing_api.md#BillingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**SsioAccountsGet**](billing_api.md#SsioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**SsioInsertionOrderCreate**](billing_api.md#SsioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**SsioInsertionOrderEdit**](billing_api.md#SsioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**SsioInsertionOrdersStatusGetByAdAccount**](billing_api.md#SsioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**SsioInsertionOrdersStatusGetByPinOrderId**](billing_api.md#SsioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**SsioOrderLinesGetByAdAccount**](billing_api.md#SsioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


<a name="AdsCreditRedeem"></a>
# **AdsCreditRedeem**
> AdsCreditRedeemResponse AdsCreditRedeem(adAccountId, adsCreditRedeemRequest)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
<a name="AdsCreditsDiscountsGet"></a>
# **AdsCreditsDiscountsGet**
> AdsCreditsDiscountsGet200Response AdsCreditsDiscountsGet(adAccountId, bookmark, pageSize)

Get ads credit discounts

Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
<a name="BillingProfilesGet"></a>
# **BillingProfilesGet**
> BillingProfilesGet200Response BillingProfilesGet(adAccountId, isActive, bookmark, pageSize)

Get billing profiles

Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
<a name="SsioAccountsGet"></a>
# **SsioAccountsGet**
> SsioAccountResponse SsioAccountsGet(adAccountId)

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
<a name="SsioInsertionOrderCreate"></a>
# **SsioInsertionOrderCreate**
> SsioCreateInsertionOrderResponse SsioInsertionOrderCreate(adAccountId, ssioCreateInsertionOrderRequest)

Create insertion order through SSIO.

Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
<a name="SsioInsertionOrderEdit"></a>
# **SsioInsertionOrderEdit**
> SsioEditInsertionOrderResponse SsioInsertionOrderEdit(adAccountId, ssioEditInsertionOrderRequest)

Edit insertion order through SSIO.

Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
<a name="SsioInsertionOrdersStatusGetByAdAccount"></a>
# **SsioInsertionOrdersStatusGetByAdAccount**
> SsioInsertionOrdersStatusGetByAdAccount200Response SsioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)

Get insertion order status by ad account id.

Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
<a name="SsioInsertionOrdersStatusGetByPinOrderId"></a>
# **SsioInsertionOrdersStatusGetByPinOrderId**
> SsioInsertionOrderStatusResponse SsioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)

Get insertion order status by pin order id.

Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
<a name="SsioOrderLinesGetByAdAccount"></a>
# **SsioOrderLinesGetByAdAccount**
> SsioOrderLinesGetByAdAccount200Response SsioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId)

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
