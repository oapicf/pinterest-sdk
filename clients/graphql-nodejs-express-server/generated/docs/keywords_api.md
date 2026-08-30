# keywords_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CountryKeywordsMetricsGet**](keywords_api.md#CountryKeywordsMetricsGet) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
[**KeywordsCreate**](keywords_api.md#KeywordsCreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
[**KeywordsGet**](keywords_api.md#KeywordsGet) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
[**KeywordsUpdate**](keywords_api.md#KeywordsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
[**TrendingKeywordsList**](keywords_api.md#TrendingKeywordsList) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords


<a name="CountryKeywordsMetricsGet"></a>
# **CountryKeywordsMetricsGet**
> KeywordsMetricsArrayResponse CountryKeywordsMetricsGet(adAccountId, countryCode, keywords)

Get country&#39;s keyword metrics

  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
<a name="KeywordsCreate"></a>
# **KeywordsCreate**
> Keywords KeywordsCreate(adAccountId, keywordsCreate)

Create keywords

  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
<a name="KeywordsGet"></a>
# **KeywordsGet**
> KeywordsGet200Response KeywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize)

Get keywords

    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
<a name="KeywordsUpdate"></a>
# **KeywordsUpdate**
> Keywords KeywordsUpdate(adAccountId, keywordsUpdate)

Update keywords

  Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
<a name="TrendingKeywordsList"></a>
# **TrendingKeywordsList**
> TrendingKeywordsResponse TrendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics)

List trending keywords

Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
