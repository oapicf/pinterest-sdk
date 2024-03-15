-module(openapi_product_group_promotions_api).

-export([product_group_promotions/create/3, product_group_promotions/create/4,
         product_group_promotions/get/3, product_group_promotions/get/4,
         product_group_promotions/list/2, product_group_promotions/list/3,
         product_group_promotions/update/3, product_group_promotions/update/4,
         product_groups/analytics/7, product_groups/analytics/8]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create product group promotions
%% Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
-spec product_group_promotions/create(ctx:ctx(), binary(), openapi_product_group_promotion_create_request:openapi_product_group_promotion_create_request()) -> {ok, openapi_product_group_promotion_response:openapi_product_group_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/create(Ctx, AdAccountId, OpenapiProductGroupPromotionCreateRequest) ->
    product_group_promotions/create(Ctx, AdAccountId, OpenapiProductGroupPromotionCreateRequest, #{}).

-spec product_group_promotions/create(ctx:ctx(), binary(), openapi_product_group_promotion_create_request:openapi_product_group_promotion_create_request(), maps:map()) -> {ok, openapi_product_group_promotion_response:openapi_product_group_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/create(Ctx, AdAccountId, OpenapiProductGroupPromotionCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_group_promotions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProductGroupPromotionCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a product group promotion by id
%% Get a product group promotion by id
-spec product_group_promotions/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_product_group_promotion_response:openapi_product_group_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/get(Ctx, AdAccountId, ProductGroupPromotionId) ->
    product_group_promotions/get(Ctx, AdAccountId, ProductGroupPromotionId, #{}).

-spec product_group_promotions/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_product_group_promotion_response:openapi_product_group_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/get(Ctx, AdAccountId, ProductGroupPromotionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_group_promotions/", ProductGroupPromotionId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product group promotions
%% List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
-spec product_group_promotions/list(ctx:ctx(), binary()) -> {ok, openapi_product_group_promotions_list_200_response:openapi_product_group_promotions_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/list(Ctx, AdAccountId) ->
    product_group_promotions/list(Ctx, AdAccountId, #{}).

-spec product_group_promotions/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_product_group_promotions_list_200_response:openapi_product_group_promotions_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_group_promotions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['product_group_promotion_ids', 'entity_statuses', 'ad_group_id', 'page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update product group promotions
%% Update multiple existing Product Group Promotions (by product_group_id)
-spec product_group_promotions/update(ctx:ctx(), binary(), openapi_product_group_promotion_update_request:openapi_product_group_promotion_update_request()) -> {ok, openapi_product_group_promotion_response:openapi_product_group_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/update(Ctx, AdAccountId, OpenapiProductGroupPromotionUpdateRequest) ->
    product_group_promotions/update(Ctx, AdAccountId, OpenapiProductGroupPromotionUpdateRequest, #{}).

-spec product_group_promotions/update(ctx:ctx(), binary(), openapi_product_group_promotion_update_request:openapi_product_group_promotion_update_request(), maps:map()) -> {ok, openapi_product_group_promotion_response:openapi_product_group_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/update(Ctx, AdAccountId, OpenapiProductGroupPromotionUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_group_promotions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProductGroupPromotionUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product group analytics
%% Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec product_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, [openapi_product_group_analytics_response_inner:openapi_product_group_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, ProductGroupIds, Columns, Granularity) ->
    product_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, ProductGroupIds, Columns, Granularity, #{}).

-spec product_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, [openapi_product_group_analytics_response_inner:openapi_product_group_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, ProductGroupIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_groups/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"product_group_ids">>, X} || X <- ProductGroupIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


