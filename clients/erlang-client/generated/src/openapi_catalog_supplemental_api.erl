-module(openapi_catalog_supplemental_api).

-export([catalogs_local_inventory_items/post/3, catalogs_local_inventory_items/post/4,
         catalogs_local_inventory_items_batch/operate/3, catalogs_local_inventory_items_batch/operate/4,
         catalogs_local_stores/create/3, catalogs_local_stores/create/4,
         catalogs_local_stores/delete/3, catalogs_local_stores/delete/4,
         catalogs_local_stores/list/2, catalogs_local_stores/list/3,
         catalogs_local_stores/update/3, catalogs_local_stores/update/4,
         catalogs_supplemental_items_batch/get/3, catalogs_supplemental_items_batch/get/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get local inventory items (POST)
%% Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_local_inventory_items/post(ctx:ctx(), binary(), openapi_local_inventory_items_get_create:openapi_local_inventory_items_get_create()) -> {ok, openapi_local_inventory_items_get:openapi_local_inventory_items_get(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_inventory_items/post(Ctx, CatalogId, OpenapiLocalInventoryItemsGetCreate) ->
    catalogs_local_inventory_items/post(Ctx, CatalogId, OpenapiLocalInventoryItemsGetCreate, #{}).

-spec catalogs_local_inventory_items/post(ctx:ctx(), binary(), openapi_local_inventory_items_get_create:openapi_local_inventory_items_get_create(), maps:map()) -> {ok, openapi_local_inventory_items_get:openapi_local_inventory_items_get(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_inventory_items/post(Ctx, CatalogId, OpenapiLocalInventoryItemsGetCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/", CatalogId, "/local_inventory_items/query"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiLocalInventoryItemsGetCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Operate on local inventory item batch
%% Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_local_inventory_items_batch/operate(ctx:ctx(), binary(), openapi_local_inventory_items_batch_create:openapi_local_inventory_items_batch_create()) -> {ok, openapi_supplemental_items_batch_response:openapi_supplemental_items_batch_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_inventory_items_batch/operate(Ctx, CatalogId, OpenapiLocalInventoryItemsBatchCreate) ->
    catalogs_local_inventory_items_batch/operate(Ctx, CatalogId, OpenapiLocalInventoryItemsBatchCreate, #{}).

-spec catalogs_local_inventory_items_batch/operate(ctx:ctx(), binary(), openapi_local_inventory_items_batch_create:openapi_local_inventory_items_batch_create(), maps:map()) -> {ok, openapi_supplemental_items_batch_response:openapi_supplemental_items_batch_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_inventory_items_batch/operate(Ctx, CatalogId, OpenapiLocalInventoryItemsBatchCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/", CatalogId, "/local_inventory_items/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiLocalInventoryItemsBatchCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create local stores
%% Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_local_stores/create(ctx:ctx(), binary(), list()) -> {ok, [openapi_catalogs_local_stores_create_200_response_inner:openapi_catalogs_local_stores_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/create(Ctx, CatalogId, OpenapiLocalStoreCreateArray) ->
    catalogs_local_stores/create(Ctx, CatalogId, OpenapiLocalStoreCreateArray, #{}).

-spec catalogs_local_stores/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, [openapi_catalogs_local_stores_create_200_response_inner:openapi_catalogs_local_stores_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/create(Ctx, CatalogId, OpenapiLocalStoreCreateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/", CatalogId, "/local_stores"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiLocalStoreCreateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete local stores
%%   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_local_stores/delete(ctx:ctx(), binary(), list()) -> {ok, [openapi_catalogs_local_stores_delete_200_response_inner:openapi_catalogs_local_stores_delete_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/delete(Ctx, CatalogId, Ids) ->
    catalogs_local_stores/delete(Ctx, CatalogId, Ids, #{}).

-spec catalogs_local_stores/delete(ctx:ctx(), binary(), list(), maps:map()) -> {ok, [openapi_catalogs_local_stores_delete_200_response_inner:openapi_catalogs_local_stores_delete_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/delete(Ctx, CatalogId, Ids, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/catalogs/", CatalogId, "/local_stores"],
    QS = lists:flatten([[{<<"ids">>, X} || X <- Ids]])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List local stores
%% Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_local_stores/list(ctx:ctx(), binary()) -> {ok, openapi_catalogs_local_stores_list_200_response:openapi_catalogs_local_stores_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/list(Ctx, CatalogId) ->
    catalogs_local_stores/list(Ctx, CatalogId, #{}).

-spec catalogs_local_stores/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_local_stores_list_200_response:openapi_catalogs_local_stores_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/list(Ctx, CatalogId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/", CatalogId, "/local_stores"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ids', 'ad_account_id', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update local stores
%%   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_local_stores/update(ctx:ctx(), binary(), list()) -> {ok, [openapi_catalogs_local_stores_create_200_response_inner:openapi_catalogs_local_stores_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/update(Ctx, CatalogId, OpenapiLocalStoreBatchUpdateArray) ->
    catalogs_local_stores/update(Ctx, CatalogId, OpenapiLocalStoreBatchUpdateArray, #{}).

-spec catalogs_local_stores/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, [openapi_catalogs_local_stores_create_200_response_inner:openapi_catalogs_local_stores_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_local_stores/update(Ctx, CatalogId, OpenapiLocalStoreBatchUpdateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/catalogs/", CatalogId, "/local_stores"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiLocalStoreBatchUpdateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get supplemental items batch status
%% Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_supplemental_items_batch/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_supplemental_items_batch_response:openapi_supplemental_items_batch_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_supplemental_items_batch/get(Ctx, CatalogId, BatchId) ->
    catalogs_supplemental_items_batch/get(Ctx, CatalogId, BatchId, #{}).

-spec catalogs_supplemental_items_batch/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_supplemental_items_batch_response:openapi_supplemental_items_batch_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_supplemental_items_batch/get(Ctx, CatalogId, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/", CatalogId, "/supplemental_items/batch/", BatchId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


