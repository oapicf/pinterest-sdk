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

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

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
let metricTypes: Array<MultiPinsAnalyticsMetricTypesItem>; //Pin metric types to get data for. (default to undefined)
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
| **metricTypes** | **Array&lt;MultiPinsAnalyticsMetricTypesItem&gt;** | Pin metric types to get data for. | defaults to undefined|
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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsAnalytics**
> { [key: string]: PinAnalyticsMetricsResponse; } pinsAnalytics()

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

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
let metricTypes: Array<QuerypinanalyticsmetrictypesItems>; //Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`. (default to undefined)
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
| **metricTypes** | **Array&lt;QuerypinanalyticsmetrictypesItems&gt;** | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;. | defaults to undefined|
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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsCreate**
> Pin pinsCreate(pinCreate)

 Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Example

```typescript
import {
    PinsApi,
    Configuration,
    PinCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinCreate: PinCreate; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsCreate(
    pinCreate,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinCreate** | **PinCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Pin**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsDelete**
> Pin pinsDelete()

  Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; // (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsDelete(
    pinId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinId** | [**string**] |  | defaults to undefined|
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
|**200** | The request has succeeded. |  -  |
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsGet**
> Pin pinsGet()

  Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; // (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

const { status, data } = await apiInstance.pinsGet(
    pinId,
    adAccountId,
    pinMetrics
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinId** | [**string**] |  | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsList**
> PinsList200Response pinsList()

    Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Example

```typescript
import {
    PinsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinFilter: PinFilter; //The filter to apply to the pins (optional) (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)
let includeProtectedPins: boolean; //Whether to include protected pins in the results (optional) (default to false)
let pinType: PinType; //The type of pins to return, currently only enabled for private pins (optional) (default to undefined)
let creativeTypes: Array<CreativeType>; //Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let domain: string; //Only return pins with links that match the exact domain. Domain should not include \'www.\' prefix. For example, \'pinterest.com\' is a valid domain, but \'www.pinterest.com\' is not (will not match any pins). (optional) (default to undefined)
let domains: Array<string>; //Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`). (optional) (default to undefined)
let includeProductTagObj: boolean; //Include product tag objects in the response with their associated links. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.pinsList(
    pinFilter,
    pinMetrics,
    includeProtectedPins,
    pinType,
    creativeTypes,
    adAccountId,
    domain,
    domains,
    includeProductTagObj,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinFilter** | **PinFilter** | The filter to apply to the pins | (optional) defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|
| **includeProtectedPins** | [**boolean**] | Whether to include protected pins in the results | (optional) defaults to false|
| **pinType** | **PinType** | The type of pins to return, currently only enabled for private pins | (optional) defaults to undefined|
| **creativeTypes** | **Array&lt;CreativeType&gt;** | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **domain** | [**string**] | Only return pins with links that match the exact domain. Domain should not include \&#39;www.\&#39; prefix. For example, \&#39;pinterest.com\&#39; is a valid domain, but \&#39;www.pinterest.com\&#39; is not (will not match any pins). | (optional) defaults to undefined|
| **domains** | **Array&lt;string&gt;** | Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;). | (optional) defaults to undefined|
| **includeProductTagObj** | [**boolean**] | Include product tag objects in the response with their associated links. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsSave**
> Pin pinsSave(pinsSaveRequestCreate)

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example

```typescript
import {
    PinsApi,
    Configuration,
    PinsSaveRequestCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; //Unique identifier of a Pin. (default to undefined)
let pinsSaveRequestCreate: PinsSaveRequestCreate; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.pinsSave(
    pinId,
    pinsSaveRequestCreate,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinsSaveRequestCreate** | **PinsSaveRequestCreate**|  | |
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
|**201** | The request has succeeded and a new resource has been created as a result. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsUpdate**
> Pin pinsUpdate(pinUpdate)

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

```typescript
import {
    PinsApi,
    Configuration,
    PinUpdate
} from './api';

const configuration = new Configuration();
const apiInstance = new PinsApi(configuration);

let pinId: string; // (default to undefined)
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
| **pinId** | [**string**] |  | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Pin**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

