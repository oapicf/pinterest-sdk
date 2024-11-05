-module(openapi_targeting_template_api).

-export([targeting_template/create/3, targeting_template/create/4,
         targeting_template/list/2, targeting_template/list/3,
         targeting_template/update/3, targeting_template/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create targeting templates
%% <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
-spec targeting_template/create(ctx:ctx(), binary(), openapi_targeting_template_create:openapi_targeting_template_create()) -> {ok, openapi_targeting_template_get_response_data:openapi_targeting_template_get_response_data(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_template/create(Ctx, AdAccountId, OpenapiTargetingTemplateCreate) ->
    targeting_template/create(Ctx, AdAccountId, OpenapiTargetingTemplateCreate, #{}).

-spec targeting_template/create(ctx:ctx(), binary(), openapi_targeting_template_create:openapi_targeting_template_create(), maps:map()) -> {ok, openapi_targeting_template_get_response_data:openapi_targeting_template_get_response_data(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_template/create(Ctx, AdAccountId, OpenapiTargetingTemplateCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/targeting_templates"],
    QS = [],
    Headers = [],
    Body1 = OpenapiTargetingTemplateCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List targeting templates
%% Get a list of the targeting templates in the specified <code>ad_account_id</code>
-spec targeting_template/list(ctx:ctx(), binary()) -> {ok, openapi_targeting_template_list_200_response:openapi_targeting_template_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_template/list(Ctx, AdAccountId) ->
    targeting_template/list(Ctx, AdAccountId, #{}).

-spec targeting_template/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_targeting_template_list_200_response:openapi_targeting_template_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_template/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/targeting_templates"],
    QS = lists:flatten([])++openapi_utils:optional_params(['order', 'include_sizing', 'search_query', 'page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update targeting templates
%% <p>Update the targeting template given advertiser ID and targeting template ID</p>
-spec targeting_template/update(ctx:ctx(), binary(), openapi_targeting_template_update_request:openapi_targeting_template_update_request()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_template/update(Ctx, AdAccountId, OpenapiTargetingTemplateUpdateRequest) ->
    targeting_template/update(Ctx, AdAccountId, OpenapiTargetingTemplateUpdateRequest, #{}).

-spec targeting_template/update(ctx:ctx(), binary(), openapi_targeting_template_update_request:openapi_targeting_template_update_request(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_template/update(Ctx, AdAccountId, OpenapiTargetingTemplateUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/targeting_templates"],
    QS = [],
    Headers = [],
    Body1 = OpenapiTargetingTemplateUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


