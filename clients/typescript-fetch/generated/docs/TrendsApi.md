# TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**trendsEditorialArticlesList**](TrendsApi.md#trendseditorialarticleslist) | **GET** /trends/editorial_articles | Returns editorial articles for a given region |
| [**trendsFeaturedTopicsList**](TrendsApi.md#trendsfeaturedtopicslist) | **GET** /trends/topics/featured | Get featured topics |
| [**trendsProductCategoriesDetailsList**](TrendsApi.md#trendsproductcategoriesdetailslist) | **GET** /trends/product_categories/details | Get product category details |
| [**trendsProductCategoriesTrendingList**](TrendsApi.md#trendsproductcategoriestrendinglist) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |



## trendsEditorialArticlesList

> Array&lt;TrendsEditorial&gt; trendsEditorialArticlesList(region)

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Example

```ts
import {
  Configuration,
  TrendsApi,
} from '';
import type { TrendsEditorialArticlesListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new TrendsApi(config);

  const body = {
    // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
    region: ...,
  } satisfies TrendsEditorialArticlesListRequest;

  try {
    const data = await api.trendsEditorialArticlesList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | `ProductCategoryRegion` |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [Defaults to `undefined`] [Enum: US, GB+IE, CA] |

### Return type

[**Array&lt;TrendsEditorial&gt;**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## trendsFeaturedTopicsList

> Array&lt;FeaturedTrend&gt; trendsFeaturedTopicsList(region, interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example

```ts
import {
  Configuration,
  TrendsApi,
} from '';
import type { TrendsFeaturedTopicsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new TrendsApi(config);

  const body = {
    // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
    region: ...,
    // InterestsEnum | Interest to filter by (optional)
    interest: ...,
  } satisfies TrendsFeaturedTopicsListRequest;

  try {
    const data = await api.trendsFeaturedTopicsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | `ProductCategoryRegion` |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [Defaults to `undefined`] [Enum: US, GB+IE, CA] |
| **interest** | `InterestsEnum` | Interest to filter by | [Optional] [Defaults to `undefined`] [Enum: ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING] |

### Return type

[**Array&lt;FeaturedTrend&gt;**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## trendsProductCategoriesDetailsList

> Array&lt;ProductCategoryDetails&gt; trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example

```ts
import {
  Configuration,
  TrendsApi,
} from '';
import type { TrendsProductCategoriesDetailsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new TrendsApi(config);

  const body = {
    // Array<ProductCategoryEnum> | List of product categories
    productCategories: ...,
    // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
    region: ...,
    // ProductCategoryDetailLookbackWindow |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
    lookbackWindow: ...,
    // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)
    engagementType: ...,
  } satisfies TrendsProductCategoriesDetailsListRequest;

  try {
    const data = await api.trendsProductCategoriesDetailsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productCategories** | `Array<ProductCategoryEnum>` | List of product categories | |
| **region** | `ProductCategoryRegion` |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [Defaults to `undefined`] [Enum: US, GB+IE, CA] |
| **lookbackWindow** | `ProductCategoryDetailLookbackWindow` |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [Optional] [Defaults to `undefined`] [Enum: 90, 180, 365, 730] |
| **engagementType** | `ProductCategoriesEngagementType` |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [Optional] [Defaults to `undefined`] [Enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**Array&lt;ProductCategoryDetails&gt;**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## trendsProductCategoriesTrendingList

> Array&lt;TrendingProductCategory&gt; trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example

```ts
import {
  Configuration,
  TrendsApi,
} from '';
import type { TrendsProductCategoriesTrendingListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new TrendsApi(config);

  const body = {
    // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
    region: ...,
    // Array<VerticalProductCategory> | List of verticals to filter by (optional)
    verticals: ...,
    // Array<AgeTrendsBucket> | Age to filter by. If not provided, the results will be filtered by all ages. (optional)
    ages: ...,
    // Array<GenderBucket> | Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
    genders: ...,
    // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)
    engagementType: ...,
  } satisfies TrendsProductCategoriesTrendingListRequest;

  try {
    const data = await api.trendsProductCategoriesTrendingList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | `ProductCategoryRegion` |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [Defaults to `undefined`] [Enum: US, GB+IE, CA] |
| **verticals** | `Array<VerticalProductCategory>` | List of verticals to filter by | [Optional] |
| **ages** | `Array<AgeTrendsBucket>` | Age to filter by. If not provided, the results will be filtered by all ages. | [Optional] |
| **genders** | `Array<GenderBucket>` | Gender to filter by, If not provided, the results will be filtered by all genders. | [Optional] |
| **engagementType** | `ProductCategoriesEngagementType` |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [Optional] [Defaults to `undefined`] [Enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**Array&lt;TrendingProductCategory&gt;**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

