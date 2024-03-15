-module(openapi_bulk_api).

-export([bulk_download/create/3, bulk_download/create/4,
         bulk_request/get/3, bulk_request/get/4,
         bulk_upsert/create/3, bulk_upsert/create/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get advertiser entities in bulk
%% Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
-spec bulk_download/create(ctx:ctx(), binary(), openapi_bulk_download_request:openapi_bulk_download_request()) -> {ok, openapi_bulk_download_response:openapi_bulk_download_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
bulk_download/create(Ctx, AdAccountId, OpenapiBulkDownloadRequest) ->
    bulk_download/create(Ctx, AdAccountId, OpenapiBulkDownloadRequest, #{}).

-spec bulk_download/create(ctx:ctx(), binary(), openapi_bulk_download_request:openapi_bulk_download_request(), maps:map()) -> {ok, openapi_bulk_download_response:openapi_bulk_download_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
bulk_download/create(Ctx, AdAccountId, OpenapiBulkDownloadRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/bulk/download"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBulkDownloadRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download advertiser entities in bulk
%% Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
-spec bulk_request/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_bulk_upsert_status_response:openapi_bulk_upsert_status_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
bulk_request/get(Ctx, AdAccountId, BulkRequestId) ->
    bulk_request/get(Ctx, AdAccountId, BulkRequestId, #{}).

-spec bulk_request/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_bulk_upsert_status_response:openapi_bulk_upsert_status_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
bulk_request/get(Ctx, AdAccountId, BulkRequestId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/bulk/", BulkRequestId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['include_details'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create/update ad entities in bulk
%% Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
-spec bulk_upsert/create(ctx:ctx(), binary(), openapi_bulk_upsert_request:openapi_bulk_upsert_request()) -> {ok, openapi_bulk_upsert_response:openapi_bulk_upsert_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
bulk_upsert/create(Ctx, AdAccountId, OpenapiBulkUpsertRequest) ->
    bulk_upsert/create(Ctx, AdAccountId, OpenapiBulkUpsertRequest, #{}).

-spec bulk_upsert/create(ctx:ctx(), binary(), openapi_bulk_upsert_request:openapi_bulk_upsert_request(), maps:map()) -> {ok, openapi_bulk_upsert_response:openapi_bulk_upsert_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
bulk_upsert/create(Ctx, AdAccountId, OpenapiBulkUpsertRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/bulk/upsert"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBulkUpsertRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


