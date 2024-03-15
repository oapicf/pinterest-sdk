note
    description: "API tests for BULK_API"
    date: "$Date$"
    revision: "$Revision$"


class BULK_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_bulk_download_create
            -- Get advertiser entities in bulk
            --
            -- Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
        local
            l_response: BULK_DOWNLOAD_RESPONSE
            l_ad_account_id: STRING_32
            l_bulk_download_request: BULK_DOWNLOAD_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_bulk_download_request

            -- l_response := api.bulk_download_create(l_ad_account_id, l_bulk_download_request)
            assert ("not_implemented", False)
        end

    test_bulk_request_get
            -- Download advertiser entities in bulk
            --
            -- Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
        local
            l_response: BULK_UPSERT_STATUS_RESPONSE
            l_ad_account_id: STRING_32
            l_bulk_request_id: STRING_32
            l_include_details: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_bulk_request_id

            -- l_response := api.bulk_request_get(l_ad_account_id, l_bulk_request_id, l_include_details)
            assert ("not_implemented", False)
        end

    test_bulk_upsert_create
            -- Create/update ad entities in bulk
            --
            -- Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
        local
            l_response: BULK_UPSERT_RESPONSE
            l_ad_account_id: STRING_32
            l_bulk_upsert_request: BULK_UPSERT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_bulk_upsert_request

            -- l_response := api.bulk_upsert_create(l_ad_account_id, l_bulk_upsert_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BULK_API
            -- Create an object instance of `BULK_API'.
        once
            create { BULK_API } Result
        end

end
