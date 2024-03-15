# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boardsUserFollowsList**](UserAccountApi.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards |
| [**followUserUpdate**](UserAccountApi.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user |
| [**followersList**](UserAccountApi.md#followersList) | **GET** /user_account/followers | List followers |
| [**linkedBusinessAccountsGet**](UserAccountApi.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses |
| [**unverifyWebsiteDelete**](UserAccountApi.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website |
| [**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics |
| [**userAccountAnalyticsTopPins**](UserAccountApi.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**userAccountAnalyticsTopVideoPins**](UserAccountApi.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**userAccountFollowedInterests**](UserAccountApi.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests |
| [**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account |
| [**userFollowingGet**](UserAccountApi.md#userFollowingGet) | **GET** /user_account/following | List following |
| [**userWebsitesGet**](UserAccountApi.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites |
| [**verifyWebsiteUpdate**](UserAccountApi.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website |
| [**websiteVerificationGet**](UserAccountApi.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming |


## Creating UserAccountApi

To initiate an instance of `UserAccountApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.UserAccountApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(UserAccountApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    UserAccountApi userAccountApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="boardsUserFollowsList"></a>
# **boardsUserFollowsList**
```java
Mono<BoardsUserFollowsList200Response> UserAccountApi.boardsUserFollowsList(bookmarkpageSizeexplicitFollowingadAccountId)
```

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **explicitFollowing** | `Boolean`| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional parameter] [default to `false`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="followUserUpdate"></a>
# **followUserUpdate**
```java
Mono<UserSummary> UserAccountApi.followUserUpdate(usernamefollowUserRequest)
```

Follow user

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **username** | `String`| A valid username | |
| **followUserRequest** | [**FollowUserRequest**](FollowUserRequest.md)| Follow a user. | |


### Return type
[**UserSummary**](UserSummary.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="followersList"></a>
# **followersList**
```java
Mono<FollowersList200Response> UserAccountApi.followersList(bookmarkpageSize)
```

List followers

Get a list of your followers.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**FollowersList200Response**](FollowersList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="linkedBusinessAccountsGet"></a>
# **linkedBusinessAccountsGet**
```java
Mono<List<LinkedBusiness>> UserAccountApi.linkedBusinessAccountsGet()
```

List linked businesses

Get a list of your linked business accounts.



### Return type
[**List&lt;LinkedBusiness&gt;**](LinkedBusiness.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="unverifyWebsiteDelete"></a>
# **unverifyWebsiteDelete**
```java
Mono<Void> UserAccountApi.unverifyWebsiteDelete(website)
```

Unverify website

Unverifu a website verified by the signed-in user.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **website** | `String`| Website with path or domain only | |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="userAccountAnalytics"></a>
# **userAccountAnalytics**
```java
Mono<Map<String, AnalyticsMetricsResponse>> UserAccountApi.userAccountAnalytics(startDateendDatefromClaimedContentpinFormatappTypescontentTypesourcemetricTypessplitFieldadAccountId)
```

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **fromClaimedContent** | `String`| Filter on Pins that match your claimed domain. | [optional parameter] [default to `BOTH`] [enum: `OTHER`, `CLAIMED`, `BOTH`] |
| **pinFormat** | `String`| Pin formats to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA`, `PRODUCT`, `REGULAR`, `VIDEO`] |
| **appTypes** | `String`| Apps or devices to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `MOBILE`, `TABLET`, `WEB`] |
| **contentType** | `String`| Filter to paid or organic data. Default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `PAID`, `ORGANIC`] |
| **source** | `String`| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional parameter] [default to `ALL`] [enum: `ALL`, `YOUR_PINS`, `OTHER_PINS`] |
| **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get data for, default is all.  | [optional parameter] [enum: `ENGAGEMENT`, `ENGAGEMENT_RATE`, `IMPRESSION`, `OUTBOUND_CLICK`, `OUTBOUND_CLICK_RATE`, `PIN_CLICK`, `PIN_CLICK_RATE`, `SAVE`, `SAVE_RATE`] |
| **splitField** | `String`| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional parameter] [default to `NO_SPLIT`] [enum: `NO_SPLIT`, `APP_TYPE`, `OWNED_CONTENT`, `SOURCE`, `PIN_FORMAT`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**Map&lt;String, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="userAccountAnalyticsTopPins"></a>
# **userAccountAnalyticsTopPins**
```java
Mono<TopPinsAnalyticsResponse> UserAccountApi.userAccountAnalyticsTopPins(startDateendDatesortByfromClaimedContentpinFormatappTypescontentTypesourcemetricTypesnumOfPinscreatedInLastNDaysadAccountId)
```

Get user account top pins analytics

Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **sortBy** | `String`| Specify sorting order for metrics | [enum: `ENGAGEMENT`, `IMPRESSION`, `OUTBOUND_CLICK`, `PIN_CLICK`, `SAVE`] |
| **fromClaimedContent** | `String`| Filter on Pins that match your claimed domain. | [optional parameter] [default to `BOTH`] [enum: `OTHER`, `CLAIMED`, `BOTH`] |
| **pinFormat** | `String`| Pin formats to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA`, `PRODUCT`, `REGULAR`, `VIDEO`] |
| **appTypes** | `String`| Apps or devices to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `MOBILE`, `TABLET`, `WEB`] |
| **contentType** | `String`| Filter to paid or organic data. Default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `PAID`, `ORGANIC`] |
| **source** | `String`| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional parameter] [default to `ALL`] [enum: `ALL`, `YOUR_PINS`, `OTHER_PINS`] |
| **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get data for, default is all.  | [optional parameter] [enum: `ENGAGEMENT`, `ENGAGEMENT_RATE`, `IMPRESSION`, `OUTBOUND_CLICK`, `OUTBOUND_CLICK_RATE`, `PIN_CLICK`, `PIN_CLICK_RATE`, `SAVE`, `SAVE_RATE`] |
| **numOfPins** | `Integer`| Number of pins to include, default is 10. Max is 50. | [optional parameter] [default to `10`] |
| **createdInLastNDays** | `Integer`| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional parameter] [enum: `30`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `pins:read`, `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="userAccountAnalyticsTopVideoPins"></a>
# **userAccountAnalyticsTopVideoPins**
```java
Mono<TopVideoPinsAnalyticsResponse> UserAccountApi.userAccountAnalyticsTopVideoPins(startDateendDatesortByfromClaimedContentpinFormatappTypescontentTypesourcemetricTypesnumOfPinscreatedInLastNDaysadAccountId)
```

Get user account top video pins analytics

Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **sortBy** | `String`| Specify sorting order for video metrics | [enum: `IMPRESSION`, `SAVE`, `OUTBOUND_CLICK`, `VIDEO_MRC_VIEW`, `VIDEO_AVG_WATCH_TIME`, `VIDEO_V50_WATCH_TIME`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_10S_VIEW`, `VIDEO_START`] |
| **fromClaimedContent** | `String`| Filter on Pins that match your claimed domain. | [optional parameter] [default to `BOTH`] [enum: `OTHER`, `CLAIMED`, `BOTH`] |
| **pinFormat** | `String`| Pin formats to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `ORGANIC_IMAGE`, `ORGANIC_PRODUCT`, `ORGANIC_VIDEO`, `ADS_STANDARD`, `ADS_PRODUCT`, `ADS_VIDEO`, `ADS_IDEA`, `PRODUCT`, `REGULAR`, `VIDEO`] |
| **appTypes** | `String`| Apps or devices to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `MOBILE`, `TABLET`, `WEB`] |
| **contentType** | `String`| Filter to paid or organic data. Default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `PAID`, `ORGANIC`] |
| **source** | `String`| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional parameter] [default to `ALL`] [enum: `ALL`, `YOUR_PINS`, `OTHER_PINS`] |
| **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get video data for, default is all.  | [optional parameter] [enum: `IMPRESSION`, `SAVE`, `VIDEO_MRC_VIEW`, `VIDEO_AVG_WATCH_TIME`, `VIDEO_V50_WATCH_TIME`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_10S_VIEW`, `VIDEO_START`, `OUTBOUND_CLICK`] |
| **numOfPins** | `Integer`| Number of pins to include, default is 10. Max is 50. | [optional parameter] [default to `10`] |
| **createdInLastNDays** | `Integer`| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional parameter] [enum: `30`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `pins:read`, `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="userAccountFollowedInterests"></a>
# **userAccountFollowedInterests**
```java
Mono<UserAccountFollowedInterests200Response> UserAccountApi.userAccountFollowedInterests(usernamebookmarkpageSize)
```

List following interests

Get a list of a user&#39;s following interests in one place.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **username** | `String`| A valid username | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="userAccountGet"></a>
# **userAccountGet**
```java
Mono<Account> UserAccountApi.userAccountGet(adAccountId)
```

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**Account**](Account.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="userFollowingGet"></a>
# **userFollowingGet**
```java
Mono<UserFollowingGet200Response> UserAccountApi.userFollowingGet(bookmarkpageSizefeedTypeexplicitFollowingadAccountId)
```

List following

Get a list of who a certain user follows.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **feedType** | `UserFollowingFeedType`| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional parameter] [default to `ALL`] [enum: `ALL`, `RANKED`, `CREATOR_ONLY`, `RANKED_CREATOR_ONLY`] |
| **explicitFollowing** | `Boolean`| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional parameter] [default to `false`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="userWebsitesGet"></a>
# **userWebsitesGet**
```java
Mono<UserWebsitesGet200Response> UserAccountApi.userWebsitesGet(bookmarkpageSize)
```

Get user websites

Get user websites, claimed or not

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="verifyWebsiteUpdate"></a>
# **verifyWebsiteUpdate**
```java
Mono<UserWebsiteSummary> UserAccountApi.verifyWebsiteUpdate(userWebsiteVerifyRequest)
```

Verify website

Verify a website as a signed-in user.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userWebsiteVerifyRequest** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md)| Verify a website. | |


### Return type
[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="websiteVerificationGet"></a>
# **websiteVerificationGet**
```java
Mono<UserWebsiteVerificationCode> UserAccountApi.websiteVerificationGet()
```

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.



### Return type
[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

