-module(openapi_terms_api).

-export([terms_related/list/2, terms_related/list/3,
         terms_suggested/list/2, terms_suggested/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc List related terms
%% Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
-spec terms_related/list(ctx:ctx(), list()) -> {ok, openapi_related_terms:openapi_related_terms(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
terms_related/list(Ctx, Terms) ->
    terms_related/list(Ctx, Terms, #{}).

-spec terms_related/list(ctx:ctx(), list(), maps:map()) -> {ok, openapi_related_terms:openapi_related_terms(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
terms_related/list(Ctx, Terms, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/terms/related"],
    QS = lists:flatten([[{<<"terms">>, X} || X <- Terms]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List suggested terms
%% Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
-spec terms_suggested/list(ctx:ctx(), binary()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
terms_suggested/list(Ctx, Term) ->
    terms_suggested/list(Ctx, Term, #{}).

-spec terms_suggested/list(ctx:ctx(), binary(), maps:map()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
terms_suggested/list(Ctx, Term, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/terms/suggested"],
    QS = lists:flatten([{<<"term">>, Term}])++openapi_utils:optional_params(['limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


