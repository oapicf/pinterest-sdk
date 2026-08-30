-module(openapi_customer_segment_api).

-export([customer_segment/create/3, customer_segment/create/4,
         customer_segment/list/2, customer_segment/list/3,
         customer_segment/update/3, customer_segment/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create customer segments
%% Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
-spec customer_segment/create(ctx:ctx(), binary(), openapi_customer_segment_create:openapi_customer_segment_create()) -> {ok, openapi_customer_segment:openapi_customer_segment(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_segment/create(Ctx, AdAccountId, OpenapiCustomerSegmentCreate) ->
    customer_segment/create(Ctx, AdAccountId, OpenapiCustomerSegmentCreate, #{}).

-spec customer_segment/create(ctx:ctx(), binary(), openapi_customer_segment_create:openapi_customer_segment_create(), maps:map()) -> {ok, openapi_customer_segment:openapi_customer_segment(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_segment/create(Ctx, AdAccountId, OpenapiCustomerSegmentCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_segments"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCustomerSegmentCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List customer segments
%% Get a list of the customer segments in the specified `ad_account_id`.
-spec customer_segment/list(ctx:ctx(), binary()) -> {ok, openapi_customer_segment_list_200_response:openapi_customer_segment_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_segment/list(Ctx, AdAccountId) ->
    customer_segment/list(Ctx, AdAccountId, #{}).

-spec customer_segment/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_customer_segment_list_200_response:openapi_customer_segment_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_segment/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_segments"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'include_sizing', 'search_query'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update customer segments
%% Update the customer segment given advertiser ID and customer segment ID
-spec customer_segment/update(ctx:ctx(), binary(), openapi_customer_segment_update_request_update_with_required_body:openapi_customer_segment_update_request_update_with_required_body()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_segment/update(Ctx, AdAccountId, OpenapiCustomerSegmentUpdateRequestUpdateWithRequiredBody) ->
    customer_segment/update(Ctx, AdAccountId, OpenapiCustomerSegmentUpdateRequestUpdateWithRequiredBody, #{}).

-spec customer_segment/update(ctx:ctx(), binary(), openapi_customer_segment_update_request_update_with_required_body:openapi_customer_segment_update_request_update_with_required_body(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_segment/update(Ctx, AdAccountId, OpenapiCustomerSegmentUpdateRequestUpdateWithRequiredBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_segments"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCustomerSegmentUpdateRequestUpdateWithRequiredBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


