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
            -- Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
        local
            l_response: LIST [AD_ACCOUNT_ANALYTICS_RESPONSE_INNER]
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_columns: LIST [STRING_32]
            l_granularity: GRANULARITY
            l_click_window_days: INTEGER_32
            l_engagement_window_days: INTEGER_32
            l_view_window_days: INTEGER_32
            l_conversion_report_time: STRING_32
            l_reporting_timezone: REPORTING_TIME_ZONE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_account_analytics(l_ad_account_id, l_start_date, l_end_date, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_reporting_timezone)
            assert ("not_implemented", False)
        end

    test_ad_account_targeting_analytics_get
            -- Get targeting analytics for an ad account
            --
            -- Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: METRICS_RESPONSE
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_targeting_types: LIST [ADS_ANALYTICS_TARGETING_TYPE]
            l_columns: LIST [STRING_32]
            l_granularity: GRANULARITY
            l_click_window_days: INTEGER_32
            l_engagement_window_days: INTEGER_32
            l_view_window_days: INTEGER_32
            l_conversion_report_time: STRING_32
            l_attribution_types: LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]
            l_reporting_timezone: REPORTING_TIME_ZONE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [ADS_ANALYTICS_TARGETING_TYPE]} l_targeting_types.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.ad_account_targeting_analytics_get(l_ad_account_id, l_start_date, l_end_date, l_targeting_types, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_attribution_types, l_reporting_timezone)
            assert ("not_implemented", False)
        end

    test_ad_accounts_create
            -- Create ad account
            --
            -- Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
        local
            l_response: AD_ACCOUNT
            l_ad_account_create: AD_ACCOUNT_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_create

            -- l_response := api.ad_accounts_create(l_ad_account_create)
            assert ("not_implemented", False)
        end

    test_ad_accounts_get
            -- Get ad account
            --
            -- Get an ad account
        local
            l_response: AD_ACCOUNT
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ad_accounts_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_ad_accounts_list
            -- List ad accounts
            --
            -- Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
        local
            l_response: AD_ACCOUNTS_LIST_200_RESPONSE
            l_include_shared_accounts: BOOLEAN
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.ad_accounts_list(l_include_shared_accounts, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_analytics_create_conversion_product_report
            -- Create a request for a brand, category, SKU report
            --
            -- &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
        local
            l_response: ADS_ANALYTICS_CREATE_ASYNC_RESPONSE
            l_ad_account_id: STRING_32
            l_conversion_product_report_request: CONVERSION_PRODUCT_REPORT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_conversion_product_report_request

            -- l_response := api.analytics_create_conversion_product_report(l_ad_account_id, l_conversion_product_report_request)
            assert ("not_implemented", False)
        end

    test_analytics_create_mmm_report
            -- Create a request for a Marketing Mix Modeling (MMM) report
            --
            -- This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it&#39;s in beta release.
        local
            l_response: CREATE_MMM_REPORT_RESPONSE
            l_ad_account_id: STRING_32
            l_create_mmm_report_request: CREATE_MMM_REPORT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_create_mmm_report_request

            -- l_response := api.analytics_create_mmm_report(l_ad_account_id, l_create_mmm_report_request)
            assert ("not_implemented", False)
        end

    test_analytics_create_report
            -- Create async request for an account analytics report
            --
            -- This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
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

    test_analytics_create_template_report
            -- Create async request for an analytics report using a template
            --
            --    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
        local
            l_response: TEMPLATE_BASED_REPORT
            l_ad_account_id: STRING_32
            l_template_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_granularity: GRANULARITY
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_template_id

            -- l_response := api.analytics_create_template_report(l_ad_account_id, l_template_id, l_start_date, l_end_date, l_granularity)
            assert ("not_implemented", False)
        end

    test_analytics_get_conversion_product_report
            -- Get advertiser brand, category, SKU report
            --
            -- &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
        local
            l_response: ADS_ANALYTICS_GET_ASYNC_RESPONSE
            l_ad_account_id: STRING_32
            l_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_token

            -- l_response := api.analytics_get_conversion_product_report(l_ad_account_id, l_token)
            assert ("not_implemented", False)
        end

    test_analytics_get_mmm_report
            -- Get advertiser Marketing Mix Modeling (MMM) report.
            --
            -- Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
        local
            l_response: GET_MMM_REPORT_RESPONSE
            l_ad_account_id: STRING_32
            l_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_token

            -- l_response := api.analytics_get_mmm_report(l_ad_account_id, l_token)
            assert ("not_implemented", False)
        end

    test_analytics_get_report
            -- Get the account analytics report created by the async call
            --
            -- This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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

    test_sandbox_delete
            -- Delete ads data for ad account in API Sandbox
            --
            -- Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
        local
            l_response: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.sandbox_delete(l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_templates_list
            -- List templates
            --
            -- Gets all Templates associated with an ad account ID.
        local
            l_response: TEMPLATES_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.templates_list(l_ad_account_id, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADACCOUNTS_API
            -- Create an object instance of `ADACCOUNTS_API'.
        once
            create { ADACCOUNTS_API } Result
        end

end
