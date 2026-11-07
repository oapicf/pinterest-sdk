note
    description: "API tests for CATALOGITEMS_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGITEMS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_items_batch_get
            -- Get item batch status
            --
            -- Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
        local
            l_response: CATALOGS_ITEMS_BATCH
            l_batch_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_batch_id

            -- l_response := api.items_batch_get(l_batch_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_items_batch_post
            -- Operate on item batch
            --
            -- This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
        local
            l_response: CATALOGS_ITEMS_BATCH
            l_catalogs_items_batch_post_request: CATALOGS_ITEMS_BATCH_POST_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalogs_items_batch_post_request

            -- l_response := api.items_batch_post(l_catalogs_items_batch_post_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_items_post
            -- Get catalogs items (POST)
            --
            -- Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: ITEMS_POST_200_RESPONSE
            l_catalogs_items_request: CATALOGS_ITEMS_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalogs_items_request

            -- l_response := api.items_post(l_catalogs_items_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGITEMS_API
            -- Create an object instance of `CATALOGITEMS_API'.
        once
            create { CATALOGITEMS_API } Result
        end

end
