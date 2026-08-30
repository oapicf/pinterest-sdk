# TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**trendsEditorialArticlesList**](TrendsApi.md#trendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region |
| [**trendsFeaturedTopicsList**](TrendsApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics |
| [**trendsProductCategoriesDetailsList**](TrendsApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details |
| [**trendsProductCategoriesTrendingList**](TrendsApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |


<a id="trendsEditorialArticlesList"></a>
# **trendsEditorialArticlesList**
> kotlin.collections.List&lt;TrendsEditorial&gt; trendsEditorialArticlesList(region)

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrendsApi()
val region : ProductCategoryRegion =  // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
try {
    val result : kotlin.collections.List<TrendsEditorial> = apiInstance.trendsEditorialArticlesList(region)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrendsApi#trendsEditorialArticlesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrendsApi#trendsEditorialArticlesList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |

### Return type

[**kotlin.collections.List&lt;TrendsEditorial&gt;**](TrendsEditorial.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="trendsFeaturedTopicsList"></a>
# **trendsFeaturedTopicsList**
> kotlin.collections.List&lt;FeaturedTrend&gt; trendsFeaturedTopicsList(region, interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrendsApi()
val region : ProductCategoryRegion =  // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
val interest : InterestsEnum =  // InterestsEnum | Interest to filter by
try {
    val result : kotlin.collections.List<FeaturedTrend> = apiInstance.trendsFeaturedTopicsList(region, interest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrendsApi#trendsFeaturedTopicsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrendsApi#trendsFeaturedTopicsList")
    e.printStackTrace()
}
```

### Parameters
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional] [enum: ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING] |

### Return type

[**kotlin.collections.List&lt;FeaturedTrend&gt;**](FeaturedTrend.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="trendsProductCategoriesDetailsList"></a>
# **trendsProductCategoriesDetailsList**
> kotlin.collections.List&lt;ProductCategoryDetails&gt; trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrendsApi()
val productCategories : kotlin.collections.List<ProductCategoryEnum> =  // kotlin.collections.List<ProductCategoryEnum> | List of product categories
val region : ProductCategoryRegion =  // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
val lookbackWindow : ProductCategoryDetailLookbackWindow =  // ProductCategoryDetailLookbackWindow |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
val engagementType : ProductCategoriesEngagementType =  // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
try {
    val result : kotlin.collections.List<ProductCategoryDetails> = apiInstance.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrendsApi#trendsProductCategoriesDetailsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrendsApi#trendsProductCategoriesDetailsList")
    e.printStackTrace()
}
```

### Parameters
| **productCategories** | [**kotlin.collections.List&lt;ProductCategoryEnum&gt;**](ProductCategoryEnum.md)| List of product categories | |
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |
| **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](.md)|   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] [enum: 90, 180, 365, 730] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **engagementType** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**kotlin.collections.List&lt;ProductCategoryDetails&gt;**](ProductCategoryDetails.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="trendsProductCategoriesTrendingList"></a>
# **trendsProductCategoriesTrendingList**
> kotlin.collections.List&lt;TrendingProductCategory&gt; trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrendsApi()
val region : ProductCategoryRegion =  // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
val verticals : kotlin.collections.List<VerticalProductCategory> =  // kotlin.collections.List<VerticalProductCategory> | List of verticals to filter by
val ages : kotlin.collections.List<AgeTrendsBucket> =  // kotlin.collections.List<AgeTrendsBucket> | Age to filter by. If not provided, the results will be filtered by all ages.
val genders : kotlin.collections.List<GenderBucket> =  // kotlin.collections.List<GenderBucket> | Gender to filter by, If not provided, the results will be filtered by all genders.
val engagementType : ProductCategoriesEngagementType =  // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
try {
    val result : kotlin.collections.List<TrendingProductCategory> = apiInstance.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrendsApi#trendsProductCategoriesTrendingList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrendsApi#trendsProductCategoriesTrendingList")
    e.printStackTrace()
}
```

### Parameters
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |
| **verticals** | [**kotlin.collections.List&lt;VerticalProductCategory&gt;**](VerticalProductCategory.md)| List of verticals to filter by | [optional] |
| **ages** | [**kotlin.collections.List&lt;AgeTrendsBucket&gt;**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] |
| **genders** | [**kotlin.collections.List&lt;GenderBucket&gt;**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **engagementType** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**kotlin.collections.List&lt;TrendingProductCategory&gt;**](TrendingProductCategory.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

