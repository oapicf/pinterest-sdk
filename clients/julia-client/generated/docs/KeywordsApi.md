# KeywordsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**country_keywords_metrics_get**](KeywordsApi.md#country_keywords_metrics_get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
[**keywords_create**](KeywordsApi.md#keywords_create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
[**keywords_get**](KeywordsApi.md#keywords_get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
[**keywords_update**](KeywordsApi.md#keywords_update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
[**trending_keywords_list**](KeywordsApi.md#trending_keywords_list) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords


# **country_keywords_metrics_get**
> `country_keywords_metrics_get`(_api::`KeywordsApi`, `ad_account_id`::`String`, `country_code`::`String`, `keywords`::`Vector{String}`; _mediaType=nothing) -> `KeywordsMetricsArrayResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `country_keywords_metrics_get`(_api::`KeywordsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `country_code`::`String`, `keywords`::`Vector{String}`; _mediaType=nothing) -> `Channel`{ `KeywordsMetricsArrayResponse` }, `OpenAPI.Clients.ApiResponse`

Get country's keyword metrics

  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`KeywordsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`country_code`** | **`String`** | Two letter country code (ISO 3166-1 alpha-2) |
**`keywords`** | [**`Vector{String}`**](String.md) | Comma-separated keywords |

### Return type

[**`KeywordsMetricsArrayResponse`**](KeywordsMetricsArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **keywords_create**
> `keywords_create`(_api::`KeywordsApi`, `ad_account_id`::`String`, `keywords_create_param`::`KeywordsCreate`; _mediaType=nothing) -> `Keywords`, `OpenAPI.Clients.ApiResponse` <br/>
> `keywords_create`(_api::`KeywordsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `keywords_create_param`::`KeywordsCreate`; _mediaType=nothing) -> `Channel`{ `Keywords` }, `OpenAPI.Clients.ApiResponse`

Create keywords

  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`KeywordsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`keywords_create_param`** | [**`KeywordsCreate`**](KeywordsCreate.md) |  |

### Return type

[**`Keywords`**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **keywords_get**
> `keywords_get`(_api::`KeywordsApi`, `ad_account_id`::`String`; `campaign_id`=nothing, `ad_group_id`=nothing, `ad_group_ids`=nothing, `match_types`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `KeywordsGet200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `keywords_get`(_api::`KeywordsApi`, response_stream::`Channel`, `ad_account_id`::`String`; `campaign_id`=nothing, `ad_group_id`=nothing, `ad_group_ids`=nothing, `match_types`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `KeywordsGet200Response` }, `OpenAPI.Clients.ApiResponse`

Get keywords

    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`KeywordsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`campaign_id`** | **`String`** | Campaign Id to use to filter the results. | [default to nothing]
 **`ad_group_id`** | **`String`** | Ad group Id. | [default to nothing]
 **`ad_group_ids`** | [**`Vector{String}`**](String.md) | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [default to nothing]
 **`match_types`** | [**`Vector{MatchType}`**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`KeywordsGet200Response`**](KeywordsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **keywords_update**
> `keywords_update`(_api::`KeywordsApi`, `ad_account_id`::`String`, `keywords_update_param`::`KeywordsUpdate`; _mediaType=nothing) -> `Keywords`, `OpenAPI.Clients.ApiResponse` <br/>
> `keywords_update`(_api::`KeywordsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `keywords_update_param`::`KeywordsUpdate`; _mediaType=nothing) -> `Channel`{ `Keywords` }, `OpenAPI.Clients.ApiResponse`

Update keywords

  Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`KeywordsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`keywords_update_param`** | [**`KeywordsUpdate`**](KeywordsUpdate.md) |  |

### Return type

[**`Keywords`**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **trending_keywords_list**
> `trending_keywords_list`(_api::`KeywordsApi`, `region`::`TrendsSupportedRegion`, `trend_type`::`TrendType`; `interests`=nothing, `genders`=nothing, `ages`=nothing, `include_keywords`=nothing, `normalize_against_group`=nothing, `limit`=nothing, `include_demographics`=nothing, _mediaType=nothing) -> `TrendingKeywordsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `trending_keywords_list`(_api::`KeywordsApi`, response_stream::`Channel`, `region`::`TrendsSupportedRegion`, `trend_type`::`TrendType`; `interests`=nothing, `genders`=nothing, `ages`=nothing, `include_keywords`=nothing, `normalize_against_group`=nothing, `limit`=nothing, `include_demographics`=nothing, _mediaType=nothing) -> `Channel`{ `TrendingKeywordsResponse` }, `OpenAPI.Clients.ApiResponse`

List trending keywords

Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`KeywordsApi`** | API context | 
**`region`** | [**`TrendsSupportedRegion`**](.md) |   The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia |
**`trend_type`** | [**`TrendType`**](.md) |   The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`interests`** | [**`Vector{TrendsL1Interest}`**](TrendsL1Interest.md) |   The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion | [default to nothing]
 **`genders`** | [**`Vector{TrendsGenderFilter}`**](TrendsGenderFilter.md) | If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. | [default to nothing]
 **`ages`** | [**`Vector{TrendsAgeBucket}`**](TrendsAgeBucket.md) | If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. | [default to nothing]
 **`include_keywords`** | [**`Vector{String}`**](String.md) | If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. | [default to nothing]
 **`normalize_against_group`** | **`Bool`** |  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [default to false]
 **`limit`** | **`Int64`** | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. | [default to 50]
 **`include_demographics`** | **`Bool`** | Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data. | [default to false]

### Return type

[**`TrendingKeywordsResponse`**](TrendingKeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

