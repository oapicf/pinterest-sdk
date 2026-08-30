-module(openapi_oauth_api).

-export([oauth/conversion_token/1, oauth/conversion_token/2,
         oauth/token/2, oauth/token/3,
         token/revoke/2, token/revoke/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Generate OAuth access token for conversion API
%% Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
-spec oauth/conversion_token(ctx:ctx()) -> {ok, openapi_conversion_access_token:openapi_conversion_access_token(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/conversion_token(Ctx) ->
    oauth/conversion_token(Ctx, #{}).

-spec oauth/conversion_token(ctx:ctx(), maps:map()) -> {ok, openapi_conversion_access_token:openapi_conversion_access_token(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/conversion_token(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/oauth/conversion_token"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Generate OAuth access token
%% Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
-spec oauth/token(ctx:ctx(), openapi_token_grant_type:openapi_token_grant_type()) -> {ok, openapi_oauth_access_token:openapi_oauth_access_token(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/token(Ctx, GrantType) ->
    oauth/token(Ctx, GrantType, #{}).

-spec oauth/token(ctx:ctx(), openapi_token_grant_type:openapi_token_grant_type(), maps:map()) -> {ok, openapi_oauth_access_token:openapi_oauth_access_token(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/token(Ctx, GrantType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/oauth/token"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"grant_type">>, GrantType}]++openapi_utils:optional_params(['code', 'continuous_refresh', 'redirect_uri', 'refresh_token', 'scope'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/x-www-form-urlencoded">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Revoke a token
%% Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
-spec token/revoke(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
token/revoke(Ctx, Token) ->
    token/revoke(Ctx, Token, #{}).

-spec token/revoke(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
token/revoke(Ctx, Token, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/oauth/token/revoke"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"token">>, Token}]++openapi_utils:optional_params(['token_type_hint'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/x-www-form-urlencoded">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


