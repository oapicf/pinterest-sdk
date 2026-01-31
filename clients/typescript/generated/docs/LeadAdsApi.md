# .LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**adAccountsSubscriptionsGetList**](LeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **adAccountsSubscriptionsDelById**
> void adAccountsSubscriptionsDelById()

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'

### Example


```typescript
import { createConfiguration, LeadAdsApi } from '';
import type { LeadAdsApiAdAccountsSubscriptionsDelByIdRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadAdsApi(configuration);

const request: LeadAdsApiAdAccountsSubscriptionsDelByIdRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a subscription.
  subscriptionId: "4",
};

const data = await apiInstance.adAccountsSubscriptionsDelById(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **subscriptionId** | [**string**] | Unique identifier of a subscription. | defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Resource deleted successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adAccountsSubscriptionsGetById**
> LeadSubscription adAccountsSubscriptionsGetById()

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'

### Example


```typescript
import { createConfiguration, LeadAdsApi } from '';
import type { LeadAdsApiAdAccountsSubscriptionsGetByIdRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadAdsApi(configuration);

const request: LeadAdsApiAdAccountsSubscriptionsGetByIdRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a subscription.
  subscriptionId: "4",
};

const data = await apiInstance.adAccountsSubscriptionsGetById(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **subscriptionId** | [**string**] | Unique identifier of a subscription. | defaults to undefined


### Return type

**LeadSubscription**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adAccountsSubscriptionsGetList**
> AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList()

Get the advertiser\'s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Example


```typescript
import { createConfiguration, LeadAdsApi } from '';
import type { LeadAdsApiAdAccountsSubscriptionsGetListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadAdsApi(configuration);

const request: LeadAdsApiAdAccountsSubscriptionsGetListRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.adAccountsSubscriptionsGetList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25


### Return type

**AdAccountsSubscriptionsGetList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adAccountsSubscriptionsPost**
> LeadSubscription adAccountsSubscriptionsPost(leadSubscriptionPostParamsCreate)

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Example


```typescript
import { createConfiguration, LeadAdsApi } from '';
import type { LeadAdsApiAdAccountsSubscriptionsPostRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadAdsApi(configuration);

const request: LeadAdsApiAdAccountsSubscriptionsPostRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
  
  leadSubscriptionPostParamsCreate: ,
};

const data = await apiInstance.adAccountsSubscriptionsPost(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadSubscriptionPostParamsCreate** | **LeadSubscriptionPostParamsCreate**|  |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**LeadSubscription**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


