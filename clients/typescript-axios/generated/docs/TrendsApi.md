# TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**trendsEditorialArticlesList**](#trendseditorialarticleslist) | **GET** /trends/editorial_articles | Returns editorial articles for a given region|
|[**trendsFeaturedTopicsList**](#trendsfeaturedtopicslist) | **GET** /trends/topics/featured | Get featured topics|
|[**trendsProductCategoriesDetailsList**](#trendsproductcategoriesdetailslist) | **GET** /trends/product_categories/details | Get product category details|
|[**trendsProductCategoriesTrendingList**](#trendsproductcategoriestrendinglist) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories|

# **trendsEditorialArticlesList**
> Array<TrendsEditorial> trendsEditorialArticlesList()

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Example

```typescript
import {
    TrendsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new TrendsApi(configuration);

let region: ProductCategoryRegion; //     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada (default to undefined)

const { status, data } = await apiInstance.trendsEditorialArticlesList(
    region
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **region** | **ProductCategoryRegion** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | defaults to undefined|


### Return type

**Array<TrendsEditorial>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trendsFeaturedTopicsList**
> Array<FeaturedTrend> trendsFeaturedTopicsList()

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example

```typescript
import {
    TrendsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new TrendsApi(configuration);

let region: ProductCategoryRegion; //     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada (default to undefined)
let interest: InterestsEnum; //Interest to filter by (optional) (default to undefined)

const { status, data } = await apiInstance.trendsFeaturedTopicsList(
    region,
    interest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **region** | **ProductCategoryRegion** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | defaults to undefined|
| **interest** | **InterestsEnum** | Interest to filter by | (optional) defaults to undefined|


### Return type

**Array<FeaturedTrend>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trendsProductCategoriesDetailsList**
> Array<ProductCategoryDetails> trendsProductCategoriesDetailsList()

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example

```typescript
import {
    TrendsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new TrendsApi(configuration);

let productCategories: Array<ProductCategoryEnum>; //List of product categories (default to undefined)
let region: ProductCategoryRegion; //     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada (default to undefined)
let lookbackWindow: ProductCategoryDetailLookbackWindow; //  Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional) (default to undefined)
let engagementType: ProductCategoriesEngagementType; //    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional) (default to undefined)

const { status, data } = await apiInstance.trendsProductCategoriesDetailsList(
    productCategories,
    region,
    lookbackWindow,
    engagementType
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productCategories** | **Array&lt;ProductCategoryEnum&gt;** | List of product categories | defaults to undefined|
| **region** | **ProductCategoryRegion** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | defaults to undefined|
| **lookbackWindow** | **ProductCategoryDetailLookbackWindow** |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | (optional) defaults to undefined|
| **engagementType** | **ProductCategoriesEngagementType** |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | (optional) defaults to undefined|


### Return type

**Array<ProductCategoryDetails>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trendsProductCategoriesTrendingList**
> Array<TrendingProductCategory> trendsProductCategoriesTrendingList()

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example

```typescript
import {
    TrendsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new TrendsApi(configuration);

let region: ProductCategoryRegion; //     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada (default to undefined)
let verticals: Array<VerticalProductCategory>; //List of verticals to filter by (optional) (default to undefined)
let ages: Array<AgeTrendsBucket>; //Age to filter by. If not provided, the results will be filtered by all ages. (optional) (default to undefined)
let genders: Array<GenderBucket>; //Gender to filter by, If not provided, the results will be filtered by all genders. (optional) (default to undefined)
let engagementType: ProductCategoriesEngagementType; //    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional) (default to undefined)

const { status, data } = await apiInstance.trendsProductCategoriesTrendingList(
    region,
    verticals,
    ages,
    genders,
    engagementType
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **region** | **ProductCategoryRegion** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | defaults to undefined|
| **verticals** | **Array&lt;VerticalProductCategory&gt;** | List of verticals to filter by | (optional) defaults to undefined|
| **ages** | **Array&lt;AgeTrendsBucket&gt;** | Age to filter by. If not provided, the results will be filtered by all ages. | (optional) defaults to undefined|
| **genders** | **Array&lt;GenderBucket&gt;** | Gender to filter by, If not provided, the results will be filtered by all genders. | (optional) defaults to undefined|
| **engagementType** | **ProductCategoriesEngagementType** |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | (optional) defaults to undefined|


### Return type

**Array<TrendingProductCategory>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

