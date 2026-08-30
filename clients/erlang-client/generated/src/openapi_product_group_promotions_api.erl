-module(openapi_product_group_promotions_api).

-export([product_group_promotions/create/3, product_group_promotions/create/4,
         product_group_promotions/get/3, product_group_promotions/get/4,
         product_group_promotions/list/2, product_group_promotions/list/3,
         product_group_promotions/update/3, product_group_promotions/update/4,
         product_groups/analytics/7, product_groups/analytics/8]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create product group promotions
%% Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
-spec product_group_promotions/create(ctx:ctx(), binary(), openapi_product_group_promotions_create:openapi_product_group_promotions_create()) -> {ok, openapi_product_group_promotions:openapi_product_group_promotions(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/create(Ctx, AdAccountId, OpenapiProductGroupPromotionsCreate) ->
    product_group_promotions/create(Ctx, AdAccountId, OpenapiProductGroupPromotionsCreate, #{}).

-spec product_group_promotions/create(ctx:ctx(), binary(), openapi_product_group_promotions_create:openapi_product_group_promotions_create(), maps:map()) -> {ok, openapi_product_group_promotions:openapi_product_group_promotions(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/create(Ctx, AdAccountId, OpenapiProductGroupPromotionsCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_group_promotions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProductGroupPromotionsCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a product group promotion by id
%% Get a product group promotion by id
-spec product_group_promotions/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_product_group_promotion:openapi_product_group_promotion(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/get(Ctx, AdAccountId, ProductGroupPromotionId) ->
    product_group_promotions/get(Ctx, AdAccountId, ProductGroupPromotionId, #{}).

-spec product_group_promotions/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_product_group_promotion:openapi_product_group_promotion(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
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
%% List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
-spec product_group_promotions/list(ctx:ctx(), binary()) -> {ok, openapi_product_group_promotions_list_200_response:openapi_product_group_promotions_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/list(Ctx, AdAccountId) ->
    product_group_promotions/list(Ctx, AdAccountId, #{}).

-spec product_group_promotions/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_product_group_promotions_list_200_response:openapi_product_group_promotions_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_group_promotions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'product_group_promotion_ids', 'entity_statuses', 'ad_group_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update product group promotions
%% Update multiple existing Product Group Promotions (by product_group_id)
-spec product_group_promotions/update(ctx:ctx(), binary(), openapi_product_group_promotions_update_with_required_body:openapi_product_group_promotions_update_with_required_body()) -> {ok, openapi_product_group_promotions:openapi_product_group_promotions(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/update(Ctx, AdAccountId, OpenapiProductGroupPromotionsUpdateWithRequiredBody) ->
    product_group_promotions/update(Ctx, AdAccountId, OpenapiProductGroupPromotionsUpdateWithRequiredBody, #{}).

-spec product_group_promotions/update(ctx:ctx(), binary(), openapi_product_group_promotions_update_with_required_body:openapi_product_group_promotions_update_with_required_body(), maps:map()) -> {ok, openapi_product_group_promotions:openapi_product_group_promotions(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_group_promotions/update(Ctx, AdAccountId, OpenapiProductGroupPromotionsUpdateWithRequiredBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_group_promotions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProductGroupPromotionsUpdateWithRequiredBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product group analytics
%% Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-spec product_groups/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, binary()) -> {ok, [openapi_product_group_analytics_items:openapi_product_group_analytics_items()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_groups/analytics(Ctx, StartDate, EndDate, ProductGroupIds, Columns, Granularity, AdAccountId) ->
    product_groups/analytics(Ctx, StartDate, EndDate, ProductGroupIds, Columns, Granularity, AdAccountId, #{}).

-spec product_groups/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, binary(), maps:map()) -> {ok, [openapi_product_group_analytics_items:openapi_product_group_analytics_items()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_groups/analytics(Ctx, StartDate, EndDate, ProductGroupIds, Columns, Granularity, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_groups/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"product_group_ids">>, X} || X <- ProductGroupIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'reporting_timezone'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


