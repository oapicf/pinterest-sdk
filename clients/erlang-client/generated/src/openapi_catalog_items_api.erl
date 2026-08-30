-module(openapi_catalog_items_api).

-export([items/post/2, items/post/3,
         items_batch/get/2, items_batch/get/3,
         items_batch/post/2, items_batch/post/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get catalogs items (POST)
%% Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
-spec items/post(ctx:ctx(), openapi_catalogs_items_request:openapi_catalogs_items_request()) -> {ok, openapi_items_post_200_response:openapi_items_post_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items/post(Ctx, OpenapiCatalogsItemsRequest) ->
    items/post(Ctx, OpenapiCatalogsItemsRequest, #{}).

-spec items/post(ctx:ctx(), openapi_catalogs_items_request:openapi_catalogs_items_request(), maps:map()) -> {ok, openapi_items_post_200_response:openapi_items_post_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items/post(Ctx, OpenapiCatalogsItemsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/items"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsItemsRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get item batch status
%% Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
-spec items_batch/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/get(Ctx, BatchId) ->
    items_batch/get(Ctx, BatchId, #{}).

-spec items_batch/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/get(Ctx, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/items/batch/", BatchId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Operate on item batch
%% This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
-spec items_batch/post(ctx:ctx(), openapi_catalogs_items_batch_post_request:openapi_catalogs_items_batch_post_request()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/post(Ctx, OpenapiCatalogsItemsBatchPostRequest) ->
    items_batch/post(Ctx, OpenapiCatalogsItemsBatchPostRequest, #{}).

-spec items_batch/post(ctx:ctx(), openapi_catalogs_items_batch_post_request:openapi_catalogs_items_batch_post_request(), maps:map()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/post(Ctx, OpenapiCatalogsItemsBatchPostRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/items/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsItemsBatchPostRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


