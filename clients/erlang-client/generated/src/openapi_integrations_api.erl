-module(openapi_integrations_api).

-export([integrations/get_by_id/2, integrations/get_by_id/3,
         integrations/get_list/1, integrations/get_list/2,
         integrations_commerce/del/2, integrations_commerce/del/3,
         integrations_commerce/get/2, integrations_commerce/get/3,
         integrations_commerce/patch/3, integrations_commerce/patch/4,
         integrations_commerce/post/2, integrations_commerce/post/3,
         integrations_logs/post/2, integrations_logs/post/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get integration metadata
%% Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec integrations/get_by_id(ctx:ctx(), binary()) -> {ok, openapi_integration_record:openapi_integration_record(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations/get_by_id(Ctx, Id) ->
    integrations/get_by_id(Ctx, Id, #{}).

-spec integrations/get_by_id(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_integration_record:openapi_integration_record(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations/get_by_id(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/integrations/", Id, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get integration metadata list
%% Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec integrations/get_list(ctx:ctx()) -> {ok, openapi_integrations_get_list_200_response:openapi_integrations_get_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations/get_list(Ctx) ->
    integrations/get_list(Ctx, #{}).

-spec integrations/get_list(ctx:ctx(), maps:map()) -> {ok, openapi_integrations_get_list_200_response:openapi_integrations_get_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations/get_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/integrations"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete commerce integration
%% Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec integrations_commerce/del(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/del(Ctx, ExternalBusinessId) ->
    integrations_commerce/del(Ctx, ExternalBusinessId, #{}).

-spec integrations_commerce/del(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/del(Ctx, ExternalBusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/integrations/commerce/", ExternalBusinessId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get commerce integration
%% Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec integrations_commerce/get(ctx:ctx(), binary()) -> {ok, openapi_integration_metadata:openapi_integration_metadata(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/get(Ctx, ExternalBusinessId) ->
    integrations_commerce/get(Ctx, ExternalBusinessId, #{}).

-spec integrations_commerce/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_integration_metadata:openapi_integration_metadata(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/get(Ctx, ExternalBusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/integrations/commerce/", ExternalBusinessId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update commerce integration
%% Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec integrations_commerce/patch(ctx:ctx(), binary()) -> {ok, openapi_integration_metadata:openapi_integration_metadata(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/patch(Ctx, ExternalBusinessId) ->
    integrations_commerce/patch(Ctx, ExternalBusinessId, #{}).

-spec integrations_commerce/patch(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_integration_metadata:openapi_integration_metadata(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/patch(Ctx, ExternalBusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/integrations/commerce/", ExternalBusinessId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiIntegrationRequestPatch,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create commerce integration
%% Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec integrations_commerce/post(ctx:ctx()) -> {ok, openapi_integration_metadata:openapi_integration_metadata(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/post(Ctx) ->
    integrations_commerce/post(Ctx, #{}).

-spec integrations_commerce/post(ctx:ctx(), maps:map()) -> {ok, openapi_integration_metadata:openapi_integration_metadata(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_commerce/post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/integrations/commerce"],
    QS = [],
    Headers = [],
    Body1 = OpenapiIntegrationRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Receives batched logs from integration applications.
%% This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec integrations_logs/post(ctx:ctx(), openapi_integration_logs_request:openapi_integration_logs_request()) -> {ok, openapi_integration_logs_success_response:openapi_integration_logs_success_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_logs/post(Ctx, OpenapiIntegrationLogsRequest) ->
    integrations_logs/post(Ctx, OpenapiIntegrationLogsRequest, #{}).

-spec integrations_logs/post(ctx:ctx(), openapi_integration_logs_request:openapi_integration_logs_request(), maps:map()) -> {ok, openapi_integration_logs_success_response:openapi_integration_logs_success_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
integrations_logs/post(Ctx, OpenapiIntegrationLogsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/integrations/logs"],
    QS = [],
    Headers = [],
    Body1 = OpenapiIntegrationLogsRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


