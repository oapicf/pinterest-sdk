-module(openapi_catalog_product_groups_api).

-export([catalogs_product_group_pins/list/2, catalogs_product_group_pins/list/3,
         catalogs_product_groups/create/2, catalogs_product_groups/create/3,
         catalogs_product_groups/create_many/2, catalogs_product_groups/create_many/3,
         catalogs_product_groups/delete/2, catalogs_product_groups/delete/3,
         catalogs_product_groups/delete_many/2, catalogs_product_groups/delete_many/3,
         catalogs_product_groups/get/2, catalogs_product_groups/get/3,
         catalogs_product_groups/list/1, catalogs_product_groups/list/2,
         catalogs_product_groups/product_counts_get/2, catalogs_product_groups/product_counts_get/3,
         catalogs_product_groups/update/3, catalogs_product_groups/update/4,
         products_by_product_group_filter/list/2, products_by_product_group_filter/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc List products by product group
%% Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_product_group_pins/list(ctx:ctx(), binary()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_group_pins/list(Ctx, ProductGroupId) ->
    catalogs_product_group_pins/list(Ctx, ProductGroupId, #{}).

-spec catalogs_product_group_pins/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_group_pins/list(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, "/products"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id', 'pin_metrics', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create product group
%% Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
-spec catalogs_product_groups/create(ctx:ctx(), openapi_catalogs_product_groups_create_request_schema:openapi_catalogs_product_groups_create_request_schema()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupsCreateRequestSchema) ->
    catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupsCreateRequestSchema, #{}).

-spec catalogs_product_groups/create(ctx:ctx(), openapi_catalogs_product_groups_create_request_schema:openapi_catalogs_product_groups_create_request_schema(), maps:map()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupsCreateRequestSchema, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/product_groups"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsProductGroupsCreateRequestSchema,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create product groups
%% Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
-spec catalogs_product_groups/create_many(ctx:ctx(), list()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create_many(Ctx, OpenapiCatalogsProductGroupsCreateManyRequestItemsArray) ->
    catalogs_product_groups/create_many(Ctx, OpenapiCatalogsProductGroupsCreateManyRequestItemsArray, #{}).

-spec catalogs_product_groups/create_many(ctx:ctx(), list(), maps:map()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create_many(Ctx, OpenapiCatalogsProductGroupsCreateManyRequestItemsArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/product_groups/multiple"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsProductGroupsCreateManyRequestItemsArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete product group
%% Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_product_groups/delete(ctx:ctx(), binary()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete(Ctx, ProductGroupId) ->
    catalogs_product_groups/delete(Ctx, ProductGroupId, #{}).

-spec catalogs_product_groups/delete(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete product groups
%% Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_product_groups/delete_many(ctx:ctx(), list()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete_many(Ctx, Id) ->
    catalogs_product_groups/delete_many(Ctx, Id, #{}).

-spec catalogs_product_groups/delete_many(ctx:ctx(), list(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete_many(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/catalogs/product_groups/multiple"],
    QS = lists:flatten([[{<<"id">>, X} || X <- Id]])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product group
%% Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_product_groups/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/get(Ctx, ProductGroupId) ->
    catalogs_product_groups/get(Ctx, ProductGroupId, #{}).

-spec catalogs_product_groups/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/get(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List product groups
%% Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_product_groups/list(ctx:ctx()) -> {ok, openapi_catalogs_product_groups_list_200_response:openapi_catalogs_product_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/list(Ctx) ->
    catalogs_product_groups/list(Ctx, #{}).

-spec catalogs_product_groups/list(ctx:ctx(), maps:map()) -> {ok, openapi_catalogs_product_groups_list_200_response:openapi_catalogs_product_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups"],
    QS = lists:flatten([])++openapi_utils:optional_params(['id', 'feed_id', 'catalog_id', 'ad_account_id', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product counts
%% Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
-spec catalogs_product_groups/product_counts_get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_product_group_product_counts_vertical:openapi_catalogs_product_group_product_counts_vertical(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/product_counts_get(Ctx, ProductGroupId) ->
    catalogs_product_groups/product_counts_get(Ctx, ProductGroupId, #{}).

-spec catalogs_product_groups/product_counts_get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_product_group_product_counts_vertical:openapi_catalogs_product_group_product_counts_vertical(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/product_counts_get(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, "/product_counts"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update single product group
%% Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
-spec catalogs_product_groups/update(ctx:ctx(), binary(), openapi_catalogs_product_groups_update_request_schema:openapi_catalogs_product_groups_update_request_schema()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupsUpdateRequestSchema) ->
    catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupsUpdateRequestSchema, #{}).

-spec catalogs_product_groups/update(ctx:ctx(), binary(), openapi_catalogs_product_groups_update_request_schema:openapi_catalogs_product_groups_update_request_schema(), maps:map()) -> {ok, openapi_catalogs_vertical_product_group:openapi_catalogs_vertical_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupsUpdateRequestSchema, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/catalogs/product_groups/", ProductGroupId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsProductGroupsUpdateRequestSchema,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List products by filter
%% List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)
-spec products_by_product_group_filter/list(ctx:ctx(), openapi_catalogs_list_products_by_filter_request:openapi_catalogs_list_products_by_filter_request()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
products_by_product_group_filter/list(Ctx, OpenapiCatalogsListProductsByFilterRequest) ->
    products_by_product_group_filter/list(Ctx, OpenapiCatalogsListProductsByFilterRequest, #{}).

-spec products_by_product_group_filter/list(ctx:ctx(), openapi_catalogs_list_products_by_filter_request:openapi_catalogs_list_products_by_filter_request(), maps:map()) -> {ok, openapi_catalogs_product_group_pins_list_200_response:openapi_catalogs_product_group_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
products_by_product_group_filter/list(Ctx, OpenapiCatalogsListProductsByFilterRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/products/get_by_product_group_filters"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'ad_account_id', 'pin_metrics'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsListProductsByFilterRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


