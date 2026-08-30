-module(openapi_conversions_api).

-export([advertiser_defined_events/create/3, advertiser_defined_events/create/4,
         advertiser_defined_events/delete/3, advertiser_defined_events/delete/4,
         advertiser_defined_events/get/2, advertiser_defined_events/get/3,
         advertiser_defined_events/update/3, advertiser_defined_events/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create advertiser defined events
%% Map advertiser defined events to standard events for the given ad account.
-spec advertiser_defined_events/create(ctx:ctx(), binary(), openapi_advertiser_defined_events_create_request:openapi_advertiser_defined_events_create_request()) -> {ok, openapi_advertiser_defined_events_create_200_response:openapi_advertiser_defined_events_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/create(Ctx, AdAccountId, OpenapiAdvertiserDefinedEventsCreateRequest) ->
    advertiser_defined_events/create(Ctx, AdAccountId, OpenapiAdvertiserDefinedEventsCreateRequest, #{}).

-spec advertiser_defined_events/create(ctx:ctx(), binary(), openapi_advertiser_defined_events_create_request:openapi_advertiser_defined_events_create_request(), maps:map()) -> {ok, openapi_advertiser_defined_events_create_200_response:openapi_advertiser_defined_events_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/create(Ctx, AdAccountId, OpenapiAdvertiserDefinedEventsCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/advertiser_defined_events"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdvertiserDefinedEventsCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete advertiser defined events
%% Untrack advertiser defined events for the given ad account.
-spec advertiser_defined_events/delete(ctx:ctx(), binary(), list()) -> {ok, openapi_advertiser_defined_events_create_200_response:openapi_advertiser_defined_events_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/delete(Ctx, AdAccountId, EventNames) ->
    advertiser_defined_events/delete(Ctx, AdAccountId, EventNames, #{}).

-spec advertiser_defined_events/delete(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_advertiser_defined_events_create_200_response:openapi_advertiser_defined_events_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/delete(Ctx, AdAccountId, EventNames, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/advertiser_defined_events"],
    QS = lists:flatten([[{<<"event_names">>, X} || X <- EventNames]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get advertiser defined events
%% Get advertiser defined events for the given ad account.
-spec advertiser_defined_events/get(ctx:ctx(), binary()) -> {ok, openapi_advertiser_defined_events_get_200_response:openapi_advertiser_defined_events_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/get(Ctx, AdAccountId) ->
    advertiser_defined_events/get(Ctx, AdAccountId, #{}).

-spec advertiser_defined_events/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_advertiser_defined_events_get_200_response:openapi_advertiser_defined_events_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/advertiser_defined_events"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update advertiser defined events
%% Update advertiser defined event names or mappings for the given ad account.
-spec advertiser_defined_events/update(ctx:ctx(), binary(), openapi_advertiser_defined_events_create_request:openapi_advertiser_defined_events_create_request()) -> {ok, openapi_advertiser_defined_events_create_200_response:openapi_advertiser_defined_events_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/update(Ctx, AdAccountId, OpenapiAdvertiserDefinedEventsCreateRequest) ->
    advertiser_defined_events/update(Ctx, AdAccountId, OpenapiAdvertiserDefinedEventsCreateRequest, #{}).

-spec advertiser_defined_events/update(ctx:ctx(), binary(), openapi_advertiser_defined_events_create_request:openapi_advertiser_defined_events_create_request(), maps:map()) -> {ok, openapi_advertiser_defined_events_create_200_response:openapi_advertiser_defined_events_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/update(Ctx, AdAccountId, OpenapiAdvertiserDefinedEventsCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/advertiser_defined_events"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdvertiserDefinedEventsCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


