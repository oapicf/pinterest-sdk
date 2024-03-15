-module(openapi_order_lines_api).

-export([order_lines/get/3, order_lines/get/4,
         order_lines/list/2, order_lines/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get order line
%% Get a specific existing order line associated with an ad account.
-spec order_lines/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_order_line:openapi_order_line(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
order_lines/get(Ctx, AdAccountId, OrderLineId) ->
    order_lines/get(Ctx, AdAccountId, OrderLineId, #{}).

-spec order_lines/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_order_line:openapi_order_line(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
order_lines/get(Ctx, AdAccountId, OrderLineId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/order_lines/", OrderLineId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get order lines
%% List existing order lines associated with an ad account.
-spec order_lines/list(ctx:ctx(), binary()) -> {ok, openapi_order_lines_list_200_response:openapi_order_lines_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
order_lines/list(Ctx, AdAccountId) ->
    order_lines/list(Ctx, AdAccountId, #{}).

-spec order_lines/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_order_lines_list_200_response:openapi_order_lines_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
order_lines/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/order_lines"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


