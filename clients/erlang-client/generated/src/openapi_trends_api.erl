-module(openapi_trends_api).

-export([trends_editorial_articles/list/2, trends_editorial_articles/list/3,
         trends_featured_topics/list/2, trends_featured_topics/list/3,
         trends_product_categories_details/list/3, trends_product_categories_details/list/4,
         trends_product_categories_trending/list/2, trends_product_categories_trending/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Returns editorial articles for a given region
%%   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
-spec trends_editorial_articles/list(ctx:ctx(), openapi_product_category_region) -> {ok, [openapi_trends_editorial:openapi_trends_editorial()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_editorial_articles/list(Ctx, Region) ->
    trends_editorial_articles/list(Ctx, Region, #{}).

-spec trends_editorial_articles/list(ctx:ctx(), openapi_product_category_region, maps:map()) -> {ok, [openapi_trends_editorial:openapi_trends_editorial()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_editorial_articles/list(Ctx, Region, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/trends/editorial_articles"],
    QS = lists:flatten([{<<"region">>, Region}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get featured topics
%%   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
-spec trends_featured_topics/list(ctx:ctx(), openapi_product_category_region) -> {ok, [openapi_featured_trend:openapi_featured_trend()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_featured_topics/list(Ctx, Region) ->
    trends_featured_topics/list(Ctx, Region, #{}).

-spec trends_featured_topics/list(ctx:ctx(), openapi_product_category_region, maps:map()) -> {ok, [openapi_featured_trend:openapi_featured_trend()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_featured_topics/list(Ctx, Region, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/trends/topics/featured"],
    QS = lists:flatten([{<<"region">>, Region}])++openapi_utils:optional_params(['interest'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product category details
%%   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
-spec trends_product_categories_details/list(ctx:ctx(), list(), openapi_product_category_region) -> {ok, [openapi_product_category_details:openapi_product_category_details()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_product_categories_details/list(Ctx, ProductCategories, Region) ->
    trends_product_categories_details/list(Ctx, ProductCategories, Region, #{}).

-spec trends_product_categories_details/list(ctx:ctx(), list(), openapi_product_category_region, maps:map()) -> {ok, [openapi_product_category_details:openapi_product_category_details()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_product_categories_details/list(Ctx, ProductCategories, Region, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/trends/product_categories/details"],
    QS = lists:flatten([[{<<"product_categories">>, X} || X <- ProductCategories], {<<"region">>, Region}])++openapi_utils:optional_params(['lookback_window', 'engagement_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a list of growing Shopping Product Categories
%%   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
-spec trends_product_categories_trending/list(ctx:ctx(), openapi_product_category_region) -> {ok, [openapi_trending_product_category:openapi_trending_product_category()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_product_categories_trending/list(Ctx, Region) ->
    trends_product_categories_trending/list(Ctx, Region, #{}).

-spec trends_product_categories_trending/list(ctx:ctx(), openapi_product_category_region, maps:map()) -> {ok, [openapi_trending_product_category:openapi_trending_product_category()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trends_product_categories_trending/list(Ctx, Region, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/trends/product_categories/trending"],
    QS = lists:flatten([{<<"region">>, Region}])++openapi_utils:optional_params(['verticals', 'ages', 'genders', 'engagement_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


