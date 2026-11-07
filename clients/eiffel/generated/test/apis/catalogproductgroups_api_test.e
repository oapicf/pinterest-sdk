note
    description: "API tests for CATALOGPRODUCTGROUPS_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGPRODUCTGROUPS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_catalogs_product_group_pins_list
            -- List products by product group
            --
            -- Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE
            l_product_group_id: STRING_32
            l_ad_account_id: STRING_32
            l_pin_metrics: BOOLEAN
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- l_response := api.catalogs_product_group_pins_list(l_product_group_id, l_ad_account_id, l_pin_metrics, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_create
            -- Create product group
            --
            -- Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: CATALOGS_VERTICAL_PRODUCT_GROUP
            l_catalogs_product_groups_create_request_schema: CATALOGS_PRODUCT_GROUPS_CREATE_REQUEST_SCHEMA
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalogs_product_groups_create_request_schema

            -- l_response := api.catalogs_product_groups_create(l_catalogs_product_groups_create_request_schema, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_create_many
            -- Create product groups
            --
            -- Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: LIST [STRING_32]
            l_catalogs_product_groups_create_many_request_items: LIST [CATALOGS_PRODUCT_GROUPS_CREATE_MANY_REQUEST_ITEMS]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [CATALOGS_PRODUCT_GROUPS_CREATE_MANY_REQUEST_ITEMS]} l_catalogs_product_groups_create_many_request_items.make (2)

            -- l_response := api.catalogs_product_groups_create_many(l_catalogs_product_groups_create_many_request_items, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_delete
            -- Delete product group
            --
            -- Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_VERTICAL_PRODUCT_GROUP
            l_product_group_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- l_response := api.catalogs_product_groups_delete(l_product_group_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_delete_many
            -- Delete product groups
            --
            -- Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_id: LIST [INTEGER_32]
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [INTEGER_32]} l_id.make (2)

            -- api.catalogs_product_groups_delete_many(l_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_get
            -- Get product group
            --
            -- Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_VERTICAL_PRODUCT_GROUP
            l_product_group_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- l_response := api.catalogs_product_groups_get(l_product_group_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_list
            -- List product groups
            --
            -- Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_PRODUCT_GROUPS_LIST_200_RESPONSE
            l_id: LIST [INTEGER_32]
            l_feed_id: STRING_32
            l_catalog_id: STRING_32
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.catalogs_product_groups_list(l_id, l_feed_id, l_catalog_id, l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_product_counts_get
            -- Get product counts
            --
            -- Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_PRODUCT_GROUP_PRODUCT_COUNTS_VERTICAL
            l_product_group_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- l_response := api.catalogs_product_groups_product_counts_get(l_product_group_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_update
            -- Update single product group
            --
            -- Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: CATALOGS_VERTICAL_PRODUCT_GROUP
            l_product_group_id: STRING_32
            l_catalogs_product_groups_update_request_schema: CATALOGS_PRODUCT_GROUPS_UPDATE_REQUEST_SCHEMA
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id
            -- l_catalogs_product_groups_update_request_schema

            -- l_response := api.catalogs_product_groups_update(l_product_group_id, l_catalogs_product_groups_update_request_schema, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_products_by_product_group_filter_list
            -- List products by filter
            --
            -- List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE
            l_catalogs_list_products_by_filter_request: CATALOGS_LIST_PRODUCTS_BY_FILTER_REQUEST
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_ad_account_id: STRING_32
            l_pin_metrics: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_catalogs_list_products_by_filter_request

            -- l_response := api.products_by_product_group_filter_list(l_catalogs_list_products_by_filter_request, l_bookmark, l_page_size, l_ad_account_id, l_pin_metrics)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGPRODUCTGROUPS_API
            -- Create an object instance of `CATALOGPRODUCTGROUPS_API'.
        once
            create { CATALOGPRODUCTGROUPS_API } Result
        end

end
