-module(openapi_conversion_deletion_requests_api).

-export([conversion_deletion_request/create/3, conversion_deletion_request/create/4,
         conversion_deletion_request/delete/3, conversion_deletion_request/delete/4,
         conversion_deletion_request/get/3, conversion_deletion_request/get/4,
         conversion_deletion_request/list/2, conversion_deletion_request/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create a conversion deletion request
%% **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
-spec conversion_deletion_request/create(ctx:ctx(), binary(), openapi_conversion_deletion_request_create:openapi_conversion_deletion_request_create()) -> {ok, openapi_conversion_deletion_request:openapi_conversion_deletion_request(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/create(Ctx, AdAccountId, OpenapiConversionDeletionRequestCreate) ->
    conversion_deletion_request/create(Ctx, AdAccountId, OpenapiConversionDeletionRequestCreate, #{}).

-spec conversion_deletion_request/create(ctx:ctx(), binary(), openapi_conversion_deletion_request_create:openapi_conversion_deletion_request_create(), maps:map()) -> {ok, openapi_conversion_deletion_request:openapi_conversion_deletion_request(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/create(Ctx, AdAccountId, OpenapiConversionDeletionRequestCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_deletion_requests"],
    QS = [],
    Headers = [],
    Body1 = OpenapiConversionDeletionRequestCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete a conversion deletion request
%% **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
-spec conversion_deletion_request/delete(ctx:ctx(), binary(), binary()) -> {ok, openapi_conversion_deletion_request:openapi_conversion_deletion_request(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/delete(Ctx, RequestId, AdAccountId) ->
    conversion_deletion_request/delete(Ctx, RequestId, AdAccountId, #{}).

-spec conversion_deletion_request/delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_conversion_deletion_request:openapi_conversion_deletion_request(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/delete(Ctx, RequestId, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_deletion_requests/", RequestId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get a single conversion deletion request
%% **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
-spec conversion_deletion_request/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_conversion_deletion_request:openapi_conversion_deletion_request(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/get(Ctx, RequestId, AdAccountId) ->
    conversion_deletion_request/get(Ctx, RequestId, AdAccountId, #{}).

-spec conversion_deletion_request/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_conversion_deletion_request:openapi_conversion_deletion_request(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/get(Ctx, RequestId, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_deletion_requests/", RequestId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List conversion deletion requests
%% **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
-spec conversion_deletion_request/list(ctx:ctx(), binary()) -> {ok, openapi_conversion_deletion_request_list_200_response:openapi_conversion_deletion_request_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/list(Ctx, AdAccountId) ->
    conversion_deletion_request/list(Ctx, AdAccountId, #{}).

-spec conversion_deletion_request/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_conversion_deletion_request_list_200_response:openapi_conversion_deletion_request_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_deletion_request/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_deletion_requests"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


