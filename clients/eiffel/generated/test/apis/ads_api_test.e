note
    description: "API tests for ADS_API"
    date: "$Date$"
    revision: "$Revision$"


class ADS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_previews_create
            -- Create ad preview with pin or image
            --
            -- Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
        local
            l_response: AD_PREVIEW_URL_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_preview_request: AD_PREVIEW_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_preview_request

            -- l_response := api.ad_previews_create(l_ad_account_id, l_ad_preview_request)
            assert ("not_implemented", False)
        end

    test_ad_targeting_analytics_get
            -- Get targeting analytics for ads
            --
            -- Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
        local
            l_response: METRICS_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_ids: LIST [STRING_32]
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
            -- create {ARRAYED_LIST [STRING_32]} l_ad_ids.make (2)
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [ADS_ANALYTICS_TARGETING_TYPE]} l_targeting_types.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_targeting_analytics_get(l_ad_account_id, l_ad_ids, l_start_date, l_end_date, l_targeting_types, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_attribution_types)
            assert ("not_implemented", False)
        end

    test_ads_analytics
            -- Get ad analytics
            --
            -- Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
        local
            l_response: LIST [ADS_ANALYTICS_RESPONSE_INNER]
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_ad_ids: LIST [STRING_32]
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
            -- create {ARRAYED_LIST [STRING_32]} l_ad_ids.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ads_analytics(l_ad_account_id, l_start_date, l_end_date, l_ad_ids, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time)
            assert ("not_implemented", False)
        end

    test_ads_create
            -- Create ads
            --
            -- Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
        local
            l_response: AD_ARRAY_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_create_request: LIST [AD_CREATE_REQUEST]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_CREATE_REQUEST]} l_ad_create_request.make (2)

            -- l_response := api.ads_create(l_ad_account_id, l_ad_create_request)
            assert ("not_implemented", False)
        end

    test_ads_get
            -- Get ad
            --
            -- Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
        local
            l_response: AD_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_id

            -- l_response := api.ads_get(l_ad_account_id, l_ad_id)
            assert ("not_implemented", False)
        end

    test_ads_list
            -- List ads
            --
            -- List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
        local
            l_response: ADS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_ids: LIST [STRING_32]
            l_ad_group_ids: LIST [STRING_32]
            l_ad_ids: LIST [STRING_32]
            l_entity_statuses: LIST [STRING_32]
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ads_list(l_ad_account_id, l_campaign_ids, l_ad_group_ids, l_ad_ids, l_entity_statuses, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

    test_ads_update
            -- Update ads
            --
            -- Update multiple existing ads
        local
            l_response: AD_ARRAY_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_update_request: LIST [AD_UPDATE_REQUEST]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_UPDATE_REQUEST]} l_ad_update_request.make (2)

            -- l_response := api.ads_update(l_ad_account_id, l_ad_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADS_API
            -- Create an object instance of `ADS_API'.
        once
            create { ADS_API } Result
        end

end
