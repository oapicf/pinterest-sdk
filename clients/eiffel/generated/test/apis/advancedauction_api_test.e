note
    description: "API tests for ADVANCEDAUCTION_API"
    date: "$Date$"
    revision: "$Revision$"


class ADVANCEDAUCTION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_advanced_auction_items_get_post
            -- Get item bid options (POST)
            --
            -- Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
        local
            l_response: ADVANCED_AUCTION_ITEMS
            l_advanced_auction_items_get_request: ADVANCED_AUCTION_ITEMS_GET_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_advanced_auction_items_get_request

            -- l_response := api.advanced_auction_items_get_post(l_advanced_auction_items_get_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_advanced_auction_items_submit_post
            -- Operate on item level bid options
            --
            -- This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
        local
            l_response: ADVANCED_AUCTION_PROCESSED_ITEMS
            l_advanced_auction_items_submit_request: ADVANCED_AUCTION_ITEMS_SUBMIT_REQUEST
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_advanced_auction_items_submit_request

            -- l_response := api.advanced_auction_items_submit_post(l_advanced_auction_items_submit_request, l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ADVANCEDAUCTION_API
            -- Create an object instance of `ADVANCEDAUCTION_API'.
        once
            create { ADVANCEDAUCTION_API } Result
        end

end
