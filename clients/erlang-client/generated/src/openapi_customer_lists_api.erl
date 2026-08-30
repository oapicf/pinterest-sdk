-module(openapi_customer_lists_api).

-export([customer_lists/create/3, customer_lists/create/4,
         customer_lists/get/3, customer_lists/get/4,
         customer_lists/list/2, customer_lists/list/3,
         customer_lists/update/4, customer_lists/update/5]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create customer lists
%% Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
-spec customer_lists/create(ctx:ctx(), binary(), openapi_customer_list_create:openapi_customer_list_create()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/create(Ctx, AdAccountId, OpenapiCustomerListCreate) ->
    customer_lists/create(Ctx, AdAccountId, OpenapiCustomerListCreate, #{}).

-spec customer_lists/create(ctx:ctx(), binary(), openapi_customer_list_create:openapi_customer_list_create(), maps:map()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/create(Ctx, AdAccountId, OpenapiCustomerListCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCustomerListCreate,
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
%% Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
-spec customer_lists/list(ctx:ctx(), binary()) -> {ok, openapi_customer_lists_list_200_response:openapi_customer_lists_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/list(Ctx, AdAccountId) ->
    customer_lists/list(Ctx, AdAccountId, #{}).

-spec customer_lists/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_customer_lists_list_200_response:openapi_customer_lists_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'exclude_nca'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update customer list
%% Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
-spec customer_lists/update(ctx:ctx(), binary(), binary(), openapi_customer_list_update_with_required_body:openapi_customer_list_update_with_required_body()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/update(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUpdateWithRequiredBody) ->
    customer_lists/update(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUpdateWithRequiredBody, #{}).

-spec customer_lists/update(ctx:ctx(), binary(), binary(), openapi_customer_list_update_with_required_body:openapi_customer_list_update_with_required_body(), maps:map()) -> {ok, openapi_customer_list:openapi_customer_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_lists/update(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUpdateWithRequiredBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists/", CustomerListId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiCustomerListUpdateWithRequiredBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


