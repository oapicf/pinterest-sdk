-module(openapi_audiences_api).

-export([audiences/create/3, audiences/create/4,
         audiences/create_custom/3, audiences/create_custom/4,
         audiences/get/3, audiences/get/4,
         audiences/list/2, audiences/list/3,
         audiences/update/4, audiences/update/5]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create audience
%% Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
-spec audiences/create(ctx:ctx(), binary(), openapi_audience_create_request:openapi_audience_create_request()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/create(Ctx, AdAccountId, OpenapiAudienceCreateRequest) ->
    audiences/create(Ctx, AdAccountId, OpenapiAudienceCreateRequest, #{}).

-spec audiences/create(ctx:ctx(), binary(), openapi_audience_create_request:openapi_audience_create_request(), maps:map()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/create(Ctx, AdAccountId, OpenapiAudienceCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAudienceCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create custom audience
%% Create a custom audience and find the audiences you want your ads to reach.
-spec audiences/create_custom(ctx:ctx(), binary(), openapi_audience_create_custom_request:openapi_audience_create_custom_request()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/create_custom(Ctx, AdAccountId, OpenapiAudienceCreateCustomRequest) ->
    audiences/create_custom(Ctx, AdAccountId, OpenapiAudienceCreateCustomRequest, #{}).

-spec audiences/create_custom(ctx:ctx(), binary(), openapi_audience_create_custom_request:openapi_audience_create_custom_request(), maps:map()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/create_custom(Ctx, AdAccountId, OpenapiAudienceCreateCustomRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/custom"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAudienceCreateCustomRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get audience
%% Get a specific audience given the audience ID.
-spec audiences/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/get(Ctx, AdAccountId, AudienceId) ->
    audiences/get(Ctx, AdAccountId, AudienceId, #{}).

-spec audiences/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/get(Ctx, AdAccountId, AudienceId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/", AudienceId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List audiences
%% Get list of audiences for the ad account.
-spec audiences/list(ctx:ctx(), binary()) -> {ok, openapi_audiences_list_200_response:openapi_audiences_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/list(Ctx, AdAccountId) ->
    audiences/list(Ctx, AdAccountId, #{}).

-spec audiences/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_audiences_list_200_response:openapi_audiences_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'order', 'page_size', 'ownership_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update audience
%% Update (edit or remove) an existing targeting audience.
-spec audiences/update(ctx:ctx(), binary(), binary()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/update(Ctx, AdAccountId, AudienceId) ->
    audiences/update(Ctx, AdAccountId, AudienceId, #{}).

-spec audiences/update(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_audience:openapi_audience(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audiences/update(Ctx, AdAccountId, AudienceId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/", AudienceId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiAudienceUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


