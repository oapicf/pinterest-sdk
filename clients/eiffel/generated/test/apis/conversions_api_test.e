note
    description: "API tests for CONVERSIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class CONVERSIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_advertiser_defined_events_get
            -- Get advertiser defined events
            --
            -- &lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;
        local
            l_response: ADVERTISER_DEFINED_EVENTS_RESPONSE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.advertiser_defined_events_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONVERSIONS_API
            -- Create an object instance of `CONVERSIONS_API'.
        once
            create { CONVERSIONS_API } Result
        end

end
