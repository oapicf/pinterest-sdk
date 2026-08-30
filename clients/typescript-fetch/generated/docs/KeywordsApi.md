# KeywordsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countryKeywordsMetricsGet**](KeywordsApi.md#countrykeywordsmetricsget) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country\&#39;s keyword metrics |
| [**keywordsCreate**](KeywordsApi.md#keywordscreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords |
| [**keywordsGet**](KeywordsApi.md#keywordsget) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords |
| [**keywordsUpdate**](KeywordsApi.md#keywordsupdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords |
| [**trendingKeywordsList**](KeywordsApi.md#trendingkeywordslist) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords |



## countryKeywordsMetricsGet

> KeywordsMetricsArrayResponse countryKeywordsMetricsGet(adAccountId, countryCode, keywords)

Get country\&#39;s keyword metrics

  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).

### Example

```ts
import {
  Configuration,
  KeywordsApi,
} from '';
import type { CountryKeywordsMetricsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new KeywordsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Two letter country code (ISO 3166-1 alpha-2)
    countryCode: countryCode_example,
    // Array<string> | Comma-separated keywords
    keywords: ...,
  } satisfies CountryKeywordsMetricsGetRequest;

  try {
    const data = await api.countryKeywordsMetricsGet(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **countryCode** | `string` | Two letter country code (ISO 3166-1 alpha-2) | [Defaults to `undefined`] |
| **keywords** | `Array<string>` | Comma-separated keywords | |

### Return type

[**KeywordsMetricsArrayResponse**](KeywordsMetricsArrayResponse.md)

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


## keywordsCreate

> Keywords keywordsCreate(adAccountId, keywordsCreate)

Create keywords

  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }

### Example

```ts
import {
  Configuration,
  KeywordsApi,
} from '';
import type { KeywordsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new KeywordsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // KeywordsCreate
    keywordsCreate: ...,
  } satisfies KeywordsCreateRequest;

  try {
    const data = await api.keywordsCreate(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **keywordsCreate** | [KeywordsCreate](KeywordsCreate.md) |  | |

### Return type

[**Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## keywordsGet

> KeywordsGet200Response keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize)

Get keywords

    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }

### Example

```ts
import {
  Configuration,
  KeywordsApi,
} from '';
import type { KeywordsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new KeywordsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Campaign Id to use to filter the results. (optional)
    campaignId: campaignId_example,
    // string | Ad group Id. (optional)
    adGroupId: adGroupId_example,
    // Array<string> | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
    adGroupIds: ...,
    // Array<MatchType> | Keyword [match type](/docs/api-features/targeting-overview/) (optional)
    matchTypes: ...,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies KeywordsGetRequest;

  try {
    const data = await api.keywordsGet(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **campaignId** | `string` | Campaign Id to use to filter the results. | [Optional] [Defaults to `undefined`] |
| **adGroupId** | `string` | Ad group Id. | [Optional] [Defaults to `undefined`] |
| **adGroupIds** | `Array<string>` | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [Optional] |
| **matchTypes** | `Array<MatchType>` | Keyword [match type](/docs/api-features/targeting-overview/) | [Optional] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**KeywordsGet200Response**](KeywordsGet200Response.md)

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


## keywordsUpdate

> Keywords keywordsUpdate(adAccountId, keywordsUpdate)

Update keywords

  Update one or more keywords\&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity\&#39;s keywords list.

### Example

```ts
import {
  Configuration,
  KeywordsApi,
} from '';
import type { KeywordsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new KeywordsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // KeywordsUpdate
    keywordsUpdate: ...,
  } satisfies KeywordsUpdateRequest;

  try {
    const data = await api.keywordsUpdate(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **keywordsUpdate** | [KeywordsUpdate](KeywordsUpdate.md) |  | |

### Return type

[**Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
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


## trendingKeywordsList

> TrendingKeywordsResponse trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics)

List trending keywords

Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).

### Example

```ts
import {
  Configuration,
  KeywordsApi,
} from '';
import type { TrendingKeywordsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new KeywordsApi(config);

  const body = {
    // TrendsSupportedRegion |   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia
    region: ...,
    // TrendType |   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
    trendType: ...,
    // Array<TrendsL1Interest> |   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children\'s Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men\'s Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women\'s Fashion (optional)
    interests: ...,
    // Array<TrendsGenderFilter> | If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings. (optional)
    genders: ...,
    // Array<TrendsAgeBucket> | If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. (optional)
    ages: ...,
    // Array<string> | If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. (optional)
    includeKeywords: ...,
    // boolean |  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\'s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional)
    normalizeAgainstGroup: true,
    // number | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends. (optional)
    limit: 56,
    // boolean | Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data. (optional)
    includeDemographics: true,
  } satisfies TrendingKeywordsListRequest;

  try {
    const data = await api.trendingKeywordsList(body);
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
| **region** | `TrendsSupportedRegion` |   The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia | [Defaults to `undefined`] [Enum: US, CA, DE, FR, ES, IT, DE+AT+CH, GB+IE, IT+ES+PT+GR+MT, PL+RO+HU+SK+CZ, SE+DK+FI+NO, NL+BE+LU, AR, BR, CO, MX, MX+AR+CO+CL, AU+NZ] |
| **trendType** | `TrendType` |   The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) | [Defaults to `undefined`] [Enum: growing, monthly, yearly, seasonal] |
| **interests** | `Array<TrendsL1Interest>` |   The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children\&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men\&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women\&#39;s Fashion | [Optional] |
| **genders** | `Array<TrendsGenderFilter>` | If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. | [Optional] |
| **ages** | `Array<TrendsAgeBucket>` | If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. | [Optional] |
| **includeKeywords** | `Array<string>` | If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. | [Optional] |
| **normalizeAgainstGroup** | `boolean` |  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [Optional] [Defaults to `false`] |
| **limit** | `number` | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. | [Optional] [Defaults to `50`] |
| **includeDemographics** | `boolean` | Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data. | [Optional] [Defaults to `false`] |

### Return type

[**TrendingKeywordsResponse**](TrendingKeywordsResponse.md)

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

