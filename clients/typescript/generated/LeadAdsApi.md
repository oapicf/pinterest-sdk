# .LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
[**adAccountsSubscriptionsGetList**](LeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **adAccountsSubscriptionsDelById**
> void adAccountsSubscriptionsDelById()

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LeadAdsApi(configuration);

let body:.LeadAdsApiAdAccountsSubscriptionsDelByIdRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of a subscription.
  subscriptionId: "4",
};

apiInstance.adAccountsSubscriptionsDelById(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
**204** | Subscription deleted successfully |  -  |
**400** | Invalid input parameters. |  -  |
**403** | You are not authorized to delete this subscription. |  -  |
**404** | Subscription not found. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adAccountsSubscriptionsGetById**
> AdAccountGetSubscriptionResponse adAccountsSubscriptionsGetById()

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LeadAdsApi(configuration);

let body:.LeadAdsApiAdAccountsSubscriptionsGetByIdRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of a subscription.
  subscriptionId: "4",
};

apiInstance.adAccountsSubscriptionsGetById(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **subscriptionId** | [**string**] | Unique identifier of a subscription. | defaults to undefined


### Return type

**AdAccountGetSubscriptionResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid input parameters. |  -  |
**403** | Can\&#39;t access this subscription. |  -  |
**404** | Subscription not found. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adAccountsSubscriptionsGetList**
> AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList()

Get the advertiser\'s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LeadAdsApi(configuration);

let body:.LeadAdsApiAdAccountsSubscriptionsGetListRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

apiInstance.adAccountsSubscriptionsGetList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


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
**200** | Success |  -  |
**403** | Can\&#39;t access this subscription. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adAccountsSubscriptionsPost**
> AdAccountCreateSubscriptionResponse adAccountsSubscriptionsPost(adAccountCreateSubscriptionRequest)

Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LeadAdsApi(configuration);

let body:.LeadAdsApiAdAccountsSubscriptionsPostRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // AdAccountCreateSubscriptionRequest | Subscription to create.
  adAccountCreateSubscriptionRequest: {
    webhookUrl: "https://webhook.example.com/xyz",
    leadFormId: "383791336903426390",
    partnerAccessToken: "partnerAccessToken_example",
    partnerRefreshToken: "partnerRefreshToken_example",
  },
};

apiInstance.adAccountsSubscriptionsPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountCreateSubscriptionRequest** | **AdAccountCreateSubscriptionRequest**| Subscription to create. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdAccountCreateSubscriptionResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid input parameters. |  -  |
**403** | Can\&#39;t access this subscription. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


