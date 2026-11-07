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
            -- Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
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
            -- Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: METRICS_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_ids: LIST [STRING_32]
            l_start_date: DATE
            l_end_date: DATE
            l_targeting_types: LIST [ADS_ANALYTICS_AD_TARGETING_TYPE]
            l_columns: LIST [REPORTING_COLUMN_SYNC]
            l_granularity: GRANULARITY
            l_click_window_days: CONVERSION_ATTRIBUTION_WINDOW_DAYS
            l_engagement_window_days: CONVERSION_ATTRIBUTION_WINDOW_DAYS
            l_view_window_days: CONVERSION_ATTRIBUTION_WINDOW_DAYS
            l_conversion_report_time: CONVERSION_REPORT_TIME_TYPE
            l_attribution_types: LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]
            l_reporting_timezone: REPORTING_TIME_ZONE
            l_sort_columns: LIST [STRING_32]
            l_sort_ascending: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [STRING_32]} l_ad_ids.make (2)
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [ADS_ANALYTICS_AD_TARGETING_TYPE]} l_targeting_types.make (2)
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_targeting_analytics_get(l_ad_account_id, l_ad_ids, l_start_date, l_end_date, l_targeting_types, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_attribution_types, l_reporting_timezone, l_sort_columns, l_sort_ascending)
            assert ("not_implemented", False)
        end

    test_ads_analytics
            -- Get ad analytics
            --
            --     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: LIST [ADS_ANALYTICS]
            l_start_date: DATE
            l_end_date: DATE
            l_columns: LIST [REPORTING_COLUMN_SYNC]
            l_granularity: GRANULARITY
            l_ad_account_id: STRING_32
            l_pin_ids: LIST [STRING_32]
            l_ad_ids: LIST [STRING_32]
            l_click_window_days: REAL_32
            l_engagement_window_days: REAL_32
            l_view_window_days: REAL_32
            l_conversion_report_time: STRING_32
            l_campaign_ids: LIST [STRING_32]
            l_reporting_timezone: REPORTING_TIME_ZONE
        do
            -- TODO: Initialize required params.
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity
            -- l_ad_account_id

            -- l_response := api.ads_analytics(l_start_date, l_end_date, l_columns, l_granularity, l_ad_account_id, l_pin_ids, l_ad_ids, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_campaign_ids, l_reporting_timezone)
            assert ("not_implemented", False)
        end

    test_ads_create
            -- Create ads
            --
            -- Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
        local
            l_response: AD_BATCH_WRITE_RESPONSE_MODEL
            l_ad_account_id: STRING_32
            l_ad_create: LIST [AD_CREATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_CREATE]} l_ad_create.make (2)

            -- l_response := api.ads_create(l_ad_account_id, l_ad_create)
            assert ("not_implemented", False)
        end

    test_ads_get
            -- Get ad
            --
            -- Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
        local
            l_response: AD
            l_ad_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_id
            -- l_ad_account_id

            -- l_response := api.ads_get(l_ad_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_ads_list
            -- List ads
            --
            -- List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
        local
            l_response: ADS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_campaign_ids: LIST [STRING_32]
            l_ad_group_ids: LIST [STRING_32]
            l_ad_ids: LIST [STRING_32]
            l_entity_statuses: LIST [ENTITY_STATUS]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ads_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_campaign_ids, l_ad_group_ids, l_ad_ids, l_entity_statuses)
            assert ("not_implemented", False)
        end

    test_ads_update
            -- Update ads
            --
            -- Update multiple existing ads
        local
            l_response: AD_BATCH_WRITE_RESPONSE_MODEL
            l_ad_account_id: STRING_32
            l_ad_batch_update: LIST [AD_BATCH_UPDATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_BATCH_UPDATE]} l_ad_batch_update.make (2)

            -- l_response := api.ads_update(l_ad_account_id, l_ad_batch_update)
            assert ("not_implemented", False)
        end

    test_campaign_ad_preview_create
            -- Create ad preview records for one or more ad groups
            --
            -- Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
        local
            l_response: LIST [CAMPAIGN_AD_PREVIEW_CREATE_200_RESPONSE_INNER]
            l_ad_account_id: STRING_32
            l_campaign_ad_preview_create: LIST [CAMPAIGN_AD_PREVIEW_CREATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [CAMPAIGN_AD_PREVIEW_CREATE]} l_campaign_ad_preview_create.make (2)

            -- l_response := api.campaign_ad_preview_create(l_ad_account_id, l_campaign_ad_preview_create)
            assert ("not_implemented", False)
        end

    test_campaign_ad_preview_delete
            -- Delete ad preview records for one or more ad groups
            --
            -- Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
        local
            l_response: LIST [CAMPAIGN_AD_PREVIEW_DELETE_200_RESPONSE_INNER]
            l_ad_group_ids: LIST [STRING_32]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [STRING_32]} l_ad_group_ids.make (2)
            -- l_ad_account_id

            -- l_response := api.campaign_ad_preview_delete(l_ad_group_ids, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_campaign_ad_preview_read
            -- Fetch ad preview records for one or more ad groups
            --
            -- Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
        local
            l_response: LIST [CAMPAIGN_AD_PREVIEW]
            l_ad_group_ids: LIST [STRING_32]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [STRING_32]} l_ad_group_ids.make (2)
            -- l_ad_account_id

            -- l_response := api.campaign_ad_preview_read(l_ad_group_ids, l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADS_API
            -- Create an object instance of `ADS_API'.
        once
            create { ADS_API } Result
        end

end
