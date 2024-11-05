note
    description: "API tests for BILLING_API"
    date: "$Date$"
    revision: "$Revision$"


class BILLING_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ads_credit_redeem
            -- Redeem ad credits
            --
            -- Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
        local
            l_response: ADS_CREDIT_REDEEM_RESPONSE
            l_ad_account_id: STRING_32
            l_ads_credit_redeem_request: ADS_CREDIT_REDEEM_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ads_credit_redeem_request

            -- l_response := api.ads_credit_redeem(l_ad_account_id, l_ads_credit_redeem_request)
            assert ("not_implemented", False)
        end

    test_ads_credits_discounts_get
            -- Get ads credit discounts
            --
            -- Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
        local
            l_response: ADS_CREDITS_DISCOUNTS_GET_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ads_credits_discounts_get(l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_billing_profiles_get
            -- Get billing profiles
            --
            -- Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
        local
            l_response: BILLING_PROFILES_GET_200_RESPONSE
            l_ad_account_id: STRING_32
            l_is_active: BOOLEAN
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_is_active

            -- l_response := api.billing_profiles_get(l_ad_account_id, l_is_active, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_ssio_accounts_get
            -- Get Salesforce account details including bill-to information.
            --
            -- Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
        local
            l_response: SSIO_ACCOUNT_RESPONSE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ssio_accounts_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_ssio_insertion_order_create
            -- Create insertion order through SSIO.
            --
            -- Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
        local
            l_response: SSIO_CREATE_INSERTION_ORDER_RESPONSE
            l_ad_account_id: STRING_32
            l_ssio_create_insertion_order_request: SSIO_CREATE_INSERTION_ORDER_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ssio_create_insertion_order_request

            -- l_response := api.ssio_insertion_order_create(l_ad_account_id, l_ssio_create_insertion_order_request)
            assert ("not_implemented", False)
        end

    test_ssio_insertion_order_edit
            -- Edit insertion order through SSIO.
            --
            -- Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
        local
            l_response: SSIO_EDIT_INSERTION_ORDER_RESPONSE
            l_ad_account_id: STRING_32
            l_ssio_edit_insertion_order_request: SSIO_EDIT_INSERTION_ORDER_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ssio_edit_insertion_order_request

            -- l_response := api.ssio_insertion_order_edit(l_ad_account_id, l_ssio_edit_insertion_order_request)
            assert ("not_implemented", False)
        end

    test_ssio_insertion_orders_status_get_by_ad_account
            -- Get insertion order status by ad account id.
            --
            -- Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
        local
            l_response: SSIO_INSERTION_ORDERS_STATUS_GET_BY_AD_ACCOUNT_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ssio_insertion_orders_status_get_by_ad_account(l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_ssio_insertion_orders_status_get_by_pin_order_id
            -- Get insertion order status by pin order id.
            --
            -- Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
        local
            l_response: SSIO_INSERTION_ORDER_STATUS_RESPONSE
            l_ad_account_id: STRING_32
            l_pin_order_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_pin_order_id

            -- l_response := api.ssio_insertion_orders_status_get_by_pin_order_id(l_ad_account_id, l_pin_order_id)
            assert ("not_implemented", False)
        end

    test_ssio_order_lines_get_by_ad_account
            -- Get Salesforce order lines by ad account id.
            --
            -- Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
        local
            l_response: SSIO_ORDER_LINES_GET_BY_AD_ACCOUNT_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_pin_order_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ssio_order_lines_get_by_ad_account(l_ad_account_id, l_bookmark, l_page_size, l_pin_order_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BILLING_API
            -- Create an object instance of `BILLING_API'.
        once
            create { BILLING_API } Result
        end

end
