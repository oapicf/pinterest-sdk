note
    description: "API tests for ADACCOUNTS_API"
    date: "$Date$"
    revision: "$Revision$"


class ADACCOUNTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_account_analytics
            -- Get ad account analytics
            --
            -- Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: LIST [STRING_TABLE [ANY]]
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
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
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_account_analytics(l_ad_account_id, l_start_date, l_end_date, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time)
            assert ("not_implemented", False)
        end

    test_ad_accounts_list
            -- List ad accounts
            --
            -- Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
        local
            l_response: PAGINATED
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_include_shared_accounts: BOOLEAN
        do
            -- TODO: Initialize required params.

            -- l_response := api.ad_accounts_list(l_bookmark, l_page_size, l_include_shared_accounts)
            assert ("not_implemented", False)
        end

    test_ad_groups_analytics
            -- Get ad group analytics
            --
            -- Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: LIST [STRING_TABLE [ANY]]
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

    test_ad_groups_list
            -- List ad groups
            --
            -- Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: PAGINATED
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

    test_ads_analytics
            -- Get ad analytics
            --
            -- Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: LIST [STRING_TABLE [ANY]]
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

    test_ads_list
            -- List ads
            --
            -- Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: PAGINATED
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

    test_analytics_create_report
            -- Create async request for an account analytics report
            --
            -- This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: ADS_ANALYTICS_CREATE_ASYNC_RESPONSE
            l_ad_account_id: STRING_32
            l_ads_analytics_create_async_request: ADS_ANALYTICS_CREATE_ASYNC_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ads_analytics_create_async_request

            -- l_response := api.analytics_create_report(l_ad_account_id, l_ads_analytics_create_async_request)
            assert ("not_implemented", False)
        end

    test_analytics_get_report
            -- Get the account analytics report created by the async call
            --
            -- This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: ADS_ANALYTICS_GET_ASYNC_RESPONSE
            l_ad_account_id: STRING_32
            l_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_token

            -- l_response := api.analytics_get_report(l_ad_account_id, l_token)
            assert ("not_implemented", False)
        end

    test_campaigns_analytics
            -- Get campaign analytics
            --
            -- Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: LIST [STRING_TABLE [ANY]]
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_campaign_ids: LIST [STRING_32]
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
            -- create {ARRAYED_LIST [STRING_32]} l_campaign_ids.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.campaigns_analytics(l_ad_account_id, l_start_date, l_end_date, l_campaign_ids, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time)
            assert ("not_implemented", False)
        end

    test_campaigns_list
            -- List campaigns
            --
            -- Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: PAGINATED
            l_ad_account_id: STRING_32
            l_campaign_ids: LIST [STRING_32]
            l_entity_statuses: LIST [STRING_32]
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.campaigns_list(l_ad_account_id, l_campaign_ids, l_entity_statuses, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

    test_product_groups_analytics
            -- Get product group analytics
            --
            -- Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        local
            l_response: LIST [STRING_TABLE [ANY]]
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_product_group_ids: LIST [STRING_32]
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
            -- create {ARRAYED_LIST [STRING_32]} l_product_group_ids.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.product_groups_analytics(l_ad_account_id, l_start_date, l_end_date, l_product_group_ids, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADACCOUNTS_API
            -- Create an object instance of `ADACCOUNTS_API'.
        once
            create { ADACCOUNTS_API } Result
        end

end
