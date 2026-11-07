note
    description: "API tests for KEYWORDS_API"
    date: "$Date$"
    revision: "$Revision$"


class KEYWORDS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_country_keywords_metrics_get
            -- Get country&#39;s keyword metrics
            --
            --   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
        local
            l_response: KEYWORDS_METRICS_ARRAY_RESPONSE
            l_ad_account_id: STRING_32
            l_country_code: STRING_32
            l_keywords: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_country_code
            -- create {ARRAYED_LIST [STRING_32]} l_keywords.make (2)

            -- l_response := api.country_keywords_metrics_get(l_ad_account_id, l_country_code, l_keywords)
            assert ("not_implemented", False)
        end

    test_keywords_create
            -- Create keywords
            --
            --   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
        local
            l_response: KEYWORDS
            l_ad_account_id: STRING_32
            l_keywords_create: KEYWORDS_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_keywords_create

            -- l_response := api.keywords_create(l_ad_account_id, l_keywords_create)
            assert ("not_implemented", False)
        end

    test_keywords_get
            -- Get keywords
            --
            --     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
        local
            l_response: KEYWORDS_GET_200_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_id: STRING_32
            l_ad_group_id: STRING_32
            l_ad_group_ids: LIST [STRING_32]
            l_match_types: LIST [MATCH_TYPE]
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.keywords_get(l_ad_account_id, l_campaign_id, l_ad_group_id, l_ad_group_ids, l_match_types, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_keywords_update
            -- Update keywords
            --
            --   Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
        local
            l_response: KEYWORDS
            l_ad_account_id: STRING_32
            l_keywords_update: KEYWORDS_UPDATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_keywords_update

            -- l_response := api.keywords_update(l_ad_account_id, l_keywords_update)
            assert ("not_implemented", False)
        end

    test_trending_keywords_list
            -- List trending keywords
            --
            -- Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
        local
            l_response: TRENDING_KEYWORDS_RESPONSE
            l_region: TRENDS_SUPPORTED_REGION
            l_trend_type: TREND_TYPE
            l_interests: LIST [TRENDS_L1_INTEREST]
            l_genders: LIST [TRENDS_GENDER_FILTER]
            l_ages: LIST [TRENDS_AGE_BUCKET]
            l_include_keywords: LIST [STRING_32]
            l_normalize_against_group: BOOLEAN
            l_limit: INTEGER_32
            l_include_demographics: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_region
            -- l_trend_type

            -- l_response := api.trending_keywords_list(l_region, l_trend_type, l_interests, l_genders, l_ages, l_include_keywords, l_normalize_against_group, l_limit, l_include_demographics)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: KEYWORDS_API
            -- Create an object instance of `KEYWORDS_API'.
        once
            create { KEYWORDS_API } Result
        end

end
