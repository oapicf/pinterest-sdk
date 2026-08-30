require "json"

module OpenAPIClient
  module Api
  class AdvancedAuction
    def initialize(@conn : Connection); end

    # Get item bid options (POST) Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
    def items_get_post(advanced_auction_items_get_request : OpenAPIClient::AdvancedAuctionItemsGetRequest, *, ad_account_id : String? = nil) : Response(OpenAPIClient::AdvancedAuctionItems)
      @conn.request(OpenAPIClient::AdvancedAuctionItems,
        method: :POST,
        path: "/advanced_auction/items/get",
        body: advanced_auction_items_get_request,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Operate on item level bid options This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
    def items_submit_post(advanced_auction_items_submit_request : OpenAPIClient::AdvancedAuctionItemsSubmitRequest, *, ad_account_id : String? = nil) : Response(OpenAPIClient::AdvancedAuctionProcessedItems)
      @conn.request(OpenAPIClient::AdvancedAuctionProcessedItems,
        method: :POST,
        path: "/advanced_auction/items/submit",
        body: advanced_auction_items_submit_request,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
