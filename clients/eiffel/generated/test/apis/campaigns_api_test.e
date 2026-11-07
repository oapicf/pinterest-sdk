note
    description: "API tests for CAMPAIGNS_API"
    date: "$Date$"
    revision: "$Revision$"


class CAMPAIGNS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_pins_analytics
            -- Get pins analytics
            --
            -- Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
        local
            l_response: LIST [AD_PIN_ANALYTICS]
            l_campaign_id: STRING_32
            l_pin_ids: LIST [STRING_32]
            l_start_date: DATE
            l_end_date: DATE
            l_columns: LIST [REPORTING_COLUMN_SYNC]
            l_granularity: GRANULARITY
            l_ad_account_id: STRING_32
            l_click_window_days: REAL_32
            l_engagement_window_days: REAL_32
            l_view_window_days: REAL_32
            l_conversion_report_time: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- create {ARRAYED_LIST [STRING_32]} l_pin_ids.make (2)
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity
            -- l_ad_account_id

            -- l_response := api.ad_pins_analytics(l_campaign_id, l_pin_ids, l_start_date, l_end_date, l_columns, l_granularity, l_ad_account_id, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time)
            assert ("not_implemented", False)
        end

    test_campaign_delivery_estimates
            -- Get campaign delivery estimates
            --
            -- Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
        local
            l_response: CAMPAIGN_DELIVERY_ESTIMATES_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_delivery_estimates_campaign: LIST [CAMPAIGN_DELIVERY_ESTIMATES_CAMPAIGN]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [CAMPAIGN_DELIVERY_ESTIMATES_CAMPAIGN]} l_campaign_delivery_estimates_campaign.make (2)

            -- l_response := api.campaign_delivery_estimates(l_ad_account_id, l_campaign_delivery_estimates_campaign)
            assert ("not_implemented", False)
        end

    test_campaign_targeting_analytics_get
            -- Get targeting analytics for campaigns
            --
            -- Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: METRICS_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_ids: LIST [STRING_32]
            l_start_date: DATE
            l_end_date: DATE
            l_targeting_types: LIST [ADS_ANALYTICS_CAMPAIGN_TARGETING_TYPE]
            l_columns: LIST [REPORTING_COLUMN_SYNC]
            l_granularity: GRANULARITY
            l_click_window_days: REAL_32
            l_engagement_window_days: REAL_32
            l_view_window_days: REAL_32
            l_conversion_report_time: STRING_32
            l_attribution_types: LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]
            l_reporting_timezone: REPORTING_TIME_ZONE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [STRING_32]} l_campaign_ids.make (2)
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [ADS_ANALYTICS_CAMPAIGN_TARGETING_TYPE]} l_targeting_types.make (2)
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.campaign_targeting_analytics_get(l_ad_account_id, l_campaign_ids, l_start_date, l_end_date, l_targeting_types, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_attribution_types, l_reporting_timezone)
            assert ("not_implemented", False)
        end

    test_campaigns_analytics
            -- Get campaign analytics
            --
            -- Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: LIST [CAMPAIGNS_ANALYTICS_METRICS]
            l_start_date: DATE
            l_end_date: DATE
            l_campaign_ids: LIST [STRING_32]
            l_columns: LIST [REPORTING_COLUMN_SYNC]
            l_granularity: GRANULARITY
            l_ad_account_id: STRING_32
            l_click_window_days: REAL_32
            l_engagement_window_days: REAL_32
            l_view_window_days: REAL_32
            l_conversion_report_time: STRING_32
            l_aggregate_report_rows: BOOLEAN
            l_reporting_timezone: REPORTING_TIME_ZONE
        do
            -- TODO: Initialize required params.
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [STRING_32]} l_campaign_ids.make (2)
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity
            -- l_ad_account_id

            -- l_response := api.campaigns_analytics(l_start_date, l_end_date, l_campaign_ids, l_columns, l_granularity, l_ad_account_id, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_aggregate_report_rows, l_reporting_timezone)
            assert ("not_implemented", False)
        end

    test_campaigns_create
            -- Create campaigns
            --
            -- Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
        local
            l_response: CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL
            l_ad_account_id: STRING_32
            l_campaign_create_item: LIST [CAMPAIGN_CREATE_ITEM]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [CAMPAIGN_CREATE_ITEM]} l_campaign_create_item.make (2)

            -- l_response := api.campaigns_create(l_ad_account_id, l_campaign_create_item)
            assert ("not_implemented", False)
        end

    test_campaigns_get
            -- Get campaign
            --
            -- Get a specific campaign given the campaign ID.
        local
            l_response: CAMPAIGN
            l_campaign_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_campaign_id
            -- l_ad_account_id

            -- l_response := api.campaigns_get(l_campaign_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_campaigns_list
            -- List campaigns
            --
            -- Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
        local
            l_response: CAMPAIGNS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_campaign_ids: LIST [STRING_32]
            l_entity_statuses: LIST [ENTITY_STATUS]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.campaigns_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_campaign_ids, l_entity_statuses)
            assert ("not_implemented", False)
        end

    test_campaigns_update
            -- Update campaigns
            --
            -- Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
        local
            l_response: CAMPAIGN_BATCH_WRITE_RESPONSE_MODEL
            l_ad_account_id: STRING_32
            l_campaign_batch_update_item: LIST [CAMPAIGN_BATCH_UPDATE_ITEM]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [CAMPAIGN_BATCH_UPDATE_ITEM]} l_campaign_batch_update_item.make (2)

            -- l_response := api.campaigns_update(l_ad_account_id, l_campaign_batch_update_item)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CAMPAIGNS_API
            -- Create an object instance of `CAMPAIGNS_API'.
        once
            create { CAMPAIGNS_API } Result
        end

end
