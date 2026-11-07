note
    description: "API tests for MSOTEVENTS_API"
    date: "$Date$"
    revision: "$Revision$"


class MSOTEVENTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_msot_events_create
            -- Send Measurement Source Of Truth (MSOT) attributed conversion events
            --
            -- **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
        local
            l_ad_account_id: STRING_32
            l_conversion_msot_events_create: CONVERSION_MSOT_EVENTS_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_conversion_msot_events_create

            -- api.msot_events_create(l_ad_account_id, l_conversion_msot_events_create)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MSOTEVENTS_API
            -- Create an object instance of `MSOTEVENTS_API'.
        once
            create { MSOTEVENTS_API } Result
        end

end
