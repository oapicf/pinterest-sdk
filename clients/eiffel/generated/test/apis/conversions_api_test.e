note
    description: "API tests for CONVERSIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class CONVERSIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_advertiser_defined_events_create
            -- Create advertiser defined events
            --
            -- Map advertiser defined events to standard events for the given ad account.
        local
            l_response: ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE
            l_ad_account_id: STRING_32
            l_advertiser_defined_events_create_request: ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_advertiser_defined_events_create_request

            -- l_response := api.advertiser_defined_events_create(l_ad_account_id, l_advertiser_defined_events_create_request)
            assert ("not_implemented", False)
        end

    test_advertiser_defined_events_delete
            -- Delete advertiser defined events
            --
            -- Untrack advertiser defined events for the given ad account.
        local
            l_response: ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE
            l_ad_account_id: STRING_32
            l_event_names: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [STRING_32]} l_event_names.make (2)

            -- l_response := api.advertiser_defined_events_delete(l_ad_account_id, l_event_names)
            assert ("not_implemented", False)
        end

    test_advertiser_defined_events_get
            -- Get advertiser defined events
            --
            -- Get advertiser defined events for the given ad account.
        local
            l_response: ADVERTISER_DEFINED_EVENTS_GET_200_RESPONSE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.advertiser_defined_events_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_advertiser_defined_events_update
            -- Update advertiser defined events
            --
            -- Update advertiser defined event names or mappings for the given ad account.
        local
            l_response: ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE
            l_ad_account_id: STRING_32
            l_advertiser_defined_events_create_request: ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_advertiser_defined_events_create_request

            -- l_response := api.advertiser_defined_events_update(l_ad_account_id, l_advertiser_defined_events_create_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONVERSIONS_API
            -- Create an object instance of `CONVERSIONS_API'.
        once
            create { CONVERSIONS_API } Result
        end

end
