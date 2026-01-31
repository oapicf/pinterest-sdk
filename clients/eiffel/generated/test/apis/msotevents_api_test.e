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
            -- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.
        local
            l_ad_account_id: STRING_32
            l_conversion_msot_events: CONVERSION_MSOT_EVENTS
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_conversion_msot_events

            -- api.msot_events_create(l_ad_account_id, l_conversion_msot_events)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MSOTEVENTS_API
            -- Create an object instance of `MSOTEVENTS_API'.
        once
            create { MSOTEVENTS_API } Result
        end

end
