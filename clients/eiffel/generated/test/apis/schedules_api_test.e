note
    description: "API tests for SCHEDULES_API"
    date: "$Date$"
    revision: "$Revision$"


class SCHEDULES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_schedules_create
            -- Create schedules
            --
            -- Batch create schedules
        local
            l_response: LIST [SCHEDULES_CREATE_200_RESPONSE_INNER]
            l_ad_account_id: STRING_32
            l_schedule_create: LIST [SCHEDULE_CREATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [SCHEDULE_CREATE]} l_schedule_create.make (2)

            -- l_response := api.schedules_create(l_ad_account_id, l_schedule_create)
            assert ("not_implemented", False)
        end

    test_schedules_list
            -- Get Schedules
            --
            -- Get schedules for a specific advertiser
        local
            l_response: SCHEDULES_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_entity_ids: LIST [STRING_32]
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_schedule_statuses: LIST [SCHEDULE_STATUS]
            l_schedule_type: SCHEDULE_TYPE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [STRING_32]} l_entity_ids.make (2)

            -- l_response := api.schedules_list(l_ad_account_id, l_entity_ids, l_bookmark, l_page_size, l_order, l_schedule_statuses, l_schedule_type)
            assert ("not_implemented", False)
        end

    test_schedules_update
            -- Update schedules
            --
            -- Update one or more schedules
        local
            l_response: LIST [SCHEDULES_CREATE_200_RESPONSE_INNER]
            l_ad_account_id: STRING_32
            l_schedule_batch_update: LIST [SCHEDULE_BATCH_UPDATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [SCHEDULE_BATCH_UPDATE]} l_schedule_batch_update.make (2)

            -- l_response := api.schedules_update(l_ad_account_id, l_schedule_batch_update)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SCHEDULES_API
            -- Create an object instance of `SCHEDULES_API'.
        once
            create { SCHEDULES_API } Result
        end

end
