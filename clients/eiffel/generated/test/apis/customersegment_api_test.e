note
    description: "API tests for CUSTOMERSEGMENT_API"
    date: "$Date$"
    revision: "$Revision$"


class CUSTOMERSEGMENT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_customer_segment_create
            -- Create customer segments
            --
            -- Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
        local
            l_response: CUSTOMER_SEGMENT
            l_ad_account_id: STRING_32
            l_customer_segment_create: CUSTOMER_SEGMENT_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_segment_create

            -- l_response := api.customer_segment_create(l_ad_account_id, l_customer_segment_create)
            assert ("not_implemented", False)
        end

    test_customer_segment_list
            -- List customer segments
            --
            -- Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
        local
            l_response: CUSTOMER_SEGMENT_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_include_sizing: BOOLEAN
            l_search_query: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.customer_segment_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_include_sizing, l_search_query)
            assert ("not_implemented", False)
        end

    test_customer_segment_update
            -- Update customer segments
            --
            -- Update the customer segment given advertiser ID and customer segment ID
        local
            l_ad_account_id: STRING_32
            l_customer_segment_update_request_update_with_required_body: CUSTOMER_SEGMENT_UPDATE_REQUEST_UPDATE_WITH_REQUIRED_BODY
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_segment_update_request_update_with_required_body

            -- api.customer_segment_update(l_ad_account_id, l_customer_segment_update_request_update_with_required_body)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CUSTOMERSEGMENT_API
            -- Create an object instance of `CUSTOMERSEGMENT_API'.
        once
            create { CUSTOMERSEGMENT_API } Result
        end

end
