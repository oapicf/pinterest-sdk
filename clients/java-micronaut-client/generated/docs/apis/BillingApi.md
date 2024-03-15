# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adsCreditRedeem**](BillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits |
| [**adsCreditsDiscountsGet**](BillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts |
| [**billingProfilesGet**](BillingApi.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles |
| [**ssioAccountsGet**](BillingApi.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information. |
| [**ssioInsertionOrderCreate**](BillingApi.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO. |
| [**ssioInsertionOrderEdit**](BillingApi.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO. |
| [**ssioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id. |
| [**ssioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id. |
| [**ssioOrderLinesGetByAdAccount**](BillingApi.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id. |


## Creating BillingApi

To initiate an instance of `BillingApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BillingApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BillingApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BillingApi billingApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="adsCreditRedeem"></a>
# **adsCreditRedeem**
```java
Mono<AdsCreditRedeemResponse> BillingApi.adsCreditRedeem(adAccountIdadsCreditRedeemRequest)
```

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adsCreditRedeemRequest** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md)| Redeem ad credits request. | |


### Return type
[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`, `billing:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adsCreditsDiscountsGet"></a>
# **adsCreditsDiscountsGet**
```java
Mono<AdsCreditsDiscountsGet200Response> BillingApi.adsCreditsDiscountsGet(adAccountIdbookmarkpageSize)
```

Get ads credit discounts

Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`, `billing:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="billingProfilesGet"></a>
# **billingProfilesGet**
```java
Mono<BillingProfilesGet200Response> BillingApi.billingProfilesGet(adAccountIdisActivebookmarkpageSize)
```

Get billing profiles

Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **isActive** | `Boolean`| Return active billing profiles, if false return all billing profiles. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`, `billing:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="ssioAccountsGet"></a>
# **ssioAccountsGet**
```java
Mono<SSIOAccountResponse> BillingApi.ssioAccountsGet(adAccountId)
```

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**SSIOAccountResponse**](SSIOAccountResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="ssioInsertionOrderCreate"></a>
# **ssioInsertionOrderCreate**
```java
Mono<SSIOCreateInsertionOrderResponse> BillingApi.ssioInsertionOrderCreate(adAccountIdssIOCreateInsertionOrderRequest)
```

Create insertion order through SSIO.

Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **ssIOCreateInsertionOrderRequest** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md)| Order line to create. | |


### Return type
[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="ssioInsertionOrderEdit"></a>
# **ssioInsertionOrderEdit**
```java
Mono<SSIOEditInsertionOrderResponse> BillingApi.ssioInsertionOrderEdit(adAccountIdssIOEditInsertionOrderRequest)
```

Edit insertion order through SSIO.

Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **ssIOEditInsertionOrderRequest** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md)| Order line to create. | |


### Return type
[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="ssioInsertionOrdersStatusGetByAdAccount"></a>
# **ssioInsertionOrdersStatusGetByAdAccount**
```java
Mono<SsioInsertionOrdersStatusGetByAdAccount200Response> BillingApi.ssioInsertionOrdersStatusGetByAdAccount(adAccountIdbookmarkpageSize)
```

Get insertion order status by ad account id.

Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="ssioInsertionOrdersStatusGetByPinOrderId"></a>
# **ssioInsertionOrdersStatusGetByPinOrderId**
```java
Mono<SSIOInsertionOrderStatusResponse> BillingApi.ssioInsertionOrdersStatusGetByPinOrderId(adAccountIdpinOrderId)
```

Get insertion order status by pin order id.

Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **pinOrderId** | `String`| The pin order id associated with the ssio insertion order | |


### Return type
[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="ssioOrderLinesGetByAdAccount"></a>
# **ssioOrderLinesGetByAdAccount**
```java
Mono<SsioOrderLinesGetByAdAccount200Response> BillingApi.ssioOrderLinesGetByAdAccount(adAccountIdbookmarkpageSizepinOrderId)
```

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **pinOrderId** | `String`| The pin order id associated with the ssio insertino order | [optional parameter] |


### Return type
[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

