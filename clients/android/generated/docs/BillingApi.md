# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingProfilesGet**](BillingApi.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](BillingApi.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](BillingApi.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](BillingApi.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](BillingApi.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.



## adsCreditRedeem

> AdsCreditRedeemResponse adsCreditRedeem(adAccountId, adsCreditRedeemRequest)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AdsCreditRedeemRequest adsCreditRedeemRequest = new AdsCreditRedeemRequest(); // AdsCreditRedeemRequest | Redeem ad credits request.
try {
    AdsCreditRedeemResponse result = apiInstance.adsCreditRedeem(adAccountId, adsCreditRedeemRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#adsCreditRedeem");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **adsCreditRedeemRequest** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md)| Redeem ad credits request. |

### Return type

[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## adsCreditsDiscountsGet

> AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)

Get ads credit discounts

Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
try {
    AdsCreditsDiscountsGet200Response result = apiInstance.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#adsCreditsDiscountsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billingProfilesGet

> BillingProfilesGet200Response billingProfilesGet(adAccountId, isActive, bookmark, pageSize)

Get billing profiles

Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Boolean isActive = null; // Boolean | Return active billing profiles, if false return all billing profiles.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
try {
    BillingProfilesGet200Response result = apiInstance.billingProfilesGet(adAccountId, isActive, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#billingProfilesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **isActive** | **Boolean**| Return active billing profiles, if false return all billing profiles. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioAccountsGet

> SSIOAccountResponse ssioAccountsGet(adAccountId)

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    SSIOAccountResponse result = apiInstance.ssioAccountsGet(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioAccountsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**SSIOAccountResponse**](SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioInsertionOrderCreate

> SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(adAccountId, sSIOCreateInsertionOrderRequest)

Create insertion order through SSIO.

Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
SSIOCreateInsertionOrderRequest sSIOCreateInsertionOrderRequest = new SSIOCreateInsertionOrderRequest(); // SSIOCreateInsertionOrderRequest | Order line to create.
try {
    SSIOCreateInsertionOrderResponse result = apiInstance.ssioInsertionOrderCreate(adAccountId, sSIOCreateInsertionOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrderCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **sSIOCreateInsertionOrderRequest** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md)| Order line to create. |

### Return type

[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssioInsertionOrderEdit

> SSIOEditInsertionOrderResponse ssioInsertionOrderEdit(adAccountId, sSIOEditInsertionOrderRequest)

Edit insertion order through SSIO.

Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
SSIOEditInsertionOrderRequest sSIOEditInsertionOrderRequest = new SSIOEditInsertionOrderRequest(); // SSIOEditInsertionOrderRequest | Order line to create.
try {
    SSIOEditInsertionOrderResponse result = apiInstance.ssioInsertionOrderEdit(adAccountId, sSIOEditInsertionOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrderEdit");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **sSIOEditInsertionOrderRequest** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md)| Order line to create. |

### Return type

[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssioInsertionOrdersStatusGetByAdAccount

> SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)

Get insertion order status by ad account id.

Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
try {
    SsioInsertionOrdersStatusGetByAdAccount200Response result = apiInstance.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByAdAccount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioInsertionOrdersStatusGetByPinOrderId

> SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)

Get insertion order status by pin order id.

Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String pinOrderId = 0Q01N0000015hekSVDFDC; // String | The pin order id associated with the ssio insertion order
try {
    SSIOInsertionOrderStatusResponse result = apiInstance.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioInsertionOrdersStatusGetByPinOrderId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **pinOrderId** | **String**| The pin order id associated with the ssio insertion order | [default to null]

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ssioOrderLinesGetByAdAccount

> SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId)

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BillingApi;

BillingApi apiInstance = new BillingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
String pinOrderId = 0Q01N0000015hekSVDFDC; // String | The pin order id associated with the ssio insertino order
try {
    SsioOrderLinesGetByAdAccount200Response result = apiInstance.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#ssioOrderLinesGetByAdAccount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pinOrderId** | **String**| The pin order id associated with the ssio insertino order | [optional] [default to null]

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

