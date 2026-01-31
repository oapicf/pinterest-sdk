# ProductCategoriesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**trendsFeaturedTopicsList**](ProductCategoriesApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics |
| [**trendsProductCategoriesDetailsList**](ProductCategoriesApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details |
| [**trendsProductCategoriesTrendingList**](ProductCategoriesApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |


## Creating ProductCategoriesApi

To initiate an instance of `ProductCategoriesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ProductCategoriesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ProductCategoriesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ProductCategoriesApi productCategoriesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="trendsFeaturedTopicsList"></a>
# **trendsFeaturedTopicsList**
```java
Mono<List<FeaturedTrend>> ProductCategoriesApi.trendsFeaturedTopicsList(regioninterest)
```

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: `US`, `GB+IE`, `CA`] |
| **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional parameter] [enum: `ALL`, `ANIMALS`, `ARCHITECTURE`, `ART`, `BEAUTY`, `DIY_AND_CRAFTS`, `EDUCATION`, `EVENT_PLANNING`, `FASHION`, `FOOD_AND_DRINKS`, `GARDENING`, `HEALTH`, `HOME_DECOR`, `PARENTING`, `TRAVEL`, `WEDDING`] |


### Return type
[**List&lt;FeaturedTrend&gt;**](FeaturedTrend.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="trendsProductCategoriesDetailsList"></a>
# **trendsProductCategoriesDetailsList**
```java
Mono<List<ProductCategoryDetails>> ProductCategoriesApi.trendsProductCategoriesDetailsList(productCategoriesregionlookbackWindowengagementType)
```

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productCategories** | [**List&lt;ProductCategoryEnum&gt;**](ProductCategoryEnum.md)| List of product categories | |
| **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: `US`, `GB+IE`, `CA`] |
| **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](.md)|    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional parameter] [enum: `90`, `180`, `365`, `730`] |
| **engagementType** | [**ProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional parameter] [enum: `ENGAGEMENT`, `OUTBOUND_CLICK`, `SAVE`] |


### Return type
[**List&lt;ProductCategoryDetails&gt;**](ProductCategoryDetails.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="trendsProductCategoriesTrendingList"></a>
# **trendsProductCategoriesTrendingList**
```java
Mono<List<TrendingProductCategory>> ProductCategoriesApi.trendsProductCategoriesTrendingList(regionverticalsagesgendersengagementType)
```

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: `US`, `GB+IE`, `CA`] |
| **verticals** | [**List&lt;VerticalProductCategory&gt;**](VerticalProductCategory.md)| List of verticals to filter by | [optional parameter] |
| **ages** | [**List&lt;AgeTrendsBucket&gt;**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional parameter] |
| **genders** | [**List&lt;GenderBucket&gt;**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional parameter] |
| **engagementType** | [**ProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional parameter] [enum: `ENGAGEMENT`, `OUTBOUND_CLICK`, `SAVE`] |


### Return type
[**List&lt;TrendingProductCategory&gt;**](TrendingProductCategory.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

