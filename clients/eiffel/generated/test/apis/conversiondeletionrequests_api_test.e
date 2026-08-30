note
    description: "API tests for CONVERSIONDELETIONREQUESTS_API"
    date: "$Date$"
    revision: "$Revision$"


class CONVERSIONDELETIONREQUESTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_conversion_deletion_request_create
            -- Create a conversion deletion request
            --
            -- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
        local
            l_response: CONVERSION_DELETION_REQUEST
            l_ad_account_id: STRING_32
            l_conversion_deletion_request_create: CONVERSION_DELETION_REQUEST_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_conversion_deletion_request_create

            -- l_response := api.conversion_deletion_request_create(l_ad_account_id, l_conversion_deletion_request_create)
            assert ("not_implemented", False)
        end

    test_conversion_deletion_request_delete
            -- Delete a conversion deletion request
            --
            -- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
        local
            l_response: CONVERSION_DELETION_REQUEST
            l_request_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_request_id
            -- l_ad_account_id

            -- l_response := api.conversion_deletion_request_delete(l_request_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_conversion_deletion_request_get
            -- Get a single conversion deletion request
            --
            -- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
        local
            l_response: CONVERSION_DELETION_REQUEST
            l_request_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_request_id
            -- l_ad_account_id

            -- l_response := api.conversion_deletion_request_get(l_request_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_conversion_deletion_request_list
            -- List conversion deletion requests
            --
            -- **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
        local
            l_response: CONVERSION_DELETION_REQUEST_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.conversion_deletion_request_list(l_ad_account_id, l_bookmark, l_page_size, l_order)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONVERSIONDELETIONREQUESTS_API
            -- Create an object instance of `CONVERSIONDELETIONREQUESTS_API'.
        once
            create { CONVERSIONDELETIONREQUESTS_API } Result
        end

end
