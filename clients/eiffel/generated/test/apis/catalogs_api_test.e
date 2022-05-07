note
    description: "API tests for CATALOGS_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_catalogs_product_groups_create
            -- Create product group
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
        local
            l_response: ANY
            l_catalogs_product_group_create_request: CATALOGS_PRODUCT_GROUP_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_catalogs_product_group_create_request

            -- l_response := api.catalogs_product_groups_create(l_catalogs_product_group_create_request)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_delete
            -- Delete product group
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
        local
            l_product_group_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- api.catalogs_product_groups_delete(l_product_group_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_list
            -- Get product groups list
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
        local
            l_response: PAGINATED
            l_feed_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.catalogs_product_groups_list(l_feed_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_update
            -- Update product group
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
        local
            l_response: CATALOGS_PRODUCT_GROUP
            l_product_group_id: STRING_32
            l_catalogs_product_group_update_request: CATALOGS_PRODUCT_GROUP_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_product_group_id
            -- l_catalogs_product_group_update_request

            -- l_response := api.catalogs_product_groups_update(l_product_group_id, l_catalogs_product_group_update_request)
            assert ("not_implemented", False)
        end

    test_feed_processing_results_list
            -- List processing results for a given feed
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
        local
            l_response: PAGINATED
            l_feed_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.feed_processing_results_list(l_feed_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_feeds_create
            -- Create feed
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
        local
            l_response: CATALOGS_FEED
            l_catalogs_feeds_create_request: CATALOGS_FEEDS_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_catalogs_feeds_create_request

            -- l_response := api.feeds_create(l_catalogs_feeds_create_request)
            assert ("not_implemented", False)
        end

    test_feeds_delete
            -- Delete feed
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
        local
            l_feed_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- api.feeds_delete(l_feed_id)
            assert ("not_implemented", False)
        end

    test_feeds_get
            -- Get feed
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
        local
            l_response: CATALOGS_FEED
            l_feed_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.feeds_get(l_feed_id)
            assert ("not_implemented", False)
        end

    test_feeds_list
            -- List feeds
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
        local
            l_response: PAGINATED
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.feeds_list(l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_feeds_update
            -- Update feed
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
        local
            l_response: CATALOGS_FEED
            l_feed_id: STRING_32
            l_catalogs_feeds_update_request: CATALOGS_FEEDS_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_feed_id
            -- l_catalogs_feeds_update_request

            -- l_response := api.feeds_update(l_feed_id, l_catalogs_feeds_update_request)
            assert ("not_implemented", False)
        end

    test_items_batch_get
            -- Get catalogs items batch
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
        local
            l_response: CATALOGS_ITEMS_BATCH
            l_batch_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_batch_id

            -- l_response := api.items_batch_get(l_batch_id)
            assert ("not_implemented", False)
        end

    test_items_batch_post
            -- Perform an operation on an item batch
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
        local
            l_response: CATALOGS_ITEMS_BATCH
            l_catalogs_items_batch_request: CATALOGS_ITEMS_BATCH_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_catalogs_items_batch_request

            -- l_response := api.items_batch_post(l_catalogs_items_batch_request)
            assert ("not_implemented", False)
        end

    test_items_get
            -- Get catalogs items
            --
            -- Get the items of the catalog created by the \&quot;operating user_account\&quot;
        local
            l_response: CATALOGS_ITEMS
            l_country: STRING_32
            l_item_ids: LIST [STRING_32]
            l_language: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_country
            -- create {ARRAYED_LIST [STRING_32]} l_item_ids.make (2)
            -- l_language

            -- l_response := api.items_get(l_country, l_item_ids, l_language)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGS_API
            -- Create an object instance of `CATALOGS_API'.
        once
            create { CATALOGS_API } Result
        end

end
