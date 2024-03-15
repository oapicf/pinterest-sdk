note
    description: "API tests for ADGROUPS_API"
    date: "$Date$"
    revision: "$Revision$"


class ADGROUPS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_groups_analytics
            -- Get ad group analytics
            --
            -- Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
        local
            l_response: LIST [AD_GROUPS_ANALYTICS_RESPONSE_INNER]
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_ad_group_ids: LIST [STRING_32]
            l_columns: LIST [STRING_32]
            l_granularity: GRANULARITY
            l_click_window_days: INTEGER_32
            l_engagement_window_days: INTEGER_32
            l_view_window_days: INTEGER_32
            l_conversion_report_time: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [STRING_32]} l_ad_group_ids.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_groups_analytics(l_ad_account_id, l_start_date, l_end_date, l_ad_group_ids, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time)
            assert ("not_implemented", False)
        end

    test_ad_groups_audience_sizing
            -- Get audience sizing
            --
            -- Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
        local
            l_response: AD_GROUP_AUDIENCE_SIZING_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_audience_sizing_request: AD_GROUP_AUDIENCE_SIZING_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ad_groups_audience_sizing(l_ad_account_id, l_ad_group_audience_sizing_request)
            assert ("not_implemented", False)
        end

    test_ad_groups_bid_floor_get
            -- Get bid floors
            --
            -- List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; For more on bid floors see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-your-bid\&quot;&gt; Set your bid&lt;/a&gt;.
        local
            l_response: BID_FLOOR
            l_ad_account_id: STRING_32
            l_bid_floor_request: BID_FLOOR_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_bid_floor_request

            -- l_response := api.ad_groups_bid_floor_get(l_ad_account_id, l_bid_floor_request)
            assert ("not_implemented", False)
        end

    test_ad_groups_create
            -- Create ad groups
            --
            -- Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/campaign-structure\&quot; target&#x3D;\&quot;_blank\&quot;&gt; click here&lt;/a&gt;.&lt;/p&gt; &lt;strong&gt;Note:&lt;/strong&gt; - &#39;bid_in_micro_currency&#39; and &#39;budget_in_micro_currency&#39; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.&lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
        local
            l_response: AD_GROUP_ARRAY_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_create_request: LIST [AD_GROUP_CREATE_REQUEST]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_GROUP_CREATE_REQUEST]} l_ad_group_create_request.make (2)

            -- l_response := api.ad_groups_create(l_ad_account_id, l_ad_group_create_request)
            assert ("not_implemented", False)
        end

    test_ad_groups_get
            -- Get ad group
            --
            -- Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
        local
            l_response: AD_GROUP_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_group_id

            -- l_response := api.ad_groups_get(l_ad_account_id, l_ad_group_id)
            assert ("not_implemented", False)
        end

    test_ad_groups_list
            -- List ad groups
            --
            -- List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id. Do not provide both.
        local
            l_response: AD_GROUPS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_ids: LIST [STRING_32]
            l_ad_group_ids: LIST [STRING_32]
            l_entity_statuses: LIST [STRING_32]
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
            l_translate_interests_to_names: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ad_groups_list(l_ad_account_id, l_campaign_ids, l_ad_group_ids, l_entity_statuses, l_page_size, l_order, l_bookmark, l_translate_interests_to_names)
            assert ("not_implemented", False)
        end

    test_ad_groups_targeting_analytics_get
            -- Get targeting analytics for ad groups
            --
            -- Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
        local
            l_response: METRICS_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_ids: LIST [STRING_32]
            l_start_date: DATE
            l_end_date: DATE
            l_targeting_types: LIST [ADS_ANALYTICS_TARGETING_TYPE]
            l_columns: LIST [STRING_32]
            l_granularity: GRANULARITY
            l_click_window_days: INTEGER_32
            l_engagement_window_days: INTEGER_32
            l_view_window_days: INTEGER_32
            l_conversion_report_time: STRING_32
            l_attribution_types: CONVERSION_REPORT_ATTRIBUTION_TYPE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [STRING_32]} l_ad_group_ids.make (2)
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [ADS_ANALYTICS_TARGETING_TYPE]} l_targeting_types.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_groups_targeting_analytics_get(l_ad_account_id, l_ad_group_ids, l_start_date, l_end_date, l_targeting_types, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_attribution_types)
            assert ("not_implemented", False)
        end

    test_ad_groups_update
            -- Update ad groups
            --
            -- Update multiple existing ad groups.
        local
            l_response: AD_GROUP_ARRAY_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_update_request: LIST [AD_GROUP_UPDATE_REQUEST]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_GROUP_UPDATE_REQUEST]} l_ad_group_update_request.make (2)

            -- l_response := api.ad_groups_update(l_ad_account_id, l_ad_group_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADGROUPS_API
            -- Create an object instance of `ADGROUPS_API'.
        once
            create { ADGROUPS_API } Result
        end

end
