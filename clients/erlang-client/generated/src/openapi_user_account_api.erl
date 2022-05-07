-module(openapi_user_account_api).

-export([user_account/analytics/3, user_account/analytics/4,
         user_account/get/1, user_account/get/2]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get user account analytics
%% Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
-spec user_account/analytics(ctx:ctx(), calendar:date(), calendar:date()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics(Ctx, StartDate, EndDate) ->
    user_account/analytics(Ctx, StartDate, EndDate, #{}).

-spec user_account/analytics(ctx:ctx(), calendar:date(), calendar:date(), maps:map()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/analytics(Ctx, StartDate, EndDate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/user_account/analytics">>],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}])++openapi_utils:optional_params(['from_claimed_content', 'pin_format', 'app_types', 'metric_types', 'split_field', 'ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get user account
%% Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.
-spec user_account/get(ctx:ctx()) -> {ok, openapi_account:openapi_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/get(Ctx) ->
    user_account/get(Ctx, #{}).

-spec user_account/get(ctx:ctx(), maps:map()) -> {ok, openapi_account:openapi_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
user_account/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/user_account">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


