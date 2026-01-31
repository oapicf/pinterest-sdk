# ProductCategoriesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendsFeaturedTopicsList**](ProductCategoriesApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**trendsProductCategoriesDetailsList**](ProductCategoriesApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**trendsProductCategoriesTrendingList**](ProductCategoriesApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories



## trendsFeaturedTopicsList

> List&lt;FeaturedTrend&gt; trendsFeaturedTopicsList(region, interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductCategoriesApi;

ProductCategoriesApi apiInstance = new ProductCategoriesApi();
ProductCategoryRegion region = null; // ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
InterestsEnum interest = null; // InterestsEnum | Interest to filter by
try {
    List<FeaturedTrend> result = apiInstance.trendsFeaturedTopicsList(region, interest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductCategoriesApi#trendsFeaturedTopicsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null] [enum: US, GB+IE, CA]
 **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional] [default to null] [enum: ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING]

### Return type

[**List&lt;FeaturedTrend&gt;**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trendsProductCategoriesDetailsList

> List&lt;ProductCategoryDetails&gt; trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductCategoriesApi;

ProductCategoriesApi apiInstance = new ProductCategoriesApi();
List<ProductCategoryEnum> productCategories = null; // List<ProductCategoryEnum> | List of product categories
ProductCategoryRegion region = null; // ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
ProductCategoryDetailLookbackWindow lookbackWindow = null; // ProductCategoryDetailLookbackWindow |    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
ProductCategoriesEngagementType engagementType = null; // ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
try {
    List<ProductCategoryDetails> result = apiInstance.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductCategoriesApi#trendsProductCategoriesDetailsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCategories** | [**List&lt;ProductCategoryEnum&gt;**](ProductCategoryEnum.md)| List of product categories | [default to null]
 **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null] [enum: US, GB+IE, CA]
 **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](.md)|    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] [default to null] [enum: 90, 180, 365, 730]
 **engagementType** | [**ProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [default to null] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE]

### Return type

[**List&lt;ProductCategoryDetails&gt;**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trendsProductCategoriesTrendingList

> List&lt;TrendingProductCategory&gt; trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductCategoriesApi;

ProductCategoriesApi apiInstance = new ProductCategoriesApi();
ProductCategoryRegion region = null; // ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
List<VerticalProductCategory> verticals = null; // List<VerticalProductCategory> | List of verticals to filter by
List<AgeTrendsBucket> ages = null; // List<AgeTrendsBucket> | Age to filter by. If not provided, the results will be filtered by all ages.
List<GenderBucket> genders = null; // List<GenderBucket> | Gender to filter by, If not provided, the results will be filtered by all genders.
ProductCategoriesEngagementType engagementType = null; // ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
try {
    List<TrendingProductCategory> result = apiInstance.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductCategoriesApi#trendsProductCategoriesTrendingList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null] [enum: US, GB+IE, CA]
 **verticals** | [**List&lt;VerticalProductCategory&gt;**](VerticalProductCategory.md)| List of verticals to filter by | [optional] [default to null]
 **ages** | [**List&lt;AgeTrendsBucket&gt;**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] [default to null]
 **genders** | [**List&lt;GenderBucket&gt;**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] [default to null]
 **engagementType** | [**ProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [default to null] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE]

### Return type

[**List&lt;TrendingProductCategory&gt;**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

