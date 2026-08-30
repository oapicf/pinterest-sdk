# PinterestSdkClient::TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**trends_editorial_articles_list**](TrendsApi.md#trends_editorial_articles_list) | **GET** /trends/editorial_articles | Returns editorial articles for a given region |
| [**trends_featured_topics_list**](TrendsApi.md#trends_featured_topics_list) | **GET** /trends/topics/featured | Get featured topics |
| [**trends_product_categories_details_list**](TrendsApi.md#trends_product_categories_details_list) | **GET** /trends/product_categories/details | Get product category details |
| [**trends_product_categories_trending_list**](TrendsApi.md#trends_product_categories_trending_list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |


## trends_editorial_articles_list

> <Array<TrendsEditorial>> trends_editorial_articles_list(region)

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TrendsApi.new
region = PinterestSdkClient::ProductCategoryRegion::US # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada

begin
  # Returns editorial articles for a given region
  result = api_instance.trends_editorial_articles_list(region)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_editorial_articles_list: #{e}"
end
```

#### Using the trends_editorial_articles_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<TrendsEditorial>>, Integer, Hash)> trends_editorial_articles_list_with_http_info(region)

```ruby
begin
  # Returns editorial articles for a given region
  data, status_code, headers = api_instance.trends_editorial_articles_list_with_http_info(region)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<TrendsEditorial>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_editorial_articles_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region** | [**ProductCategoryRegion**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |  |

### Return type

[**Array&lt;TrendsEditorial&gt;**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trends_featured_topics_list

> <Array<FeaturedTrend>> trends_featured_topics_list(region, opts)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TrendsApi.new
region = PinterestSdkClient::ProductCategoryRegion::US # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
opts = {
  interest: PinterestSdkClient::InterestsEnum::ALL # InterestsEnum | Interest to filter by
}

begin
  # Get featured topics
  result = api_instance.trends_featured_topics_list(region, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_featured_topics_list: #{e}"
end
```

#### Using the trends_featured_topics_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<FeaturedTrend>>, Integer, Hash)> trends_featured_topics_list_with_http_info(region, opts)

```ruby
begin
  # Get featured topics
  data, status_code, headers = api_instance.trends_featured_topics_list_with_http_info(region, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<FeaturedTrend>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_featured_topics_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region** | [**ProductCategoryRegion**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |  |
| **interest** | [**InterestsEnum**](.md) | Interest to filter by | [optional] |

### Return type

[**Array&lt;FeaturedTrend&gt;**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trends_product_categories_details_list

> <Array<ProductCategoryDetails>> trends_product_categories_details_list(product_categories, region, opts)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TrendsApi.new
product_categories = [PinterestSdkClient::ProductCategoryEnum::ACCENT_TABLES] # Array<ProductCategoryEnum> | List of product categories
region = PinterestSdkClient::ProductCategoryRegion::US # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
opts = {
  lookback_window: PinterestSdkClient::ProductCategoryDetailLookbackWindow::N90, # ProductCategoryDetailLookbackWindow |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
  engagement_type: PinterestSdkClient::ProductCategoriesEngagementType::ENGAGEMENT # ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
}

begin
  # Get product category details
  result = api_instance.trends_product_categories_details_list(product_categories, region, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_product_categories_details_list: #{e}"
end
```

#### Using the trends_product_categories_details_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ProductCategoryDetails>>, Integer, Hash)> trends_product_categories_details_list_with_http_info(product_categories, region, opts)

```ruby
begin
  # Get product category details
  data, status_code, headers = api_instance.trends_product_categories_details_list_with_http_info(product_categories, region, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ProductCategoryDetails>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_product_categories_details_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_categories** | [**Array&lt;ProductCategoryEnum&gt;**](ProductCategoryEnum.md) | List of product categories |  |
| **region** | [**ProductCategoryRegion**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |  |
| **lookback_window** | [**ProductCategoryDetailLookbackWindow**](.md) |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] |
| **engagement_type** | [**ProductCategoriesEngagementType**](.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] |

### Return type

[**Array&lt;ProductCategoryDetails&gt;**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## trends_product_categories_trending_list

> <Array<TrendingProductCategory>> trends_product_categories_trending_list(region, opts)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::TrendsApi.new
region = PinterestSdkClient::ProductCategoryRegion::US # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
opts = {
  verticals: [PinterestSdkClient::VerticalProductCategory::FASHION], # Array<VerticalProductCategory> | List of verticals to filter by
  ages: [PinterestSdkClient::AgeTrendsBucket::N18_24], # Array<AgeTrendsBucket> | Age to filter by. If not provided, the results will be filtered by all ages.
  genders: [PinterestSdkClient::GenderBucket::MALE], # Array<GenderBucket> | Gender to filter by, If not provided, the results will be filtered by all genders.
  engagement_type: PinterestSdkClient::ProductCategoriesEngagementType::ENGAGEMENT # ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
}

begin
  # Get a list of growing Shopping Product Categories
  result = api_instance.trends_product_categories_trending_list(region, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_product_categories_trending_list: #{e}"
end
```

#### Using the trends_product_categories_trending_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<TrendingProductCategory>>, Integer, Hash)> trends_product_categories_trending_list_with_http_info(region, opts)

```ruby
begin
  # Get a list of growing Shopping Product Categories
  data, status_code, headers = api_instance.trends_product_categories_trending_list_with_http_info(region, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<TrendingProductCategory>>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling TrendsApi->trends_product_categories_trending_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region** | [**ProductCategoryRegion**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |  |
| **verticals** | [**Array&lt;VerticalProductCategory&gt;**](VerticalProductCategory.md) | List of verticals to filter by | [optional] |
| **ages** | [**Array&lt;AgeTrendsBucket&gt;**](AgeTrendsBucket.md) | Age to filter by. If not provided, the results will be filtered by all ages. | [optional] |
| **genders** | [**Array&lt;GenderBucket&gt;**](GenderBucket.md) | Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] |
| **engagement_type** | [**ProductCategoriesEngagementType**](.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] |

### Return type

[**Array&lt;TrendingProductCategory&gt;**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

