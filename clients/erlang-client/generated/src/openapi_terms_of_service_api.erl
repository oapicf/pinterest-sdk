-module(openapi_terms_of_service_api).

-export([terms_of_service/get/2, terms_of_service/get/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get terms of service
%% Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
-spec terms_of_service/get(ctx:ctx(), binary()) -> {ok, openapi_terms_of_service:openapi_terms_of_service(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
terms_of_service/get(Ctx, AdAccountId) ->
    terms_of_service/get(Ctx, AdAccountId, #{}).

-spec terms_of_service/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_terms_of_service:openapi_terms_of_service(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
terms_of_service/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/terms_of_service"],
    QS = lists:flatten([])++openapi_utils:optional_params(['include_html', 'tos_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


