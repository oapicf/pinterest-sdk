-module(openapi_catalogs_api).

-export([catalogs_product_groups/create/2, catalogs_product_groups/create/3,
         catalogs_product_groups/delete/2, catalogs_product_groups/delete/3,
         catalogs_product_groups/list/2, catalogs_product_groups/list/3,
         catalogs_product_groups/update/3, catalogs_product_groups/update/4,
         feed_processing_results/list/2, feed_processing_results/list/3,
         feeds/create/2, feeds/create/3,
         feeds/delete/2, feeds/delete/3,
         feeds/get/2, feeds/get/3,
         feeds/list/1, feeds/list/2,
         feeds/update/3, feeds/update/4,
         items/get/4, items/get/5,
         items_batch/get/2, items_batch/get/3,
         items_batch/post/2, items_batch/post/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create product group
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.
-spec catalogs_product_groups/create(ctx:ctx(), openapi_catalogs_product_group_create_request:openapi_catalogs_product_group_create_request()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupCreateRequest) ->
    catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupCreateRequest, #{}).

-spec catalogs_product_groups/create(ctx:ctx(), openapi_catalogs_product_group_create_request:openapi_catalogs_product_group_create_request(), maps:map()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/create(Ctx, OpenapiCatalogsProductGroupCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/catalogs/product_groups">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiCatalogsProductGroupCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete product group
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
-spec catalogs_product_groups/delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete(Ctx, ProductGroupId) ->
    catalogs_product_groups/delete(Ctx, ProductGroupId, #{}).

-spec catalogs_product_groups/delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/delete(Ctx, ProductGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/catalogs/product_groups/", ProductGroupId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product groups list
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
-spec catalogs_product_groups/list(ctx:ctx(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/list(Ctx, FeedId) ->
    catalogs_product_groups/list(Ctx, FeedId, #{}).

-spec catalogs_product_groups/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/list(Ctx, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/catalogs/product_groups">>],
    QS = lists:flatten([{<<"feed_id">>, FeedId}])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update product group
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.
-spec catalogs_product_groups/update(ctx:ctx(), binary(), openapi_catalogs_product_group_update_request:openapi_catalogs_product_group_update_request()) -> {ok, openapi_catalogs_product_group:openapi_catalogs_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupUpdateRequest) ->
    catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupUpdateRequest, #{}).

-spec catalogs_product_groups/update(ctx:ctx(), binary(), openapi_catalogs_product_group_update_request:openapi_catalogs_product_group_update_request(), maps:map()) -> {ok, openapi_catalogs_product_group:openapi_catalogs_product_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
catalogs_product_groups/update(Ctx, ProductGroupId, OpenapiCatalogsProductGroupUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/catalogs/product_groups/", ProductGroupId, "">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiCatalogsProductGroupUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List processing results for a given feed
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.
-spec feed_processing_results/list(ctx:ctx(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feed_processing_results/list(Ctx, FeedId) ->
    feed_processing_results/list(Ctx, FeedId, #{}).

-spec feed_processing_results/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feed_processing_results/list(Ctx, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/catalogs/feeds/", FeedId, "/processing_results">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create feed
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
-spec feeds/create(ctx:ctx(), openapi_catalogs_feeds_create_request:openapi_catalogs_feeds_create_request()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/create(Ctx, OpenapiCatalogsFeedsCreateRequest) ->
    feeds/create(Ctx, OpenapiCatalogsFeedsCreateRequest, #{}).

-spec feeds/create(ctx:ctx(), openapi_catalogs_feeds_create_request:openapi_catalogs_feeds_create_request(), maps:map()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/create(Ctx, OpenapiCatalogsFeedsCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/catalogs/feeds">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiCatalogsFeedsCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete feed
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
-spec feeds/delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/delete(Ctx, FeedId) ->
    feeds/delete(Ctx, FeedId, #{}).

-spec feeds/delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/delete(Ctx, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/catalogs/feeds/", FeedId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get feed
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
-spec feeds/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/get(Ctx, FeedId) ->
    feeds/get(Ctx, FeedId, #{}).

-spec feeds/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/get(Ctx, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/catalogs/feeds/", FeedId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List feeds
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
-spec feeds/list(ctx:ctx()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/list(Ctx) ->
    feeds/list(Ctx, #{}).

-spec feeds/list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/catalogs/feeds">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update feed
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
-spec feeds/update(ctx:ctx(), binary(), openapi_catalogs_feeds_update_request:openapi_catalogs_feeds_update_request()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/update(Ctx, FeedId, OpenapiCatalogsFeedsUpdateRequest) ->
    feeds/update(Ctx, FeedId, OpenapiCatalogsFeedsUpdateRequest, #{}).

-spec feeds/update(ctx:ctx(), binary(), openapi_catalogs_feeds_update_request:openapi_catalogs_feeds_update_request(), maps:map()) -> {ok, openapi_catalogs_feed:openapi_catalogs_feed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
feeds/update(Ctx, FeedId, OpenapiCatalogsFeedsUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/catalogs/feeds/", FeedId, "">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiCatalogsFeedsUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get catalogs items
%% Get the items of the catalog created by the \"operating user_account\"
-spec items/get(ctx:ctx(), binary(), list(), binary()) -> {ok, openapi_catalogs_items:openapi_catalogs_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items/get(Ctx, Country, ItemIds, Language) ->
    items/get(Ctx, Country, ItemIds, Language, #{}).

-spec items/get(ctx:ctx(), binary(), list(), binary(), maps:map()) -> {ok, openapi_catalogs_items:openapi_catalogs_items(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items/get(Ctx, Country, ItemIds, Language, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/catalogs/items">>],
    QS = lists:flatten([{<<"country">>, Country}, [{<<"item_ids">>, X} || X <- ItemIds], {<<"language">>, Language}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get catalogs items batch
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".
-spec items_batch/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/get(Ctx, BatchId) ->
    items_batch/get(Ctx, BatchId, #{}).

-spec items_batch/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/get(Ctx, BatchId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/catalogs/items/batch/", BatchId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Perform an operation on an item batch
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.
-spec items_batch/post(ctx:ctx(), openapi_catalogs_items_batch_request:openapi_catalogs_items_batch_request()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/post(Ctx, OpenapiCatalogsItemsBatchRequest) ->
    items_batch/post(Ctx, OpenapiCatalogsItemsBatchRequest, #{}).

-spec items_batch/post(ctx:ctx(), openapi_catalogs_items_batch_request:openapi_catalogs_items_batch_request(), maps:map()) -> {ok, openapi_catalogs_items_batch:openapi_catalogs_items_batch(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
items_batch/post(Ctx, OpenapiCatalogsItemsBatchRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/catalogs/items/batch">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiCatalogsItemsBatchRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


