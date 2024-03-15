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
            -- Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
        local
            l_response: AUDIENCE
            l_ad_account_id: STRING_32
            l_audience_create_request: AUDIENCE_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_audience_create_request

            -- l_response := api.audiences_create(l_ad_account_id, l_audience_create_request)
            assert ("not_implemented", False)
        end

    test_audiences_create_custom
            -- Create custom audience
            --
            -- Create a custom audience and find the audiences you want your ads to reach.
        local
            l_response: AUDIENCE
            l_ad_account_id: STRING_32
            l_audience_create_custom_request: AUDIENCE_CREATE_CUSTOM_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_audience_create_custom_request

            -- l_response := api.audiences_create_custom(l_ad_account_id, l_audience_create_custom_request)
            assert ("not_implemented", False)
        end

    test_audiences_get
            -- Get audience
            --
            -- Get a specific audience given the audience ID.
        local
            l_response: AUDIENCE
            l_ad_account_id: STRING_32
            l_audience_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_audience_id

            -- l_response := api.audiences_get(l_ad_account_id, l_audience_id)
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
            l_order: STRING_32
            l_page_size: INTEGER_32
            l_ownership_type: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.audiences_list(l_ad_account_id, l_bookmark, l_order, l_page_size, l_ownership_type)
            assert ("not_implemented", False)
        end

    test_audiences_update
            -- Update audience
            --
            -- Update (edit or remove) an existing targeting audience.
        local
            l_response: AUDIENCE
            l_ad_account_id: STRING_32
            l_audience_id: STRING_32
            l_audience_update_request: AUDIENCE_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_audience_id

            -- l_response := api.audiences_update(l_ad_account_id, l_audience_id, l_audience_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: AUDIENCES_API
            -- Create an object instance of `AUDIENCES_API'.
        once
            create { AUDIENCES_API } Result
        end

end
