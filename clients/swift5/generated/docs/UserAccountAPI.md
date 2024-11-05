# UserAccountAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardsUserFollowsList**](UserAccountAPI.md#boardsuserfollowslist) | **GET** /user_account/following/boards | List following boards
[**followUserUpdate**](UserAccountAPI.md#followuserupdate) | **POST** /user_account/following/{username} | Follow user
[**followersList**](UserAccountAPI.md#followerslist) | **GET** /user_account/followers | List followers
[**linkedBusinessAccountsGet**](UserAccountAPI.md#linkedbusinessaccountsget) | **GET** /user_account/businesses | List linked businesses
[**unverifyWebsiteDelete**](UserAccountAPI.md#unverifywebsitedelete) | **DELETE** /user_account/websites | Unverify website
[**userAccountAnalytics**](UserAccountAPI.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountAnalyticsTopPins**](UserAccountAPI.md#useraccountanalyticstoppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**userAccountAnalyticsTopVideoPins**](UserAccountAPI.md#useraccountanalyticstopvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**userAccountFollowedInterests**](UserAccountAPI.md#useraccountfollowedinterests) | **GET** /users/{username}/interests/follow | List following interests
[**userAccountGet**](UserAccountAPI.md#useraccountget) | **GET** /user_account | Get user account
[**userFollowingGet**](UserAccountAPI.md#userfollowingget) | **GET** /user_account/following | List following
[**userWebsitesGet**](UserAccountAPI.md#userwebsitesget) | **GET** /user_account/websites | Get user websites
[**verifyWebsiteUpdate**](UserAccountAPI.md#verifywebsiteupdate) | **POST** /user_account/websites | Verify website
[**websiteVerificationGet**](UserAccountAPI.md#websiteverificationget) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **boardsUserFollowsList**
```swift
    open class func boardsUserFollowsList(bookmark: String? = nil, pageSize: Int? = nil, explicitFollowing: Bool? = nil, adAccountId: String? = nil, completion: @escaping (_ data: BoardsUserFollowsList200Response?, _ error: Error?) -> Void)
```

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let explicitFollowing = true // Bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to false)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List following boards
UserAccountAPI.boardsUserFollowsList(bookmark: bookmark, pageSize: pageSize, explicitFollowing: explicitFollowing, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **explicitFollowing** | **Bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followUserUpdate**
```swift
    open class func followUserUpdate(username: String, followUserRequest: FollowUserRequest, completion: @escaping (_ data: UserSummary?, _ error: Error?) -> Void)
```

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let username = "username_example" // String | A valid username
let followUserRequest = FollowUserRequest(autoFollow: false) // FollowUserRequest | Follow a user.

// Follow user
UserAccountAPI.followUserUpdate(username: username, followUserRequest: followUserRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String** | A valid username | 
 **followUserRequest** | [**FollowUserRequest**](FollowUserRequest.md) | Follow a user. | 

### Return type

[**UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followersList**
```swift
    open class func followersList(bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: FollowersList200Response?, _ error: Error?) -> Void)
```

List followers

Get a list of your followers.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// List followers
UserAccountAPI.followersList(bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linkedBusinessAccountsGet**
```swift
    open class func linkedBusinessAccountsGet(completion: @escaping (_ data: [LinkedBusiness]?, _ error: Error?) -> Void)
```

List linked businesses

Get a list of your linked business accounts.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// List linked businesses
UserAccountAPI.linkedBusinessAccountsGet() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[LinkedBusiness]**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverifyWebsiteDelete**
```swift
    open class func unverifyWebsiteDelete(website: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Unverify website

Unverifu a website verified by the signed-in user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let website = "website_example" // String | Website with path or domain only

// Unverify website
UserAccountAPI.unverifyWebsiteDelete(website: website) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **String** | Website with path or domain only | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountAnalytics**
```swift
    open class func userAccountAnalytics(startDate: Date, endDate: Date, fromClaimedContent: FromClaimedContent_userAccountAnalytics? = nil, pinFormat: PinFormat_userAccountAnalytics? = nil, appTypes: AppTypes_userAccountAnalytics? = nil, contentType: ContentType_userAccountAnalytics? = nil, source: Source_userAccountAnalytics? = nil, metricTypes: [MetricTypes_userAccountAnalytics]? = nil, splitField: SplitField_userAccountAnalytics? = nil, adAccountId: String? = nil, completion: @escaping (_ data: [String: AnalyticsMetricsResponse]?, _ error: Error?) -> Void)
```

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let fromClaimedContent = "fromClaimedContent_example" // String | Filter on Pins that match your claimed domain. (optional) (default to .both)
let pinFormat = "pinFormat_example" // String | Pin formats to get data for, default is all. (optional) (default to .all)
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let contentType = "contentType_example" // String | Filter to paid or organic data. Default is all. (optional) (default to .all)
let source = "source_example" // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to .all)
let metricTypes = ["metricTypes_example"] // [String] | Metric types to get data for, default is all.  (optional)
let splitField = "splitField_example" // String | How to split the data into groups. Not including this param means data won't be split. (optional) (default to .noSplit)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account analytics
UserAccountAPI.userAccountAnalytics(startDate: startDate, endDate: endDate, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source: source, metricTypes: metricTypes, splitField: splitField, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **fromClaimedContent** | **String** | Filter on Pins that match your claimed domain. | [optional] [default to .both]
 **pinFormat** | **String** | Pin formats to get data for, default is all. | [optional] [default to .all]
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **contentType** | **String** | Filter to paid or organic data. Default is all. | [optional] [default to .all]
 **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to .all]
 **metricTypes** | [**[String]**](String.md) | Metric types to get data for, default is all.  | [optional] 
 **splitField** | **String** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to .noSplit]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**[String: AnalyticsMetricsResponse]**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountAnalyticsTopPins**
```swift
    open class func userAccountAnalyticsTopPins(startDate: Date, endDate: Date, sortBy: SortBy_userAccountAnalyticsTopPins, fromClaimedContent: FromClaimedContent_userAccountAnalyticsTopPins? = nil, pinFormat: PinFormat_userAccountAnalyticsTopPins? = nil, appTypes: AppTypes_userAccountAnalyticsTopPins? = nil, contentType: ContentType_userAccountAnalyticsTopPins? = nil, source: Source_userAccountAnalyticsTopPins? = nil, metricTypes: [MetricTypes_userAccountAnalyticsTopPins]? = nil, numOfPins: Int? = nil, createdInLastNDays: CreatedInLastNDays_userAccountAnalyticsTopPins? = nil, adAccountId: String? = nil, completion: @escaping (_ data: TopPinsAnalyticsResponse?, _ error: Error?) -> Void)
```

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let sortBy = "sortBy_example" // String | Specify sorting order for metrics
let fromClaimedContent = "fromClaimedContent_example" // String | Filter on Pins that match your claimed domain. (optional) (default to .both)
let pinFormat = "pinFormat_example" // String | Pin formats to get data for, default is all. (optional) (default to .all)
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let contentType = "contentType_example" // String | Filter to paid or organic data. Default is all. (optional) (default to .all)
let source = "source_example" // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to .all)
let metricTypes = ["metricTypes_example"] // [String] | Metric types to get data for, default is all.  (optional)
let numOfPins = 987 // Int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
let createdInLastNDays = 987 // Int | Get metrics for pins created in the last \"n\" days. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account top pins analytics
UserAccountAPI.userAccountAnalyticsTopPins(startDate: startDate, endDate: endDate, sortBy: sortBy, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source: source, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | **String** | Specify sorting order for metrics | 
 **fromClaimedContent** | **String** | Filter on Pins that match your claimed domain. | [optional] [default to .both]
 **pinFormat** | **String** | Pin formats to get data for, default is all. | [optional] [default to .all]
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **contentType** | **String** | Filter to paid or organic data. Default is all. | [optional] [default to .all]
 **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to .all]
 **metricTypes** | [**[String]**](String.md) | Metric types to get data for, default is all.  | [optional] 
 **numOfPins** | **Int** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **Int** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountAnalyticsTopVideoPins**
```swift
    open class func userAccountAnalyticsTopVideoPins(startDate: Date, endDate: Date, sortBy: SortBy_userAccountAnalyticsTopVideoPins, fromClaimedContent: FromClaimedContent_userAccountAnalyticsTopVideoPins? = nil, pinFormat: PinFormat_userAccountAnalyticsTopVideoPins? = nil, appTypes: AppTypes_userAccountAnalyticsTopVideoPins? = nil, contentType: ContentType_userAccountAnalyticsTopVideoPins? = nil, source: Source_userAccountAnalyticsTopVideoPins? = nil, metricTypes: [MetricTypes_userAccountAnalyticsTopVideoPins]? = nil, numOfPins: Int? = nil, createdInLastNDays: CreatedInLastNDays_userAccountAnalyticsTopVideoPins? = nil, adAccountId: String? = nil, completion: @escaping (_ data: TopVideoPinsAnalyticsResponse?, _ error: Error?) -> Void)
```

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let sortBy = "sortBy_example" // String | Specify sorting order for video metrics
let fromClaimedContent = "fromClaimedContent_example" // String | Filter on Pins that match your claimed domain. (optional) (default to .both)
let pinFormat = "pinFormat_example" // String | Pin formats to get data for, default is all. (optional) (default to .all)
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let contentType = "contentType_example" // String | Filter to paid or organic data. Default is all. (optional) (default to .all)
let source = "source_example" // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to .all)
let metricTypes = ["metricTypes_example"] // [String] | Metric types to get video data for, default is all.  (optional)
let numOfPins = 987 // Int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
let createdInLastNDays = 987 // Int | Get metrics for pins created in the last \"n\" days. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account top video pins analytics
UserAccountAPI.userAccountAnalyticsTopVideoPins(startDate: startDate, endDate: endDate, sortBy: sortBy, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source: source, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | **String** | Specify sorting order for video metrics | 
 **fromClaimedContent** | **String** | Filter on Pins that match your claimed domain. | [optional] [default to .both]
 **pinFormat** | **String** | Pin formats to get data for, default is all. | [optional] [default to .all]
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **contentType** | **String** | Filter to paid or organic data. Default is all. | [optional] [default to .all]
 **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to .all]
 **metricTypes** | [**[String]**](String.md) | Metric types to get video data for, default is all.  | [optional] 
 **numOfPins** | **Int** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **Int** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountFollowedInterests**
```swift
    open class func userAccountFollowedInterests(username: String, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: UserAccountFollowedInterests200Response?, _ error: Error?) -> Void)
```

List following interests

Get a list of a user's following interests in one place.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let username = "username_example" // String | A valid username
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// List following interests
UserAccountAPI.userAccountFollowedInterests(username: username, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String** | A valid username | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountGet**
```swift
    open class func userAccountGet(adAccountId: String? = nil, completion: @escaping (_ data: Account?, _ error: Error?) -> Void)
```

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account
UserAccountAPI.userAccountGet(adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userFollowingGet**
```swift
    open class func userFollowingGet(bookmark: String? = nil, pageSize: Int? = nil, feedType: UserFollowingFeedType? = nil, explicitFollowing: Bool? = nil, adAccountId: String? = nil, completion: @escaping (_ data: UserFollowingGet200Response?, _ error: Error?) -> Void)
```

List following

Get a list of who a certain user follows.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let feedType = UserFollowingFeedType() // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
let explicitFollowing = true // Bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to false)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List following
UserAccountAPI.userFollowingGet(bookmark: bookmark, pageSize: pageSize, feedType: feedType, explicitFollowing: explicitFollowing, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **feedType** | **UserFollowingFeedType** | Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
 **explicitFollowing** | **Bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userWebsitesGet**
```swift
    open class func userWebsitesGet(bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: UserWebsitesGet200Response?, _ error: Error?) -> Void)
```

Get user websites

Get user websites, claimed or not

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// Get user websites
UserAccountAPI.userWebsitesGet(bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verifyWebsiteUpdate**
```swift
    open class func verifyWebsiteUpdate(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: String? = nil, completion: @escaping (_ data: UserWebsiteSummary?, _ error: Error?) -> Void)
```

Verify website

Verify a website as a signed-in user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userWebsiteVerifyRequest = UserWebsiteVerifyRequest(website: "website_example", verificationMethod: "verificationMethod_example") // UserWebsiteVerifyRequest | Verify a website.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Verify website
UserAccountAPI.verifyWebsiteUpdate(userWebsiteVerifyRequest: userWebsiteVerifyRequest, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteVerifyRequest** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md) | Verify a website. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **websiteVerificationGet**
```swift
    open class func websiteVerificationGet(adAccountId: String? = nil, completion: @escaping (_ data: UserWebsiteVerificationCode?, _ error: Error?) -> Void)
```

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user verification code for website claiming
UserAccountAPI.websiteVerificationGet(adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

