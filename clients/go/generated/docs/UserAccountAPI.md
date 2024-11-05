# \UserAccountAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardsUserFollowsList**](UserAccountAPI.md#BoardsUserFollowsList) | **Get** /user_account/following/boards | List following boards
[**FollowUserUpdate**](UserAccountAPI.md#FollowUserUpdate) | **Post** /user_account/following/{username} | Follow user
[**FollowersList**](UserAccountAPI.md#FollowersList) | **Get** /user_account/followers | List followers
[**LinkedBusinessAccountsGet**](UserAccountAPI.md#LinkedBusinessAccountsGet) | **Get** /user_account/businesses | List linked businesses
[**UnverifyWebsiteDelete**](UserAccountAPI.md#UnverifyWebsiteDelete) | **Delete** /user_account/websites | Unverify website
[**UserAccountAnalytics**](UserAccountAPI.md#UserAccountAnalytics) | **Get** /user_account/analytics | Get user account analytics
[**UserAccountAnalyticsTopPins**](UserAccountAPI.md#UserAccountAnalyticsTopPins) | **Get** /user_account/analytics/top_pins | Get user account top pins analytics
[**UserAccountAnalyticsTopVideoPins**](UserAccountAPI.md#UserAccountAnalyticsTopVideoPins) | **Get** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**UserAccountFollowedInterests**](UserAccountAPI.md#UserAccountFollowedInterests) | **Get** /users/{username}/interests/follow | List following interests
[**UserAccountGet**](UserAccountAPI.md#UserAccountGet) | **Get** /user_account | Get user account
[**UserFollowingGet**](UserAccountAPI.md#UserFollowingGet) | **Get** /user_account/following | List following
[**UserWebsitesGet**](UserAccountAPI.md#UserWebsitesGet) | **Get** /user_account/websites | Get user websites
[**VerifyWebsiteUpdate**](UserAccountAPI.md#VerifyWebsiteUpdate) | **Post** /user_account/websites | Verify website
[**WebsiteVerificationGet**](UserAccountAPI.md#WebsiteVerificationGet) | **Get** /user_account/websites/verification | Get user verification code for website claiming



## BoardsUserFollowsList

> BoardsUserFollowsList200Response BoardsUserFollowsList(ctx).Bookmark(bookmark).PageSize(pageSize).ExplicitFollowing(explicitFollowing).AdAccountId(adAccountId).Execute()

List following boards



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	explicitFollowing := true // bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to false)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.BoardsUserFollowsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).ExplicitFollowing(explicitFollowing).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.BoardsUserFollowsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardsUserFollowsList`: BoardsUserFollowsList200Response
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.BoardsUserFollowsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBoardsUserFollowsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **explicitFollowing** | **bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [default to false]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FollowUserUpdate

> UserSummary FollowUserUpdate(ctx, username).FollowUserRequest(followUserRequest).Execute()

Follow user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	username := "username" // string | A valid username
	followUserRequest := *openapiclient.NewFollowUserRequest() // FollowUserRequest | Follow a user.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.FollowUserUpdate(context.Background(), username).FollowUserRequest(followUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.FollowUserUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FollowUserUpdate`: UserSummary
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.FollowUserUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**username** | **string** | A valid username | 

### Other Parameters

Other parameters are passed through a pointer to a apiFollowUserUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **followUserRequest** | [**FollowUserRequest**](FollowUserRequest.md) | Follow a user. | 

### Return type

[**UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FollowersList

> FollowersList200Response FollowersList(ctx).Bookmark(bookmark).PageSize(pageSize).Execute()

List followers



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.FollowersList(context.Background()).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.FollowersList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FollowersList`: FollowersList200Response
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.FollowersList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFollowersListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LinkedBusinessAccountsGet

> []LinkedBusiness LinkedBusinessAccountsGet(ctx).Execute()

List linked businesses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.LinkedBusinessAccountsGet(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.LinkedBusinessAccountsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LinkedBusinessAccountsGet`: []LinkedBusiness
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.LinkedBusinessAccountsGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiLinkedBusinessAccountsGetRequest struct via the builder pattern


### Return type

[**[]LinkedBusiness**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UnverifyWebsiteDelete

> UnverifyWebsiteDelete(ctx).Website(website).Execute()

Unverify website



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	website := "mysite.test" // string | Website with path or domain only

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.UserAccountAPI.UnverifyWebsiteDelete(context.Background()).Website(website).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UnverifyWebsiteDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUnverifyWebsiteDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **string** | Website with path or domain only | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserAccountAnalytics

> map[string]AnalyticsMetricsResponse UserAccountAnalytics(ctx).StartDate(startDate).EndDate(endDate).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).ContentType(contentType).Source(source).MetricTypes(metricTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()

Get user account analytics



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	fromClaimedContent := "fromClaimedContent_example" // string | Filter on Pins that match your claimed domain. (optional) (default to "BOTH")
	pinFormat := "pinFormat_example" // string | Pin formats to get data for, default is all. (optional) (default to "ALL")
	appTypes := "appTypes_example" // string | Apps or devices to get data for, default is all. (optional) (default to "ALL")
	contentType := "contentType_example" // string | Filter to paid or organic data. Default is all. (optional) (default to "ALL")
	source := "source_example" // string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to "ALL")
	metricTypes := []string{"MetricTypes_example"} // []string | Metric types to get data for, default is all.  (optional)
	splitField := "splitField_example" // string | How to split the data into groups. Not including this param means data won't be split. (optional) (default to "NO_SPLIT")
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.UserAccountAnalytics(context.Background()).StartDate(startDate).EndDate(endDate).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).ContentType(contentType).Source(source).MetricTypes(metricTypes).SplitField(splitField).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UserAccountAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UserAccountAnalytics`: map[string]AnalyticsMetricsResponse
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.UserAccountAnalytics`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserAccountAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [default to &quot;BOTH&quot;]
 **pinFormat** | **string** | Pin formats to get data for, default is all. | [default to &quot;ALL&quot;]
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **contentType** | **string** | Filter to paid or organic data. Default is all. | [default to &quot;ALL&quot;]
 **source** | **string** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to &quot;ALL&quot;]
 **metricTypes** | **[]string** | Metric types to get data for, default is all.  | 
 **splitField** | **string** | How to split the data into groups. Not including this param means data won&#39;t be split. | [default to &quot;NO_SPLIT&quot;]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**map[string]AnalyticsMetricsResponse**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserAccountAnalyticsTopPins

> TopPinsAnalyticsResponse UserAccountAnalyticsTopPins(ctx).StartDate(startDate).EndDate(endDate).SortBy(sortBy).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).ContentType(contentType).Source(source).MetricTypes(metricTypes).NumOfPins(numOfPins).CreatedInLastNDays(createdInLastNDays).AdAccountId(adAccountId).Execute()

Get user account top pins analytics



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	sortBy := "sortBy_example" // string | Specify sorting order for metrics
	fromClaimedContent := "fromClaimedContent_example" // string | Filter on Pins that match your claimed domain. (optional) (default to "BOTH")
	pinFormat := "pinFormat_example" // string | Pin formats to get data for, default is all. (optional) (default to "ALL")
	appTypes := "appTypes_example" // string | Apps or devices to get data for, default is all. (optional) (default to "ALL")
	contentType := "contentType_example" // string | Filter to paid or organic data. Default is all. (optional) (default to "ALL")
	source := "source_example" // string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to "ALL")
	metricTypes := []string{"MetricTypes_example"} // []string | Metric types to get data for, default is all.  (optional)
	numOfPins := int32(25) // int32 | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
	createdInLastNDays := int32(30) // int32 | Get metrics for pins created in the last \"n\" days. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.UserAccountAnalyticsTopPins(context.Background()).StartDate(startDate).EndDate(endDate).SortBy(sortBy).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).ContentType(contentType).Source(source).MetricTypes(metricTypes).NumOfPins(numOfPins).CreatedInLastNDays(createdInLastNDays).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UserAccountAnalyticsTopPins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UserAccountAnalyticsTopPins`: TopPinsAnalyticsResponse
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.UserAccountAnalyticsTopPins`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserAccountAnalyticsTopPinsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | **string** | Specify sorting order for metrics | 
 **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [default to &quot;BOTH&quot;]
 **pinFormat** | **string** | Pin formats to get data for, default is all. | [default to &quot;ALL&quot;]
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **contentType** | **string** | Filter to paid or organic data. Default is all. | [default to &quot;ALL&quot;]
 **source** | **string** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to &quot;ALL&quot;]
 **metricTypes** | **[]string** | Metric types to get data for, default is all.  | 
 **numOfPins** | **int32** | Number of pins to include, default is 10. Max is 50. | [default to 10]
 **createdInLastNDays** | **int32** | Get metrics for pins created in the last \&quot;n\&quot; days. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserAccountAnalyticsTopVideoPins

> TopVideoPinsAnalyticsResponse UserAccountAnalyticsTopVideoPins(ctx).StartDate(startDate).EndDate(endDate).SortBy(sortBy).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).ContentType(contentType).Source(source).MetricTypes(metricTypes).NumOfPins(numOfPins).CreatedInLastNDays(createdInLastNDays).AdAccountId(adAccountId).Execute()

Get user account top video pins analytics



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	sortBy := "sortBy_example" // string | Specify sorting order for video metrics
	fromClaimedContent := "fromClaimedContent_example" // string | Filter on Pins that match your claimed domain. (optional) (default to "BOTH")
	pinFormat := "pinFormat_example" // string | Pin formats to get data for, default is all. (optional) (default to "ALL")
	appTypes := "appTypes_example" // string | Apps or devices to get data for, default is all. (optional) (default to "ALL")
	contentType := "contentType_example" // string | Filter to paid or organic data. Default is all. (optional) (default to "ALL")
	source := "source_example" // string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to "ALL")
	metricTypes := []string{"MetricTypes_example"} // []string | Metric types to get video data for, default is all.  (optional)
	numOfPins := int32(25) // int32 | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
	createdInLastNDays := int32(30) // int32 | Get metrics for pins created in the last \"n\" days. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.UserAccountAnalyticsTopVideoPins(context.Background()).StartDate(startDate).EndDate(endDate).SortBy(sortBy).FromClaimedContent(fromClaimedContent).PinFormat(pinFormat).AppTypes(appTypes).ContentType(contentType).Source(source).MetricTypes(metricTypes).NumOfPins(numOfPins).CreatedInLastNDays(createdInLastNDays).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UserAccountAnalyticsTopVideoPins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UserAccountAnalyticsTopVideoPins`: TopVideoPinsAnalyticsResponse
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.UserAccountAnalyticsTopVideoPins`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserAccountAnalyticsTopVideoPinsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sortBy** | **string** | Specify sorting order for video metrics | 
 **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [default to &quot;BOTH&quot;]
 **pinFormat** | **string** | Pin formats to get data for, default is all. | [default to &quot;ALL&quot;]
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **contentType** | **string** | Filter to paid or organic data. Default is all. | [default to &quot;ALL&quot;]
 **source** | **string** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to &quot;ALL&quot;]
 **metricTypes** | **[]string** | Metric types to get video data for, default is all.  | 
 **numOfPins** | **int32** | Number of pins to include, default is 10. Max is 50. | [default to 10]
 **createdInLastNDays** | **int32** | Get metrics for pins created in the last \&quot;n\&quot; days. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserAccountFollowedInterests

> UserAccountFollowedInterests200Response UserAccountFollowedInterests(ctx, username).Bookmark(bookmark).PageSize(pageSize).Execute()

List following interests



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	username := "username" // string | A valid username
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.UserAccountFollowedInterests(context.Background(), username).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UserAccountFollowedInterests``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UserAccountFollowedInterests`: UserAccountFollowedInterests200Response
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.UserAccountFollowedInterests`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**username** | **string** | A valid username | 

### Other Parameters

Other parameters are passed through a pointer to a apiUserAccountFollowedInterestsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserAccountGet

> Account UserAccountGet(ctx).AdAccountId(adAccountId).Execute()

Get user account



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.UserAccountGet(context.Background()).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UserAccountGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UserAccountGet`: Account
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.UserAccountGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserAccountGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserFollowingGet

> UserFollowingGet200Response UserFollowingGet(ctx).Bookmark(bookmark).PageSize(pageSize).FeedType(feedType).ExplicitFollowing(explicitFollowing).AdAccountId(adAccountId).Execute()

List following



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	feedType := "feedType_example" // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional) (default to "ALL")
	explicitFollowing := true // bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to false)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.UserFollowingGet(context.Background()).Bookmark(bookmark).PageSize(pageSize).FeedType(feedType).ExplicitFollowing(explicitFollowing).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UserFollowingGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UserFollowingGet`: UserFollowingGet200Response
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.UserFollowingGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserFollowingGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **feedType** | **UserFollowingFeedType** | Thrift param specifying what type of followees will be kept. Default to include all followees. | [default to &quot;ALL&quot;]
 **explicitFollowing** | **bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [default to false]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserWebsitesGet

> UserWebsitesGet200Response UserWebsitesGet(ctx).Bookmark(bookmark).PageSize(pageSize).Execute()

Get user websites



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.UserWebsitesGet(context.Background()).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.UserWebsitesGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UserWebsitesGet`: UserWebsitesGet200Response
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.UserWebsitesGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUserWebsitesGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifyWebsiteUpdate

> UserWebsiteSummary VerifyWebsiteUpdate(ctx).UserWebsiteVerifyRequest(userWebsiteVerifyRequest).AdAccountId(adAccountId).Execute()

Verify website



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	userWebsiteVerifyRequest := *openapiclient.NewUserWebsiteVerifyRequest() // UserWebsiteVerifyRequest | Verify a website.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.VerifyWebsiteUpdate(context.Background()).UserWebsiteVerifyRequest(userWebsiteVerifyRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.VerifyWebsiteUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `VerifyWebsiteUpdate`: UserWebsiteSummary
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.VerifyWebsiteUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiVerifyWebsiteUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteVerifyRequest** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md) | Verify a website. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WebsiteVerificationGet

> UserWebsiteVerificationCode WebsiteVerificationGet(ctx).AdAccountId(adAccountId).Execute()

Get user verification code for website claiming



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UserAccountAPI.WebsiteVerificationGet(context.Background()).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UserAccountAPI.WebsiteVerificationGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `WebsiteVerificationGet`: UserWebsiteVerificationCode
	fmt.Fprintf(os.Stdout, "Response from `UserAccountAPI.WebsiteVerificationGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiWebsiteVerificationGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

