# .PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**multiPinsAnalytics**](PinsApi.md#multiPinsAnalytics) | **GET** /pins/analytics | Get multiple Pin analytics
[**pinsAnalytics**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](PinsApi.md#pinsList) | **GET** /pins | List Pins
[**pinsSave**](PinsApi.md#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](PinsApi.md#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin


# **multiPinsAnalytics**
> { [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; } multiPinsAnalytics()

<strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiMultiPinsAnalyticsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiMultiPinsAnalyticsRequest = {
    // List of Pin IDs.
  pinIds: [
    "4",
  ],
    // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Pin metric types to get data for.
  metricTypes: [
    "metric_types_example",
  ],
    // Apps or devices to get data for, default is all. (optional)
  appTypes: "ALL",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.multiPinsAnalytics(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinIds** | **Array&lt;string&gt;** | List of Pin IDs. | defaults to undefined
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **metricTypes** | **Array<&#39;IMPRESSION&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;PIN_CLICK&#39; &#124; &#39;SAVE&#39; &#124; &#39;SAVE_RATE&#39; &#124; &#39;TOTAL_COMMENTS&#39; &#124; &#39;TOTAL_REACTIONS&#39; &#124; &#39;USER_FOLLOW&#39; &#124; &#39;PROFILE_VISIT&#39; &#124; &#39;VIDEO_MRC_VIEW&#39; &#124; &#39;VIDEO_10S_VIEW&#39; &#124; &#39;QUARTILE_95_PERCENT_VIEW&#39; &#124; &#39;VIDEO_V50_WATCH_TIME&#39; &#124; &#39;VIDEO_START&#39; &#124; &#39;VIDEO_AVG_WATCH_TIME&#39;>** | Pin metric types to get data for. | defaults to undefined
 **appTypes** | [**&#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;**]**Array<&#39;ALL&#39; &#124; &#39;MOBILE&#39; &#124; &#39;TABLET&#39; &#124; &#39;WEB&#39;>** | Apps or devices to get data for, default is all. | (optional) defaults to 'ALL'
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**400** | Invalid pins analytics parameters. |  -  |
**401** | Not authorized to access board or Pin. |  -  |
**404** | Pin not found. |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pinsAnalytics**
> { [key: string]: PinAnalyticsMetricsResponse; } pinsAnalytics()

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiPinsAnalyticsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiPinsAnalyticsRequest = {
    // Unique identifier of a Pin.
  pinId: "pin_id_example",
    // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
    // Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
  metricTypes: [
    "metric_types_example",
  ],
    // Apps or devices to get data for, default is all. (optional)
  appTypes: "ALL",
    // How to split the data into groups. Not including this param means data won\'t be split. (optional)
  splitField: "NO_SPLIT",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.pinsAnalytics(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | [**string**] | Unique identifier of a Pin. | defaults to undefined
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **metricTypes** | **Array<&#39;IMPRESSION&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;PIN_CLICK&#39; &#124; &#39;SAVE&#39; &#124; &#39;SAVE_RATE&#39; &#124; &#39;TOTAL_COMMENTS&#39; &#124; &#39;TOTAL_REACTIONS&#39; &#124; &#39;USER_FOLLOW&#39; &#124; &#39;PROFILE_VISIT&#39; &#124; &#39;VIDEO_MRC_VIEW&#39; &#124; &#39;VIDEO_10S_VIEW&#39; &#124; &#39;QUARTILE_95_PERCENT_VIEW&#39; &#124; &#39;VIDEO_V50_WATCH_TIME&#39; &#124; &#39;VIDEO_START&#39; &#124; &#39;VIDEO_AVG_WATCH_TIME&#39;>** | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. | defaults to undefined
 **appTypes** | [**&#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;**]**Array<&#39;ALL&#39; &#124; &#39;MOBILE&#39; &#124; &#39;TABLET&#39; &#124; &#39;WEB&#39;>** | Apps or devices to get data for, default is all. | (optional) defaults to 'ALL'
 **splitField** | [**&#39;NO_SPLIT&#39; | &#39;APP_TYPE&#39;**]**Array<&#39;NO_SPLIT&#39; &#124; &#39;APP_TYPE&#39;>** | How to split the data into groups. Not including this param means data won\&#39;t be split. | (optional) defaults to 'NO_SPLIT'
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**{ [key: string]: PinAnalyticsMetricsResponse; }**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**400** | Invalid pins analytics parameters. |  -  |
**403** | Not authorized to access board or Pin. |  -  |
**404** | Pin not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pinsCreate**
> Pin pinsCreate(pinCreate)

  Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiPinsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiPinsCreateRequest = {
  
  pinCreate: {
    altText: "altText_example",
    boardId: "4",
    boardSectionId: "4",
    description: "description_example",
    dominantColor: "dominantColor_example",
    link: "link_example",
    mediaSource: {
    contentType: "image/jpeg",
    data: "2",
    isStandard: true,
    sourceType: "image_base64",
  },
    parentPinId: "4",
    sponsorId: "4",
    title: "title_example",
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.pinsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinCreate** | **PinCreate**|  |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Pin**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pinsDelete**
> void pinsDelete()

   Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiPinsDeleteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiPinsDeleteRequest = {
  
  pinId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.pinsDelete(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | [**string**] |  | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

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

# **pinsGet**
> Pin pinsGet()

   Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiPinsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiPinsGetRequest = {
  
  pinId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
  pinMetrics: false,
};

const data = await apiInstance.pinsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | [**string**] |  | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false


### Return type

**Pin**

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

# **pinsList**
> PinsList200Response pinsList()

     Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiPinsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiPinsListRequest = {
    // The filter to apply to the pins (optional)
  pinFilter: "exclude_native",
    // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
  pinMetrics: false,
    // Whether to include protected pins in the results (optional)
  includeProtectedPins: false,
    // The type of pins to return, currently only enabled for private pins (optional)
  pinType: "PRIVATE",
    // Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
  creativeTypes: [
    "REGULAR",
  ],
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.pinsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinFilter** | [**&#39;exclude_native&#39; | &#39;exclude_repins&#39; | &#39;has_been_promoted&#39;**]**Array<&#39;exclude_native&#39; &#124; &#39;exclude_repins&#39; &#124; &#39;has_been_promoted&#39;>** | The filter to apply to the pins | (optional) defaults to undefined
 **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false
 **includeProtectedPins** | [**boolean**] | Whether to include protected pins in the results | (optional) defaults to false
 **pinType** | [**&#39;PRIVATE&#39;**]**Array<&#39;PRIVATE&#39;>** | The type of pins to return, currently only enabled for private pins | (optional) defaults to undefined
 **creativeTypes** | **Array&lt;CreativeType&gt;** | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25


### Return type

**PinsList200Response**

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

# **pinsSave**
> Pin pinsSave(pinsSaveRequest)

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiPinsSaveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiPinsSaveRequest = {
    // Unique identifier of a Pin.
  pinId: "pin_id_example",
    // Request object used to save an existing pin
  pinsSaveRequest: {
    boardId: "4",
    boardSectionId: "4",
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.pinsSave(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinsSaveRequest** | **PinsSaveRequest**| Request object used to save an existing pin |
 **pinId** | [**string**] | Unique identifier of a Pin. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Pin**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully saved pin. |  -  |
**403** | Not authorized to access Board or Pin. |  -  |
**404** | Board or Pin not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pinsUpdate**
> Pin pinsUpdate(pinUpdate)

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example


```typescript
import { createConfiguration, PinsApi } from '';
import type { PinsApiPinsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PinsApi(configuration);

const request: PinsApiPinsUpdateRequest = {
  
  pinId: "4",
  
  pinUpdate: {
    altText: "altText_example",
    boardId: "4",
    boardSectionId: "4",
    carouselSlots: [
      {
        description: "description_example",
        link: "link_example",
        title: "title_example",
      },
    ],
    description: "description_example",
    link: "link_example",
    title: "title_example",
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.pinsUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinUpdate** | **PinUpdate**|  |
 **pinId** | [**string**] |  | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Pin**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
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


