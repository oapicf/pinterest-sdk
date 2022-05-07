note
    description: "API tests for USERACCOUNT_API"
    date: "$Date$"
    revision: "$Revision$"


class USERACCOUNT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_user_account_analytics
            -- Get user account analytics
            --
            -- Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
        local
            l_response: STRING_TABLE [ANALYTICS_METRICS_RESPONSE]
            l_start_date: DATE
            l_end_date: DATE
            l_from_claimed_content: STRING_32
            l_pin_format: STRING_32
            l_app_types: STRING_32
            l_metric_types: LIST [STRING_32]
            l_split_field: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_date
            -- l_end_date

            -- l_response := api.user_account_analytics(l_start_date, l_end_date, l_from_claimed_content, l_pin_format, l_app_types, l_metric_types, l_split_field, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_user_account_get
            -- Get user account
            --
            -- Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
        local
            l_response: ACCOUNT
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.user_account_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: USERACCOUNT_API
            -- Create an object instance of `USERACCOUNT_API'.
        once
            create { USERACCOUNT_API } Result
        end

end
