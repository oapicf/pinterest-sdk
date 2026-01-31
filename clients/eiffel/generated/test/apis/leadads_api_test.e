note
    description: "API tests for LEADADS_API"
    date: "$Date$"
    revision: "$Revision$"


class LEADADS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_accounts_subscriptions_del_by_id
            -- Delete lead ads subscription
            --
            -- Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
        local
            l_ad_account_id: STRING_32
            l_subscription_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_subscription_id

            -- api.ad_accounts_subscriptions_del_by_id(l_ad_account_id, l_subscription_id)
            assert ("not_implemented", False)
        end

    test_ad_accounts_subscriptions_get_by_id
            -- Get lead ads subscription by ID
            --
            -- Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
        local
            l_response: LEAD_SUBSCRIPTION
            l_ad_account_id: STRING_32
            l_subscription_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_subscription_id

            -- l_response := api.ad_accounts_subscriptions_get_by_id(l_ad_account_id, l_subscription_id)
            assert ("not_implemented", False)
        end

    test_ad_accounts_subscriptions_get_list
            -- Get lead ads subscriptions
            --
            -- Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
        local
            l_response: AD_ACCOUNTS_SUBSCRIPTIONS_GET_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ad_accounts_subscriptions_get_list(l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_ad_accounts_subscriptions_post
            -- Create lead ads subscription
            --
            -- Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
        local
            l_response: LEAD_SUBSCRIPTION
            l_ad_account_id: STRING_32
            l_lead_subscription_post_params_create: LEAD_SUBSCRIPTION_POST_PARAMS_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_lead_subscription_post_params_create

            -- l_response := api.ad_accounts_subscriptions_post(l_ad_account_id, l_lead_subscription_post_params_create)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LEADADS_API
            -- Create an object instance of `LEADADS_API'.
        once
            create { LEADADS_API } Result
        end

end
