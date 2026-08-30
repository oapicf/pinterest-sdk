note
    description: "API tests for CATALOGSUPPLEMENTAL_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGSUPPLEMENTAL_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_catalogs_local_inventory_items_batch_operate
            -- Operate on local inventory item batch
            --
            -- Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: SUPPLEMENTAL_ITEMS_BATCH_RESPONSE
            l_catalog_id: STRING_32
            l_local_inventory_items_batch_create: LOCAL_INVENTORY_ITEMS_BATCH_CREATE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id
            -- l_local_inventory_items_batch_create

            -- l_response := api.catalogs_local_inventory_items_batch_operate(l_catalog_id, l_local_inventory_items_batch_create, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_local_inventory_items_post
            -- Get local inventory items (POST)
            --
            -- Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: LOCAL_INVENTORY_ITEMS_GET
            l_catalog_id: STRING_32
            l_local_inventory_items_get_create: LOCAL_INVENTORY_ITEMS_GET_CREATE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id
            -- l_local_inventory_items_get_create

            -- l_response := api.catalogs_local_inventory_items_post(l_catalog_id, l_local_inventory_items_get_create, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_local_stores_create
            -- Create local stores
            --
            -- Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: LIST [CATALOGS_LOCAL_STORES_CREATE_200_RESPONSE_INNER]
            l_catalog_id: STRING_32
            l_local_store_create: LIST [LOCAL_STORE_CREATE]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id
            -- create {ARRAYED_LIST [LOCAL_STORE_CREATE]} l_local_store_create.make (2)

            -- l_response := api.catalogs_local_stores_create(l_catalog_id, l_local_store_create, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_local_stores_delete
            -- Delete local stores
            --
            --   Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: LIST [CATALOGS_LOCAL_STORES_DELETE_200_RESPONSE_INNER]
            l_catalog_id: STRING_32
            l_ids: LIST [STRING_32]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id
            -- create {ARRAYED_LIST [STRING_32]} l_ids.make (2)

            -- l_response := api.catalogs_local_stores_delete(l_catalog_id, l_ids, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_local_stores_list
            -- List local stores
            --
            -- Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_LOCAL_STORES_LIST_200_RESPONSE
            l_catalog_id: STRING_32
            l_ids: LIST [STRING_32]
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id

            -- l_response := api.catalogs_local_stores_list(l_catalog_id, l_ids, l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_catalogs_local_stores_update
            -- Update local stores
            --
            --   Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: LIST [CATALOGS_LOCAL_STORES_CREATE_200_RESPONSE_INNER]
            l_catalog_id: STRING_32
            l_local_store_batch_update: LIST [LOCAL_STORE_BATCH_UPDATE]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id
            -- create {ARRAYED_LIST [LOCAL_STORE_BATCH_UPDATE]} l_local_store_batch_update.make (2)

            -- l_response := api.catalogs_local_stores_update(l_catalog_id, l_local_store_batch_update, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_supplemental_items_batch_get
            -- Get supplemental items batch status
            --
            -- Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: SUPPLEMENTAL_ITEMS_BATCH_RESPONSE
            l_catalog_id: STRING_32
            l_batch_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id
            -- l_batch_id

            -- l_response := api.catalogs_supplemental_items_batch_get(l_catalog_id, l_batch_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGSUPPLEMENTAL_API
            -- Create an object instance of `CATALOGSUPPLEMENTAL_API'.
        once
            create { CATALOGSUPPLEMENTAL_API } Result
        end

end
