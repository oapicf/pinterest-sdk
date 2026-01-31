note
    description: "API tests for CONVERSIONTAGS_API"
    date: "$Date$"
    revision: "$Revision$"


class CONVERSIONTAGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_conversion_tags_create
            -- Create conversion tag
            --
            -- Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
        local
            l_response: CONVERSION_TAG
            l_ad_account_id: STRING_32
            l_conversion_tag_create: CONVERSION_TAG_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_conversion_tag_create

            -- l_response := api.conversion_tags_create(l_ad_account_id, l_conversion_tag_create)
            assert ("not_implemented", False)
        end

    test_conversion_tags_get
            -- Get conversion tag
            --
            -- Get information about an existing conversion tag.
        local
            l_response: CONVERSION_TAG
            l_ad_account_id: STRING_32
            l_conversion_tag_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_conversion_tag_id

            -- l_response := api.conversion_tags_get(l_ad_account_id, l_conversion_tag_id)
            assert ("not_implemented", False)
        end

    test_conversion_tags_list
            -- List conversion tags
            --
            -- List conversion tags associated with an ad account.
        local
            l_response: CONVERSION_TAGS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_filter_deleted: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.conversion_tags_list(l_ad_account_id, l_filter_deleted)
            assert ("not_implemented", False)
        end

    test_ocpm_eligible_conversion_tags_get
            -- Get Ocpm eligible conversion tags
            --
            -- Get Ocpm eligible conversion tag events for an ad account.
        local
            l_response: STRING_TABLE [LIST [CONVERSION_EVENT_RESPONSE]]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ocpm_eligible_conversion_tags_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_page_visit_conversion_tags_get
            -- Get page visit conversion tags
            --
            -- Get all page visit conversion tag events for an ad account.
        local
            l_response: PAGE_VISIT_CONVERSION_TAGS_GET_200_RESPONSE
            l_ad_account_id: STRING_32
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.page_visit_conversion_tags_get(l_ad_account_id, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONVERSIONTAGS_API
            -- Create an object instance of `CONVERSIONTAGS_API'.
        once
            create { CONVERSIONTAGS_API } Result
        end

end
