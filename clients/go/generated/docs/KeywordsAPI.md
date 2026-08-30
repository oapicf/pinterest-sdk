# \KeywordsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CountryKeywordsMetricsGet**](KeywordsAPI.md#CountryKeywordsMetricsGet) | **Get** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
[**KeywordsCreate**](KeywordsAPI.md#KeywordsCreate) | **Post** /ad_accounts/{ad_account_id}/keywords | Create keywords
[**KeywordsGet**](KeywordsAPI.md#KeywordsGet) | **Get** /ad_accounts/{ad_account_id}/keywords | Get keywords
[**KeywordsUpdate**](KeywordsAPI.md#KeywordsUpdate) | **Patch** /ad_accounts/{ad_account_id}/keywords | Update keywords
[**TrendingKeywordsList**](KeywordsAPI.md#TrendingKeywordsList) | **Get** /trends/keywords/{region}/top/{trend_type} | List trending keywords



## CountryKeywordsMetricsGet

> KeywordsMetricsArrayResponse CountryKeywordsMetricsGet(ctx, adAccountId).CountryCode(countryCode).Keywords(keywords).Execute()

Get country's keyword metrics



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	countryCode := "countryCode_example" // string | Two letter country code (ISO 3166-1 alpha-2)
	keywords := []string{"Inner_example"} // []string | Comma-separated keywords

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.KeywordsAPI.CountryKeywordsMetricsGet(context.Background(), adAccountId).CountryCode(countryCode).Keywords(keywords).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `KeywordsAPI.CountryKeywordsMetricsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CountryKeywordsMetricsGet`: KeywordsMetricsArrayResponse
	fmt.Fprintf(os.Stdout, "Response from `KeywordsAPI.CountryKeywordsMetricsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCountryKeywordsMetricsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **countryCode** | **string** | Two letter country code (ISO 3166-1 alpha-2) | 
 **keywords** | **[]string** | Comma-separated keywords | 

### Return type

[**KeywordsMetricsArrayResponse**](KeywordsMetricsArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## KeywordsCreate

> Keywords KeywordsCreate(ctx, adAccountId).KeywordsCreate(keywordsCreate).Execute()

Create keywords



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	keywordsCreate := *openapiclient.NewKeywordsCreate([]openapiclient.KeywordCreateItem{*openapiclient.NewKeywordCreateItem("TODO", "Value_example")}, "ParentId_example") // KeywordsCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.KeywordsAPI.KeywordsCreate(context.Background(), adAccountId).KeywordsCreate(keywordsCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `KeywordsAPI.KeywordsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `KeywordsCreate`: Keywords
	fmt.Fprintf(os.Stdout, "Response from `KeywordsAPI.KeywordsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiKeywordsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **keywordsCreate** | [**KeywordsCreate**](KeywordsCreate.md) |  | 

### Return type

[**Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## KeywordsGet

> KeywordsGet200Response KeywordsGet(ctx, adAccountId).CampaignId(campaignId).AdGroupId(adGroupId).AdGroupIds(adGroupIds).MatchTypes(matchTypes).Bookmark(bookmark).PageSize(pageSize).Execute()

Get keywords



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	campaignId := "campaignId_example" // string | Campaign Id to use to filter the results. (optional)
	adGroupId := "adGroupId_example" // string | Ad group Id. (optional)
	adGroupIds := []string{"Inner_example"} // []string | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
	matchTypes := []openapiclient.MatchType{openapiclient.MatchType("BROAD")} // []MatchType | Keyword [match type](/docs/api-features/targeting-overview/) (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.KeywordsAPI.KeywordsGet(context.Background(), adAccountId).CampaignId(campaignId).AdGroupId(adGroupId).AdGroupIds(adGroupIds).MatchTypes(matchTypes).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `KeywordsAPI.KeywordsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `KeywordsGet`: KeywordsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `KeywordsAPI.KeywordsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiKeywordsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignId** | **string** | Campaign Id to use to filter the results. | 
 **adGroupId** | **string** | Ad group Id. | 
 **adGroupIds** | **[]string** | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | 
 **matchTypes** | [**[]MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**KeywordsGet200Response**](KeywordsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## KeywordsUpdate

> Keywords KeywordsUpdate(ctx, adAccountId).KeywordsUpdate(keywordsUpdate).Execute()

Update keywords



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	keywordsUpdate := *openapiclient.NewKeywordsUpdate() // KeywordsUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.KeywordsAPI.KeywordsUpdate(context.Background(), adAccountId).KeywordsUpdate(keywordsUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `KeywordsAPI.KeywordsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `KeywordsUpdate`: Keywords
	fmt.Fprintf(os.Stdout, "Response from `KeywordsAPI.KeywordsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiKeywordsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **keywordsUpdate** | [**KeywordsUpdate**](KeywordsUpdate.md) |  | 

### Return type

[**Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TrendingKeywordsList

> TrendingKeywordsResponse TrendingKeywordsList(ctx, region, trendType).Interests(interests).Genders(genders).Ages(ages).IncludeKeywords(includeKeywords).NormalizeAgainstGroup(normalizeAgainstGroup).Limit(limit).IncludeDemographics(includeDemographics).Execute()

List trending keywords



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
	region := openapiclient.TrendsSupportedRegion("US") // TrendsSupportedRegion |   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia
	trendType := openapiclient.TrendType("growing") // TrendType |   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
	interests := []openapiclient.TrendsL1Interest{openapiclient.TrendsL1Interest("animals")} // []TrendsL1Interest |   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion (optional)
	genders := []openapiclient.TrendsGenderFilter{openapiclient.TrendsGenderFilter("male")} // []TrendsGenderFilter | If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings. (optional)
	ages := []openapiclient.TrendsAgeBucket{openapiclient.TrendsAgeBucket("18-24")} // []TrendsAgeBucket | If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. (optional)
	includeKeywords := []string{"Inner_example"} // []string | If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. (optional)
	normalizeAgainstGroup := true // bool |  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional) (default to false)
	limit := int32(56) // int32 | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends. (optional) (default to 50)
	includeDemographics := true // bool | Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.KeywordsAPI.TrendingKeywordsList(context.Background(), region, trendType).Interests(interests).Genders(genders).Ages(ages).IncludeKeywords(includeKeywords).NormalizeAgainstGroup(normalizeAgainstGroup).Limit(limit).IncludeDemographics(includeDemographics).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `KeywordsAPI.TrendingKeywordsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TrendingKeywordsList`: TrendingKeywordsResponse
	fmt.Fprintf(os.Stdout, "Response from `KeywordsAPI.TrendingKeywordsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**region** | [**TrendsSupportedRegion**](.md) |   The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia | 
**trendType** | [**TrendType**](.md) |   The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) | 

### Other Parameters

Other parameters are passed through a pointer to a apiTrendingKeywordsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **interests** | [**[]TrendsL1Interest**](TrendsL1Interest.md) |   The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion | 
 **genders** | [**[]TrendsGenderFilter**](TrendsGenderFilter.md) | If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. | 
 **ages** | [**[]TrendsAgeBucket**](TrendsAgeBucket.md) | If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. | 
 **includeKeywords** | **[]string** | If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. | 
 **normalizeAgainstGroup** | **bool** |  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [default to false]
 **limit** | **int32** | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. | [default to 50]
 **includeDemographics** | **bool** | Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data. | [default to false]

### Return type

[**TrendingKeywordsResponse**](TrendingKeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

