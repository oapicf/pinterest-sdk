note
    description: "API tests for CATALOGS_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_catalogs_list
            -- List catalogs
            --
            -- Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_LIST_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.catalogs_list(l_bookmark, l_page_size, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_group_pins_list
            -- List products for a Product Group
            --
            -- Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE
            l_product_group_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- l_response := api.catalogs_product_group_pins_list(l_product_group_id, l_bookmark, l_page_size, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_create
            -- Create product group
            --
            -- Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE
            l_catalogs_product_groups_create_request: CATALOGS_PRODUCT_GROUPS_CREATE_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalogs_product_groups_create_request

            -- l_response := api.catalogs_product_groups_create(l_catalogs_product_groups_create_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_delete
            -- Delete product group
            --
            -- Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_product_group_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- api.catalogs_product_groups_delete(l_product_group_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_get
            -- Get product group
            --
            -- Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE
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
            -- Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_PRODUCT_GROUPS_LIST_200_RESPONSE
            l_feed_id: STRING_32
            l_catalog_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.catalogs_product_groups_list(l_feed_id, l_catalog_id, l_bookmark, l_page_size, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_product_counts_get
            -- Get product counts for a Product Group
            --
            -- Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_PRODUCT_GROUP_PRODUCT_COUNTS
            l_product_group_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id

            -- l_response := api.catalogs_product_groups_product_counts_get(l_product_group_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_product_groups_update
            -- Update product group
            --
            -- Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE
            l_product_group_id: STRING_32
            l_catalogs_product_groups_update_request: CATALOGS_PRODUCT_GROUPS_UPDATE_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product_group_id
            -- l_catalogs_product_groups_update_request

            -- l_response := api.catalogs_product_groups_update(l_product_group_id, l_catalogs_product_groups_update_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feed_processing_results_list
            -- List processing results for a given feed
            --
            -- Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: FEED_PROCESSING_RESULTS_LIST_200_RESPONSE
            l_feed_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- l_response := api.feed_processing_results_list(l_feed_id, l_bookmark, l_page_size, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_create
            -- Create feed
            --
            -- Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
        local
            l_response: CATALOGS_FEED
            l_feeds_create_request: FEEDS_CREATE_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feeds_create_request

            -- l_response := api.feeds_create(l_feeds_create_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_delete
            -- Delete feed
            --
            -- Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
        local
            l_feed_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id

            -- api.feeds_delete(l_feed_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_get
            -- Get feed
            --
            -- Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
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

    test_feeds_list
            -- List feeds
            --
            -- Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
        local
            l_response: FEEDS_LIST_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_catalog_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.feeds_list(l_bookmark, l_page_size, l_catalog_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_feeds_update
            -- Update feed
            --
            -- Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
        local
            l_response: CATALOGS_FEED
            l_feed_id: STRING_32
            l_feeds_update_request: FEEDS_UPDATE_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_feed_id
            -- l_feeds_update_request

            -- l_response := api.feeds_update(l_feed_id, l_feeds_update_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_items_batch_get
            -- Get catalogs item batch status
            --
            -- Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
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
            -- This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
        local
            l_response: CATALOGS_ITEMS_BATCH
            l_items_batch_post_request: ITEMS_BATCH_POST_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_items_batch_post_request

            -- l_response := api.items_batch_post(l_items_batch_post_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_items_get
            -- Get catalogs items
            --
            -- Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
        local
            l_response: CATALOGS_ITEMS
            l_country: STRING_32
            l_language: STRING_32
            l_ad_account_id: STRING_32
            l_item_ids: LIST [STRING_32]
            l_filters: CATALOGS_ITEMS_FILTERS
        do
            -- TODO: Initialize required params.
            -- l_country
            -- l_language

            -- l_response := api.items_get(l_country, l_language, l_ad_account_id, l_item_ids, l_filters)
            assert ("not_implemented", False)
        end

    test_items_issues_list
            -- List item issues for a given processing result
            --
            -- List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: ITEMS_ISSUES_LIST_200_RESPONSE
            l_processing_result_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_item_numbers: LIST [INTEGER_32]
            l_item_validation_issue: CATALOGS_ITEM_VALIDATION_ISSUE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_processing_result_id

            -- l_response := api.items_issues_list(l_processing_result_id, l_bookmark, l_page_size, l_item_numbers, l_item_validation_issue, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_products_by_product_group_filter_list
            -- List filtered products
            --
            -- List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
        local
            l_response: CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE
            l_catalogs_list_products_by_filter_request: CATALOGS_LIST_PRODUCTS_BY_FILTER_REQUEST
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalogs_list_products_by_filter_request

            -- l_response := api.products_by_product_group_filter_list(l_catalogs_list_products_by_filter_request, l_bookmark, l_page_size, l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGS_API
            -- Create an object instance of `CATALOGS_API'.
        once
            create { CATALOGS_API } Result
        end

end
