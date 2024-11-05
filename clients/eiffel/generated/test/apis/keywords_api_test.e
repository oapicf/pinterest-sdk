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
            -- See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \&quot;Get delivery metrics definitions\&quot; &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/delivery_metrics/get\&quot;&gt;API endpoint&lt;/a&gt;).
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
            -- &lt;p&gt;Create keywords for following entity types(advertiser, campaign, ad group or ad).&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a  target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;b&gt;Rate limit&lt;/b&gt;: &lt;a href&#x3D;\&quot;/docs/reference/rate-limits/\&quot;&gt;WRITE&lt;/a&gt;.&lt;/p&gt;
        local
            l_response: KEYWORDS_RESPONSE
            l_ad_account_id: STRING_32
            l_keywords_request: KEYWORDS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_keywords_request

            -- l_response := api.keywords_create(l_ad_account_id, l_keywords_request)
            assert ("not_implemented", False)
        end

    test_keywords_get
            -- Get keywords
            --
            -- &lt;p&gt;Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;
        local
            l_response: KEYWORDS_GET_200_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_id: STRING_32
            l_ad_group_id: STRING_32
            l_match_types: LIST [MATCH_TYPE]
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.keywords_get(l_ad_account_id, l_campaign_id, l_ad_group_id, l_match_types, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_keywords_update
            -- Update keywords
            --
            -- &lt;p&gt;Update one or more keywords&#39; bid and archived fields.&lt;/p&gt; &lt;p&gt;Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity&#39;s keywords list.&lt;/p&gt;
        local
            l_response: KEYWORDS_RESPONSE
            l_ad_account_id: STRING_32
            l_keyword_update_body: KEYWORD_UPDATE_BODY
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_keyword_update_body

            -- l_response := api.keywords_update(l_ad_account_id, l_keyword_update_body)
            assert ("not_implemented", False)
        end

    test_trending_keywords_list
            -- List trending keywords
            --
            -- &lt;p&gt;Get the top trending search keywords among the Pinterest user audience.&lt;/p&gt; &lt;p&gt;Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.&lt;/p&gt; &lt;p&gt;Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.&lt;/p&gt; &lt;p&gt;For an interactive way to explore this data, please visit &lt;a href&#x3D;\&quot;https://trends.pinterest.com\&quot;&gt;trends.pinterest.com&lt;/a&gt;. 
        local
            l_response: TRENDING_KEYWORDS_RESPONSE
            l_region: TRENDS_SUPPORTED_REGION
            l_trend_type: TREND_TYPE
            l_interests: LIST [STRING_32]
            l_genders: LIST [STRING_32]
            l_ages: LIST [STRING_32]
            l_include_keywords: LIST [STRING_32]
            l_normalize_against_group: BOOLEAN
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_region
            -- l_trend_type

            -- l_response := api.trending_keywords_list(l_region, l_trend_type, l_interests, l_genders, l_ages, l_include_keywords, l_normalize_against_group, l_limit)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: KEYWORDS_API
            -- Create an object instance of `KEYWORDS_API'.
        once
            create { KEYWORDS_API } Result
        end

end
