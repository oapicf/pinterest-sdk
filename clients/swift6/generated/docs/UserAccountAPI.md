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
    open class func boardsUserFollowsList(adAccountId: String? = nil, explicitFollowing: Bool? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardsList200Response
```

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let explicitFollowing = true // Bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to false)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List following boards
do {
    let response = try await UserAccountAPI.boardsUserFollowsList(adAccountId: adAccountId, explicitFollowing: explicitFollowing, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **explicitFollowing** | **Bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followUserUpdate**
```swift
    open class func followUserUpdate(username: String, followUserCreate: FollowUserCreate, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> FollowUser
```

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let username = "username_example" // String | A valid username
let followUserCreate = FollowUserCreate(autoFollow: false) // FollowUserCreate | 

// Follow user
do {
    let response = try await UserAccountAPI.followUserUpdate(username: username, followUserCreate: followUserCreate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String** | A valid username | 
 **followUserCreate** | [**FollowUserCreate**](FollowUserCreate.md) |  | 

### Return type

[**FollowUser**](FollowUser.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followersList**
```swift
    open class func followersList(bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> FollowersList200Response
```

List followers

Get a list of your followers.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List followers
do {
    let response = try await UserAccountAPI.followersList(bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
    open class func linkedBusinessAccountsGet(apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> [LinkedBusiness]
```

List linked businesses

Get a list of your linked business accounts.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// List linked businesses
do {
    let response = try await UserAccountAPI.linkedBusinessAccountsGet()
    dump(response)
} catch {
    print(error)
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
    open class func unverifyWebsiteDelete(website: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> UserWebsite?
```

Unverify website

Unverify a website verified by the signed-in user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let website = "website_example" // String | Website with path or domain only

// Unverify website
do {
    let response = try await UserAccountAPI.unverifyWebsiteDelete(website: website)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **String** | Website with path or domain only | 

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userAccountAnalytics**
```swift
    open class func userAccountAnalytics(startDate: Date, endDate: Date, fromClaimedContent: FromClaimedContent_userAccountAnalytics? = nil, pinFormat: PinFormat_userAccountAnalytics? = nil, appTypes: AppTypes_userAccountAnalytics? = nil, contentType: ContentType_userAccountAnalytics? = nil, source: Source_userAccountAnalytics? = nil, metricTypes: [QuerymetrictypesItems]? = nil, splitField: SplitField_userAccountAnalytics? = nil, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> [String: AnalyticsMetricsResponse]
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
let metricTypes = [QuerymetrictypesItems()] // [QuerymetrictypesItems] | Metric types to get data for, default is all. (optional)
let splitField = "splitField_example" // String | How to split the data into groups. Not including this param means data won't be split. (optional) (default to .noSplit)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account analytics
do {
    let response = try await UserAccountAPI.userAccountAnalytics(startDate: startDate, endDate: endDate, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source: source, metricTypes: metricTypes, splitField: splitField, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
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
 **metricTypes** | [**[QuerymetrictypesItems]**](QuerymetrictypesItems.md) | Metric types to get data for, default is all. | [optional] 
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
    open class func userAccountAnalyticsTopPins(startDate: Date, endDate: Date, sortBy: TopPinsSortBy, fromClaimedContent: FromClaimedContent_userAccountAnalyticsTopPins? = nil, pinFormat: PinFormat_userAccountAnalyticsTopPins? = nil, appTypes: AppTypes_userAccountAnalyticsTopPins? = nil, contentType: ContentType_userAccountAnalyticsTopPins? = nil, source: Source_userAccountAnalyticsTopPins? = nil, metricTypes: [QuerymetrictypesItems]? = nil, numOfPins: Int? = nil, createdInLastNDays: CreatedInLastNDays_userAccountAnalyticsTopPins? = nil, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> TopPinsAnalyticsResponse
```

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let sortBy = TopPinsSortBy() // TopPinsSortBy | Specify sorting order for metrics
let fromClaimedContent = "fromClaimedContent_example" // String | Filter on Pins that match your claimed domain. (optional) (default to .both)
let pinFormat = "pinFormat_example" // String | Pin formats to get data for, default is all. (optional) (default to .all)
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let contentType = "contentType_example" // String | Filter to paid or organic data. Default is all. (optional) (default to .all)
let source = "source_example" // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to .all)
let metricTypes = [QuerymetrictypesItems()] // [QuerymetrictypesItems] | Metric types to get data for, default is all. (optional)
let numOfPins = 987 // Int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
let createdInLastNDays = 987 // Double | Get metrics for pins created in the last \"n\" days. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account top pins analytics
do {
    let response = try await UserAccountAPI.userAccountAnalyticsTopPins(startDate: startDate, endDate: endDate, sortBy: sortBy, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source: source, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | [**TopPinsSortBy**](.md) | Specify sorting order for metrics | 
 **fromClaimedContent** | **String** | Filter on Pins that match your claimed domain. | [optional] [default to .both]
 **pinFormat** | **String** | Pin formats to get data for, default is all. | [optional] [default to .all]
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **contentType** | **String** | Filter to paid or organic data. Default is all. | [optional] [default to .all]
 **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to .all]
 **metricTypes** | [**[QuerymetrictypesItems]**](QuerymetrictypesItems.md) | Metric types to get data for, default is all. | [optional] 
 **numOfPins** | **Int** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **Double** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
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
    open class func userAccountAnalyticsTopVideoPins(startDate: Date, endDate: Date, sortBy: TopVideoPinsSortBy, fromClaimedContent: FromClaimedContent_userAccountAnalyticsTopVideoPins? = nil, pinFormat: PinFormat_userAccountAnalyticsTopVideoPins? = nil, appTypes: AppTypes_userAccountAnalyticsTopVideoPins? = nil, contentType: ContentType_userAccountAnalyticsTopVideoPins? = nil, source: Source_userAccountAnalyticsTopVideoPins? = nil, metricTypes: [QueryvideopinmetrictypesItems]? = nil, numOfPins: Int? = nil, createdInLastNDays: CreatedInLastNDays_userAccountAnalyticsTopVideoPins? = nil, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> TopVideoPinsAnalyticsResponse
```

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let sortBy = TopVideoPinsSortBy() // TopVideoPinsSortBy | Specify sorting order for video metrics
let fromClaimedContent = "fromClaimedContent_example" // String | Filter on Pins that match your claimed domain. (optional) (default to .both)
let pinFormat = "pinFormat_example" // String | Pin formats to get data for, default is all. (optional) (default to .all)
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let contentType = "contentType_example" // String | Filter to paid or organic data. Default is all. (optional) (default to .all)
let source = "source_example" // String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to .all)
let metricTypes = [QueryvideopinmetrictypesItems()] // [QueryvideopinmetrictypesItems] | Metric types to get video data for, default is all. (optional)
let numOfPins = 987 // Int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
let createdInLastNDays = 987 // Double | Get metrics for pins created in the last \"n\" days. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account top video pins analytics
do {
    let response = try await UserAccountAPI.userAccountAnalyticsTopVideoPins(startDate: startDate, endDate: endDate, sortBy: sortBy, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source: source, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | [**TopVideoPinsSortBy**](.md) | Specify sorting order for video metrics | 
 **fromClaimedContent** | **String** | Filter on Pins that match your claimed domain. | [optional] [default to .both]
 **pinFormat** | **String** | Pin formats to get data for, default is all. | [optional] [default to .all]
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **contentType** | **String** | Filter to paid or organic data. Default is all. | [optional] [default to .all]
 **source** | **String** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to .all]
 **metricTypes** | [**[QueryvideopinmetrictypesItems]**](QueryvideopinmetrictypesItems.md) | Metric types to get video data for, default is all. | [optional] 
 **numOfPins** | **Int** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **Double** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
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
    open class func userAccountFollowedInterests(username: String, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> UserAccountFollowedInterests200Response
```

List following interests

Get a list of a user's following interests in one place.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let username = "username_example" // String | A valid username
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List following interests
do {
    let response = try await UserAccountAPI.userAccountFollowedInterests(username: username, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String** | A valid username | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
    open class func userAccountGet(adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> Account
```

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account
do {
    let response = try await UserAccountAPI.userAccountGet(adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
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
    open class func userFollowingGet(adAccountId: String? = nil, explicitFollowing: Bool? = nil, feedType: UserFollowingFeedType? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> FollowersList200Response
```

List following

Get a list of who a certain user follows.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let explicitFollowing = true // Bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to false)
let feedType = UserFollowingFeedType() // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List following
do {
    let response = try await UserAccountAPI.userFollowingGet(adAccountId: adAccountId, explicitFollowing: explicitFollowing, feedType: feedType, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **explicitFollowing** | **Bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **feedType** | [**UserFollowingFeedType**](.md) | Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userWebsitesGet**
```swift
    open class func userWebsitesGet(bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> UserWebsitesGet200Response
```

Get user websites

Get user websites, claimed or not

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get user websites
do {
    let response = try await UserAccountAPI.userWebsitesGet(bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
    open class func verifyWebsiteUpdate(userWebsiteCreate: UserWebsiteCreate, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> UserWebsite
```

Verify website

Verify a website as a signed-in user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userWebsiteCreate = UserWebsiteCreate(verificationMethod: WebsiteVerificationMethod(), website: "website_example") // UserWebsiteCreate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Verify website
do {
    let response = try await UserAccountAPI.verifyWebsiteUpdate(userWebsiteCreate: userWebsiteCreate, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteCreate** | [**UserWebsiteCreate**](UserWebsiteCreate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **websiteVerificationGet**
```swift
    open class func websiteVerificationGet(adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> UserWebsiteVerification
```

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user verification code for website claiming
do {
    let response = try await UserAccountAPI.websiteVerificationGet(adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsiteVerification**](UserWebsiteVerification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

