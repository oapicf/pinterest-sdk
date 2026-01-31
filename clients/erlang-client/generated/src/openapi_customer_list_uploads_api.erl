-module(openapi_customer_list_uploads_api).

-export([customer_list_uploads/create/4, customer_list_uploads/create/5,
         customer_list_uploads/get/4, customer_list_uploads/get/5,
         customer_list_uploads/run/4, customer_list_uploads/run/5]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create customer list upload
%% <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
-spec customer_list_uploads/create(ctx:ctx(), binary(), binary(), openapi_customer_list_upload_create_request:openapi_customer_list_upload_create_request()) -> {ok, openapi_customer_list_upload_create_response:openapi_customer_list_upload_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_list_uploads/create(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUploadCreateRequest) ->
    customer_list_uploads/create(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUploadCreateRequest, #{}).

-spec customer_list_uploads/create(ctx:ctx(), binary(), binary(), openapi_customer_list_upload_create_request:openapi_customer_list_upload_create_request(), maps:map()) -> {ok, openapi_customer_list_upload_create_response:openapi_customer_list_upload_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_list_uploads/create(Ctx, AdAccountId, CustomerListId, OpenapiCustomerListUploadCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists/", CustomerListId, "/uploads"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCustomerListUploadCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get customer list upload
%% <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
-spec customer_list_uploads/get(ctx:ctx(), binary(), binary(), binary()) -> {ok, openapi_customer_list_upload_response:openapi_customer_list_upload_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_list_uploads/get(Ctx, AdAccountId, CustomerListId, CustomerListUploadId) ->
    customer_list_uploads/get(Ctx, AdAccountId, CustomerListId, CustomerListUploadId, #{}).

-spec customer_list_uploads/get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_customer_list_upload_response:openapi_customer_list_upload_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_list_uploads/get(Ctx, AdAccountId, CustomerListId, CustomerListUploadId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists/", CustomerListId, "/uploads/", CustomerListUploadId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Run customer list upload
%% <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
-spec customer_list_uploads/run(ctx:ctx(), binary(), binary(), binary()) -> {ok, openapi_customer_list_upload_response:openapi_customer_list_upload_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_list_uploads/run(Ctx, AdAccountId, CustomerListId, CustomerListUploadId) ->
    customer_list_uploads/run(Ctx, AdAccountId, CustomerListId, CustomerListUploadId, #{}).

-spec customer_list_uploads/run(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_customer_list_upload_response:openapi_customer_list_upload_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
customer_list_uploads/run(Ctx, AdAccountId, CustomerListId, CustomerListUploadId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/customer_lists/", CustomerListId, "/uploads/", CustomerListUploadId, "/run"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


