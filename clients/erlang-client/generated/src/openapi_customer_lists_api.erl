-module(openapi_customer_lists_api).

-export([customer_lists/create/3, customer_lists/create/4,
         customer_lists/get/3, customer_lists/get/4,
         customer_lists/list/2, customer_lists/list/3,
         customer_lists/update/4, customer_lists/update/5]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create customer lists
%% <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
-spec customer_lists/create(ctx:ctx(), binary(), openapi_customer_list_request:openapi_customer_list_request()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/create(Ctx, AdAccountId, OpenapiCustomerListRequest) ->
    customer_lists/create(Ctx, AdAccountId, OpenapiCustomerListRequest, #{}).

-spec customer_lists/create(ctx:ctx(), binary(), openapi_customer_list_request:openapi_customer_list_request(), maps:map()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/create(Ctx, AdAccountId, OpenapiCustomerListRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCustomerListRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get customer list
%% Gets a specific customer list given the customer list ID.
-spec customer_lists/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/get(Ctx, AdAccountId, CustomerListId) ->
    customer_lists/get(Ctx, AdAccountId, CustomerListId, #{}).

-spec customer_lists/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/get(Ctx, AdAccountId, CustomerListId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists/", CustomerListId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get customer lists
%% <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
-spec customer_lists/list(ctx:ctx(), binary()) -> {ok, openapi_customer_lists_list_200_response:openapi_customer_lists_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/list(Ctx, AdAccountId) ->
    customer_lists/list(Ctx, AdAccountId, #{}).

-spec customer_lists/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_customer_lists_list_200_response:openapi_customer_lists_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update customer list
%% <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
-spec customer_lists/update(ctx:ctx(), binary(), binary(), openapi_customer_list_update_request:openapi_customer_list_update_request()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/update(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUpdateRequest) ->
    customer_lists/update(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUpdateRequest, #{}).

-spec customer_lists/update(ctx:ctx(), binary(), binary(), openapi_customer_list_update_request:openapi_customer_list_update_request(), maps:map()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/update(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists/", CustomerListId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiCustomerListUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


