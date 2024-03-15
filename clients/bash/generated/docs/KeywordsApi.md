# KeywordsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countryKeywordsMetricsGet**](KeywordsApi.md#countryKeywordsMetricsGet) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
[**keywordsCreate**](KeywordsApi.md#keywordsCreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
[**keywordsGet**](KeywordsApi.md#keywordsGet) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
[**keywordsUpdate**](KeywordsApi.md#keywordsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
[**trendingKeywordsList**](KeywordsApi.md#trendingKeywordsList) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords



## countryKeywordsMetricsGet

Get country's keyword metrics

See keyword metrics for a specified country, aggregated across all of Pinterest.
(Definitions are available from the \"Get delivery metrics definitions\"
<a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).

### Example

```bash
 countryKeywordsMetricsGet ad_account_id=value  country_code=value  Specify as:  keywords="value1,value2,..."
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **countryCode** | **string** | Two letter country code (ISO 3166-1 alpha-2) | [default to null]
 **keywords** | [**array[string]**](string.md) | Comma-separated keywords | [default to null]

### Return type

[**KeywordsMetricsArrayResponse**](KeywordsMetricsArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## keywordsCreate

Create keywords

<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p>
<p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p>
<p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
<p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>

### Example

```bash
 keywordsCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **keywordsRequest** | [**KeywordsRequest**](KeywordsRequest.md) |  |

### Return type

[**KeywordsResponse**](KeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## keywordsGet

Get keywords

<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p>
<p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p>
<p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p>
<p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>

### Example

```bash
 keywordsGet ad_account_id=value  campaign_id=value  ad_group_id=value  Specify as:  match_types=value1 match_types=value2 match_types=...  page_size=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignId** | **string** | Campaign Id to use to filter the results. | [optional] [default to null]
 **adGroupId** | **string** | Ad group Id. | [optional] [default to null]
 **matchTypes** | [**array[MatchType]**](MatchType.md) | Keyword <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type</a> | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**KeywordsGet200Response**](KeywordsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## keywordsUpdate

Update keywords

<p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>

### Example

```bash
 keywordsUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **keywordUpdateBody** | [**KeywordUpdateBody**](KeywordUpdateBody.md) |  |

### Return type

[**KeywordsResponse**](KeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## trendingKeywordsList

List trending keywords

<p>Get the top trending search keywords among the Pinterest user audience.</p>
<p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p>
<p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p>
<p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.

### Example

```bash
 trendingKeywordsList region=value trend_type=value  Specify as:  interests=value1 interests=value2 interests=...  Specify as:  genders=value1 genders=value2 genders=...  Specify as:  ages=value1 ages=value2 ages=...  normalize_against_group=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**TrendsSupportedRegion**](.md) | The geographic region of interest. Only top trends within the specified region will be returned.<br />
The 'region' parameter is formatted as ISO 3166-2 country codes delimited by '+', corresponding to the following geographic areas:
- 'US' - United States
- 'CA' - Canada
- 'DE' - Germany
- 'FR' - France
- 'ES' - Spain
- 'IT' - Italy
- 'DE+AT+CH' - Germanic countries
- 'GB+IE' - Great Britain & Ireland
- 'IT+ES+PT+GR+MT' - Southern Europe
- 'PL+RO+HU+SK+CZ' - Eastern Europe
- 'SE+DK+FI+NO' - Nordic countries
- 'NL+BE+LU' - Benelux
- 'AR' - Argentina
- 'BR' - Brazil
- 'CO' - Colombia
- 'MX' - Mexico
- 'MX+AR+CO+CL' - Hispanic LatAm
- 'AU+NZ' - Australasia | [default to null]
 **trendType** | [**TrendType**](.md) | The methodology used to rank how trendy a keyword is.
- 'growing' trends have high upward growth in search volume over the last quarter
- 'monthly' trends have high search volume in the last month
- 'yearly' trends have high search volume in the last year
- 'seasonal' trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) | [default to null]
 **interests** | [**array[string]**](string.md) | If set, filters the results to trends associated with the specified interests.<br />
If unset, trends for all interests will be returned.<br />
The list of supported interests is:
- 'animals' - Animals
- 'architecture' - Architecture
- 'art' - Art
- 'beauty' - Beauty
- 'childrens_fashion' - Children's Fashion
- 'design' - Design
- 'diy_and_crafts' - DIY & Crafts
- 'education' - Education
- 'electronics' - Electronics
- 'entertainment' - Entertainment
- 'event_planning' - Event Planning
- 'finance' - Finance
- 'food_and_drinks' - Food & Drink
- 'gardening' - Gardening
- 'health' - Health
- 'home_decor' - Home Decor
- 'mens_fashion' - Men's Fashion
- 'parenting' - Parenting
- 'quotes' - Quotes
- 'sport' - Sports
- 'travel' - Travel
- 'vehicles' - Vehicles
- 'wedding' - Wedding
- 'womens_fashion' - Women's Fashion | [optional] [default to null]
 **genders** | [**array[string]**](string.md) | If set, filters the results to trends among users who identify with the specified gender(s).<br />
If unset, trends among all genders will be returned.<br />
The 'unknown' group includes users with unspecified or customized gender profile settings. | [optional] [default to null]
 **ages** | [**array[string]**](string.md) | If set, filters the results to trends among users in the specified age range(s).<br />
If unset, trends among all age groups will be returned. | [optional] [default to null]
 **normalizeAgainstGroup** | **boolean** | Governs how the resulting time series data will be normalized to a [0-100] scale.<br />
By default ('false'), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br />
If set to 'true', the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [optional] [default to false]
 **limit** | **integer** | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a 'limit' of 50 will return the top 50 trends. | [optional] [default to 50]

### Return type

[**TrendingKeywordsResponse**](TrendingKeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

