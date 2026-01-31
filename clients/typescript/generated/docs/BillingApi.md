# .BillingApi

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


# **adsCreditRedeem**
> AdsCreditRedeemResponse adsCreditRedeem(adsCreditRedeemRequest)

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiAdsCreditRedeemRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiAdsCreditRedeemRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Redeem ad credits request.
  adsCreditRedeemRequest: {
    offerCodeHash: "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67",
    validateOnly: true,
  },
};

const data = await apiInstance.adsCreditRedeem(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adsCreditRedeemRequest** | **AdsCreditRedeemRequest**| Redeem ad credits request. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdsCreditRedeemResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully redeemed ad credits. |  -  |
**400** | Error thrown when unable to redeem offer code. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adsCreditsDiscountsGet**
> AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet()

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiAdsCreditsDiscountsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiAdsCreditsDiscountsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.adsCreditsDiscountsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**AdsCreditsDiscountsGet200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **billingProfilesGet**
> BillingProfilesGet200Response billingProfilesGet()

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiBillingProfilesGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiBillingProfilesGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Return active billing profiles, if false return all billing profiles.
  isActive: true,
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.billingProfilesGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **isActive** | [**boolean**] | Return active billing profiles, if false return all billing profiles. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**BillingProfilesGet200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **ssioAccountsGet**
> SSIOAccountResponse ssioAccountsGet()

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiSsioAccountsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiSsioAccountsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
};

const data = await apiInstance.ssioAccountsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**SSIOAccountResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid request parameter. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **ssioInsertionOrderCreate**
> SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(sSIOCreateInsertionOrderRequest)

Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiSsioInsertionOrderCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiSsioInsertionOrderCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Order line to create.
  sSIOCreateInsertionOrderRequest: ,
};

const data = await apiInstance.ssioInsertionOrderCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSIOCreateInsertionOrderRequest** | **SSIOCreateInsertionOrderRequest**| Order line to create. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**SSIOCreateInsertionOrderResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid request. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **ssioInsertionOrderEdit**
> SSIOEditInsertionOrderResponse ssioInsertionOrderEdit(sSIOEditInsertionOrderRequest)

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiSsioInsertionOrderEditRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiSsioInsertionOrderEditRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Order line to create.
  sSIOEditInsertionOrderRequest: ,
};

const data = await apiInstance.ssioInsertionOrderEdit(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSIOEditInsertionOrderRequest** | **SSIOEditInsertionOrderRequest**| Order line to create. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**SSIOEditInsertionOrderResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid request. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **ssioInsertionOrdersStatusGetByAdAccount**
> SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount()

Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiSsioInsertionOrdersStatusGetByAdAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiSsioInsertionOrdersStatusGetByAdAccountRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.ssioInsertionOrdersStatusGetByAdAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**SsioInsertionOrdersStatusGetByAdAccount200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid request parameter. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **ssioInsertionOrdersStatusGetByPinOrderId**
> SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId()

Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // The pin order id associated with the ssio insertion order
  pinOrderId: "0Q01N0000015hekSVDFDC",
};

const data = await apiInstance.ssioInsertionOrdersStatusGetByPinOrderId(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **pinOrderId** | [**string**] | The pin order id associated with the ssio insertion order | defaults to undefined


### Return type

**SSIOInsertionOrderStatusResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid request parameter. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **ssioOrderLinesGetByAdAccount**
> SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount()

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example


```typescript
import { createConfiguration, BillingApi } from '';
import type { BillingApiSsioOrderLinesGetByAdAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BillingApi(configuration);

const request: BillingApiSsioOrderLinesGetByAdAccountRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // The pin order id associated with the ssio insertino order (optional)
  pinOrderId: "0Q01N0000015hekSVDFDC",
};

const data = await apiInstance.ssioOrderLinesGetByAdAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **pinOrderId** | [**string**] | The pin order id associated with the ssio insertino order | (optional) defaults to undefined


### Return type

**SsioOrderLinesGetByAdAccount200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid request parameter. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


