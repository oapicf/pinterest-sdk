# .UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardsUserFollowsList**](UserAccountApi.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
[**followUserUpdate**](UserAccountApi.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user
[**followersList**](UserAccountApi.md#followersList) | **GET** /user_account/followers | List followers
[**linkedBusinessAccountsGet**](UserAccountApi.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
[**unverifyWebsiteDelete**](UserAccountApi.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
[**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountAnalyticsTopPins**](UserAccountApi.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**userAccountAnalyticsTopVideoPins**](UserAccountApi.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**userAccountFollowedInterests**](UserAccountApi.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
[**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account
[**userFollowingGet**](UserAccountApi.md#userFollowingGet) | **GET** /user_account/following | List following
[**userWebsitesGet**](UserAccountApi.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites
[**verifyWebsiteUpdate**](UserAccountApi.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
[**websiteVerificationGet**](UserAccountApi.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **boardsUserFollowsList**
> BoardsUserFollowsList200Response boardsUserFollowsList()

Get a list of the boards a user follows. The request returns a board summary object array.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiBoardsUserFollowsListRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
  explicitFollowing: false,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardsUserFollowsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **explicitFollowing** | [**boolean**] | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | (optional) defaults to false
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**BoardsUserFollowsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid user id |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **followUserUpdate**
> UserSummary followUserUpdate(followUserRequest)

<strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiFollowUserUpdateRequest = {
  // string | A valid username
  username: "username",
  // FollowUserRequest | Follow a user.
  followUserRequest: {
    autoFollow: false,
  },
};

apiInstance.followUserUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **followUserRequest** | **FollowUserRequest**| Follow a user. |
 **username** | [**string**] | A valid username | defaults to undefined


### Return type

**UserSummary**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | User not found |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **followersList**
> FollowersList200Response followersList()

Get a list of your followers.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiFollowersListRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

apiInstance.followersList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**FollowersList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid user id |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **linkedBusinessAccountsGet**
> Array<LinkedBusiness> linkedBusinessAccountsGet()

Get a list of your linked business accounts.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:any = {};

apiInstance.linkedBusinessAccountsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<LinkedBusiness>**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **unverifyWebsiteDelete**
> void unverifyWebsiteDelete()

Unverifu a website verified by the signed-in user.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUnverifyWebsiteDeleteRequest = {
  // string | Website with path or domain only
  website: "mysite.test",
};

apiInstance.unverifyWebsiteDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | [**string**] | Website with path or domain only | defaults to undefined


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
**204** | Successfully unverified website |  -  |
**404** | Website not in user list. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **userAccountAnalytics**
> { [key: string]: AnalyticsMetricsResponse; } userAccountAnalytics()

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUserAccountAnalyticsRequest = {
  // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // 'OTHER' | 'CLAIMED' | 'BOTH' | Filter on Pins that match your claimed domain. (optional)
  fromClaimedContent: "BOTH",
  // 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO' | Pin formats to get data for, default is all. (optional)
  pinFormat: "ALL",
  // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
  appTypes: "ALL",
  // 'ALL' | 'PAID' | 'ORGANIC' | Filter to paid or organic data. Default is all. (optional)
  contentType: "ALL",
  // 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
  source: "ALL",
  // Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'> | Metric types to get data for, default is all.  (optional)
  metricTypes: [
    "ENGAGEMENT",
  ],
  // 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT' | How to split the data into groups. Not including this param means data won\'t be split. (optional)
  splitField: "NO_SPLIT",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.userAccountAnalytics(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **fromClaimedContent** | [**&#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;**]**Array<&#39;OTHER&#39; &#124; &#39;CLAIMED&#39; &#124; &#39;BOTH&#39;>** | Filter on Pins that match your claimed domain. | (optional) defaults to 'BOTH'
 **pinFormat** | [**&#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39; | &#39;PRODUCT&#39; | &#39;REGULAR&#39; | &#39;VIDEO&#39;**]**Array<&#39;ALL&#39; &#124; &#39;ORGANIC_IMAGE&#39; &#124; &#39;ORGANIC_PRODUCT&#39; &#124; &#39;ORGANIC_VIDEO&#39; &#124; &#39;ADS_STANDARD&#39; &#124; &#39;ADS_PRODUCT&#39; &#124; &#39;ADS_VIDEO&#39; &#124; &#39;ADS_IDEA&#39; &#124; &#39;PRODUCT&#39; &#124; &#39;REGULAR&#39; &#124; &#39;VIDEO&#39;>** | Pin formats to get data for, default is all. | (optional) defaults to 'ALL'
 **appTypes** | [**&#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;**]**Array<&#39;ALL&#39; &#124; &#39;MOBILE&#39; &#124; &#39;TABLET&#39; &#124; &#39;WEB&#39;>** | Apps or devices to get data for, default is all. | (optional) defaults to 'ALL'
 **contentType** | [**&#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;**]**Array<&#39;ALL&#39; &#124; &#39;PAID&#39; &#124; &#39;ORGANIC&#39;>** | Filter to paid or organic data. Default is all. | (optional) defaults to 'ALL'
 **source** | [**&#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;**]**Array<&#39;ALL&#39; &#124; &#39;YOUR_PINS&#39; &#124; &#39;OTHER_PINS&#39;>** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | (optional) defaults to 'ALL'
 **metricTypes** | **Array<&#39;ENGAGEMENT&#39; &#124; &#39;ENGAGEMENT_RATE&#39; &#124; &#39;IMPRESSION&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;OUTBOUND_CLICK_RATE&#39; &#124; &#39;PIN_CLICK&#39; &#124; &#39;PIN_CLICK_RATE&#39; &#124; &#39;SAVE&#39; &#124; &#39;SAVE_RATE&#39;>** | Metric types to get data for, default is all.  | (optional) defaults to undefined
 **splitField** | [**&#39;NO_SPLIT&#39; | &#39;APP_TYPE&#39; | &#39;OWNED_CONTENT&#39; | &#39;SOURCE&#39; | &#39;PIN_FORMAT&#39;**]**Array<&#39;NO_SPLIT&#39; &#124; &#39;APP_TYPE&#39; &#124; &#39;OWNED_CONTENT&#39; &#124; &#39;SOURCE&#39; &#124; &#39;PIN_FORMAT&#39;>** | How to split the data into groups. Not including this param means data won\&#39;t be split. | (optional) defaults to 'NO_SPLIT'
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**{ [key: string]: AnalyticsMetricsResponse; }**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid user accounts analytics parameters. |  -  |
**403** | Not authorized to access the user account analytics. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **userAccountAnalyticsTopPins**
> TopPinsAnalyticsResponse userAccountAnalyticsTopPins()

Gets analytics data about a user\'s top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUserAccountAnalyticsTopPinsRequest = {
  // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // 'ENGAGEMENT' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | Specify sorting order for metrics
  sortBy: "ENGAGEMENT",
  // 'OTHER' | 'CLAIMED' | 'BOTH' | Filter on Pins that match your claimed domain. (optional)
  fromClaimedContent: "BOTH",
  // 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO' | Pin formats to get data for, default is all. (optional)
  pinFormat: "ALL",
  // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
  appTypes: "ALL",
  // 'ALL' | 'PAID' | 'ORGANIC' | Filter to paid or organic data. Default is all. (optional)
  contentType: "ALL",
  // 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
  source: "ALL",
  // Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'> | Metric types to get data for, default is all.  (optional)
  metricTypes: [
    "ENGAGEMENT",
  ],
  // number | Number of pins to include, default is 10. Max is 50. (optional)
  numOfPins: 25,
  // 30 | Get metrics for pins created in the last \"n\" days. (optional)
  createdInLastNDays: 30,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.userAccountAnalyticsTopPins(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **sortBy** | [**&#39;ENGAGEMENT&#39; | &#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;PIN_CLICK&#39; | &#39;SAVE&#39;**]**Array<&#39;ENGAGEMENT&#39; &#124; &#39;IMPRESSION&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;PIN_CLICK&#39; &#124; &#39;SAVE&#39;>** | Specify sorting order for metrics | defaults to undefined
 **fromClaimedContent** | [**&#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;**]**Array<&#39;OTHER&#39; &#124; &#39;CLAIMED&#39; &#124; &#39;BOTH&#39;>** | Filter on Pins that match your claimed domain. | (optional) defaults to 'BOTH'
 **pinFormat** | [**&#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39; | &#39;PRODUCT&#39; | &#39;REGULAR&#39; | &#39;VIDEO&#39;**]**Array<&#39;ALL&#39; &#124; &#39;ORGANIC_IMAGE&#39; &#124; &#39;ORGANIC_PRODUCT&#39; &#124; &#39;ORGANIC_VIDEO&#39; &#124; &#39;ADS_STANDARD&#39; &#124; &#39;ADS_PRODUCT&#39; &#124; &#39;ADS_VIDEO&#39; &#124; &#39;ADS_IDEA&#39; &#124; &#39;PRODUCT&#39; &#124; &#39;REGULAR&#39; &#124; &#39;VIDEO&#39;>** | Pin formats to get data for, default is all. | (optional) defaults to 'ALL'
 **appTypes** | [**&#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;**]**Array<&#39;ALL&#39; &#124; &#39;MOBILE&#39; &#124; &#39;TABLET&#39; &#124; &#39;WEB&#39;>** | Apps or devices to get data for, default is all. | (optional) defaults to 'ALL'
 **contentType** | [**&#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;**]**Array<&#39;ALL&#39; &#124; &#39;PAID&#39; &#124; &#39;ORGANIC&#39;>** | Filter to paid or organic data. Default is all. | (optional) defaults to 'ALL'
 **source** | [**&#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;**]**Array<&#39;ALL&#39; &#124; &#39;YOUR_PINS&#39; &#124; &#39;OTHER_PINS&#39;>** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | (optional) defaults to 'ALL'
 **metricTypes** | **Array<&#39;ENGAGEMENT&#39; &#124; &#39;ENGAGEMENT_RATE&#39; &#124; &#39;IMPRESSION&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;OUTBOUND_CLICK_RATE&#39; &#124; &#39;PIN_CLICK&#39; &#124; &#39;PIN_CLICK_RATE&#39; &#124; &#39;SAVE&#39; &#124; &#39;SAVE_RATE&#39;>** | Metric types to get data for, default is all.  | (optional) defaults to undefined
 **numOfPins** | [**number**] | Number of pins to include, default is 10. Max is 50. | (optional) defaults to 10
 **createdInLastNDays** | [**30**]**Array<30>** | Get metrics for pins created in the last \&quot;n\&quot; days. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**TopPinsAnalyticsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user account analytics. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **userAccountAnalyticsTopVideoPins**
> TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins()

Gets analytics data about a user\'s top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUserAccountAnalyticsTopVideoPinsRequest = {
  // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  startDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  endDate: new Date('1970-01-01').toISOString().split('T')[0];,
  // 'IMPRESSION' | 'SAVE' | 'OUTBOUND_CLICK' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | Specify sorting order for video metrics
  sortBy: "IMPRESSION",
  // 'OTHER' | 'CLAIMED' | 'BOTH' | Filter on Pins that match your claimed domain. (optional)
  fromClaimedContent: "BOTH",
  // 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO' | Pin formats to get data for, default is all. (optional)
  pinFormat: "ALL",
  // 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | Apps or devices to get data for, default is all. (optional)
  appTypes: "ALL",
  // 'ALL' | 'PAID' | 'ORGANIC' | Filter to paid or organic data. Default is all. (optional)
  contentType: "ALL",
  // 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)
  source: "ALL",
  // Array<'IMPRESSION' | 'SAVE' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | 'OUTBOUND_CLICK'> | Metric types to get video data for, default is all.  (optional)
  metricTypes: [
    "IMPRESSION",
  ],
  // number | Number of pins to include, default is 10. Max is 50. (optional)
  numOfPins: 25,
  // 30 | Get metrics for pins created in the last \"n\" days. (optional)
  createdInLastNDays: 30,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.userAccountAnalyticsTopVideoPins(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | [**string**] | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | defaults to undefined
 **endDate** | [**string**] | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | defaults to undefined
 **sortBy** | [**&#39;IMPRESSION&#39; | &#39;SAVE&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;VIDEO_MRC_VIEW&#39; | &#39;VIDEO_AVG_WATCH_TIME&#39; | &#39;VIDEO_V50_WATCH_TIME&#39; | &#39;QUARTILE_95_PERCENT_VIEW&#39; | &#39;VIDEO_10S_VIEW&#39; | &#39;VIDEO_START&#39;**]**Array<&#39;IMPRESSION&#39; &#124; &#39;SAVE&#39; &#124; &#39;OUTBOUND_CLICK&#39; &#124; &#39;VIDEO_MRC_VIEW&#39; &#124; &#39;VIDEO_AVG_WATCH_TIME&#39; &#124; &#39;VIDEO_V50_WATCH_TIME&#39; &#124; &#39;QUARTILE_95_PERCENT_VIEW&#39; &#124; &#39;VIDEO_10S_VIEW&#39; &#124; &#39;VIDEO_START&#39;>** | Specify sorting order for video metrics | defaults to undefined
 **fromClaimedContent** | [**&#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;**]**Array<&#39;OTHER&#39; &#124; &#39;CLAIMED&#39; &#124; &#39;BOTH&#39;>** | Filter on Pins that match your claimed domain. | (optional) defaults to 'BOTH'
 **pinFormat** | [**&#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39; | &#39;PRODUCT&#39; | &#39;REGULAR&#39; | &#39;VIDEO&#39;**]**Array<&#39;ALL&#39; &#124; &#39;ORGANIC_IMAGE&#39; &#124; &#39;ORGANIC_PRODUCT&#39; &#124; &#39;ORGANIC_VIDEO&#39; &#124; &#39;ADS_STANDARD&#39; &#124; &#39;ADS_PRODUCT&#39; &#124; &#39;ADS_VIDEO&#39; &#124; &#39;ADS_IDEA&#39; &#124; &#39;PRODUCT&#39; &#124; &#39;REGULAR&#39; &#124; &#39;VIDEO&#39;>** | Pin formats to get data for, default is all. | (optional) defaults to 'ALL'
 **appTypes** | [**&#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;**]**Array<&#39;ALL&#39; &#124; &#39;MOBILE&#39; &#124; &#39;TABLET&#39; &#124; &#39;WEB&#39;>** | Apps or devices to get data for, default is all. | (optional) defaults to 'ALL'
 **contentType** | [**&#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;**]**Array<&#39;ALL&#39; &#124; &#39;PAID&#39; &#124; &#39;ORGANIC&#39;>** | Filter to paid or organic data. Default is all. | (optional) defaults to 'ALL'
 **source** | [**&#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;**]**Array<&#39;ALL&#39; &#124; &#39;YOUR_PINS&#39; &#124; &#39;OTHER_PINS&#39;>** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | (optional) defaults to 'ALL'
 **metricTypes** | **Array<&#39;IMPRESSION&#39; &#124; &#39;SAVE&#39; &#124; &#39;VIDEO_MRC_VIEW&#39; &#124; &#39;VIDEO_AVG_WATCH_TIME&#39; &#124; &#39;VIDEO_V50_WATCH_TIME&#39; &#124; &#39;QUARTILE_95_PERCENT_VIEW&#39; &#124; &#39;VIDEO_10S_VIEW&#39; &#124; &#39;VIDEO_START&#39; &#124; &#39;OUTBOUND_CLICK&#39;>** | Metric types to get video data for, default is all.  | (optional) defaults to undefined
 **numOfPins** | [**number**] | Number of pins to include, default is 10. Max is 50. | (optional) defaults to 10
 **createdInLastNDays** | [**30**]**Array<30>** | Get metrics for pins created in the last \&quot;n\&quot; days. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**TopVideoPinsAnalyticsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user account analytics. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **userAccountFollowedInterests**
> UserAccountFollowedInterests200Response userAccountFollowedInterests()

Get a list of a user\'s following interests in one place.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUserAccountFollowedInterestsRequest = {
  // string | A valid username
  username: "username",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

apiInstance.userAccountFollowedInterests(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**string**] | A valid username | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**UserAccountFollowedInterests200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters |  -  |
**401** | Authorization failed |  -  |
**404** | User not found |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **userAccountGet**
> Account userAccountGet()

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUserAccountGetRequest = {
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.userAccountGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Account**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**403** | Not authorized to access the user account. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **userFollowingGet**
> UserFollowingGet200Response userFollowingGet()

Get a list of who a certain user follows.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUserFollowingGetRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
  feedType: "CREATOR_ONLY",
  // boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)
  explicitFollowing: false,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.userFollowingGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **feedType** | [**UserFollowingFeedType**] | Thrift param specifying what type of followees will be kept. Default to include all followees. | (optional) defaults to undefined
 **explicitFollowing** | [**boolean**] | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | (optional) defaults to false
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**UserFollowingGet200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **userWebsitesGet**
> UserWebsitesGet200Response userWebsitesGet()

Get user websites, claimed or not

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiUserWebsitesGetRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

apiInstance.userWebsitesGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**UserWebsitesGet200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user website list. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **verifyWebsiteUpdate**
> UserWebsiteSummary verifyWebsiteUpdate(userWebsiteVerifyRequest)

Verify a website as a signed-in user.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:.UserAccountApiVerifyWebsiteUpdateRequest = {
  // UserWebsiteVerifyRequest | Verify a website.
  userWebsiteVerifyRequest: {
    website: "pintest-website-12345678.test/test_1",
    verificationMethod: "METATAG",
  },
};

apiInstance.verifyWebsiteUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteVerifyRequest** | **UserWebsiteVerifyRequest**| Verify a website. |


### Return type

**UserWebsiteSummary**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **websiteVerificationGet**
> UserWebsiteVerificationCode websiteVerificationGet()

Get verification code for user to install on the website to claim it.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserAccountApi(configuration);

let body:any = {};

apiInstance.websiteVerificationGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**UserWebsiteVerificationCode**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user verification code for website claiming. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


