note
    description: "API tests for PINS_API"
    date: "$Date$"
    revision: "$Revision$"


class PINS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_pins_analytics
            -- Get Pin analytics
            --
            -- Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
        local
            l_response: STRING_TABLE [PIN_ANALYTICS_METRICS_RESPONSE]
            l_pin_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_metric_types: LIST [PINS_ANALYTICS_METRIC_TYPES_PARAMETER_INNER]
            l_app_types: STRING_32
            l_split_field: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pin_id
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [PINS_ANALYTICS_METRIC_TYPES_PARAMETER_INNER]} l_metric_types.make (2)

            -- l_response := api.pins_analytics(l_pin_id, l_start_date, l_end_date, l_metric_types, l_app_types, l_split_field, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_pins_create
            -- Create Pin
            --
            -- Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/content/content-creation/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        local
            l_response: PIN
            l_pin_create: PIN_CREATE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pin_create

            -- l_response := api.pins_create(l_pin_create, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_pins_delete
            -- Delete Pin
            --
            -- Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
        local
            l_pin_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pin_id

            -- api.pins_delete(l_pin_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_pins_get
            -- Get Pin
            --
            -- Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
        local
            l_response: PIN
            l_pin_id: STRING_32
            l_pin_metrics: BOOLEAN
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pin_id

            -- l_response := api.pins_get(l_pin_id, l_pin_metrics, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_pins_list
            -- List Pins
            --
            -- Get a list of the Pins owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
        local
            l_response: PINS_LIST_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_pin_filter: STRING_32
            l_include_protected_pins: BOOLEAN
            l_pin_type: STRING_32
            l_creative_types: LIST [STRING_32]
            l_ad_account_id: STRING_32
            l_pin_metrics: BOOLEAN
        do
            -- TODO: Initialize required params.

            -- l_response := api.pins_list(l_bookmark, l_page_size, l_pin_filter, l_include_protected_pins, l_pin_type, l_creative_types, l_ad_account_id, l_pin_metrics)
            assert ("not_implemented", False)
        end

    test_pins_save
            -- Save Pin
            --
            -- Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
        local
            l_response: PIN
            l_pin_id: STRING_32
            l_pins_save_request: PINS_SAVE_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pin_id
            -- l_pins_save_request

            -- l_response := api.pins_save(l_pin_id, l_pins_save_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_pins_update
            -- Update Pin
            --
            -- Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
        local
            l_response: PIN
            l_pin_id: STRING_32
            l_pin_update: PIN_UPDATE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pin_id
            -- l_pin_update

            -- l_response := api.pins_update(l_pin_id, l_pin_update, l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PINS_API
            -- Create an object instance of `PINS_API'.
        once
            create { PINS_API } Result
        end

end
