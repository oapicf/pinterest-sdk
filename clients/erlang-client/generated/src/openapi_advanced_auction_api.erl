-module(openapi_advanced_auction_api).

-export([advanced_auction_items_get/post/2, advanced_auction_items_get/post/3,
         advanced_auction_items_submit/post/2, advanced_auction_items_submit/post/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get item bid options (POST)
%% Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
-spec advanced_auction_items_get/post(ctx:ctx(), openapi_advanced_auction_items_get_request:openapi_advanced_auction_items_get_request()) -> {ok, openapi_advanced_auction_items:openapi_advanced_auction_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advanced_auction_items_get/post(Ctx, OpenapiAdvancedAuctionItemsGetRequest) ->
    advanced_auction_items_get/post(Ctx, OpenapiAdvancedAuctionItemsGetRequest, #{}).

-spec advanced_auction_items_get/post(ctx:ctx(), openapi_advanced_auction_items_get_request:openapi_advanced_auction_items_get_request(), maps:map()) -> {ok, openapi_advanced_auction_items:openapi_advanced_auction_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advanced_auction_items_get/post(Ctx, OpenapiAdvancedAuctionItemsGetRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/advanced_auction/items/get"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiAdvancedAuctionItemsGetRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Operate on item level bid options
%% This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
-spec advanced_auction_items_submit/post(ctx:ctx(), openapi_advanced_auction_items_submit_request:openapi_advanced_auction_items_submit_request()) -> {ok, openapi_advanced_auction_processed_items:openapi_advanced_auction_processed_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advanced_auction_items_submit/post(Ctx, OpenapiAdvancedAuctionItemsSubmitRequest) ->
    advanced_auction_items_submit/post(Ctx, OpenapiAdvancedAuctionItemsSubmitRequest, #{}).

-spec advanced_auction_items_submit/post(ctx:ctx(), openapi_advanced_auction_items_submit_request:openapi_advanced_auction_items_submit_request(), maps:map()) -> {ok, openapi_advanced_auction_processed_items:openapi_advanced_auction_processed_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advanced_auction_items_submit/post(Ctx, OpenapiAdvancedAuctionItemsSubmitRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/advanced_auction/items/submit"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiAdvancedAuctionItemsSubmitRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


