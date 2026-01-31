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

> BoardsUserFollowsList200Response boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId)

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
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
    explicitFollowing: true,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
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
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **explicitFollowing** | `boolean` | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [Optional] [Defaults to `false`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid user id |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## followUserUpdate

> UserSummary followUserUpdate(username, followUserRequest)

Follow user

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/using-beta-and-restricted-features/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.

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
    username: username,
    // FollowUserRequest | Follow a user.
    followUserRequest: ...,
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
| **followUserRequest** | [FollowUserRequest](FollowUserRequest.md) | Follow a user. | |

### Return type

[**UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |

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
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
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
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

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
| **200** | Success |  -  |
| **400** | Invalid user id |  -  |
| **0** | Unexpected error |  -  |

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## unverifyWebsiteDelete

> unverifyWebsiteDelete(website)

Unverify website

Unverifu a website verified by the signed-in user.

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
    website: mysite.test,
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

`void` (Empty response body)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully unverified website |  -  |
| **404** | Website not in user list. |  -  |
| **0** | Unexpected error |  -  |

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
    // Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'> | Metric types to get data for, default is all.  (optional)
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
| **metricTypes** | `ENGAGEMENT`, `ENGAGEMENT_RATE`, `IMPRESSION`, `OUTBOUND_CLICK`, `OUTBOUND_CLICK_RATE`, `PIN_CLICK`, `PIN_CLICK_RATE`, `SAVE`, `SAVE_RATE` | Metric types to get data for, default is all.  | [Optional] [Enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE] |
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
| **200** | Success |  -  |
| **400** | Invalid user accounts analytics parameters. |  -  |
| **403** | Not authorized to access the user account analytics. |  -  |
| **0** | Unexpected error |  -  |

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
    // 'ENGAGEMENT' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | Specify sorting order for metrics
    sortBy: sortBy_example,
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
    // Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'> | Metric types to get data for, default is all.  (optional)
    metricTypes: ...,
    // number | Number of pins to include, default is 10. Max is 50. (optional)
    numOfPins: 25,
    // 30 | Get metrics for pins created in the last \"n\" days. (optional)
    createdInLastNDays: 30,
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
| **sortBy** | `ENGAGEMENT`, `IMPRESSION`, `OUTBOUND_CLICK`, `PIN_CLICK`, `SAVE` | Specify sorting order for metrics | [Defaults to `undefined`] [Enum: ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE] |
| **fromClaimedContent** | `OTHER`, `CLAIMED`, `BOTH` | Filter on Pins that match your claimed domain. | [Optional] [Defaults to `&#39;BOTH&#39;`] [Enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA` | Pin formats to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | `ALL`, `MOBILE`, `TABLET`, `WEB` | Apps or devices to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | `ALL`, `PAID`, `ORGANIC` | Filter to paid or organic data. Default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, PAID, ORGANIC] |
| **source** | `ALL`, `YOUR_PINS`, `OTHER_PINS` | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | `ENGAGEMENT`, `ENGAGEMENT_RATE`, `IMPRESSION`, `OUTBOUND_CLICK`, `OUTBOUND_CLICK_RATE`, `PIN_CLICK`, `PIN_CLICK_RATE`, `SAVE`, `SAVE_RATE` | Metric types to get data for, default is all.  | [Optional] [Enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE] |
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
| **200** | Success |  -  |
| **403** | Not authorized to access the user account analytics. |  -  |
| **0** | Unexpected error |  -  |

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
    // 'IMPRESSION' | 'SAVE' | 'OUTBOUND_CLICK' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | Specify sorting order for video metrics
    sortBy: sortBy_example,
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
    // Array<'IMPRESSION' | 'SAVE' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | 'OUTBOUND_CLICK'> | Metric types to get video data for, default is all.  (optional)
    metricTypes: ...,
    // number | Number of pins to include, default is 10. Max is 50. (optional)
    numOfPins: 25,
    // 30 | Get metrics for pins created in the last \"n\" days. (optional)
    createdInLastNDays: 30,
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
| **sortBy** | `IMPRESSION`, `SAVE`, `OUTBOUND_CLICK`, `VIDEO_MRC_VIEW`, `VIDEO_AVG_WATCH_TIME`, `VIDEO_V50_WATCH_TIME`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_10S_VIEW`, `VIDEO_START` | Specify sorting order for video metrics | [Defaults to `undefined`] [Enum: IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START] |
| **fromClaimedContent** | `OTHER`, `CLAIMED`, `BOTH` | Filter on Pins that match your claimed domain. | [Optional] [Defaults to `&#39;BOTH&#39;`] [Enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA` | Pin formats to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | `ALL`, `MOBILE`, `TABLET`, `WEB` | Apps or devices to get data for, default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | `ALL`, `PAID`, `ORGANIC` | Filter to paid or organic data. Default is all. | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, PAID, ORGANIC] |
| **source** | `ALL`, `YOUR_PINS`, `OTHER_PINS` | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [Optional] [Defaults to `&#39;ALL&#39;`] [Enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | `IMPRESSION`, `SAVE`, `VIDEO_MRC_VIEW`, `VIDEO_AVG_WATCH_TIME`, `VIDEO_V50_WATCH_TIME`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_10S_VIEW`, `VIDEO_START`, `OUTBOUND_CLICK` | Metric types to get video data for, default is all.  | [Optional] [Enum: IMPRESSION, SAVE, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START, OUTBOUND_CLICK] |
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
| **200** | Success |  -  |
| **403** | Not authorized to access the user account analytics. |  -  |
| **0** | Unexpected error |  -  |

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
    username: username,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
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
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

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
| **200** | Success |  -  |
| **400** | Invalid parameters |  -  |
| **401** | Authorization failed |  -  |
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## userAccountGet

> Account userAccountGet(adAccountId)

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;\&#39;/docs/getting-started/using-business-access/\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

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
| **200** | response |  -  |
| **403** | Not authorized to access the user account. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## userFollowingGet

> UserFollowingGet200Response userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId)

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
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
    feedType: feedType_example,
    // boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
    explicitFollowing: true,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
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
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **feedType** | `UserFollowingFeedType` | Thrift param specifying what type of followees will be kept. Default to include all followees. | [Optional] [Defaults to `undefined`] [Enum: ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY] |
| **explicitFollowing** | `boolean` | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [Optional] [Defaults to `false`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

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
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
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
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

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
| **200** | Success |  -  |
| **403** | Not authorized to access the user website list. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## verifyWebsiteUpdate

> UserWebsiteSummary verifyWebsiteUpdate(userWebsiteVerifyRequest, adAccountId)

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
    // UserWebsiteVerifyRequest | Verify a website.
    userWebsiteVerifyRequest: ...,
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
| **userWebsiteVerifyRequest** | [UserWebsiteVerifyRequest](UserWebsiteVerifyRequest.md) | Verify a website. | |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## websiteVerificationGet

> UserWebsiteVerificationCode websiteVerificationGet(adAccountId)

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

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Not authorized to access the user verification code for website claiming. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

