# LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adAccountsSubscriptionsDelById**](#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription|
|[**adAccountsSubscriptionsGetById**](#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription|
|[**adAccountsSubscriptionsGetList**](#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions|
|[**adAccountsSubscriptionsPost**](#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription|

# **adAccountsSubscriptionsDelById**
> adAccountsSubscriptionsDelById()

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    LeadAdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadAdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let subscriptionId: string; //Unique identifier of a subscription. (default to undefined)

const { status, data } = await apiInstance.adAccountsSubscriptionsDelById(
    adAccountId,
    subscriptionId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **subscriptionId** | [**string**] | Unique identifier of a subscription. | defaults to undefined|


### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**204** | Subscription deleted successfully |  -  |
|**400** | Invalid input parameters. |  -  |
|**403** | You are not authorized to delete this subscription. |  -  |
|**404** | Subscription not found. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetById**
> AdAccountGetSubscriptionResponse adAccountsSubscriptionsGetById()

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    LeadAdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadAdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let subscriptionId: string; //Unique identifier of a subscription. (default to undefined)

const { status, data } = await apiInstance.adAccountsSubscriptionsGetById(
    adAccountId,
    subscriptionId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **subscriptionId** | [**string**] | Unique identifier of a subscription. | defaults to undefined|


### Return type

**AdAccountGetSubscriptionResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid input parameters. |  -  |
|**403** | Can\&#39;t access this subscription. |  -  |
|**404** | Subscription not found. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetList**
> AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList()

Get the advertiser\'s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    LeadAdsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadAdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.adAccountsSubscriptionsGetList(
    adAccountId,
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


### Return type

**AdAccountsSubscriptionsGetList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**403** | Can\&#39;t access this subscription. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsPost**
> AdAccountCreateSubscriptionResponse adAccountsSubscriptionsPost(adAccountCreateSubscriptionRequest)

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    LeadAdsApi,
    Configuration,
    AdAccountCreateSubscriptionRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadAdsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest; //Subscription to create.

const { status, data } = await apiInstance.adAccountsSubscriptionsPost(
    adAccountId,
    adAccountCreateSubscriptionRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountCreateSubscriptionRequest** | **AdAccountCreateSubscriptionRequest**| Subscription to create. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdAccountCreateSubscriptionResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid input parameters. |  -  |
|**403** | Can\&#39;t access this subscription. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

