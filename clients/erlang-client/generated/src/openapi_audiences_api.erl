-module(openapi_audiences_api).

-export([audiences/create/3, audiences/create/4,
         audiences/get/3, audiences/get/4,
         audiences/list/2, audiences/list/3,
         audiences/update/4, audiences/update/5]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create audience
%% Create a new audience for the ad account.
-spec audiences/create(ctx:ctx(), binary(), openapi_ad_accounts_audience_create:openapi_ad_accounts_audience_create()) -> {ok, openapi_ad_accounts_audience:openapi_ad_accounts_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/create(Ctx, AdAccountId, OpenapiAdAccountsAudienceCreate) ->
    audiences/create(Ctx, AdAccountId, OpenapiAdAccountsAudienceCreate, #{}).

-spec audiences/create(ctx:ctx(), binary(), openapi_ad_accounts_audience_create:openapi_ad_accounts_audience_create(), maps:map()) -> {ok, openapi_ad_accounts_audience:openapi_ad_accounts_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/create(Ctx, AdAccountId, OpenapiAdAccountsAudienceCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdAccountsAudienceCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get audience
%% Get a specific audience given the audience ID.
-spec audiences/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_ad_accounts_audience:openapi_ad_accounts_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/get(Ctx, AudienceId, AdAccountId) ->
    audiences/get(Ctx, AudienceId, AdAccountId, #{}).

-spec audiences/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ad_accounts_audience:openapi_ad_accounts_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/get(Ctx, AudienceId, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/", AudienceId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List audiences
%% Get list of audiences for the ad account.
-spec audiences/list(ctx:ctx(), binary()) -> {ok, openapi_audiences_list_200_response:openapi_audiences_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/list(Ctx, AdAccountId) ->
    audiences/list(Ctx, AdAccountId, #{}).

-spec audiences/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_audiences_list_200_response:openapi_audiences_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'ownership_type', 'exclude_nca'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update audience
%% Update an existing audience for the ad account.
-spec audiences/update(ctx:ctx(), binary(), binary(), openapi_ad_accounts_audience_update:openapi_ad_accounts_audience_update()) -> {ok, openapi_ad_accounts_audience:openapi_ad_accounts_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/update(Ctx, AudienceId, AdAccountId, OpenapiAdAccountsAudienceUpdate) ->
    audiences/update(Ctx, AudienceId, AdAccountId, OpenapiAdAccountsAudienceUpdate, #{}).

-spec audiences/update(ctx:ctx(), binary(), binary(), openapi_ad_accounts_audience_update:openapi_ad_accounts_audience_update(), maps:map()) -> {ok, openapi_ad_accounts_audience:openapi_ad_accounts_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/update(Ctx, AudienceId, AdAccountId, OpenapiAdAccountsAudienceUpdate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/", AudienceId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdAccountsAudienceUpdate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


