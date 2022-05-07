-module(openapi_oauth_api).

-export([oauth/token/2, oauth/token/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Generate OAuth access token
%% Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.
-spec oauth/token(ctx:ctx(), binary()) -> {ok, openapi_oauth_access_token_response:openapi_oauth_access_token_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/token(Ctx, GrantType) ->
    oauth/token(Ctx, GrantType, #{}).

-spec oauth/token(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_oauth_access_token_response:openapi_oauth_access_token_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
oauth/token(Ctx, GrantType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/oauth/token">>],
    QS = [],
    Headers = [],
    Body1 = {form, [{<<"grant_type">>, GrantType}]++openapi_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/x-www-form-urlencoded">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


