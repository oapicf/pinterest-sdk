note
    description: "API tests for CATALOGS_API"
    date: "$Date$"
    revision: "$Revision$"


class CATALOGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_catalogs_available_filter_values
            -- List available filter values
            --
            -- Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &#x60;country&#x60;, &#x60;language&#x60;, and &#x60;feed_id&#x60; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_AVAILABLE_FILTER_VALUES
            l_catalog_id: STRING_32
            l_feed_id: STRING_32
            l_country: COUNTRY
            l_language: CATALOGS_LOCALE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_id

            -- l_response := api.catalogs_available_filter_values(l_catalog_id, l_feed_id, l_country, l_language, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_create
            -- Create catalog
            --
            -- Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
        local
            l_response: CATALOG
            l_catalog_create: CATALOG_CREATE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_catalog_create

            -- l_response := api.catalogs_create(l_catalog_create, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_catalogs_list
            -- List catalogs
            --
            -- Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
        local
            l_response: CATALOGS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.catalogs_list(l_ad_account_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CATALOGS_API
            -- Create an object instance of `CATALOGS_API'.
        once
            create { CATALOGS_API } Result
        end

end
