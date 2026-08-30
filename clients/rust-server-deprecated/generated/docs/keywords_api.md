# keywords_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**country_keywords_metrics/get**](keywords_api.md#country_keywords_metrics/get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics
**keywords/create**](keywords_api.md#keywords/create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
**keywords/get**](keywords_api.md#keywords/get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
**keywords/update**](keywords_api.md#keywords/update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
**trending_keywords/list**](keywords_api.md#trending_keywords/list) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords


# **country_keywords_metrics/get**
> models::KeywordsMetricsArrayResponse country_keywords_metrics/get(ctx, ctx, ad_account_id, country_code, keywords)
Get country's keyword metrics

  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **country_code** | **String**| Two letter country code (ISO 3166-1 alpha-2) | 
  **keywords** | [**String**](String.md)| Comma-separated keywords | 

### Return type

[**models::KeywordsMetricsArrayResponse**](KeywordsMetricsArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keywords/create**
> models::Keywords keywords/create(ctx, ad_account_id, keywords_create)
Create keywords

  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **keywords_create** | [**KeywordsCreate**](KeywordsCreate.md)|  | 

### Return type

[**models::Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keywords/get**
> models::KeywordsGet200Response keywords/get(ctx, ctx, ad_account_id, optional)
Get keywords

    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **campaign_id** | **String**| Campaign Id to use to filter the results. | 
 **ad_group_id** | **String**| Ad group Id. | 
 **ad_group_ids** | [**String**](String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | 
 **match_types** | [**models::MatchType**](models::MatchType.md)| Keyword [match type](/docs/api-features/targeting-overview/) | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::KeywordsGet200Response**](keywords_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keywords/update**
> models::Keywords keywords/update(ctx, ad_account_id, keywords_update)
Update keywords

  Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **keywords_update** | [**KeywordsUpdate**](KeywordsUpdate.md)|  | 

### Return type

[**models::Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trending_keywords/list**
> models::TrendingKeywordsResponse trending_keywords/list(ctx, region, trend_type, optional)
List trending keywords

Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **region** | [****](.md)|   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia | 
  **trend_type** | [****](.md)|   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [****](.md)|   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia | 
 **trend_type** | [****](.md)|   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) | 
 **interests** | [**models::TrendsL1Interest**](models::TrendsL1Interest.md)|   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion | 
 **genders** | [**models::TrendsGenderFilter**](models::TrendsGenderFilter.md)| If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings. | 
 **ages** | [**models::TrendsAgeBucket**](models::TrendsAgeBucket.md)| If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. | 
 **include_keywords** | [**String**](String.md)| If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. | 
 **normalize_against_group** | **bool**|  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [default to false]
 **limit** | **i32**| The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends. | [default to 50]
 **include_demographics** | **bool**| Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data. | [default to false]

### Return type

[**models::TrendingKeywordsResponse**](TrendingKeywordsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

