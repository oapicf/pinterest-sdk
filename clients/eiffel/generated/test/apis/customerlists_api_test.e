note
    description: "API tests for CUSTOMERLISTS_API"
    date: "$Date$"
    revision: "$Revision$"


class CUSTOMERLISTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_customer_lists_create
            -- Create customer lists
            --
            -- Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
        local
            l_response: CUSTOMER_LIST
            l_ad_account_id: STRING_32
            l_customer_list_create: CUSTOMER_LIST_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_create

            -- l_response := api.customer_lists_create(l_ad_account_id, l_customer_list_create)
            assert ("not_implemented", False)
        end

    test_customer_lists_get
            -- Get customer list
            --
            -- Gets a specific customer list given the customer list ID.
        local
            l_response: CUSTOMER_LIST
            l_ad_account_id: STRING_32
            l_customer_list_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_id

            -- l_response := api.customer_lists_get(l_ad_account_id, l_customer_list_id)
            assert ("not_implemented", False)
        end

    test_customer_lists_list
            -- Get customer lists
            --
            -- Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
        local
            l_response: CUSTOMER_LISTS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_exclude_nca: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.customer_lists_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_exclude_nca)
            assert ("not_implemented", False)
        end

    test_customer_lists_update
            -- Update customer list
            --
            -- Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
        local
            l_response: CUSTOMER_LIST
            l_ad_account_id: STRING_32
            l_customer_list_id: STRING_32
            l_customer_list_update_with_required_body: CUSTOMER_LIST_UPDATE_WITH_REQUIRED_BODY
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_id
            -- l_customer_list_update_with_required_body

            -- l_response := api.customer_lists_update(l_ad_account_id, l_customer_list_id, l_customer_list_update_with_required_body)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CUSTOMERLISTS_API
            -- Create an object instance of `CUSTOMERLISTS_API'.
        once
            create { CUSTOMERLISTS_API } Result
        end

end
