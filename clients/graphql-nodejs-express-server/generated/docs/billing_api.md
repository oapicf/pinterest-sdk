# billing_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdsCreditRedeem**](billing_api.md#AdsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**AdsCreditsDiscountsGet**](billing_api.md#AdsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**BillingInvoiceDownloadGet**](billing_api.md#BillingInvoiceDownloadGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**BillingInvoicesGet**](billing_api.md#BillingInvoicesGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**BillingProfilesGet**](billing_api.md#BillingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**SsioAccountsGet**](billing_api.md#SsioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**SsioInsertionOrderCreate**](billing_api.md#SsioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**SsioInsertionOrderEdit**](billing_api.md#SsioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**SsioInsertionOrdersStatusGetByAdAccount**](billing_api.md#SsioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**SsioInsertionOrdersStatusGetByPinOrderId**](billing_api.md#SsioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**SsioOrderLinesGetByAdAccount**](billing_api.md#SsioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


<a name="AdsCreditRedeem"></a>
# **AdsCreditRedeem**
> AdsCreditRedeem AdsCreditRedeem(adAccountId, adsCreditRedeemCreate)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
<a name="AdsCreditsDiscountsGet"></a>
# **AdsCreditsDiscountsGet**
> AdsCreditsDiscountsGet200Response AdsCreditsDiscountsGet(adAccountId, bookmark, pageSize)

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
<a name="BillingInvoiceDownloadGet"></a>
# **BillingInvoiceDownloadGet**
> BillingInvoiceDownloadResponse BillingInvoiceDownloadGet(adAccountId, billingInvoiceId)

Get download url for a billing invoice

Get download url for a billing invoice.
<a name="BillingInvoicesGet"></a>
# **BillingInvoicesGet**
> BillingInvoicesGet200Response BillingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)

Get billing invoices

Get billing invoices in the advertiser account.
<a name="BillingProfilesGet"></a>
# **BillingProfilesGet**
> BillingProfilesGet200Response BillingProfilesGet(isActive, adAccountId, bookmark, pageSize)

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
<a name="SsioAccountsGet"></a>
# **SsioAccountsGet**
> SsioAccount SsioAccountsGet(adAccountId)

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
<a name="SsioInsertionOrderCreate"></a>
# **SsioInsertionOrderCreate**
> SsioInsertionOrder SsioInsertionOrderCreate(adAccountId, ssioInsertionOrderCreate)

Create insertion order through SSIO.

  Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
<a name="SsioInsertionOrderEdit"></a>
# **SsioInsertionOrderEdit**
> SsioInsertionOrder SsioInsertionOrderEdit(adAccountId, ssioInsertionOrderUpdate)

Edit insertion order through SSIO.

  Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
<a name="SsioInsertionOrdersStatusGetByAdAccount"></a>
# **SsioInsertionOrdersStatusGetByAdAccount**
> SsioInsertionOrdersStatusGetByAdAccount200Response SsioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)

Get insertion order status by ad account id.

  Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
<a name="SsioInsertionOrdersStatusGetByPinOrderId"></a>
# **SsioInsertionOrdersStatusGetByPinOrderId**
> SsioInsertionOrderStatusResponse SsioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)

Get insertion order status by pin order id.

  Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
<a name="SsioOrderLinesGetByAdAccount"></a>
# **SsioOrderLinesGetByAdAccount**
> SsioOrderLinesGetByAdAccount200Response SsioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
