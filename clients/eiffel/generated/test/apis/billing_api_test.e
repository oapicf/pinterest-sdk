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
            -- Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
        local
            l_response: ADS_CREDIT_REDEEM
            l_ad_account_id: STRING_32
            l_ads_credit_redeem_create: ADS_CREDIT_REDEEM_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ads_credit_redeem_create

            -- l_response := api.ads_credit_redeem(l_ad_account_id, l_ads_credit_redeem_create)
            assert ("not_implemented", False)
        end

    test_ads_credits_discounts_get
            -- Get ads credit discounts
            --
            -- Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
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

    test_billing_invoice_download_get
            -- Get download url for a billing invoice
            --
            -- Get download url for a billing invoice.
        local
            l_response: BILLING_INVOICE_DOWNLOAD_RESPONSE
            l_ad_account_id: STRING_32
            l_billing_invoice_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_billing_invoice_id

            -- l_response := api.billing_invoice_download_get(l_ad_account_id, l_billing_invoice_id)
            assert ("not_implemented", False)
        end

    test_billing_invoices_get
            -- Get billing invoices
            --
            -- Get billing invoices in the advertiser account.
        local
            l_response: BILLING_INVOICES_GET_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_sort: BILLING_INVOICE_SORT_FIELD
            l_status: BILLING_INVOICE_STATUS
            l_document_type: BILLING_INVOICE_DOCUMENT_TYPE
            l_start_due_date: DATE
            l_end_due_date: DATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.billing_invoices_get(l_ad_account_id, l_bookmark, l_page_size, l_order, l_sort, l_status, l_document_type, l_start_due_date, l_end_due_date)
            assert ("not_implemented", False)
        end

    test_billing_profiles_get
            -- Get billing profiles
            --
            -- Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
        local
            l_response: BILLING_PROFILES_GET_200_RESPONSE
            l_is_active: BOOLEAN
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_is_active
            -- l_ad_account_id

            -- l_response := api.billing_profiles_get(l_is_active, l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_ssio_accounts_get
            -- Get Salesforce account details including bill-to information.
            --
            --   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
        local
            l_response: SSIO_ACCOUNT
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
            --   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
        local
            l_response: SSIO_INSERTION_ORDER
            l_ad_account_id: STRING_32
            l_ssio_insertion_order_create: SSIO_INSERTION_ORDER_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ssio_insertion_order_create

            -- l_response := api.ssio_insertion_order_create(l_ad_account_id, l_ssio_insertion_order_create)
            assert ("not_implemented", False)
        end

    test_ssio_insertion_order_edit
            -- Edit insertion order through SSIO.
            --
            --   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
        local
            l_response: SSIO_INSERTION_ORDER
            l_ad_account_id: STRING_32
            l_ssio_insertion_order_update: SSIO_INSERTION_ORDER_UPDATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ssio_insertion_order_update

            -- l_response := api.ssio_insertion_order_edit(l_ad_account_id, l_ssio_insertion_order_update)
            assert ("not_implemented", False)
        end

    test_ssio_insertion_orders_status_get_by_ad_account
            -- Get insertion order status by ad account id.
            --
            --   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
            --   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
            --   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
        local
            l_response: SSIO_ORDER_LINES_GET_BY_AD_ACCOUNT_200_RESPONSE
            l_ad_account_id: STRING_32
            l_pin_order_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ssio_order_lines_get_by_ad_account(l_ad_account_id, l_pin_order_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BILLING_API
            -- Create an object instance of `BILLING_API'.
        once
            create { BILLING_API } Result
        end

end
