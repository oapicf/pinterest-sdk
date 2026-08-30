# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boardsUserFollowsList**](UserAccountApi.md#boardsuserfollowslist) | **GET** /user_account/following/boards | List following boards |
| [**followUserUpdate**](UserAccountApi.md#followuserupdate) | **POST** /user_account/following/{username} | Follow user |
| [**followersList**](UserAccountApi.md#followerslist) | **GET** /user_account/followers | List followers |
| [**linkedBusinessAccountsGet**](UserAccountApi.md#linkedbusinessaccountsget) | **GET** /user_account/businesses | List linked businesses |
| [**unverifyWebsiteDelete**](UserAccountApi.md#unverifywebsitedelete) | **DELETE** /user_account/websites | Unverify website |
| [**userAccountAnalytics**](UserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics |
| [**userAccountAnalyticsTopPins**](UserAccountApi.md#useraccountanalyticstoppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**userAccountAnalyticsTopVideoPins**](UserAccountApi.md#useraccountanalyticstopvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**userAccountFollowedInterests**](UserAccountApi.md#useraccountfollowedinterests) | **GET** /users/{username}/interests/follow | List following interests |
| [**userAccountGet**](UserAccountApi.md#useraccountget) | **GET** /user_account | Get user account |
| [**userFollowingGet**](UserAccountApi.md#userfollowingget) | **GET** /user_account/following | List following |
| [**userWebsitesGet**](UserAccountApi.md#userwebsitesget) | **GET** /user_account/websites | Get user websites |
| [**verifyWebsiteUpdate**](UserAccountApi.md#verifywebsiteupdate) | **POST** /user_account/websites | Verify website |
| [**websiteVerificationGet**](UserAccountApi.md#websiteverificationget) | **GET** /user_account/websites/verification | Get user verification code for website claiming |



## boardsUserFollowsList

> BoardsList200Response boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { BoardsUserFollowsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
    // boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
    explicitFollowing: true,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies BoardsUserFollowsListRequest;

  try {
    const data = await api.boardsUserFollowsList(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |
| **explicitFollowing** | `boolean` | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [Optional] [Defaults to `false`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

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


## followUserUpdate

> FollowUser followUserUpdate(username, followUserCreate)

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { FollowUserUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | A valid username
    username: username_example,
    // FollowUserCreate
    followUserCreate: ...,
  } satisfies FollowUserUpdateRequest;

  try {
    const data = await api.followUserUpdate(body);
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
| **username** | `string` | A valid username | [Defaults to `undefined`] |
| **followUserCreate** | [FollowUserCreate](FollowUserCreate.md) |  | |

### Return type

[**FollowUser**](FollowUser.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

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


## followersList

> FollowersList200Response followersList(bookmark, pageSize)

List followers

Get a list of your followers.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { FollowersListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies FollowersListRequest;

  try {
    const data = await api.followersList(body);
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
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

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


## linkedBusinessAccountsGet

> Array&lt;LinkedBusiness&gt; linkedBusinessAccountsGet()

List linked businesses

Get a list of your linked business accounts.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { LinkedBusinessAccountsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  try {
    const data = await api.linkedBusinessAccountsGet();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;LinkedBusiness&gt;**](LinkedBusiness.md)

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


## unverifyWebsiteDelete

> UserWebsite unverifyWebsiteDelete(website)

Unverify website

Unverify a website verified by the signed-in user.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UnverifyWebsiteDeleteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | Website with path or domain only
    website: website_example,
  } satisfies UnverifyWebsiteDeleteRequest;

  try {
    const data = await api.unverifyWebsiteDelete(body);
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
| **website** | `string` | Website with path or domain only | [Defaults to `undefined`] |

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## userAccountAnalytics

> { [key: string]: AnalyticsMetricsResponse; } userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UserAccountAnalyticsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // 'OTHER' | 'CLAIMED' | 'BOTH' | Filter on Pins that match your claimed domain. (optional)
    fromClaimedContent: fromClaimedContent_example,
    // 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | Pin formats to get data for, default is all. (optional)
    pinFormat: pinFormat_example,
    // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
    appTypes: appTypes_example,
    // 'ALL' | 'PAID' | 'ORGANIC' | Filter to paid or organic data. Default is all. (optional)
    contentType: contentType_example,
    // 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
    source: source_example,
    // Array<QuerymetrictypesItems> | Metric types to get data for, default is all. (optional)
    metricTypes: ...,
    // 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT' | How to split the data into groups. Not including this param means data won\'t be split. (optional)
    splitField: splitField_example,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies UserAccountAnalyticsRequest;

  try {
    const data = await api.userAccountAnalytics(body);
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
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **fromClaimedContent** | `OTHER`, `CLAIMED`, `BOTH` | Filter on Pins that match your claimed domain. | [Optional] [Defaults to `&#39;BOTH&#39;`] [Enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA` | Pin formats to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | `ALL`, `MOBILE`, `TABLET`, `WEB` | Apps or devices to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | `ALL`, `PAID`, `ORGANIC` | Filter to paid or organic data. Default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, PAID, ORGANIC] |
| **source** | `ALL`, `YOUR_PINS`, `OTHER_PINS` | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | `Array<QuerymetrictypesItems>` | Metric types to get data for, default is all. | [Optional] |
| **splitField** | `NO_SPLIT`, `APP_TYPE`, `OWNED_CONTENT`, `SOURCE`, `PIN_FORMAT` | How to split the data into groups. Not including this param means data won\&#39;t be split. | [Optional] [Defaults to `&#39;NO_SPLIT&#39;`] [Enum: NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**{ [key: string]: AnalyticsMetricsResponse; }**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

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


## userAccountAnalyticsTopPins

> TopPinsAnalyticsResponse userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top pins analytics

Gets analytics data about a user\&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UserAccountAnalyticsTopPinsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // TopPinsSortBy | Specify sorting order for metrics
    sortBy: ...,
    // 'OTHER' | 'CLAIMED' | 'BOTH' | Filter on Pins that match your claimed domain. (optional)
    fromClaimedContent: fromClaimedContent_example,
    // 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | Pin formats to get data for, default is all. (optional)
    pinFormat: pinFormat_example,
    // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
    appTypes: appTypes_example,
    // 'ALL' | 'PAID' | 'ORGANIC' | Filter to paid or organic data. Default is all. (optional)
    contentType: contentType_example,
    // 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
    source: source_example,
    // Array<QuerymetrictypesItems> | Metric types to get data for, default is all. (optional)
    metricTypes: ...,
    // number | Number of pins to include, default is 10. Max is 50. (optional)
    numOfPins: 56,
    // 30 | Get metrics for pins created in the last \"n\" days. (optional)
    createdInLastNDays: 8.14,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies UserAccountAnalyticsTopPinsRequest;

  try {
    const data = await api.userAccountAnalyticsTopPins(body);
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
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **sortBy** | `TopPinsSortBy` | Specify sorting order for metrics | [Defaults to `undefined`] [Enum: ENGAGEMENT, SAVE, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK] |
| **fromClaimedContent** | `OTHER`, `CLAIMED`, `BOTH` | Filter on Pins that match your claimed domain. | [Optional] [Defaults to `&#39;BOTH&#39;`] [Enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA` | Pin formats to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | `ALL`, `MOBILE`, `TABLET`, `WEB` | Apps or devices to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | `ALL`, `PAID`, `ORGANIC` | Filter to paid or organic data. Default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, PAID, ORGANIC] |
| **source** | `ALL`, `YOUR_PINS`, `OTHER_PINS` | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | `Array<QuerymetrictypesItems>` | Metric types to get data for, default is all. | [Optional] |
| **numOfPins** | `number` | Number of pins to include, default is 10. Max is 50. | [Optional] [Defaults to `10`] |
| **createdInLastNDays** | `30` | Get metrics for pins created in the last \&quot;n\&quot; days. | [Optional] [Defaults to `undefined`] [Enum: 30] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

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


## userAccountAnalyticsTopVideoPins

> TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top video pins analytics

Gets analytics data about a user\&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UserAccountAnalyticsTopVideoPinsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    startDate: 2013-10-20,
    // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    endDate: 2013-10-20,
    // TopVideoPinsSortBy | Specify sorting order for video metrics
    sortBy: ...,
    // 'OTHER' | 'CLAIMED' | 'BOTH' | Filter on Pins that match your claimed domain. (optional)
    fromClaimedContent: fromClaimedContent_example,
    // 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | Pin formats to get data for, default is all. (optional)
    pinFormat: pinFormat_example,
    // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
    appTypes: appTypes_example,
    // 'ALL' | 'PAID' | 'ORGANIC' | Filter to paid or organic data. Default is all. (optional)
    contentType: contentType_example,
    // 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
    source: source_example,
    // Array<QueryvideopinmetrictypesItems> | Metric types to get video data for, default is all. (optional)
    metricTypes: ...,
    // number | Number of pins to include, default is 10. Max is 50. (optional)
    numOfPins: 56,
    // 30 | Get metrics for pins created in the last \"n\" days. (optional)
    createdInLastNDays: 8.14,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies UserAccountAnalyticsTopVideoPinsRequest;

  try {
    const data = await api.userAccountAnalyticsTopVideoPins(body);
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
| **startDate** | `Date` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [Defaults to `undefined`] |
| **endDate** | `Date` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [Defaults to `undefined`] |
| **sortBy** | `TopVideoPinsSortBy` | Specify sorting order for video metrics | [Defaults to `undefined`] [Enum: SAVE, IMPRESSION, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START] |
| **fromClaimedContent** | `OTHER`, `CLAIMED`, `BOTH` | Filter on Pins that match your claimed domain. | [Optional] [Defaults to `&#39;BOTH&#39;`] [Enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA` | Pin formats to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | `ALL`, `MOBILE`, `TABLET`, `WEB` | Apps or devices to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | `ALL`, `PAID`, `ORGANIC` | Filter to paid or organic data. Default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, PAID, ORGANIC] |
| **source** | `ALL`, `YOUR_PINS`, `OTHER_PINS` | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | `Array<QueryvideopinmetrictypesItems>` | Metric types to get video data for, default is all. | [Optional] |
| **numOfPins** | `number` | Number of pins to include, default is 10. Max is 50. | [Optional] [Defaults to `10`] |
| **createdInLastNDays** | `30` | Get metrics for pins created in the last \&quot;n\&quot; days. | [Optional] [Defaults to `undefined`] [Enum: 30] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

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


## userAccountFollowedInterests

> UserAccountFollowedInterests200Response userAccountFollowedInterests(username, bookmark, pageSize)

List following interests

Get a list of a user\&#39;s following interests in one place.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UserAccountFollowedInterestsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | A valid username
    username: username_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies UserAccountFollowedInterestsRequest;

  try {
    const data = await api.userAccountFollowedInterests(body);
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
| **username** | `string` | A valid username | [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The server could not understand the request due to invalid syntax. |  -  |
| **401** | Access is unauthorized. |  -  |
| **404** | The server cannot find the requested resource. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## userAccountGet

> Account userAccountGet(adAccountId)

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UserAccountGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies UserAccountGetRequest;

  try {
    const data = await api.userAccountGet(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**Account**](Account.md)

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


## userFollowingGet

> FollowersList200Response userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)

List following

Get a list of who a certain user follows.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UserFollowingGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
    // boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
    explicitFollowing: true,
    // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
    feedType: ...,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies UserFollowingGetRequest;

  try {
    const data = await api.userFollowingGet(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |
| **explicitFollowing** | `boolean` | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [Optional] [Defaults to `false`] |
| **feedType** | `UserFollowingFeedType` | Thrift param specifying what type of followees will be kept. Default to include all followees. | [Optional] [Defaults to `undefined`] [Enum: ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

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


## userWebsitesGet

> UserWebsitesGet200Response userWebsitesGet(bookmark, pageSize)

Get user websites

Get user websites, claimed or not

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { UserWebsitesGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies UserWebsitesGetRequest;

  try {
    const data = await api.userWebsitesGet(body);
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
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

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


## verifyWebsiteUpdate

> UserWebsite verifyWebsiteUpdate(userWebsiteCreate, adAccountId)

Verify website

Verify a website as a signed-in user.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { VerifyWebsiteUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // UserWebsiteCreate
    userWebsiteCreate: ...,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies VerifyWebsiteUpdateRequest;

  try {
    const data = await api.verifyWebsiteUpdate(body);
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
| **userWebsiteCreate** | [UserWebsiteCreate](UserWebsiteCreate.md) |  | |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

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


## websiteVerificationGet

> UserWebsiteVerification websiteVerificationGet(adAccountId)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example

```ts
import {
  Configuration,
  UserAccountApi,
} from '';
import type { WebsiteVerificationGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new UserAccountApi(config);

  const body = {
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
  } satisfies WebsiteVerificationGetRequest;

  try {
    const data = await api.websiteVerificationGet(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**UserWebsiteVerification**](UserWebsiteVerification.md)

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

