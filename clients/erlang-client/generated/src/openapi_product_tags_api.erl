-module(openapi_product_tags_api).

-export([product_tags/bulk_add/3, product_tags/bulk_add/4,
         product_tags/bulk_delete/3, product_tags/bulk_delete/4,
         product_tags/list/2, product_tags/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Add product tags to pin
%% Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
-spec product_tags/bulk_add(ctx:ctx(), binary(), openapi_product_tags_bulk_add_request:openapi_product_tags_bulk_add_request()) -> {ok, openapi_product_tags_response:openapi_product_tags_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_tags/bulk_add(Ctx, PinId, OpenapiProductTagsBulkAddRequest) ->
    product_tags/bulk_add(Ctx, PinId, OpenapiProductTagsBulkAddRequest, #{}).

-spec product_tags/bulk_add(ctx:ctx(), binary(), openapi_product_tags_bulk_add_request:openapi_product_tags_bulk_add_request(), maps:map()) -> {ok, openapi_product_tags_response:openapi_product_tags_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_tags/bulk_add(Ctx, PinId, OpenapiProductTagsBulkAddRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/pins/", PinId, "/product_tags"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProductTagsBulkAddRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete product tags from pin
%% Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
-spec product_tags/bulk_delete(ctx:ctx(), binary(), openapi_product_tags_bulk_delete_request:openapi_product_tags_bulk_delete_request()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_tags/bulk_delete(Ctx, PinId, OpenapiProductTagsBulkDeleteRequest) ->
    product_tags/bulk_delete(Ctx, PinId, OpenapiProductTagsBulkDeleteRequest, #{}).

-spec product_tags/bulk_delete(ctx:ctx(), binary(), openapi_product_tags_bulk_delete_request:openapi_product_tags_bulk_delete_request(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_tags/bulk_delete(Ctx, PinId, OpenapiProductTagsBulkDeleteRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/pins/", PinId, "/product_tags/bulk-delete"],
    QS = [],
    Headers = [],
    Body1 = OpenapiProductTagsBulkDeleteRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product tags for pin
%% Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
-spec product_tags/list(ctx:ctx(), binary()) -> {ok, openapi_product_tags_response:openapi_product_tags_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_tags/list(Ctx, PinId) ->
    product_tags/list(Ctx, PinId, #{}).

-spec product_tags/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_product_tags_response:openapi_product_tags_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_tags/list(Ctx, PinId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/pins/", PinId, "/product_tags"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


