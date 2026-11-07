note
    description: "API tests for CATALOGFEEDS_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGFEEDS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_feed_processing_results_list
            -- List feed processing results
            --
            -- Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: FEED_PROCESSING_RESULTS_LIST_200_RESPONSE
            l_feed_id: STRING_32
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.feed_processing_results_list(l_feed_id, l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_feeds_create
            -- Create feed
            --
            -- Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: CATALOGS_FEED
            l_catalogs_feed_create_request_schema: CATALOGS_FEED_CREATE_REQUEST_SCHEMA
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalogs_feed_create_request_schema

            -- l_response := api.feeds_create(l_catalogs_feed_create_request_schema, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_delete
            -- Delete feed
            --
            -- Delete a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
        local
            l_response: CATALOGS_FEED
            l_feed_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.feeds_delete(l_feed_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_get
            -- Get feed
            --
            -- Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
        local
            l_response: CATALOGS_FEED
            l_feed_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.feeds_get(l_feed_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_ingest
            -- Ingest feed items
            --
            -- Ingest items for a given feed owned by the \&quot;operation user_account\&quot;.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: CATALOGS_FEED_INGESTION
            l_feed_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.feeds_ingest(l_feed_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_list
            -- List feeds
            --
            -- Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
        local
            l_response: FEEDS_LIST_200_RESPONSE
            l_catalog_id: STRING_32
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.feeds_list(l_catalog_id, l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_feeds_update
            -- Update feed
            --
            -- Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: CATALOGS_FEED
            l_feed_id: STRING_32
            l_catalogs_feed_update_request_schema: CATALOGS_FEED_UPDATE_REQUEST_SCHEMA
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id
            -- l_catalogs_feed_update_request_schema

            -- l_response := api.feeds_update(l_feed_id, l_catalogs_feed_update_request_schema, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_items_issues_list
            -- List item issues
            --
            -- List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: ITEMS_ISSUES_LIST_200_RESPONSE
            l_processing_result_id: STRING_32
            l_item_numbers: LIST [INTEGER_32]
            l_item_validation_issue: CATALOGS_ITEM_VALIDATION_ISSUE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_processing_result_id

            -- l_response := api.items_issues_list(l_processing_result_id, l_item_numbers, l_item_validation_issue, l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGFEEDS_API
            -- Create an object instance of `CATALOGFEEDS_API'.
        once
            create { CATALOGFEEDS_API } Result
        end

end
