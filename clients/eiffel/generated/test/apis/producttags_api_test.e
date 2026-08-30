note
    description: "API tests for PRODUCTTAGS_API"
    date: "$Date$"
    revision: "$Revision$"


class PRODUCTTAGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_product_tags_bulk_add
            -- Add product tags to pin
            --
            -- Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
        local
            l_response: PRODUCT_TAGS_RESPONSE
            l_pin_id: STRING_32
            l_product_tags_bulk_add_request: PRODUCT_TAGS_BULK_ADD_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_pin_id
            -- l_product_tags_bulk_add_request

            -- l_response := api.product_tags_bulk_add(l_pin_id, l_product_tags_bulk_add_request)
            assert ("not_implemented", False)
        end

    test_product_tags_bulk_delete
            -- Delete product tags from pin
            --
            -- Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
        local
            l_pin_id: STRING_32
            l_product_tags_bulk_delete_request: PRODUCT_TAGS_BULK_DELETE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_pin_id
            -- l_product_tags_bulk_delete_request

            -- api.product_tags_bulk_delete(l_pin_id, l_product_tags_bulk_delete_request)
            assert ("not_implemented", False)
        end

    test_product_tags_list
            -- Get product tags for pin
            --
            -- Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
        local
            l_response: PRODUCT_TAGS_RESPONSE
            l_pin_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_pin_id

            -- l_response := api.product_tags_list(l_pin_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRODUCTTAGS_API
            -- Create an object instance of `PRODUCTTAGS_API'.
        once
            create { PRODUCTTAGS_API } Result
        end

end
