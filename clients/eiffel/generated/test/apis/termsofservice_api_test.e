note
    description: "API tests for TERMSOFSERVICE_API"
    date: "$Date$"
    revision: "$Revision$"


class TERMSOFSERVICE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_terms_of_service_get
            -- Get terms of service
            --
            -- Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
        local
            l_response: TERMS_OF_SERVICE
            l_ad_account_id: STRING_32
            l_include_html: BOOLEAN
            l_tos_type: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.terms_of_service_get(l_ad_account_id, l_include_html, l_tos_type)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: TERMSOFSERVICE_API
            -- Create an object instance of `TERMSOFSERVICE_API'.
        once
            create { TERMSOFSERVICE_API } Result
        end

end
