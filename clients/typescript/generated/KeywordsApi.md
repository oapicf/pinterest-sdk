# .KeywordsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countryKeywordsMetricsGet**](KeywordsApi.md#countryKeywordsMetricsGet) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country\&#39;s keyword metrics
[**keywordsCreate**](KeywordsApi.md#keywordsCreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
[**keywordsGet**](KeywordsApi.md#keywordsGet) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
[**keywordsUpdate**](KeywordsApi.md#keywordsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
[**trendingKeywordsList**](KeywordsApi.md#trendingKeywordsList) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords


# **countryKeywordsMetricsGet**
> KeywordsMetricsArrayResponse countryKeywordsMetricsGet()

See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .KeywordsApi(configuration);

let body:.KeywordsApiCountryKeywordsMetricsGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Two letter country code (ISO 3166-1 alpha-2)
  countryCode: "US",
  // Array<string> | Comma-separated keywords
  keywords: [
    "keywords_example",
  ],
};

apiInstance.countryKeywordsMetricsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **countryCode** | [**string**] | Two letter country code (ISO 3166-1 alpha-2) | defaults to undefined
 **keywords** | **Array&lt;string&gt;** | Comma-separated keywords | defaults to undefined


### Return type

**KeywordsMetricsArrayResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **keywordsCreate**
> KeywordsResponse keywordsCreate(keywordsRequest)

<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .KeywordsApi(configuration);

let body:.KeywordsApiKeywordsCreateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // KeywordsRequest
  keywordsRequest: {
    keywords: [
      {
        bid: 200000,
        matchType: "BROAD",
        value: "value_example",
      },
    ],
    parentId: "383791336903426391",
  },
};

apiInstance.keywordsCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordsRequest** | **KeywordsRequest**|  |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**KeywordsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **keywordsGet**
> KeywordsGet200Response keywordsGet()

<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .KeywordsApi(configuration);

let body:.KeywordsApiKeywordsGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Campaign Id to use to filter the results. (optional)
  campaignId: "4",
  // string | Ad group Id. (optional)
  adGroupId: "123123123",
  // Array<MatchType> | Keyword <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type</a> (optional)
  matchTypes: [
    "BROAD",
  ],
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

apiInstance.keywordsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **campaignId** | [**string**] | Campaign Id to use to filter the results. | (optional) defaults to undefined
 **adGroupId** | [**string**] | Ad group Id. | (optional) defaults to undefined
 **matchTypes** | **Array&lt;MatchType&gt;** | Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type&lt;/a&gt; | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**KeywordsGet200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **keywordsUpdate**
> KeywordsResponse keywordsUpdate(keywordUpdateBody)

<p>Update one or more keywords\' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\'s keywords list.</p>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .KeywordsApi(configuration);

let body:.KeywordsApiKeywordsUpdateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // KeywordUpdateBody
  keywordUpdateBody: {
    keywords: [
      {
        id: "2886364308355",
        archived: false,
        bid: 200000,
      },
    ],
  },
};

apiInstance.keywordsUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordUpdateBody** | **KeywordUpdateBody**|  |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**KeywordsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **trendingKeywordsList**
> TrendingKeywordsResponse trendingKeywordsList()

<p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .KeywordsApi(configuration);

let body:.KeywordsApiTrendingKeywordsListRequest = {
  // TrendsSupportedRegion | The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia
  region: "GB+IE",
  // TrendType | The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
  trendType: "monthly",
  // Array<'animals' | 'architecture' | 'art' | 'beauty' | 'childrens_fashion' | 'design' | 'diy_and_crafts' | 'education' | 'electronics' | 'entertainment' | 'event_planning' | 'finance' | 'food_and_drinks' | 'gardening' | 'health' | 'home_decor' | 'mens_fashion' | 'parenting' | 'quotes' | 'sport' | 'travel' | 'vehicles' | 'wedding' | 'womens_fashion'> | If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children\'s Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men\'s Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women\'s Fashion (optional)
  interests: ["beauty","womens_fashion"],
  // Array<'female' | 'male' | 'unknown'> | If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings. (optional)
  genders: ["female","unknown"],
  // Array<'18-24' | '25-34' | '35-44' | '45-49' | '50-54' | '55-64' | '65+'> | If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned. (optional)
  ages: ["35-44","50-54"],
  // boolean | Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\'s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional)
  normalizeAgainstGroup: true,
  // number | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends. (optional)
  limit: 25,
};

apiInstance.trendingKeywordsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **TrendsSupportedRegion** | The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia | defaults to undefined
 **trendType** | **TrendType** | The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) | defaults to undefined
 **interests** | **Array<&#39;animals&#39; &#124; &#39;architecture&#39; &#124; &#39;art&#39; &#124; &#39;beauty&#39; &#124; &#39;childrens_fashion&#39; &#124; &#39;design&#39; &#124; &#39;diy_and_crafts&#39; &#124; &#39;education&#39; &#124; &#39;electronics&#39; &#124; &#39;entertainment&#39; &#124; &#39;event_planning&#39; &#124; &#39;finance&#39; &#124; &#39;food_and_drinks&#39; &#124; &#39;gardening&#39; &#124; &#39;health&#39; &#124; &#39;home_decor&#39; &#124; &#39;mens_fashion&#39; &#124; &#39;parenting&#39; &#124; &#39;quotes&#39; &#124; &#39;sport&#39; &#124; &#39;travel&#39; &#124; &#39;vehicles&#39; &#124; &#39;wedding&#39; &#124; &#39;womens_fashion&#39;>** | If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children\&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men\&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women\&#39;s Fashion | (optional) defaults to undefined
 **genders** | **Array<&#39;female&#39; &#124; &#39;male&#39; &#124; &#39;unknown&#39;>** | If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. | (optional) defaults to undefined
 **ages** | **Array<&#39;18-24&#39; &#124; &#39;25-34&#39; &#124; &#39;35-44&#39; &#124; &#39;45-49&#39; &#124; &#39;50-54&#39; &#124; &#39;55-64&#39; &#124; &#39;65+&#39;>** | If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned. | (optional) defaults to undefined
 **normalizeAgainstGroup** | [**boolean**] | Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | (optional) defaults to false
 **limit** | [**number**] | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. | (optional) defaults to 50


### Return type

**TrendingKeywordsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid trending keywords request parameters |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


