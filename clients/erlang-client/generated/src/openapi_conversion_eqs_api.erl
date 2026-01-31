-module(openapi_conversion_eqs_api).

-export([conversion_eqs/list/3, conversion_eqs/list/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get event quality score (EQS)
%% Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
-spec conversion_eqs/list(ctx:ctx(), openapi_lookback_period_options, binary()) -> {ok, [openapi_event_quality_score:openapi_event_quality_score()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_eqs/list(Ctx, LookbackPeriod, AdAccountId) ->
    conversion_eqs/list(Ctx, LookbackPeriod, AdAccountId, #{}).

-spec conversion_eqs/list(ctx:ctx(), openapi_lookback_period_options, binary(), maps:map()) -> {ok, [openapi_event_quality_score:openapi_event_quality_score()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_eqs/list(Ctx, LookbackPeriod, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_eqs"],
    QS = lists:flatten([{<<"lookback_period">>, LookbackPeriod}])++openapi_utils:optional_params(['source_platform', 'ingestion_source'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


