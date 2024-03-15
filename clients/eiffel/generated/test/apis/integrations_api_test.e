note
    description: "API tests for INTEGRATIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class INTEGRATIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_integrations_commerce_del
            -- Delete commerce integration
            --
            -- Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_external_business_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_external_business_id

            -- api.integrations_commerce_del(l_external_business_id)
            assert ("not_implemented", False)
        end

    test_integrations_commerce_get
            -- Get commerce integration
            --
            -- Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: INTEGRATION_METADATA
            l_external_business_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_external_business_id

            -- l_response := api.integrations_commerce_get(l_external_business_id)
            assert ("not_implemented", False)
        end

    test_integrations_commerce_patch
            -- Update commerce integration
            --
            -- Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: INTEGRATION_METADATA
            l_external_business_id: STRING_32
            l_integration_request_patch: INTEGRATION_REQUEST_PATCH
        do
            -- TODO: Initialize required params.
            -- l_external_business_id

            -- l_response := api.integrations_commerce_patch(l_external_business_id, l_integration_request_patch)
            assert ("not_implemented", False)
        end

    test_integrations_commerce_post
            -- Create commerce integration
            --
            -- Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: INTEGRATION_METADATA
            l_integration_request: INTEGRATION_REQUEST
        do
            -- TODO: Initialize required params.

            -- l_response := api.integrations_commerce_post(l_integration_request)
            assert ("not_implemented", False)
        end

    test_integrations_get_by_id
            -- Get integration metadata
            --
            -- Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: INTEGRATION_RECORD
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.integrations_get_by_id(l_id)
            assert ("not_implemented", False)
        end

    test_integrations_get_list
            -- Get integration metadata list
            --
            -- Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: INTEGRATIONS_GET_LIST_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.integrations_get_list(l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_integrations_logs_post
            -- Receives batched logs from integration applications.
            --
            -- This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
        local
            l_response: INTEGRATION_LOGS_SUCCESS_RESPONSE
            l_integration_logs_request: INTEGRATION_LOGS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_integration_logs_request

            -- l_response := api.integrations_logs_post(l_integration_logs_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: INTEGRATIONS_API
            -- Create an object instance of `INTEGRATIONS_API'.
        once
            create { INTEGRATIONS_API } Result
        end

end
