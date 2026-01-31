note
    description: "API tests for CATALOGREPORTS_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGREPORTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_reports_create
            -- Build catalogs report
            --
            -- Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: CATALOGS_CREATE_REPORT_RESPONSE
            l_catalogs_report_parameters: CATALOGS_REPORT_PARAMETERS
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalogs_report_parameters

            -- l_response := api.reports_create(l_catalogs_report_parameters, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_reports_get
            -- Get catalogs report
            --
            -- This returns a URL to a report given a token returned from &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt;. You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
        local
            l_response: CATALOGS_REPORT
            l_token: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_token

            -- l_response := api.reports_get(l_token, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_reports_stats
            -- List report stats
            --
            -- List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
        local
            l_response: REPORTS_STATS_200_RESPONSE
            l_parameters: REPORTS_STATS_PARAMETERS_PARAMETER
            l_ad_account_id: STRING_32
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_parameters

            -- l_response := api.reports_stats(l_parameters, l_ad_account_id, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGREPORTS_API
            -- Create an object instance of `CATALOGREPORTS_API'.
        once
            create { CATALOGREPORTS_API } Result
        end

end
