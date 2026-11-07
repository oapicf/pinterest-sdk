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
            -- Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: LIST [AD_GROUPS_ANALYTICS_METRICS]
            l_start_date: DATE
            l_end_date: DATE
            l_ad_group_ids: LIST [STRING_32]
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
            -- create {ARRAYED_LIST [STRING_32]} l_ad_group_ids.make (2)
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity
            -- l_ad_account_id

            -- l_response := api.ad_groups_analytics(l_start_date, l_end_date, l_ad_group_ids, l_columns, l_granularity, l_ad_account_id, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_aggregate_report_rows, l_reporting_timezone)
            assert ("not_implemented", False)
        end

    test_ad_groups_audience_sizing
            -- Get audience sizing
            --
            -- Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
        local
            l_response: AD_GROUP_AUDIENCE_SIZING
            l_ad_account_id: STRING_32
            l_ad_group_audience_sizing_create: AD_GROUP_AUDIENCE_SIZING_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_group_audience_sizing_create

            -- l_response := api.ad_groups_audience_sizing(l_ad_account_id, l_ad_group_audience_sizing_create)
            assert ("not_implemented", False)
        end

    test_ad_groups_bid_floor_get
            -- Get bid floors
            --
            -- List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
        local
            l_response: BID_FLOOR
            l_ad_account_id: STRING_32
            l_bid_floor_create: BID_FLOOR_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_bid_floor_create

            -- l_response := api.ad_groups_bid_floor_get(l_ad_account_id, l_bid_floor_create)
            assert ("not_implemented", False)
        end

    test_ad_groups_by_promotion_ids_list
            -- List of ad groups using promotions IDs.
            --
            --   Get a list of ad groups that are associated with those promotion ids
        local
            l_response: AD_GROUPS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_promotion_ids: LIST [STRING_32]
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [STRING_32]} l_promotion_ids.make (2)

            -- l_response := api.ad_groups_by_promotion_ids_list(l_ad_account_id, l_promotion_ids, l_bookmark, l_page_size, l_order)
            assert ("not_implemented", False)
        end

    test_ad_groups_create
            -- Create ad groups
            --
            -- Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
        local
            l_response: AD_GROUPS_CREATE_200_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_create_create: LIST [AD_GROUP_CREATE_CREATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_GROUP_CREATE_CREATE]} l_ad_group_create_create.make (2)

            -- l_response := api.ad_groups_create(l_ad_account_id, l_ad_group_create_create)
            assert ("not_implemented", False)
        end

    test_ad_groups_dynamic_titles_download_csv
            -- Get dynamic titles CSV download URL
            --
            -- Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
        local
            l_response: DYNAMIC_TITLES_DOWNLOAD_CSV
            l_ad_account_id: STRING_32
            l_ad_group_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_group_id

            -- l_response := api.ad_groups_dynamic_titles_download_csv(l_ad_account_id, l_ad_group_id)
            assert ("not_implemented", False)
        end

    test_ad_groups_dynamic_titles_get_status
            -- Get dynamic titles status
            --
            -- Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
        local
            l_response: DYNAMIC_TITLES_GET_STATUS
            l_ad_account_id: STRING_32
            l_ad_group_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_group_id

            -- l_response := api.ad_groups_dynamic_titles_get_status(l_ad_account_id, l_ad_group_id)
            assert ("not_implemented", False)
        end

    test_ad_groups_dynamic_titles_get_upload_url
            -- Get dynamic titles upload URL
            --
            -- Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
        local
            l_response: DYNAMIC_TITLES_UPLOAD_URL
            l_ad_account_id: STRING_32
            l_ad_group_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_group_id

            -- l_response := api.ad_groups_dynamic_titles_get_upload_url(l_ad_account_id, l_ad_group_id)
            assert ("not_implemented", False)
        end

    test_ad_groups_dynamic_titles_process_csv
            -- Process dynamic titles CSV
            --
            -- Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
        local
            l_response: DYNAMIC_TITLES_PROCESS_CSV
            l_ad_account_id: STRING_32
            l_ad_group_id: STRING_32
            l_dynamic_titles_process_csv_create: DYNAMIC_TITLES_PROCESS_CSV_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_group_id
            -- l_dynamic_titles_process_csv_create

            -- l_response := api.ad_groups_dynamic_titles_process_csv(l_ad_account_id, l_ad_group_id, l_dynamic_titles_process_csv_create)
            assert ("not_implemented", False)
        end

    test_ad_groups_get
            -- Get ad group
            --
            -- Get a specific ad group given the ad group ID.
        local
            l_response: AD_GROUP
            l_ad_group_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_group_id
            -- l_ad_account_id

            -- l_response := api.ad_groups_get(l_ad_group_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_ad_groups_list
            -- List ad groups
            --
            -- List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
        local
            l_response: AD_GROUPS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_campaign_ids: LIST [STRING_32]
            l_ad_group_ids: LIST [STRING_32]
            l_entity_statuses: LIST [ENTITY_STATUS]
            l_translate_interests_to_names: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ad_groups_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_campaign_ids, l_ad_group_ids, l_entity_statuses, l_translate_interests_to_names)
            assert ("not_implemented", False)
        end

    test_ad_groups_targeting_analytics_get
            -- Get targeting analytics for ad groups
            --
            -- Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: METRICS_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_ids: LIST [STRING_32]
            l_start_date: DATE
            l_end_date: DATE
            l_targeting_types: LIST [ADS_ANALYTICS_AD_GROUP_TARGETING_TYPE]
            l_columns: LIST [REPORTING_COLUMN_SYNC]
            l_granularity: GRANULARITY
            l_click_window_days: REAL_32
            l_engagement_window_days: REAL_32
            l_view_window_days: REAL_32
            l_conversion_report_time: STRING_32
            l_attribution_types: LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]
            l_reporting_timezone: REPORTING_TIME_ZONE
            l_sort_columns: LIST [STRING_32]
            l_sort_ascending: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [STRING_32]} l_ad_group_ids.make (2)
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [ADS_ANALYTICS_AD_GROUP_TARGETING_TYPE]} l_targeting_types.make (2)
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_groups_targeting_analytics_get(l_ad_account_id, l_ad_group_ids, l_start_date, l_end_date, l_targeting_types, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_attribution_types, l_reporting_timezone, l_sort_columns, l_sort_ascending)
            assert ("not_implemented", False)
        end

    test_ad_groups_update
            -- Update ad groups
            --
            -- Update multiple existing ad groups.
        local
            l_response: AD_GROUPS_CREATE_200_RESPONSE
            l_ad_account_id: STRING_32
            l_ad_group_update_batch_update: LIST [AD_GROUP_UPDATE_BATCH_UPDATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [AD_GROUP_UPDATE_BATCH_UPDATE]} l_ad_group_update_batch_update.make (2)

            -- l_response := api.ad_groups_update(l_ad_account_id, l_ad_group_update_batch_update)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADGROUPS_API
            -- Create an object instance of `ADGROUPS_API'.
        once
            create { ADGROUPS_API } Result
        end

end
