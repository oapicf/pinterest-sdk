note
    description: "API tests for PRODUCTGROUPS_API"
    date: "$Date$"
    revision: "$Revision$"


class PRODUCTGROUPS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_accounts_catalogs_product_groups_list
            -- Get catalog product groups
            --
            -- This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
        local
            l_response: AD_ACCOUNTS_CATALOGS_PRODUCT_GROUPS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_feed_profile_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.ad_accounts_catalogs_product_groups_list(l_ad_account_id, l_feed_profile_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRODUCTGROUPS_API
            -- Create an object instance of `PRODUCTGROUPS_API'.
        once
            create { PRODUCTGROUPS_API } Result
        end

end
