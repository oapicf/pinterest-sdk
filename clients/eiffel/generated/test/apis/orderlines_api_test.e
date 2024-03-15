note
    description: "API tests for ORDERLINES_API"
    date: "$Date$"
    revision: "$Revision$"


class ORDERLINES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_order_lines_get
            -- Get order line
            --
            -- Get a specific existing order line associated with an ad account.
        local
            l_response: ORDER_LINE
            l_ad_account_id: STRING_32
            l_order_line_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_order_line_id

            -- l_response := api.order_lines_get(l_ad_account_id, l_order_line_id)
            assert ("not_implemented", False)
        end

    test_order_lines_list
            -- Get order lines
            --
            -- List existing order lines associated with an ad account.
        local
            l_response: ORDER_LINES_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.order_lines_list(l_ad_account_id, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ORDERLINES_API
            -- Create an object instance of `ORDERLINES_API'.
        once
            create { ORDERLINES_API } Result
        end

end
