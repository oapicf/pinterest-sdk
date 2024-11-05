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
            -- &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
        local
            l_response: TARGETING_TEMPLATE_GET_RESPONSE_DATA
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
            -- Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
        local
            l_response: TARGETING_TEMPLATE_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_order: STRING_32
            l_include_sizing: BOOLEAN
            l_search_query: STRING_32
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.targeting_template_list(l_ad_account_id, l_order, l_include_sizing, l_search_query, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_targeting_template_update
            -- Update targeting templates
            --
            -- &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
        local
            l_ad_account_id: STRING_32
            l_targeting_template_update_request: TARGETING_TEMPLATE_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_targeting_template_update_request

            -- api.targeting_template_update(l_ad_account_id, l_targeting_template_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: TARGETINGTEMPLATE_API
            -- Create an object instance of `TARGETINGTEMPLATE_API'.
        once
            create { TARGETINGTEMPLATE_API } Result
        end

end
