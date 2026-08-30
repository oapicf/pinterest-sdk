# TrendsController

All URIs are relative to `"/v5"`

The controller class is defined in **[TrendsController.java](../../src/main/java/org/openapitools/controller/TrendsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendsEditorialArticlesList**](#trendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
[**trendsFeaturedTopicsList**](#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**trendsProductCategoriesDetailsList**](#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**trendsProductCategoriesTrendingList**](#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories

<a id="trendsEditorialArticlesList"></a>
# **trendsEditorialArticlesList**
```java
Mono<List<TrendsEditorial>> TrendsController.trendsEditorialArticlesList(region)
```

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**region** | [**ProductCategoryRegion**](../../docs/models/.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: `US`, `GB+IE`, `CA`]

### Return type
[**List&lt;TrendsEditorial&gt;**](../../docs/models/TrendsEditorial.md)

### Authorization
* **pinterest_oauth2**, scopes: `user_accounts:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="trendsFeaturedTopicsList"></a>
# **trendsFeaturedTopicsList**
```java
Mono<List<FeaturedTrend>> TrendsController.trendsFeaturedTopicsList(regioninterest)
```

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**region** | [**ProductCategoryRegion**](../../docs/models/.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: `US`, `GB+IE`, `CA`]
**interest** | [**InterestsEnum**](../../docs/models/.md) | Interest to filter by | [optional parameter] [enum: `ALL`, `ANIMALS`, `ARCHITECTURE`, `ART`, `BEAUTY`, `DIY_AND_CRAFTS`, `EDUCATION`, `EVENT_PLANNING`, `FASHION`, `FOOD_AND_DRINKS`, `GARDENING`, `HEALTH`, `HOME_DECOR`, `PARENTING`, `TRAVEL`, `WEDDING`]

### Return type
[**List&lt;FeaturedTrend&gt;**](../../docs/models/FeaturedTrend.md)

### Authorization
* **pinterest_oauth2**, scopes: `user_accounts:read`
* **client_credentials**, scopes: `user_accounts:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="trendsProductCategoriesDetailsList"></a>
# **trendsProductCategoriesDetailsList**
```java
Mono<List<ProductCategoryDetails>> TrendsController.trendsProductCategoriesDetailsList(productCategoriesregionlookbackWindowengagementType)
```

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**productCategories** | [**List&lt;ProductCategoryEnum&gt;**](../../docs/models/ProductCategoryEnum.md) | List of product categories |
**region** | [**ProductCategoryRegion**](../../docs/models/.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: `US`, `GB+IE`, `CA`]
**lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](../../docs/models/.md) |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional parameter] [enum: `90`, `180`, `365`, `730`]
**engagementType** | [**ProductCategoriesEngagementType**](../../docs/models/.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional parameter] [enum: `ENGAGEMENT`, `OUTBOUND_CLICK`, `SAVE`]

### Return type
[**List&lt;ProductCategoryDetails&gt;**](../../docs/models/ProductCategoryDetails.md)

### Authorization
* **pinterest_oauth2**, scopes: `user_accounts:read`
* **client_credentials**, scopes: `user_accounts:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="trendsProductCategoriesTrendingList"></a>
# **trendsProductCategoriesTrendingList**
```java
Mono<List<TrendingProductCategory>> TrendsController.trendsProductCategoriesTrendingList(regionverticalsagesgendersengagementType)
```

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**region** | [**ProductCategoryRegion**](../../docs/models/.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: `US`, `GB+IE`, `CA`]
**verticals** | [**List&lt;VerticalProductCategory&gt;**](../../docs/models/VerticalProductCategory.md) | List of verticals to filter by | [optional parameter]
**ages** | [**List&lt;AgeTrendsBucket&gt;**](../../docs/models/AgeTrendsBucket.md) | Age to filter by. If not provided, the results will be filtered by all ages. | [optional parameter]
**genders** | [**List&lt;GenderBucket&gt;**](../../docs/models/GenderBucket.md) | Gender to filter by, If not provided, the results will be filtered by all genders. | [optional parameter]
**engagementType** | [**ProductCategoriesEngagementType**](../../docs/models/.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional parameter] [enum: `ENGAGEMENT`, `OUTBOUND_CLICK`, `SAVE`]

### Return type
[**List&lt;TrendingProductCategory&gt;**](../../docs/models/TrendingProductCategory.md)

### Authorization
* **pinterest_oauth2**, scopes: `user_accounts:read`
* **client_credentials**, scopes: `user_accounts:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

