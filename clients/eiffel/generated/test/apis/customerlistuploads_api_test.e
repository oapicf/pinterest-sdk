note
    description: "API tests for CUSTOMERLISTUPLOADS_API"
    date: "$Date$"
    revision: "$Revision$"


class CUSTOMERLISTUPLOADS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_customer_list_uploads_create
            -- Create customer list upload
            --
            -- Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
        local
            l_response: CUSTOMER_LIST_UPLOAD_CREATE_RESPONSE
            l_ad_account_id: STRING_32
            l_customer_list_id: STRING_32
            l_customer_list_upload_create_request: CUSTOMER_LIST_UPLOAD_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_id
            -- l_customer_list_upload_create_request

            -- l_response := api.customer_list_uploads_create(l_ad_account_id, l_customer_list_id, l_customer_list_upload_create_request)
            assert ("not_implemented", False)
        end

    test_customer_list_uploads_get
            -- Get customer list upload
            --
            -- Get the metadata for a given upload by its ID.
        local
            l_response: CUSTOMER_LIST_UPLOAD
            l_ad_account_id: STRING_32
            l_customer_list_id: STRING_32
            l_customer_list_upload_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_id
            -- l_customer_list_upload_id

            -- l_response := api.customer_list_uploads_get(l_ad_account_id, l_customer_list_id, l_customer_list_upload_id)
            assert ("not_implemented", False)
        end

    test_customer_list_uploads_run
            -- Run customer list upload
            --
            -- Begin processing a customer list upload.
        local
            l_response: CUSTOMER_LIST_UPLOAD
            l_ad_account_id: STRING_32
            l_customer_list_id: STRING_32
            l_customer_list_upload_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_id
            -- l_customer_list_upload_id

            -- l_response := api.customer_list_uploads_run(l_ad_account_id, l_customer_list_id, l_customer_list_upload_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CUSTOMERLISTUPLOADS_API
            -- Create an object instance of `CUSTOMERLISTUPLOADS_API'.
        once
            create { CUSTOMERLISTUPLOADS_API } Result
        end

end
