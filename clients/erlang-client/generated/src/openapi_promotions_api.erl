-module(openapi_promotions_api).

-export([promotions/create/3, promotions/create/4,
         promotions/delete/3, promotions/delete/4,
         promotions/get/3, promotions/get/4,
         promotions/list/2, promotions/list/3,
         promotions/update/3, promotions/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create promotions
%% Create multiple new promotions.
-spec promotions/create(ctx:ctx(), binary(), list()) -> {ok, openapi_promotions_response:openapi_promotions_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/create(Ctx, AdAccountId, OpenapiPromotionCreateRequestArray) ->
    promotions/create(Ctx, AdAccountId, OpenapiPromotionCreateRequestArray, #{}).

-spec promotions/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_promotions_response:openapi_promotions_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/create(Ctx, AdAccountId, OpenapiPromotionCreateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/promotions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiPromotionCreateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete promotion by id
%% Delete a promotion within Pinterest.
-spec promotions/delete(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/delete(Ctx, AdAccountId, PromotionId) ->
    promotions/delete(Ctx, AdAccountId, PromotionId, #{}).

-spec promotions/delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/delete(Ctx, AdAccountId, PromotionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/promotions/", PromotionId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get promotion by id
%% Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
-spec promotions/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_promotion_response:openapi_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/get(Ctx, AdAccountId, PromotionId) ->
    promotions/get(Ctx, AdAccountId, PromotionId, #{}).

-spec promotions/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_promotion_response:openapi_promotion_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/get(Ctx, AdAccountId, PromotionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/promotions/", PromotionId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get promotions
%% Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
-spec promotions/list(ctx:ctx(), binary()) -> {ok, openapi_promotions_list_200_response:openapi_promotions_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/list(Ctx, AdAccountId) ->
    promotions/list(Ctx, AdAccountId, #{}).

-spec promotions/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_promotions_list_200_response:openapi_promotions_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/promotions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update promotions
%% Update multiple promotions.
-spec promotions/update(ctx:ctx(), binary(), list()) -> {ok, openapi_promotions_response:openapi_promotions_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/update(Ctx, AdAccountId, OpenapiPromotionUpdateRequestArray) ->
    promotions/update(Ctx, AdAccountId, OpenapiPromotionUpdateRequestArray, #{}).

-spec promotions/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_promotions_response:openapi_promotions_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
promotions/update(Ctx, AdAccountId, OpenapiPromotionUpdateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/promotions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiPromotionUpdateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


