-module(openapi_conversions_api).

-export([advertiser_defined_events/get/2, advertiser_defined_events/get/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get advertiser defined events
%% <p>Get advertiser defined events for the given ad account.</p>
-spec advertiser_defined_events/get(ctx:ctx(), binary()) -> {ok, openapi_advertiser_defined_events_response:openapi_advertiser_defined_events_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advertiser_defined_events/get(Ctx, AdAccountId) ->
    advertiser_defined_events/get(Ctx, AdAccountId, #{}).

-spec advertiser_defined_events/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_advertiser_defined_events_response:openapi_advertiser_defined_events_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
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


