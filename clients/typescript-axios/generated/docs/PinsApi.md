# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**multiPinsAnalytics**](#multipinsanalytics) | **GET** /pins/analytics | Get multiple Pin analytics|
|[**pinsAnalytics**](#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics|
|[**pinsCreate**](#pinscreate) | **POST** /pins | Create Pin|
|[**pinsDelete**](#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin|
|[**pinsGet**](#pinsget) | **GET** /pins/{pin_id} | Get Pin|
|[**pinsList**](#pinslist) | **GET** /pins | List Pins|
|[**pinsSave**](#pinssave) | **POST** /pins/{pin_id}/save | Save Pin|
|[**pinsUpdate**](#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin|

# **multiPinsAnalytics**
> { [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; } multiPinsAnalytics()

<strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinIds: Array<string>; //List of Pin IDs. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let metricTypes: Array<'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | 'SAVE_RATE' | 'TOTAL_COMMENTS' | 'TOTAL_REACTIONS' | 'USER_FOLLOW' | 'PROFILE_VISIT' | 'VIDEO_MRC_VIEW' | 'VIDEO_10S_VIEW' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_V50_WATCH_TIME' | 'VIDEO_START' | 'VIDEO_AVG_WATCH_TIME'>; //Pin metric types to get data for. (default to undefined)
let appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'; //Apps or devices to get data for, default is all. (optional) (default to 'ALL')
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.multiPinsAnalytics(
    pinIds,
    startDate,
    endDate,
    metricTypes,
    appTypes,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinIds** | **Array&lt;string&gt;** | List of Pin IDs. | defaults to undefined|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **metricTypes** | **Array<&#39;IMPRESSION&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;PIN_CLICK&#39; &#124; &#39;SAVE&#39; &#124; &#39;SAVE_RATE&#39; &#124; &#39;TOTAL_COMMENTS&#39; &#124; &#39;TOTAL_REACTIONS&#39; &#124; &#39;USER_FOLLOW&#39; &#124; &#39;PROFILE_VISIT&#39; &#124; &#39;VIDEO_MRC_VIEW&#39; &#124; &#39;VIDEO_10S_VIEW&#39; &#124; &#39;QUARTILE_95_PERCENT_VIEW&#39; &#124; &#39;VIDEO_V50_WATCH_TIME&#39; &#124; &#39;VIDEO_START&#39; &#124; &#39;VIDEO_AVG_WATCH_TIME&#39;>** | Pin metric types to get data for. | defaults to undefined|
| **appTypes** | [**&#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;**]**Array<&#39;ALL&#39; &#124; &#39;MOBILE&#39; &#124; &#39;TABLET&#39; &#124; &#39;WEB&#39;>** | Apps or devices to get data for, default is all. | (optional) defaults to 'ALL'|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | response |  -  |
|**400** | Invalid pins analytics parameters. |  -  |
|**401** | Not authorized to access board or Pin. |  -  |
|**404** | Pin not found. |  -  |
|**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsAnalytics**
> { [key: string]: PinAnalyticsMetricsResponse; } pinsAnalytics()

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; //Unique identifier of a Pin. (default to undefined)
let startDate: string; //Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (default to undefined)
let endDate: string; //Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (default to undefined)
let metricTypes: Array<'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | 'SAVE_RATE' | 'TOTAL_COMMENTS' | 'TOTAL_REACTIONS' | 'USER_FOLLOW' | 'PROFILE_VISIT' | 'VIDEO_MRC_VIEW' | 'VIDEO_10S_VIEW' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_V50_WATCH_TIME' | 'VIDEO_START' | 'VIDEO_AVG_WATCH_TIME'>; //Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>. (default to undefined)
let appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'; //Apps or devices to get data for, default is all. (optional) (default to 'ALL')
let splitField: 'NO_SPLIT' | 'APP_TYPE'; //How to split the data into groups. Not including this param means data won\'t be split. (optional) (default to 'NO_SPLIT')
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsAnalytics(
    pinId,
    startDate,
    endDate,
    metricTypes,
    appTypes,
    splitField,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinId** | [**string**] | Unique identifier of a Pin. | defaults to undefined|
| **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined|
| **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined|
| **metricTypes** | **Array<&#39;IMPRESSION&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;PIN_CLICK&#39; &#124; &#39;SAVE&#39; &#124; &#39;SAVE_RATE&#39; &#124; &#39;TOTAL_COMMENTS&#39; &#124; &#39;TOTAL_REACTIONS&#39; &#124; &#39;USER_FOLLOW&#39; &#124; &#39;PROFILE_VISIT&#39; &#124; &#39;VIDEO_MRC_VIEW&#39; &#124; &#39;VIDEO_10S_VIEW&#39; &#124; &#39;QUARTILE_95_PERCENT_VIEW&#39; &#124; &#39;VIDEO_V50_WATCH_TIME&#39; &#124; &#39;VIDEO_START&#39; &#124; &#39;VIDEO_AVG_WATCH_TIME&#39;>** | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. | defaults to undefined|
| **appTypes** | [**&#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;**]**Array<&#39;ALL&#39; &#124; &#39;MOBILE&#39; &#124; &#39;TABLET&#39; &#124; &#39;WEB&#39;>** | Apps or devices to get data for, default is all. | (optional) defaults to 'ALL'|
| **splitField** | [**&#39;NO_SPLIT&#39; | &#39;APP_TYPE&#39;**]**Array<&#39;NO_SPLIT&#39; &#124; &#39;APP_TYPE&#39;>** | How to split the data into groups. Not including this param means data won\&#39;t be split. | (optional) defaults to 'NO_SPLIT'|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**{ [key: string]: PinAnalyticsMetricsResponse; }**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | response |  -  |
|**400** | Invalid pins analytics parameters. |  -  |
|**403** | Not authorized to access board or Pin. |  -  |
|**404** | Pin not found. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsCreate**
> Pin pinsCreate(pinCreate)

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/web-features/add-ons-overview/\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/api-features/content-overview/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/api-features/creating-boards-and-pins/#creating-video-pins\'>Learn more</a></strong> about video Pin creation.

### Example

```typescript
import {
    PinsApi,
    Configuration,
    PinCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinCreate: PinCreate; //Create a new Pin.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsCreate(
    pinCreate,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinCreate** | **PinCreate**| Create a new Pin. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Pin**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Successful pin creation. |  -  |
|**400** | Invalid Pin parameters response |  -  |
|**403** | The Pin\&#39;s image is too small, too large or is broken |  -  |
|**404** | Board or section not found |  -  |
|**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsDelete**
> pinsDelete()

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; //Unique identifier of a Pin. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsDelete(
    pinId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinId** | [**string**] | Unique identifier of a Pin. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


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
|**204** | Successfully deleted Pin |  -  |
|**403** | Not authorized to access board or Pin. |  -  |
|**404** | Pin not found. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsGet**
> Pin pinsGet()

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; //Unique identifier of a Pin. (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsGet(
    pinId,
    pinMetrics,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinId** | [**string**] | Unique identifier of a Pin. | defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Pin**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | response |  -  |
|**403** | Not authorized to access board or Pin. |  -  |
|**404** | Pin not found. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsList**
> PinsList200Response pinsList()

Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href=\'/docs/api/v5/#operation/boards/list_pins\'>GET List Pins on Board</a>.

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let pinFilter: 'exclude_native' | 'exclude_repins' | 'has_been_promoted'; //Pin filter. (optional) (default to undefined)
let includeProtectedPins: boolean; //Specify if return pins from protected boards (optional) (default to false)
let pinType: 'PRIVATE'; //The type of pins to return, currently only enabled for private pins (optional) (default to undefined)
let creativeTypes: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>; //Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

const { status, data } = await apiInstance.pinsList(
    bookmark,
    pageSize,
    pinFilter,
    includeProtectedPins,
    pinType,
    creativeTypes,
    adAccountId,
    pinMetrics
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **pinFilter** | [**&#39;exclude_native&#39; | &#39;exclude_repins&#39; | &#39;has_been_promoted&#39;**]**Array<&#39;exclude_native&#39; &#124; &#39;exclude_repins&#39; &#124; &#39;has_been_promoted&#39;>** | Pin filter. | (optional) defaults to undefined|
| **includeProtectedPins** | [**boolean**] | Specify if return pins from protected boards | (optional) defaults to false|
| **pinType** | [**&#39;PRIVATE&#39;**]**Array<&#39;PRIVATE&#39;>** | The type of pins to return, currently only enabled for private pins | (optional) defaults to undefined|
| **creativeTypes** | **Array<&#39;REGULAR&#39; &#124; &#39;VIDEO&#39; &#124; &#39;SHOPPING&#39; &#124; &#39;CAROUSEL&#39; &#124; &#39;MAX_VIDEO&#39; &#124; &#39;SHOP_THE_PIN&#39; &#124; &#39;COLLECTION&#39; &#124; &#39;IDEA&#39;>** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|


### Return type

**PinsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid pin filter value |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsSave**
> Pin pinsSave(pinsSaveRequest)

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example

```typescript
import {
    PinsApi,
    Configuration,
    PinsSaveRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; //Unique identifier of a Pin. (default to undefined)
let pinsSaveRequest: PinsSaveRequest; //Request object used to save an existing pin
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsSave(
    pinId,
    pinsSaveRequest,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinsSaveRequest** | **PinsSaveRequest**| Request object used to save an existing pin | |
| **pinId** | [**string**] | Unique identifier of a Pin. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Pin**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Successfully saved pin. |  -  |
|**403** | Not authorized to access Board or Pin. |  -  |
|**404** | Board or Pin not found. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsUpdate**
> Pin pinsUpdate(pinUpdate)

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    PinsApi,
    Configuration,
    PinUpdate
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; //Unique identifier of a Pin. (default to undefined)
let pinUpdate: PinUpdate; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsUpdate(
    pinId,
    pinUpdate,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinUpdate** | **PinUpdate**|  | |
| **pinId** | [**string**] | Unique identifier of a Pin. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Pin**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | response |  -  |
|**403** | Not authorized to update Pin. |  -  |
|**404** | Pin not found. |  -  |
|**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

