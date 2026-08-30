-module(openapi_keywords_api).

-export([country_keywords_metrics/get/4, country_keywords_metrics/get/5,
         keywords/create/3, keywords/create/4,
         keywords/get/2, keywords/get/3,
         keywords/update/3, keywords/update/4,
         trending_keywords/list/3, trending_keywords/list/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get country's keyword metrics
%%   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
-spec country_keywords_metrics/get(ctx:ctx(), binary(), binary(), list()) -> {ok, openapi_keywords_metrics_array_response:openapi_keywords_metrics_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
country_keywords_metrics/get(Ctx, AdAccountId, CountryCode, Keywords) ->
    country_keywords_metrics/get(Ctx, AdAccountId, CountryCode, Keywords, #{}).

-spec country_keywords_metrics/get(ctx:ctx(), binary(), binary(), list(), maps:map()) -> {ok, openapi_keywords_metrics_array_response:openapi_keywords_metrics_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
country_keywords_metrics/get(Ctx, AdAccountId, CountryCode, Keywords, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords/metrics"],
    QS = lists:flatten([{<<"country_code">>, CountryCode}, [{<<"keywords">>, X} || X <- Keywords]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create keywords
%%   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }
-spec keywords/create(ctx:ctx(), binary(), openapi_keywords_create:openapi_keywords_create()) -> {ok, openapi_keywords:openapi_keywords(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/create(Ctx, AdAccountId, OpenapiKeywordsCreate) ->
    keywords/create(Ctx, AdAccountId, OpenapiKeywordsCreate, #{}).

-spec keywords/create(ctx:ctx(), binary(), openapi_keywords_create:openapi_keywords_create(), maps:map()) -> {ok, openapi_keywords:openapi_keywords(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/create(Ctx, AdAccountId, OpenapiKeywordsCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords"],
    QS = [],
    Headers = [],
    Body1 = OpenapiKeywordsCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get keywords
%%     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }
-spec keywords/get(ctx:ctx(), binary()) -> {ok, openapi_keywords_get_200_response:openapi_keywords_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/get(Ctx, AdAccountId) ->
    keywords/get(Ctx, AdAccountId, #{}).

-spec keywords/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_keywords_get_200_response:openapi_keywords_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords"],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_id', 'ad_group_id', 'ad_group_ids', 'match_types', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update keywords
%%   Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.
-spec keywords/update(ctx:ctx(), binary(), openapi_keywords_update:openapi_keywords_update()) -> {ok, openapi_keywords:openapi_keywords(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/update(Ctx, AdAccountId, OpenapiKeywordsUpdate) ->
    keywords/update(Ctx, AdAccountId, OpenapiKeywordsUpdate, #{}).

-spec keywords/update(ctx:ctx(), binary(), openapi_keywords_update:openapi_keywords_update(), maps:map()) -> {ok, openapi_keywords:openapi_keywords(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/update(Ctx, AdAccountId, OpenapiKeywordsUpdate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords"],
    QS = [],
    Headers = [],
    Body1 = OpenapiKeywordsUpdate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List trending keywords
%% Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
-spec trending_keywords/list(ctx:ctx(), openapi_trends_supported_region, openapi_trend_type) -> {ok, openapi_trending_keywords_response:openapi_trending_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trending_keywords/list(Ctx, Region, TrendType) ->
    trending_keywords/list(Ctx, Region, TrendType, #{}).

-spec trending_keywords/list(ctx:ctx(), openapi_trends_supported_region, openapi_trend_type, maps:map()) -> {ok, openapi_trending_keywords_response:openapi_trending_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trending_keywords/list(Ctx, Region, TrendType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/trends/keywords/", Region, "/top/", TrendType, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['interests', 'genders', 'ages', 'include_keywords', 'normalize_against_group', 'limit', 'include_demographics'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


