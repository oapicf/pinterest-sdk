note
    description: "API tests for TARGETINGTEMPLATE_API"
    date: "$Date$"
    revision: "$Revision$"


class TARGETINGTEMPLATE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_targeting_template_create
            -- Create targeting templates
            --
            -- Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
        local
            l_response: TARGETING_TEMPLATE
            l_ad_account_id: STRING_32
            l_targeting_template_create: TARGETING_TEMPLATE_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_targeting_template_create

            -- l_response := api.targeting_template_create(l_ad_account_id, l_targeting_template_create)
            assert ("not_implemented", False)
        end

    test_targeting_template_list
            -- List targeting templates
            --
            -- Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
        local
            l_response: TARGETING_TEMPLATE_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_include_sizing: BOOLEAN
            l_search_query: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.targeting_template_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_include_sizing, l_search_query)
            assert ("not_implemented", False)
        end

    test_targeting_template_update
            -- Update targeting templates
            --
            -- Update the targeting template given advertiser ID and targeting template ID
        local
            l_ad_account_id: STRING_32
            l_targeting_template_update_request_read_or_update: TARGETING_TEMPLATE_UPDATE_REQUEST_READ_OR_UPDATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_targeting_template_update_request_read_or_update

            -- api.targeting_template_update(l_ad_account_id, l_targeting_template_update_request_read_or_update)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: TARGETINGTEMPLATE_API
            -- Create an object instance of `TARGETINGTEMPLATE_API'.
        once
            create { TARGETINGTEMPLATE_API } Result
        end

end
