note
    description: "API tests for AUDIENCES_API"
    date: "$Date$"
    revision: "$Revision$"


class AUDIENCES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_audiences_create
            -- Create audience
            --
            -- Create a new audience for the ad account.
        local
            l_response: AD_ACCOUNTS_AUDIENCE
            l_ad_account_id: STRING_32
            l_ad_accounts_audience_create: AD_ACCOUNTS_AUDIENCE_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_ad_accounts_audience_create

            -- l_response := api.audiences_create(l_ad_account_id, l_ad_accounts_audience_create)
            assert ("not_implemented", False)
        end

    test_audiences_get
            -- Get audience
            --
            -- Get a specific audience given the audience ID.
        local
            l_response: AD_ACCOUNTS_AUDIENCE
            l_audience_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_audience_id
            -- l_ad_account_id

            -- l_response := api.audiences_get(l_audience_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_audiences_list
            -- List audiences
            --
            -- Get list of audiences for the ad account.
        local
            l_response: AUDIENCES_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_ownership_type: AUDIENCE_OWNERSHIP_TYPE
            l_exclude_nca: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.audiences_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_ownership_type, l_exclude_nca)
            assert ("not_implemented", False)
        end

    test_audiences_update
            -- Update audience
            --
            -- Update an existing audience for the ad account.
        local
            l_response: AD_ACCOUNTS_AUDIENCE
            l_audience_id: STRING_32
            l_ad_account_id: STRING_32
            l_ad_accounts_audience_update: AD_ACCOUNTS_AUDIENCE_UPDATE
        do
            -- TODO: Initialize required params.
            -- l_audience_id
            -- l_ad_account_id
            -- l_ad_accounts_audience_update

            -- l_response := api.audiences_update(l_audience_id, l_ad_account_id, l_ad_accounts_audience_update)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: AUDIENCES_API
            -- Create an object instance of `AUDIENCES_API'.
        once
            create { AUDIENCES_API } Result
        end

end
