# PinterestSdkClient::KeywordsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**country_keywords_metrics_get**](KeywordsApi.md#country_keywords_metrics_get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics |
| [**keywords_create**](KeywordsApi.md#keywords_create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords |
| [**keywords_get**](KeywordsApi.md#keywords_get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords |
| [**keywords_update**](KeywordsApi.md#keywords_update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords |
| [**trending_keywords_list**](KeywordsApi.md#trending_keywords_list) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords |


## country_keywords_metrics_get

> <KeywordsMetricsArrayResponse> country_keywords_metrics_get(ad_account_id, country_code, keywords)

Get country's keyword metrics

See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::KeywordsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
country_code = 'US' # String | Two letter country code (ISO 3166-1 alpha-2)
keywords = ['inner_example'] # Array<String> | Comma-separated keywords

begin
  # Get country's keyword metrics
  result = api_instance.country_keywords_metrics_get(ad_account_id, country_code, keywords)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->country_keywords_metrics_get: #{e}"
end
```

#### Using the country_keywords_metrics_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<KeywordsMetricsArrayResponse>, Integer, Hash)> country_keywords_metrics_get_with_http_info(ad_account_id, country_code, keywords)

```ruby
begin
  # Get country's keyword metrics
  data, status_code, headers = api_instance.country_keywords_metrics_get_with_http_info(ad_account_id, country_code, keywords)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <KeywordsMetricsArrayResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->country_keywords_metrics_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **country_code** | **String** | Two letter country code (ISO 3166-1 alpha-2) |  |
| **keywords** | [**Array&lt;String&gt;**](String.md) | Comma-separated keywords |  |

### Return type

[**KeywordsMetricsArrayResponse**](KeywordsMetricsArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## keywords_create

> <KeywordsResponse> keywords_create(ad_account_id, keywords_request)

Create keywords

<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::KeywordsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
keywords_request = PinterestSdkClient::KeywordsRequest.new({keywords: [PinterestSdkClient::KeywordsCommon.new({match_type: PinterestSdkClient::MatchTypeResponse::BROAD, value: 'value_example'})], parent_id: '383791336903426391'}) # KeywordsRequest | 

begin
  # Create keywords
  result = api_instance.keywords_create(ad_account_id, keywords_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->keywords_create: #{e}"
end
```

#### Using the keywords_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<KeywordsResponse>, Integer, Hash)> keywords_create_with_http_info(ad_account_id, keywords_request)

```ruby
begin
  # Create keywords
  data, status_code, headers = api_instance.keywords_create_with_http_info(ad_account_id, keywords_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <KeywordsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->keywords_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **keywords_request** | [**KeywordsRequest**](KeywordsRequest.md) |  |  |

### Return type

[**KeywordsResponse**](KeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## keywords_get

> <KeywordsGet200Response> keywords_get(ad_account_id, opts)

Get keywords

<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::KeywordsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  campaign_id: 'campaign_id_example', # String | Campaign Id to use to filter the results.
  ad_group_id: '123123123', # String | Ad group Id.
  match_types: [PinterestSdkClient::MatchType::BROAD], # Array<MatchType> | Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get keywords
  result = api_instance.keywords_get(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->keywords_get: #{e}"
end
```

#### Using the keywords_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<KeywordsGet200Response>, Integer, Hash)> keywords_get_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get keywords
  data, status_code, headers = api_instance.keywords_get_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <KeywordsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->keywords_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **campaign_id** | **String** | Campaign Id to use to filter the results. | [optional] |
| **ad_group_id** | **String** | Ad group Id. | [optional] |
| **match_types** | [**Array&lt;MatchType&gt;**](MatchType.md) | Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type&lt;/a&gt; | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**KeywordsGet200Response**](KeywordsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## keywords_update

> <KeywordsResponse> keywords_update(ad_account_id, keyword_update_body)

Update keywords

<p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::KeywordsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
keyword_update_body = PinterestSdkClient::KeywordUpdateBody.new({keywords: [PinterestSdkClient::KeywordUpdate.new({id: '2886364308355'})]}) # KeywordUpdateBody | 

begin
  # Update keywords
  result = api_instance.keywords_update(ad_account_id, keyword_update_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->keywords_update: #{e}"
end
```

#### Using the keywords_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<KeywordsResponse>, Integer, Hash)> keywords_update_with_http_info(ad_account_id, keyword_update_body)

```ruby
begin
  # Update keywords
  data, status_code, headers = api_instance.keywords_update_with_http_info(ad_account_id, keyword_update_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <KeywordsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->keywords_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **keyword_update_body** | [**KeywordUpdateBody**](KeywordUpdateBody.md) |  |  |

### Return type

[**KeywordsResponse**](KeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## trending_keywords_list

> <TrendingKeywordsResponse> trending_keywords_list(region, trend_type, opts)

List trending keywords

<p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. 

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::KeywordsApi.new
region = PinterestSdkClient::TrendsSupportedRegion::US # TrendsSupportedRegion | The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia
trend_type = PinterestSdkClient::TrendType::GROWING # TrendType | The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
opts = {
  interests: ['animals'], # Array<String> | If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion
  genders: ['female'], # Array<String> | If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.
  ages: ['18-24'], # Array<String> | If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.
  include_keywords: ['inner_example'], # Array<String> | If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.
  normalize_against_group: true, # Boolean | Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
  limit: 25 # Integer | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
}

begin
  # List trending keywords
  result = api_instance.trending_keywords_list(region, trend_type, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->trending_keywords_list: #{e}"
end
```

#### Using the trending_keywords_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TrendingKeywordsResponse>, Integer, Hash)> trending_keywords_list_with_http_info(region, trend_type, opts)

```ruby
begin
  # List trending keywords
  data, status_code, headers = api_instance.trending_keywords_list_with_http_info(region, trend_type, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TrendingKeywordsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling KeywordsApi->trending_keywords_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region** | [**TrendsSupportedRegion**](.md) | The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia |  |
| **trend_type** | [**TrendType**](.md) | The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) |  |
| **interests** | [**Array&lt;String&gt;**](String.md) | If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women&#39;s Fashion | [optional] |
| **genders** | [**Array&lt;String&gt;**](String.md) | If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. | [optional] |
| **ages** | [**Array&lt;String&gt;**](String.md) | If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned. | [optional] |
| **include_keywords** | [**Array&lt;String&gt;**](String.md) | If set, filters the results to top trends which include at least one of the specified keywords.&lt;br /&gt; If unset, no keyword filtering logic is applied. | [optional] |
| **normalize_against_group** | **Boolean** | Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [optional][default to false] |
| **limit** | **Integer** | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. | [optional][default to 50] |

### Return type

[**TrendingKeywordsResponse**](TrendingKeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

