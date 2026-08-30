-module(openapi_schedules_api).

-export([schedules/create/3, schedules/create/4,
         schedules/list/3, schedules/list/4,
         schedules/update/3, schedules/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create schedules
%% Batch create schedules
-spec schedules/create(ctx:ctx(), binary(), list()) -> {ok, [openapi_schedules_create_200_response_inner:openapi_schedules_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
schedules/create(Ctx, AdAccountId, OpenapiScheduleCreateArray) ->
    schedules/create(Ctx, AdAccountId, OpenapiScheduleCreateArray, #{}).

-spec schedules/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, [openapi_schedules_create_200_response_inner:openapi_schedules_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
schedules/create(Ctx, AdAccountId, OpenapiScheduleCreateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/schedules"],
    QS = [],
    Headers = [],
    Body1 = OpenapiScheduleCreateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Schedules
%% Get schedules for a specific advertiser
-spec schedules/list(ctx:ctx(), binary(), list()) -> {ok, openapi_schedules_list_200_response:openapi_schedules_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
schedules/list(Ctx, AdAccountId, EntityIds) ->
    schedules/list(Ctx, AdAccountId, EntityIds, #{}).

-spec schedules/list(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_schedules_list_200_response:openapi_schedules_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
schedules/list(Ctx, AdAccountId, EntityIds, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/schedules"],
    QS = lists:flatten([[{<<"entity_ids">>, X} || X <- EntityIds]])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'schedule_statuses', 'schedule_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update schedules
%% Update one or more schedules
-spec schedules/update(ctx:ctx(), binary(), list()) -> {ok, [openapi_schedules_create_200_response_inner:openapi_schedules_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
schedules/update(Ctx, AdAccountId, OpenapiScheduleBatchUpdateArray) ->
    schedules/update(Ctx, AdAccountId, OpenapiScheduleBatchUpdateArray, #{}).

-spec schedules/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, [openapi_schedules_create_200_response_inner:openapi_schedules_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
schedules/update(Ctx, AdAccountId, OpenapiScheduleBatchUpdateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/schedules"],
    QS = [],
    Headers = [],
    Body1 = OpenapiScheduleBatchUpdateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


