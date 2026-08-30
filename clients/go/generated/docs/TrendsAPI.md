# \TrendsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TrendsEditorialArticlesList**](TrendsAPI.md#TrendsEditorialArticlesList) | **Get** /trends/editorial_articles | Returns editorial articles for a given region
[**TrendsFeaturedTopicsList**](TrendsAPI.md#TrendsFeaturedTopicsList) | **Get** /trends/topics/featured | Get featured topics
[**TrendsProductCategoriesDetailsList**](TrendsAPI.md#TrendsProductCategoriesDetailsList) | **Get** /trends/product_categories/details | Get product category details
[**TrendsProductCategoriesTrendingList**](TrendsAPI.md#TrendsProductCategoriesTrendingList) | **Get** /trends/product_categories/trending | Get a list of growing Shopping Product Categories



## TrendsEditorialArticlesList

> []TrendsEditorial TrendsEditorialArticlesList(ctx).Region(region).Execute()

Returns editorial articles for a given region



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
	region := openapiclient.ProductCategoryRegion("US") // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TrendsAPI.TrendsEditorialArticlesList(context.Background()).Region(region).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TrendsAPI.TrendsEditorialArticlesList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TrendsEditorialArticlesList`: []TrendsEditorial
	fmt.Fprintf(os.Stdout, "Response from `TrendsAPI.TrendsEditorialArticlesList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTrendsEditorialArticlesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 

### Return type

[**[]TrendsEditorial**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TrendsFeaturedTopicsList

> []FeaturedTrend TrendsFeaturedTopicsList(ctx).Region(region).Interest(interest).Execute()

Get featured topics



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
	region := openapiclient.ProductCategoryRegion("US") // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
	interest := openapiclient.InterestsEnum("ALL") // InterestsEnum | Interest to filter by (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TrendsAPI.TrendsFeaturedTopicsList(context.Background()).Region(region).Interest(interest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TrendsAPI.TrendsFeaturedTopicsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TrendsFeaturedTopicsList`: []FeaturedTrend
	fmt.Fprintf(os.Stdout, "Response from `TrendsAPI.TrendsFeaturedTopicsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTrendsFeaturedTopicsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **interest** | [**InterestsEnum**](InterestsEnum.md) | Interest to filter by | 

### Return type

[**[]FeaturedTrend**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TrendsProductCategoriesDetailsList

> []ProductCategoryDetails TrendsProductCategoriesDetailsList(ctx).ProductCategories(productCategories).Region(region).LookbackWindow(lookbackWindow).EngagementType(engagementType).Execute()

Get product category details



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
	productCategories := []openapiclient.ProductCategoryEnum{openapiclient.ProductCategoryEnum("ACCENT_TABLES")} // []ProductCategoryEnum | List of product categories
	region := openapiclient.ProductCategoryRegion("US") // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
	lookbackWindow := openapiclient.ProductCategoryDetailLookbackWindow(90) // ProductCategoryDetailLookbackWindow |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
	engagementType := openapiclient.ProductCategoriesEngagementType("ENGAGEMENT") // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TrendsAPI.TrendsProductCategoriesDetailsList(context.Background()).ProductCategories(productCategories).Region(region).LookbackWindow(lookbackWindow).EngagementType(engagementType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TrendsAPI.TrendsProductCategoriesDetailsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TrendsProductCategoriesDetailsList`: []ProductCategoryDetails
	fmt.Fprintf(os.Stdout, "Response from `TrendsAPI.TrendsProductCategoriesDetailsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTrendsProductCategoriesDetailsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCategories** | [**[]ProductCategoryEnum**](ProductCategoryEnum.md) | List of product categories | 
 **region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](ProductCategoryDetailLookbackWindow.md) |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | 
 **engagementType** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | 

### Return type

[**[]ProductCategoryDetails**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TrendsProductCategoriesTrendingList

> []TrendingProductCategory TrendsProductCategoriesTrendingList(ctx).Region(region).Verticals(verticals).Ages(ages).Genders(genders).EngagementType(engagementType).Execute()

Get a list of growing Shopping Product Categories



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
	region := openapiclient.ProductCategoryRegion("US") // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
	verticals := []openapiclient.VerticalProductCategory{openapiclient.VerticalProductCategory("FASHION")} // []VerticalProductCategory | List of verticals to filter by (optional)
	ages := []openapiclient.AgeTrendsBucket{openapiclient.AgeTrendsBucket("18-24")} // []AgeTrendsBucket | Age to filter by. If not provided, the results will be filtered by all ages. (optional)
	genders := []openapiclient.GenderBucket{openapiclient.GenderBucket("MALE")} // []GenderBucket | Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
	engagementType := openapiclient.ProductCategoriesEngagementType("ENGAGEMENT") // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TrendsAPI.TrendsProductCategoriesTrendingList(context.Background()).Region(region).Verticals(verticals).Ages(ages).Genders(genders).EngagementType(engagementType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TrendsAPI.TrendsProductCategoriesTrendingList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TrendsProductCategoriesTrendingList`: []TrendingProductCategory
	fmt.Fprintf(os.Stdout, "Response from `TrendsAPI.TrendsProductCategoriesTrendingList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTrendsProductCategoriesTrendingListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **verticals** | [**[]VerticalProductCategory**](VerticalProductCategory.md) | List of verticals to filter by | 
 **ages** | [**[]AgeTrendsBucket**](AgeTrendsBucket.md) | Age to filter by. If not provided, the results will be filtered by all ages. | 
 **genders** | [**[]GenderBucket**](GenderBucket.md) | Gender to filter by, If not provided, the results will be filtered by all genders. | 
 **engagementType** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | 

### Return type

[**[]TrendingProductCategory**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

