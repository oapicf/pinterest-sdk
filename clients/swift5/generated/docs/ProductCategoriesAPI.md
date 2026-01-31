# ProductCategoriesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendsFeaturedTopicsList**](ProductCategoriesAPI.md#trendsfeaturedtopicslist) | **GET** /trends/topics/featured | Get featured topics
[**trendsProductCategoriesDetailsList**](ProductCategoriesAPI.md#trendsproductcategoriesdetailslist) | **GET** /trends/product_categories/details | Get product category details
[**trendsProductCategoriesTrendingList**](ProductCategoriesAPI.md#trendsproductcategoriestrendinglist) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **trendsFeaturedTopicsList**
```swift
    open class func trendsFeaturedTopicsList(region: ProductCategoryRegion, interest: InterestsEnum? = nil, completion: @escaping (_ data: [FeaturedTrend]?, _ error: Error?) -> Void)
```

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let region = ProductCategoryRegion() // ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
let interest = InterestsEnum() // InterestsEnum | Interest to filter by (optional)

// Get featured topics
ProductCategoriesAPI.trendsFeaturedTopicsList(region: region, interest: interest) { (response, error) in
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
 **region** | [**ProductCategoryRegion**](.md) |       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **interest** | [**InterestsEnum**](.md) | Interest to filter by | [optional] 

### Return type

[**[FeaturedTrend]**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trendsProductCategoriesDetailsList**
```swift
    open class func trendsProductCategoriesDetailsList(productCategories: [ProductCategoryEnum], region: ProductCategoryRegion, lookbackWindow: ProductCategoryDetailLookbackWindow? = nil, engagementType: ProductCategoriesEngagementType? = nil, completion: @escaping (_ data: [ProductCategoryDetails]?, _ error: Error?) -> Void)
```

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productCategories = [ProductCategoryEnum()] // [ProductCategoryEnum] | List of product categories
let region = ProductCategoryRegion() // ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
let lookbackWindow = ProductCategoryDetailLookbackWindow() // ProductCategoryDetailLookbackWindow |    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
let engagementType = ProductCategoriesEngagementType() // ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

// Get product category details
ProductCategoriesAPI.trendsProductCategoriesDetailsList(productCategories: productCategories, region: region, lookbackWindow: lookbackWindow, engagementType: engagementType) { (response, error) in
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
 **productCategories** | [**[ProductCategoryEnum]**](ProductCategoryEnum.md) | List of product categories | 
 **region** | [**ProductCategoryRegion**](.md) |       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](.md) |    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
 **engagementType** | [**ProductCategoriesEngagementType**](.md) |      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**[ProductCategoryDetails]**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trendsProductCategoriesTrendingList**
```swift
    open class func trendsProductCategoriesTrendingList(region: ProductCategoryRegion, verticals: [VerticalProductCategory]? = nil, ages: [AgeTrendsBucket]? = nil, genders: [GenderBucket]? = nil, engagementType: ProductCategoriesEngagementType? = nil, completion: @escaping (_ data: [TrendingProductCategory]?, _ error: Error?) -> Void)
```

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let region = ProductCategoryRegion() // ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
let verticals = [VerticalProductCategory()] // [VerticalProductCategory] | List of verticals to filter by (optional)
let ages = [AgeTrendsBucket()] // [AgeTrendsBucket] | Age to filter by. If not provided, the results will be filtered by all ages. (optional)
let genders = [GenderBucket()] // [GenderBucket] | Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
let engagementType = ProductCategoriesEngagementType() // ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

// Get a list of growing Shopping Product Categories
ProductCategoriesAPI.trendsProductCategoriesTrendingList(region: region, verticals: verticals, ages: ages, genders: genders, engagementType: engagementType) { (response, error) in
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
 **region** | [**ProductCategoryRegion**](.md) |       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **verticals** | [**[VerticalProductCategory]**](VerticalProductCategory.md) | List of verticals to filter by | [optional] 
 **ages** | [**[AgeTrendsBucket]**](AgeTrendsBucket.md) | Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
 **genders** | [**[GenderBucket]**](GenderBucket.md) | Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
 **engagementType** | [**ProductCategoriesEngagementType**](.md) |      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**[TrendingProductCategory]**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

