-module(openapi_media_api).

-export([media/create/2, media/create/3,
         media/get/2, media/get/3,
         media/list/1, media/list/2]).

-define(BASE_URL, <<"/v5">>).

%% @doc Register media upload
%% Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
-spec media/create(ctx:ctx(), openapi_media_upload_create:openapi_media_upload_create()) -> {ok, openapi_media_upload:openapi_media_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/create(Ctx, OpenapiMediaUploadCreate) ->
    media/create(Ctx, OpenapiMediaUploadCreate, #{}).

-spec media/create(ctx:ctx(), openapi_media_upload_create:openapi_media_upload_create(), maps:map()) -> {ok, openapi_media_upload:openapi_media_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/create(Ctx, OpenapiMediaUploadCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/media"],
    QS = [],
    Headers = [],
    Body1 = OpenapiMediaUploadCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get media upload details
%% Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
-spec media/get(ctx:ctx(), binary()) -> {ok, openapi_media:openapi_media(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/get(Ctx, MediaId) ->
    media/get(Ctx, MediaId, #{}).

-spec media/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_media:openapi_media(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/get(Ctx, MediaId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/media/", MediaId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List media uploads
%% List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
-spec media/list(ctx:ctx()) -> {ok, openapi_media_list_200_response:openapi_media_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/list(Ctx) ->
    media/list(Ctx, #{}).

-spec media/list(ctx:ctx(), maps:map()) -> {ok, openapi_media_list_200_response:openapi_media_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/media"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


