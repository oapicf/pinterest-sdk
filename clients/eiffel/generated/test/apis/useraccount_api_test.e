note
    description: "API tests for USERACCOUNT_API"
    date: "$Date$"
    revision: "$Revision$"


class USERACCOUNT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_boards_user_follows_list
            -- List following boards
            --
            -- Get a list of the boards a user follows. The request returns a board summary object array.
        local
            l_response: BOARDS_USER_FOLLOWS_LIST_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_explicit_following: BOOLEAN
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.boards_user_follows_list(l_bookmark, l_page_size, l_explicit_following, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_follow_user_update
            -- Follow user
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
        local
            l_response: USER_SUMMARY
            l_username: STRING_32
            l_follow_user_request: FOLLOW_USER_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_username
            -- l_follow_user_request

            -- l_response := api.follow_user_update(l_username, l_follow_user_request)
            assert ("not_implemented", False)
        end

    test_followers_list
            -- List followers
            --
            -- Get a list of your followers.
        local
            l_response: FOLLOWERS_LIST_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.followers_list(l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_linked_business_accounts_get
            -- List linked businesses
            --
            -- Get a list of your linked business accounts.
        local
            l_response: LIST [LINKED_BUSINESS]
        do
            -- TODO: Initialize required params.

            -- l_response := api.linked_business_accounts_get
            assert ("not_implemented", False)
        end

    test_unverify_website_delete
            -- Unverify website
            --
            -- Unverifu a website verified by the signed-in user.
        local
            l_website: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_website

            -- api.unverify_website_delete(l_website)
            assert ("not_implemented", False)
        end

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
            l_content_type: STRING_32
            l_source: STRING_32
            l_metric_types: LIST [STRING_32]
            l_split_field: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_date
            -- l_end_date

            -- l_response := api.user_account_analytics(l_start_date, l_end_date, l_from_claimed_content, l_pin_format, l_app_types, l_content_type, l_source, l_metric_types, l_split_field, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_user_account_analytics_top_pins
            -- Get user account top pins analytics
            --
            -- Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
        local
            l_response: TOP_PINS_ANALYTICS_RESPONSE
            l_start_date: DATE
            l_end_date: DATE
            l_sort_by: STRING_32
            l_from_claimed_content: STRING_32
            l_pin_format: STRING_32
            l_app_types: STRING_32
            l_content_type: STRING_32
            l_source: STRING_32
            l_metric_types: LIST [STRING_32]
            l_num_of_pins: INTEGER_32
            l_created_in_last_n_days: INTEGER_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_date
            -- l_end_date
            -- l_sort_by

            -- l_response := api.user_account_analytics_top_pins(l_start_date, l_end_date, l_sort_by, l_from_claimed_content, l_pin_format, l_app_types, l_content_type, l_source, l_metric_types, l_num_of_pins, l_created_in_last_n_days, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_user_account_analytics_top_video_pins
            -- Get user account top video pins analytics
            --
            -- Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
        local
            l_response: TOP_VIDEO_PINS_ANALYTICS_RESPONSE
            l_start_date: DATE
            l_end_date: DATE
            l_sort_by: STRING_32
            l_from_claimed_content: STRING_32
            l_pin_format: STRING_32
            l_app_types: STRING_32
            l_content_type: STRING_32
            l_source: STRING_32
            l_metric_types: LIST [STRING_32]
            l_num_of_pins: INTEGER_32
            l_created_in_last_n_days: INTEGER_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_date
            -- l_end_date
            -- l_sort_by

            -- l_response := api.user_account_analytics_top_video_pins(l_start_date, l_end_date, l_sort_by, l_from_claimed_content, l_pin_format, l_app_types, l_content_type, l_source, l_metric_types, l_num_of_pins, l_created_in_last_n_days, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_user_account_followed_interests
            -- List following interests
            --
            -- Get a list of a user&#39;s following interests in one place.
        local
            l_response: USER_ACCOUNT_FOLLOWED_INTERESTS_200_RESPONSE
            l_username: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_username

            -- l_response := api.user_account_followed_interests(l_username, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_user_account_get
            -- Get user account
            --
            -- Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
        local
            l_response: ACCOUNT
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.user_account_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_user_following_get
            -- List following
            --
            -- Get a list of who a certain user follows.
        local
            l_response: USER_FOLLOWING_GET_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_feed_type: USER_FOLLOWING_FEED_TYPE
            l_explicit_following: BOOLEAN
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.user_following_get(l_bookmark, l_page_size, l_feed_type, l_explicit_following, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_user_websites_get
            -- Get user websites
            --
            -- Get user websites, claimed or not
        local
            l_response: USER_WEBSITES_GET_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.user_websites_get(l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_verify_website_update
            -- Verify website
            --
            -- Verify a website as a signed-in user.
        local
            l_response: USER_WEBSITE_SUMMARY
            l_user_website_verify_request: USER_WEBSITE_VERIFY_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_website_verify_request

            -- l_response := api.verify_website_update(l_user_website_verify_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_website_verification_get
            -- Get user verification code for website claiming
            --
            -- Get verification code for user to install on the website to claim it.
        local
            l_response: USER_WEBSITE_VERIFICATION_CODE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.website_verification_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: USERACCOUNT_API
            -- Create an object instance of `USERACCOUNT_API'.
        once
            create { USERACCOUNT_API } Result
        end

end
