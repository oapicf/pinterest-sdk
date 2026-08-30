-module(openapi_msot_events_api).

-export([msot_events/create/3, msot_events/create/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Send Measurement Source Of Truth (MSOT) attributed conversion events
%% **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
-spec msot_events/create(ctx:ctx(), binary(), openapi_conversion_msot_events_create:openapi_conversion_msot_events_create()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
msot_events/create(Ctx, AdAccountId, OpenapiConversionMsotEventsCreate) ->
    msot_events/create(Ctx, AdAccountId, OpenapiConversionMsotEventsCreate, #{}).

-spec msot_events/create(ctx:ctx(), binary(), openapi_conversion_msot_events_create:openapi_conversion_msot_events_create(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
msot_events/create(Ctx, AdAccountId, OpenapiConversionMsotEventsCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/msot/events"],
    QS = [],
    Headers = [],
    Body1 = OpenapiConversionMsotEventsCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


