-module(openapi_oauth_api).

-export([oauth/token/2, oauth/token/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Generate OAuth access token
%% Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication-and-scopes/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>
-spec oauth/token(ctx:ctx(), binary()) -> {ok, openapi_oauth_access_token_response:openapi_oauth_access_token_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/token(Ctx, GrantType) ->
    oauth/token(Ctx, GrantType, #{}).

-spec oauth/token(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_oauth_access_token_response:openapi_oauth_access_token_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/token(Ctx, GrantType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/oauth/token"],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"grant_type">>, GrantType}]++openapi_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/x-www-form-urlencoded">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


