-module(openapi_lead_forms_api).

-export([lead_form/get/3, lead_form/get/4,
         lead_form_test/create/4, lead_form_test/create/5,
         lead_forms/list/2, lead_forms/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get lead form by id
%% Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec lead_form/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_lead_form_response:openapi_lead_form_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_form/get(Ctx, AdAccountId, LeadFormId) ->
    lead_form/get(Ctx, AdAccountId, LeadFormId, #{}).

-spec lead_form/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_lead_form_response:openapi_lead_form_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_form/get(Ctx, AdAccountId, LeadFormId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/lead_forms/", LeadFormId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create lead form test data
%% Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec lead_form_test/create(ctx:ctx(), binary(), binary(), openapi_lead_form_test_request:openapi_lead_form_test_request()) -> {ok, openapi_lead_form_test_response:openapi_lead_form_test_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_form_test/create(Ctx, AdAccountId, LeadFormId, OpenapiLeadFormTestRequest) ->
    lead_form_test/create(Ctx, AdAccountId, LeadFormId, OpenapiLeadFormTestRequest, #{}).

-spec lead_form_test/create(ctx:ctx(), binary(), binary(), openapi_lead_form_test_request:openapi_lead_form_test_request(), maps:map()) -> {ok, openapi_lead_form_test_response:openapi_lead_form_test_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_form_test/create(Ctx, AdAccountId, LeadFormId, OpenapiLeadFormTestRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/lead_forms/", LeadFormId, "/test"],
    QS = [],
    Headers = [],
    Body1 = OpenapiLeadFormTestRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get lead forms
%% Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.
-spec lead_forms/list(ctx:ctx(), binary()) -> {ok, openapi_lead_forms_list_200_response:openapi_lead_forms_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_forms/list(Ctx, AdAccountId) ->
    lead_forms/list(Ctx, AdAccountId, #{}).

-spec lead_forms/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_lead_forms_list_200_response:openapi_lead_forms_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_forms/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/lead_forms"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


