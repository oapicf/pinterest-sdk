# PinterestSdk.TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendsEditorialArticlesList**](TrendsApi.md#trendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
[**trendsFeaturedTopicsList**](TrendsApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**trendsProductCategoriesDetailsList**](TrendsApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**trendsProductCategoriesTrendingList**](TrendsApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories



## trendsEditorialArticlesList

> [TrendsEditorial] trendsEditorialArticlesList(region)

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.TrendsApi();
let region = new PinterestSdk.ProductCategoryRegion(); // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
apiInstance.trendsEditorialArticlesList(region, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 

### Return type

[**[TrendsEditorial]**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trendsFeaturedTopicsList

> [FeaturedTrend] trendsFeaturedTopicsList(region, opts)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.TrendsApi();
let region = new PinterestSdk.ProductCategoryRegion(); // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
let opts = {
  'interest': new PinterestSdk.InterestsEnum() // InterestsEnum | Interest to filter by
};
apiInstance.trendsFeaturedTopicsList(region, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional] 

### Return type

[**[FeaturedTrend]**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trendsProductCategoriesDetailsList

> [ProductCategoryDetails] trendsProductCategoriesDetailsList(productCategories, region, opts)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.TrendsApi();
let productCategories = [new PinterestSdk.ProductCategoryEnum()]; // [ProductCategoryEnum] | List of product categories
let region = new PinterestSdk.ProductCategoryRegion(); // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
let opts = {
  'lookbackWindow': new PinterestSdk.ProductCategoryDetailLookbackWindow(), // ProductCategoryDetailLookbackWindow |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
  'engagementType': new PinterestSdk.ProductCategoriesEngagementType() // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
};
apiInstance.trendsProductCategoriesDetailsList(productCategories, region, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCategories** | [**[ProductCategoryEnum]**](ProductCategoryEnum.md)| List of product categories | 
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](.md)|   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
 **engagementType** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**[ProductCategoryDetails]**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trendsProductCategoriesTrendingList

> [TrendingProductCategory] trendsProductCategoriesTrendingList(region, opts)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure OAuth2 access token for authorization: client_credentials
let client_credentials = defaultClient.authentications['client_credentials'];
client_credentials.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.TrendsApi();
let region = new PinterestSdk.ProductCategoryRegion(); // ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
let opts = {
  'verticals': [new PinterestSdk.VerticalProductCategory()], // [VerticalProductCategory] | List of verticals to filter by
  'ages': [new PinterestSdk.AgeTrendsBucket()], // [AgeTrendsBucket] | Age to filter by. If not provided, the results will be filtered by all ages.
  'genders': [new PinterestSdk.GenderBucket()], // [GenderBucket] | Gender to filter by, If not provided, the results will be filtered by all genders.
  'engagementType': new PinterestSdk.ProductCategoriesEngagementType() // ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
};
apiInstance.trendsProductCategoriesTrendingList(region, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **verticals** | [**[VerticalProductCategory]**](VerticalProductCategory.md)| List of verticals to filter by | [optional] 
 **ages** | [**[AgeTrendsBucket]**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
 **genders** | [**[GenderBucket]**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
 **engagementType** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**[TrendingProductCategory]**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

