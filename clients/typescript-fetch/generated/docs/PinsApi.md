# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**multiPinsAnalytics**](PinsApi.md#multipinsanalytics) | **GET** /pins/analytics | Get multiple Pin analytics |
| [**pinsAnalytics**](PinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
| [**pinsCreate**](PinsApi.md#pinscreate) | **POST** /pins | Create Pin |
| [**pinsDelete**](PinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin |
| [**pinsGet**](PinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin |
| [**pinsList**](PinsApi.md#pinslist) | **GET** /pins | List Pins |
| [**pinsSave**](PinsApi.md#pinssaveoperation) | **POST** /pins/{pin_id}/save | Save Pin |
| [**pinsUpdate**](PinsApi.md#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin |



## multiPinsAnalytics

> { [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; } multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId)

Get multiple Pin analytics

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/using-beta-and-restricted-features/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { MultiPinsAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // Array<string> | List of Pin IDs.
    pinIds: ...,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | 'SAVE_RATE' | 'TOTAL_COMMENTS' | 'TOTAL_REACTIONS' | 'USER_FOLLOW' | 'PROFILE_VISIT' | 'VIDEO_MRC_VIEW' | 'VIDEO_10S_VIEW' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_V50_WATCH_TIME' | 'VIDEO_START' | 'VIDEO_AVG_WATCH_TIME'> | Pin metric types to get data for.
    metricTypes: ...,
    // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
    appTypes: appTypes_example,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies MultiPinsAnalyticsRequest;

  try {
    const data = await api.multiPinsAnalytics(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinIds** | `Array<string>` | List of Pin IDs. | |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **metricTypes** | `IMPRESSION`, `OUTBOUND_CLICK`, `PIN_CLICK`, `SAVE`, `SAVE_RATE`, `TOTAL_COMMENTS`, `TOTAL_REACTIONS`, `USER_FOLLOW`, `PROFILE_VISIT`, `VIDEO_MRC_VIEW`, `VIDEO_10S_VIEW`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_V50_WATCH_TIME`, `VIDEO_START`, `VIDEO_AVG_WATCH_TIME` | Pin metric types to get data for. | [Enum: IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE, SAVE_RATE, TOTAL_COMMENTS, TOTAL_REACTIONS, USER_FOLLOW, PROFILE_VISIT, VIDEO_MRC_VIEW, VIDEO_10S_VIEW, QUARTILE_95_PERCENT_VIEW, VIDEO_V50_WATCH_TIME, VIDEO_START, VIDEO_AVG_WATCH_TIME] |
| **appTypes** | `ALL`, `MOBILE`, `TABLET`, `WEB` | Apps or devices to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, MOBILE, TABLET, WEB] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

**{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }**

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **400** | Invalid pins analytics parameters. |  -  |
| **401** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pinsAnalytics

> { [key: string]: PinAnalyticsMetricsResponse; } pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { PinsAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // string | Unique identifier of a Pin.
    pinId: pinId_example,
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // Array<'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | 'SAVE_RATE' | 'TOTAL_COMMENTS' | 'TOTAL_REACTIONS' | 'USER_FOLLOW' | 'PROFILE_VISIT' | 'VIDEO_MRC_VIEW' | 'VIDEO_10S_VIEW' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_V50_WATCH_TIME' | 'VIDEO_START' | 'VIDEO_AVG_WATCH_TIME'> | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
    metricTypes: ...,
    // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
    appTypes: appTypes_example,
    // 'NO_SPLIT' | 'APP_TYPE' | How to split the data into groups. Not including this param means data won\'t be split. (optional)
    splitField: splitField_example,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies PinsAnalyticsRequest;

  try {
    const data = await api.pinsAnalytics(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` | Unique identifier of a Pin. | [Defaults to `undefined`] |
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **metricTypes** | `IMPRESSION`, `OUTBOUND_CLICK`, `PIN_CLICK`, `SAVE`, `SAVE_RATE`, `TOTAL_COMMENTS`, `TOTAL_REACTIONS`, `USER_FOLLOW`, `PROFILE_VISIT`, `VIDEO_MRC_VIEW`, `VIDEO_10S_VIEW`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_V50_WATCH_TIME`, `VIDEO_START`, `VIDEO_AVG_WATCH_TIME` | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. | [Enum: IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE, SAVE_RATE, TOTAL_COMMENTS, TOTAL_REACTIONS, USER_FOLLOW, PROFILE_VISIT, VIDEO_MRC_VIEW, VIDEO_10S_VIEW, QUARTILE_95_PERCENT_VIEW, VIDEO_V50_WATCH_TIME, VIDEO_START, VIDEO_AVG_WATCH_TIME] |
| **appTypes** | `ALL`, `MOBILE`, `TABLET`, `WEB` | Apps or devices to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, MOBILE, TABLET, WEB] |
| **splitField** | `NO_SPLIT`, `APP_TYPE` | How to split the data into groups. Not including this param means data won\&#39;t be split. | [Optional] [Defaults to `&#39;NO_SPLIT&#39;`] [Enum: NO_SPLIT, APP_TYPE] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**{ [key: string]: PinAnalyticsMetricsResponse; }**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **400** | Invalid pins analytics parameters. |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pinsCreate

> Pin pinsCreate(pinCreate, adAccountId)

Create Pin

  Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user\&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \&#39;curated content\&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { PinsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // PinCreate
    pinCreate: ...,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies PinsCreateRequest;

  try {
    const data = await api.pinsCreate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinCreate** | [PinCreate](PinCreate.md) |  | |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pinsDelete

> pinsDelete(pinId, adAccountId)

Delete Pin

   Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { PinsDeleteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // string
    pinId: pinId_example,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies PinsDeleteRequest;

  try {
    const data = await api.pinsDelete(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` |  | [Defaults to `undefined`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pinsGet

> Pin pinsGet(pinId, adAccountId, pinMetrics)

Get Pin

   Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { PinsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // string
    pinId: pinId_example,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
    // boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
    pinMetrics: true,
  } satisfies PinsGetRequest;

  try {
    const data = await api.pinsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` |  | [Defaults to `undefined`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |
| **pinMetrics** | `boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [Optional] [Defaults to `false`] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pinsList

> PinsList200Response pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, bookmark, pageSize)

List Pins

     Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { PinsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // 'exclude_native' | 'exclude_repins' | 'has_been_promoted' | The filter to apply to the pins (optional)
    pinFilter: pinFilter_example,
    // boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
    pinMetrics: true,
    // boolean | Whether to include protected pins in the results (optional)
    includeProtectedPins: true,
    // 'PRIVATE' | The type of pins to return, currently only enabled for private pins (optional)
    pinType: pinType_example,
    // Array<CreativeType> | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
    creativeTypes: ...,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies PinsListRequest;

  try {
    const data = await api.pinsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinFilter** | `exclude_native`, `exclude_repins`, `has_been_promoted` | The filter to apply to the pins | [Optional] [Defaults to `undefined`] [Enum: exclude_native, exclude_repins, has_been_promoted] |
| **pinMetrics** | `boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [Optional] [Defaults to `false`] |
| **includeProtectedPins** | `boolean` | Whether to include protected pins in the results | [Optional] [Defaults to `false`] |
| **pinType** | `PRIVATE` | The type of pins to return, currently only enabled for private pins | [Optional] [Defaults to `undefined`] [Enum: PRIVATE] |
| **creativeTypes** | `Array<CreativeType>` | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [Optional] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pinsSave

> Pin pinsSave(pinId, pinsSaveRequest, adAccountId)

Save Pin

Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/ad_accounts/list\&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { PinsSaveOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // string | Unique identifier of a Pin.
    pinId: pinId_example,
    // PinsSaveRequest | Request object used to save an existing pin
    pinsSaveRequest: ...,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies PinsSaveOperationRequest;

  try {
    const data = await api.pinsSave(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` | Unique identifier of a Pin. | [Defaults to `undefined`] |
| **pinsSaveRequest** | [PinsSaveRequest](PinsSaveRequest.md) | Request object used to save an existing pin | |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully saved pin. |  -  |
| **403** | Not authorized to access Board or Pin. |  -  |
| **404** | Board or Pin not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pinsUpdate

> Pin pinsUpdate(pinId, pinUpdate, adAccountId)

Update Pin

Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

```ts
import {
  Configuration,
  PinsApi,
} from '';
import type { PinsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new PinsApi(config);

  const body = {
    // string
    pinId: pinId_example,
    // PinUpdate
    pinUpdate: ...,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies PinsUpdateRequest;

  try {
    const data = await api.pinsUpdate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` |  | [Defaults to `undefined`] |
| **pinUpdate** | [PinUpdate](PinUpdate.md) |  | |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

