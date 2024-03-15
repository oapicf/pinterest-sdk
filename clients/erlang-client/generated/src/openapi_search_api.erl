-module(openapi_search_api).

-export([search_partner_pins/3, search_partner_pins/4,
         search_user_boards/get/1, search_user_boards/get/2,
         search_user_pins/list/2, search_user_pins/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Search pins by a given search term
%% <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
-spec search_partner_pins(ctx:ctx(), binary(), binary()) -> {ok, openapi_search_partner_pins_200_response:openapi_search_partner_pins_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
search_partner_pins(Ctx, Term, CountryCode) ->
    search_partner_pins(Ctx, Term, CountryCode, #{}).

-spec search_partner_pins(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_search_partner_pins_200_response:openapi_search_partner_pins_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
search_partner_pins(Ctx, Term, CountryCode, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/search/partner/pins"],
    QS = lists:flatten([{<<"term">>, Term}, {<<"country_code">>, CountryCode}])++openapi_utils:optional_params(['bookmark', 'locale', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Search user's boards
%% Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
-spec search_user_boards/get(ctx:ctx()) -> {ok, openapi_search_user_boards_get_200_response:openapi_search_user_boards_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
search_user_boards/get(Ctx) ->
    search_user_boards/get(Ctx, #{}).

-spec search_user_boards/get(ctx:ctx(), maps:map()) -> {ok, openapi_search_user_boards_get_200_response:openapi_search_user_boards_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
search_user_boards/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/search/boards"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id', 'bookmark', 'page_size', 'query'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Search user's Pins
%% Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
-spec search_user_pins/list(ctx:ctx(), binary()) -> {ok, openapi_pins_list_200_response:openapi_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
search_user_pins/list(Ctx, Query) ->
    search_user_pins/list(Ctx, Query, #{}).

-spec search_user_pins/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_pins_list_200_response:openapi_pins_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
search_user_pins/list(Ctx, Query, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/search/pins"],
    QS = lists:flatten([{<<"query">>, Query}])++openapi_utils:optional_params(['ad_account_id', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


