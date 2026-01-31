# ProductCategoriesApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendsFeaturedTopicsList**](ProductCategoriesApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**trendsProductCategoriesDetailsList**](ProductCategoriesApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**trendsProductCategoriesTrendingList**](ProductCategoriesApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories



## trendsFeaturedTopicsList

Get featured topics

Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example

```bash
 trendsFeaturedTopicsList  region=value  interest=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md) | The geographic region of interest. Only top product categories within the specified region will be returned.
     The 'region' parameter is formatted as ISO 3166-2 country codes delimited by '+'.

    - 'US' - United States
    - 'GB+IE' - Great Britain & Ireland
    - 'CA' - Canada | [default to null]
 **interest** | [**InterestsEnum**](.md) | Interest to filter by | [optional] [default to null]

### Return type

[**array[FeaturedTrend]**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## trendsProductCategoriesDetailsList

Get product category details

Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example

```bash
 trendsProductCategoriesDetailsList  Specify as:  product_categories=value1 product_categories=value2 product_categories=...  region=value  lookback_window=value  engagement_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCategories** | [**array[ProductCategoryEnum]**](ProductCategoryEnum.md) | List of product categories | [default to null]
 **region** | [**ProductCategoryRegion**](.md) | The geographic region of interest. Only top product categories within the specified region will be returned.
     The 'region' parameter is formatted as ISO 3166-2 country codes delimited by '+'.

    - 'US' - United States
    - 'GB+IE' - Great Britain & Ireland
    - 'CA' - Canada | [default to null]
 **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](.md) | Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.
  - '90' - Last 90 days (3 months)
  - '180' - Last 180 days (6 months)
  - '365' - Last 365 days (1 year)
  - '730' - Last 730 days (2 years) | [optional] [default to null]
 **engagementType** | [**ProductCategoriesEngagementType**](.md) | Type of engagement metric to analyze.
- 'ENGAGEMENT' - Overall engagement metric
- 'OUTBOUND_CLICK' - Number of outbound clicks
- 'SAVE' - Number of pin saves | [optional] [default to null]

### Return type

[**array[ProductCategoryDetails]**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## trendsProductCategoriesTrendingList

Get a list of growing Shopping Product Categories

Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example

```bash
 trendsProductCategoriesTrendingList  region=value  Specify as:  verticals=value1 verticals=value2 verticals=...  Specify as:  ages=value1 ages=value2 ages=...  Specify as:  genders=value1 genders=value2 genders=...  engagement_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md) | The geographic region of interest. Only top product categories within the specified region will be returned.
     The 'region' parameter is formatted as ISO 3166-2 country codes delimited by '+'.

    - 'US' - United States
    - 'GB+IE' - Great Britain & Ireland
    - 'CA' - Canada | [default to null]
 **verticals** | [**array[VerticalProductCategory]**](VerticalProductCategory.md) | List of verticals to filter by | [optional] [default to null]
 **ages** | [**array[AgeTrendsBucket]**](AgeTrendsBucket.md) | Age to filter by. If not provided, the results will be filtered by all ages. | [optional] [default to null]
 **genders** | [**array[GenderBucket]**](GenderBucket.md) | Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] [default to null]
 **engagementType** | [**ProductCategoriesEngagementType**](.md) | Type of engagement metric to analyze.
- 'ENGAGEMENT' - Overall engagement metric
- 'OUTBOUND_CLICK' - Number of outbound clicks
- 'SAVE' - Number of pin saves | [optional] [default to null]

### Return type

[**array[TrendingProductCategory]**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

