# UserAccountApi

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



## boardsUserFollowsList

> BoardsUserFollowsList200Response boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
Boolean explicitFollowing = false; // Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    BoardsUserFollowsList200Response result = apiInstance.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#boardsUserFollowsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **explicitFollowing** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## followUserUpdate

> UserSummary followUserUpdate(username, followUserRequest)

Follow user

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String username = username; // String | A valid username
FollowUserRequest followUserRequest = new FollowUserRequest(); // FollowUserRequest | Follow a user.
try {
    UserSummary result = apiInstance.followUserUpdate(username, followUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#followUserUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A valid username | [default to null]
 **followUserRequest** | [**FollowUserRequest**](FollowUserRequest.md)| Follow a user. |

### Return type

[**UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## followersList

> FollowersList200Response followersList(bookmark, pageSize)

List followers

Get a list of your followers.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    FollowersList200Response result = apiInstance.followersList(bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#followersList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## linkedBusinessAccountsGet

> List&lt;LinkedBusiness&gt; linkedBusinessAccountsGet()

List linked businesses

Get a list of your linked business accounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
try {
    List<LinkedBusiness> result = apiInstance.linkedBusinessAccountsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#linkedBusinessAccountsGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;LinkedBusiness&gt;**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## unverifyWebsiteDelete

> unverifyWebsiteDelete(website)

Unverify website

Unverifu a website verified by the signed-in user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String website = mysite.test; // String | Website with path or domain only
try {
    apiInstance.unverifyWebsiteDelete(website);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#unverifyWebsiteDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **String**| Website with path or domain only | [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userAccountAnalytics

> Map&lt;String, AnalyticsMetricsResponse&gt; userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
String fromClaimedContent = BOTH; // String | Filter on Pins that match your claimed domain.
String pinFormat = ALL; // String | Pin formats to get data for, default is all.
String appTypes = ALL; // String | Apps or devices to get data for, default is all.
String contentType = ALL; // String | Filter to paid or organic data. Default is all.
String source = ALL; // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
List<String> metricTypes = null; // List<String> | Metric types to get data for, default is all. 
String splitField = NO_SPLIT; // String | How to split the data into groups. Not including this param means data won't be split.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Map<String, AnalyticsMetricsResponse> result = apiInstance.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#userAccountAnalytics");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **contentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to ALL] [enum: ALL, PAID, ORGANIC]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] [enum: ALL, YOUR_PINS, OTHER_PINS]
 **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get data for, default is all.  | [optional] [default to null] [enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE]
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Map&lt;String, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userAccountAnalyticsTopPins

> TopPinsAnalyticsResponse userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top pins analytics

Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
String sortBy = null; // String | Specify sorting order for metrics
String fromClaimedContent = BOTH; // String | Filter on Pins that match your claimed domain.
String pinFormat = ALL; // String | Pin formats to get data for, default is all.
String appTypes = ALL; // String | Apps or devices to get data for, default is all.
String contentType = ALL; // String | Filter to paid or organic data. Default is all.
String source = ALL; // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
List<String> metricTypes = null; // List<String> | Metric types to get data for, default is all. 
Integer numOfPins = 25; // Integer | Number of pins to include, default is 10. Max is 50.
Integer createdInLastNDays = 30; // Integer | Get metrics for pins created in the last \"n\" days.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    TopPinsAnalyticsResponse result = apiInstance.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#userAccountAnalyticsTopPins");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **sortBy** | **String**| Specify sorting order for metrics | [default to null] [enum: ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE]
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **contentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to ALL] [enum: ALL, PAID, ORGANIC]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] [enum: ALL, YOUR_PINS, OTHER_PINS]
 **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get data for, default is all.  | [optional] [default to null] [enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE]
 **numOfPins** | **Integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **Integer**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null] [enum: 30]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userAccountAnalyticsTopVideoPins

> TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top video pins analytics

Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
String sortBy = null; // String | Specify sorting order for video metrics
String fromClaimedContent = BOTH; // String | Filter on Pins that match your claimed domain.
String pinFormat = ALL; // String | Pin formats to get data for, default is all.
String appTypes = ALL; // String | Apps or devices to get data for, default is all.
String contentType = ALL; // String | Filter to paid or organic data. Default is all.
String source = ALL; // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
List<String> metricTypes = null; // List<String> | Metric types to get video data for, default is all. 
Integer numOfPins = 25; // Integer | Number of pins to include, default is 10. Max is 50.
Integer createdInLastNDays = 30; // Integer | Get metrics for pins created in the last \"n\" days.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    TopVideoPinsAnalyticsResponse result = apiInstance.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#userAccountAnalyticsTopVideoPins");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **sortBy** | **String**| Specify sorting order for video metrics | [default to null] [enum: IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START]
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **contentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to ALL] [enum: ALL, PAID, ORGANIC]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] [enum: ALL, YOUR_PINS, OTHER_PINS]
 **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get video data for, default is all.  | [optional] [default to null] [enum: IMPRESSION, SAVE, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START, OUTBOUND_CLICK]
 **numOfPins** | **Integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **Integer**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null] [enum: 30]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userAccountFollowedInterests

> UserAccountFollowedInterests200Response userAccountFollowedInterests(username, bookmark, pageSize)

List following interests

Get a list of a user&#39;s following interests in one place.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String username = username; // String | A valid username
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    UserAccountFollowedInterests200Response result = apiInstance.userAccountFollowedInterests(username, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#userAccountFollowedInterests");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A valid username | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userAccountGet

> Account userAccountGet(adAccountId)

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Account result = apiInstance.userAccountGet(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#userAccountGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userFollowingGet

> UserFollowingGet200Response userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId)

List following

Get a list of who a certain user follows.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
UserFollowingFeedType feedType = null; // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees.
Boolean explicitFollowing = false; // Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    UserFollowingGet200Response result = apiInstance.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#userFollowingGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **feedType** | **UserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] [default to null] [enum: ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY]
 **explicitFollowing** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userWebsitesGet

> UserWebsitesGet200Response userWebsitesGet(bookmark, pageSize)

Get user websites

Get user websites, claimed or not

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    UserWebsitesGet200Response result = apiInstance.userWebsitesGet(bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#userWebsitesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## verifyWebsiteUpdate

> UserWebsiteSummary verifyWebsiteUpdate(userWebsiteVerifyRequest, adAccountId)

Verify website

Verify a website as a signed-in user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
UserWebsiteVerifyRequest userWebsiteVerifyRequest = new UserWebsiteVerifyRequest(); // UserWebsiteVerifyRequest | Verify a website.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    UserWebsiteSummary result = apiInstance.verifyWebsiteUpdate(userWebsiteVerifyRequest, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#verifyWebsiteUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteVerifyRequest** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md)| Verify a website. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## websiteVerificationGet

> UserWebsiteVerificationCode websiteVerificationGet(adAccountId)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UserAccountApi;

UserAccountApi apiInstance = new UserAccountApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    UserWebsiteVerificationCode result = apiInstance.websiteVerificationGet(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAccountApi#websiteVerificationGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

